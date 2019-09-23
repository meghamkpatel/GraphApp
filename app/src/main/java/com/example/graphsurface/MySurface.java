package com.example.graphsurface;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MySurface extends SurfaceView implements SurfaceHolder.Callback {
    private SurfaceHolder surfaceholder = null;

    class Pt {
        float x, y;

        Pt(float _x, float _y) {
            x = _x;
            y = _y;
        }
    }

    Pt[] myPath = {new Pt(100, 100),
            new Pt(200, 200),
            new Pt(200, 500),
            new Pt(400, 500),
            new Pt(400, 200)
    };

    public MySurface(Context context) {
        super(context);
        surfaceholder = getHolder();
        // TODO Auto-generated constructor stub
    }
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        onDraw(canvas);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(myPath[0].x, myPath[0].y);
        for (int i = 1; i < myPath.length; i++) {
            path.lineTo(myPath[i].x, myPath[i].y);
        }
        canvas.drawPath(path, paint);
    }
}