package com.hencoder.hencoderpracticedraw1;

import android.content.Context;

/**
 * Created by Administrator on 2018/1/12 0012.
 */

public class Util {

    public static int dpToPx(Context context, int dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    public static int sp2px(Context context, final float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }
}