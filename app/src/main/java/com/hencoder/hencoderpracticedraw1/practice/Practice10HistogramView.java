package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Util;

public class Practice10HistogramView extends View {

    private Paint paint;
    private Context context;
    private Path path;

    public Practice10HistogramView(Context context) {
        super(context);
        this.context = context;
        paint = new Paint();
        path = new Path();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        paint = new Paint();
        path = new Path();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        paint = new Paint();
        path = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
        int xOffset = Util.dpToPx(context, 30);
        int yOffset = Util.dpToPx(context, 30);
        int availableWidth = width - xOffset * 2;
        int averageWidth = availableWidth / 7;
        int histogramBottom = height - Util.dpToPx(context, 80);
        int capWidth = Util.dpToPx(context, 8);
        int rectWidth = averageWidth - capWidth;

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        canvas.drawLine(xOffset, 40, xOffset, histogramBottom, paint);
        canvas.drawLine(xOffset, histogramBottom, xOffset + availableWidth + 20, histogramBottom, paint);

        paint.setTextSize(Util.sp2px(context, 16));
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("直方图", width / 2, height - yOffset / 2, paint);

        paint.setTextSize(Util.sp2px(context, 12));
        int textY = histogramBottom + Util.dpToPx(context, 16);
        canvas.drawText("Froyo", xOffset + capWidth + rectWidth / 2, textY, paint);
        canvas.drawText("GB", xOffset + averageWidth + capWidth + rectWidth / 2, textY, paint);
        canvas.drawText("ICS", xOffset + averageWidth * 2 + capWidth + rectWidth / 2, textY, paint);
        canvas.drawText("JB", xOffset + averageWidth * 3 + capWidth + rectWidth / 2, textY, paint);
        canvas.drawText("KitKat", xOffset + averageWidth * 4 + capWidth + rectWidth / 2, textY, paint);
        canvas.drawText("L", xOffset + averageWidth * 5 + capWidth + rectWidth / 2, textY, paint);
        canvas.drawText("M", xOffset + averageWidth * 6 + capWidth + rectWidth / 2, textY, paint);

        paint.setColor(Color.parseColor("#54ca6b"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(xOffset + capWidth, histogramBottom - 5, xOffset + averageWidth, histogramBottom, paint);
        canvas.drawRect(xOffset + capWidth + averageWidth, histogramBottom - 20, xOffset + averageWidth * 2, histogramBottom, paint);
        canvas.drawRect(xOffset + capWidth + averageWidth * 2, histogramBottom - 30, xOffset + averageWidth * 3, histogramBottom, paint);
        canvas.drawRect(xOffset + capWidth + averageWidth * 3, histogramBottom - 80, xOffset + averageWidth * 4, histogramBottom, paint);
        canvas.drawRect(xOffset + capWidth + averageWidth * 4, histogramBottom - 200, xOffset + averageWidth * 5, histogramBottom, paint);
        canvas.drawRect(xOffset + capWidth + averageWidth * 5, histogramBottom - 120, xOffset + averageWidth * 6, histogramBottom, paint);
        canvas.drawRect(xOffset + capWidth + averageWidth * 6, histogramBottom - 60, xOffset + averageWidth * 7, histogramBottom, paint);
    }
}
