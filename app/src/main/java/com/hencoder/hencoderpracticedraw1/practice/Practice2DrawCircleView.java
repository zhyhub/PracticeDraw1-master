package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        @SuppressLint("DrawAllocation") Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint1.setColor(Color.RED);
        canvas.drawCircle(300, 200, 150, paint1);

        @SuppressLint("DrawAllocation") Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);//FILL 是填充模式，STROKE 是画线模式（即勾边模式），FILL_AND_STROKE 是两种模式一并使用：既画线又填充
        paint2.setStrokeWidth(10);
        paint2.setColor(Color.BLACK);
        canvas.drawCircle(700, 200, 150, paint2);

        @SuppressLint("DrawAllocation") Paint paint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint3.setColor(Color.BLUE);
        canvas.drawCircle(300, 550, 150, paint3);

        @SuppressLint("DrawAllocation") Paint paint4 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(40);
        paint4.setColor(Color.YELLOW);
        canvas.drawCircle(700, 550, 150, paint4);

//        @SuppressLint("DrawAllocation") Paint paint5 = new Paint(Paint.ANTI_ALIAS_FLAG);
//        paint5.setStyle(Paint.Style.FILL_AND_STROKE);
//        paint5.setColor(Color.BLUE);
//        canvas.drawCircle(500,500,200,paint5);

//        @SuppressLint("DrawAllocation") Paint paint7 = new Paint(Paint.ANTI_ALIAS_FLAG);
//        paint7.setStyle(Paint.Style.FILL_AND_STROKE);
//        paint7.setStrokeWidth(150);
//        paint7.setColor(Color.GRAY);
//        canvas.drawCircle(500,300,150,paint7);
//
//        @SuppressLint("DrawAllocation") Paint paint6 = new Paint(Paint.ANTI_ALIAS_FLAG);
//        paint6.setStyle(Paint.Style.FILL);
//        paint6.setStrokeWidth(5);
//        paint6.setColor(Color.RED);
//        canvas.drawCircle(500,300,150,paint6);
    }
}
