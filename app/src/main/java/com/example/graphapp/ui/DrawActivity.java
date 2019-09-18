package com.example.graphapp.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

public class DrawActivity extends Activity {
    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(new MyView(this));

    }

    public class MyView extends View {
        class Pt{
            float x, y;
            Pt(float _x, float _y){
                x = _x;
                y = _y;
            }
        }
        Pt[] myPath = { new Pt(100, 100),

                new Pt(200, 200),

                new Pt(200, 500),

                new Pt(400, 500),

                new Pt(400, 200)

        };



        public MyView(Context context) {

            super(context);

            // TODO Auto-generated constructor stub

        }
        protected void onDraw(Canvas canvas) {

            // TODO Auto-generated method stub

            super.onDraw(canvas);





            Paint paint = new Paint();

            paint.setColor(Color.WHITE);

            paint.setStrokeWidth(3);

            paint.setStyle(Paint.Style.STROKE);

            Path path = new Path();



            path.moveTo(myPath[0].x, myPath[0].y);

            for (int i = 1; i < myPath.length; i++){

                path.lineTo(myPath[i].x, myPath[i].y);

            }

            canvas.drawPath(path, paint);



        }



    }

}



