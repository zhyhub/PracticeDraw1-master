package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Util;

public class Practice11PieChartView extends View {

    private Paint paint;
    private Context context;
    private Path path;

    public Practice11PieChartView(Context context) {
        super(context);
        this.context = context;
        paint = new Paint();
        path = new Path();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        paint = new Paint();
        path = new Path();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        paint = new Paint();
        path = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        int centerX = getMeasuredWidth() / 2;
        int centerY = getMeasuredHeight() / 2;
        int radius = (getMeasuredHeight() - Util.dpToPx(context, 90)) / 2;

        paint.setTextSize(Util.sp2px(context, 14));
        paint.setColor(Color.WHITE);
        canvas.drawText("饼图", centerX, getMeasuredHeight() - Util.dpToPx(context, 16), paint);
        int LollipopOffset = Util.dpToPx(context, 10);
        int LollipopPointX = centerX - LollipopOffset;
        int LollipopPointY = centerY - LollipopOffset;
        path.addCircle(LollipopPointX, LollipopPointY, 1, Path.Direction.CW);
        path.lineTo(LollipopPointX - radius / 2, LollipopPointY - radius - 10);
        canvas.drawPath(path, paint);
        int lStopX = LollipopPointX - radius / 2;
        int lStopY = LollipopPointY - radius - 10;
        canvas.drawLine(LollipopPointX, LollipopPointY, lStopX, lStopY, paint);
        canvas.drawLine(lStopX, lStopY, lStopX - Util.dpToPx(context, 48), lStopY, paint);
        paint.setTextAlign(Paint.Align.RIGHT);
        paint.setTextSize(Util.sp2px(context, 10));
        canvas.drawText("Lollipop", lStopX - Util.dpToPx(context, 56), lStopY, paint);

        int mStartX = centerX + radius;
        int mStartY = centerY - radius;
        int offset = Util.dpToPx(context, 20);
        canvas.drawLine(centerX, centerY, mStartX - offset, mStartY + offset, paint);
        canvas.drawLine(mStartX - offset, mStartY + offset, mStartX - offset + Util.dpToPx(context, 48), mStartY + offset, paint);
        paint.setTextAlign(Paint.Align.LEFT);
        canvas.drawText("Marshmallow", mStartX - offset + Util.dpToPx(context, 56), mStartY + offset, paint);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            paint.setColor(Color.parseColor("#EE2B2A"));
            canvas.drawArc(LollipopPointX - radius, LollipopPointY - radius, LollipopPointX + radius, LollipopPointY + radius, -180, 120, true, paint);

            paint.setColor(Color.parseColor("#FDB50D"));
            canvas.drawArc(centerX - radius, centerY - radius, centerX + radius, centerY + radius, 0, -60, true, paint);

            paint.setColor(Color.parseColor("#118675"));
            canvas.drawArc(centerX - radius, centerY - radius, centerX + radius, centerY + radius, 0, 5, true, paint);

            paint.setColor(Color.parseColor("#8800A0"));
            canvas.drawArc(centerX - radius, centerY - radius, centerX + radius, centerY + radius, 5, 15, true, paint);

            paint.setColor(Color.parseColor("#118675"));
            canvas.drawArc(centerX - radius, centerY - radius, centerX + radius, centerY + radius, 15, 35, true, paint);

            paint.setColor(Color.parseColor("#1E80F0"));
            canvas.drawArc(centerX - radius, centerY - radius, centerX + radius, centerY + radius, 35, 145, true, paint);


        }
    }
}
