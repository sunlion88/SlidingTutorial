package com.sunlion.slidingtutorial.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.NonNull;

import com.cleveroad.slidingtutorial.Renderer;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public class RhombusRenderer implements Renderer {

    private static final float ANGLE_45 = 45f;

    public static RhombusRenderer create() {
        return new RhombusRenderer();
    }

    public RhombusRenderer() {
    }

    @Override
    public void draw(@NonNull Canvas canvas, @NonNull RectF elementBounds, @NonNull Paint paint, boolean isActive) {
        canvas.save();
        canvas.rotate(ANGLE_45, elementBounds.centerX(), elementBounds.centerY());
        canvas.drawRect(elementBounds,paint);
        canvas.restore();
    }
}
