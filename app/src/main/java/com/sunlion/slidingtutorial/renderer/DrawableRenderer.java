package com.sunlion.slidingtutorial.renderer;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;

import com.cleveroad.slidingtutorial.Renderer;
import com.sunlion.slidingtutorial.R;

/**
 * Created by Administrator on 2016/11/22 0022.
 */
@SuppressWarnings("WeakerAccess")
public class DrawableRenderer  implements Renderer{

    private Drawable mDrawableActivity;
    private Drawable mDrawwable;

    public static DrawableRenderer create(@NonNull Context context){
        return new DrawableRenderer(context);
    }

    private DrawableRenderer(@NonNull Context context) {
        mDrawableActivity = ContextCompat.getDrawable(context, R.drawable.vec_checkbox_fill_circle_outline);
        mDrawwable = ContextCompat.getDrawable(context,R.drawable.vec_checkbox_blank_circle_outline);
    }

    @Override
    public void draw(@NonNull Canvas canvas, @NonNull RectF elementBounds, @NonNull Paint paint, boolean isActive) {
           Drawable drawable = isActive ? mDrawableActivity : mDrawwable;
        drawable.setBounds((int)elementBounds.left,(int)elementBounds.top,
                (int)elementBounds.right,(int)elementBounds.bottom);
        drawable.draw(canvas);
    }
}
