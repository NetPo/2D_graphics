package com.example.a2d_graphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint pen = new Paint();
        pen.setColor(Color.YELLOW);
        pen.setAntiAlias(true);
        pen.setStrokeWidth(20);
        pen.setStyle(Paint.Style.FILL);
        canvas.drawColor(Color.WHITE);
        canvas.drawCircle(100, 100, 200, pen);
        canvas.drawLine(100, 50, 500, 20, pen);
        canvas.drawLine(100, 100, 440, 390, pen);
        canvas.drawLine(100, 150, 530, 170, pen);
        canvas.drawLine(100, 200, 270, 420, pen);
        canvas.drawLine(80, 200, 80, 470, pen);

        Rect rect = new Rect();
        rect.set(0, (canvas.getHeight()/2)+300, canvas.getWidth(), canvas.getHeight());
        pen.setColor(Color.parseColor("#56c456"));
        pen.setStyle(Paint.Style.FILL);
        canvas.drawRect(rect, pen);

        Rect rect2 = new Rect();
        rect2.set(60, (canvas.getHeight()/2)+600, 500, canvas.getHeight()-800);
        pen.setColor(Color.parseColor("#a25f2a"));
        pen.setStyle(Paint.Style.FILL);
        canvas.drawRect(rect2, pen);

        Rect rect3 = new Rect();
        rect3.set(700, 1350, 1050, 1400);
        pen.setColor(Color.parseColor("#7d7f7d"));
        pen.setStyle(Paint.Style.FILL);
        canvas.drawRect(rect3, pen);

        Rect rect4 = new Rect();
        rect4.set(750, 1400, 800, 1500);
        pen.setColor(Color.parseColor("#7d7f7d"));
        pen.setStyle(Paint.Style.FILL);
        canvas.drawRect(rect4, pen);

        Rect rect5 = new Rect();
        rect5.set(950, 1400, 1000, 1500);
        pen.setColor(Color.parseColor("#7d7f7d"));
        pen.setStyle(Paint.Style.FILL);
        canvas.drawRect(rect5, pen);

        Rect rect6 = new Rect();
        rect6.set(580, 1200, 610, 1350);
        pen.setColor(Color.parseColor("#904d30"));
        pen.setStyle(Paint.Style.FILL);
        canvas.drawRect(rect6, pen);

        pen.setColor(Color.GREEN);
        canvas.drawOval(525, 850, 660, 1250, pen);

        Path path = new Path();
        path.moveTo(60, (canvas.getHeight()/2)+155);
        path.lineTo(250, (canvas.getHeight()/2)-100);
        path.lineTo(500, (canvas.getHeight()/2)+155);
        pen.setColor(Color.parseColor("#a25f2a"));
        pen.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, pen);

        pen.setColor(Color.BLACK);
        pen.setStrokeWidth(5);
        canvas.drawLine(60, (canvas.getHeight()/2)+155, 500, (canvas.getHeight()/2)+155, pen);

        pen.setStyle(Paint.Style.STROKE);
        pen.setStrokeWidth(10);
        canvas.drawCircle(260, (canvas.getHeight()/2)+50, 50, pen);
        pen.setStrokeWidth(5);

        canvas.drawLine(260, canvas.getHeight()-700, 260, (canvas.getHeight()/2)+600,pen);
        canvas.drawLine(400, canvas.getHeight()-700, 400, (canvas.getHeight()/2)+600,pen);
        canvas.drawLine(260, canvas.getHeight()-700, 400, canvas.getHeight()-700,pen);

        Rect rect7 = new Rect();
        rect7.set(100, (canvas.getHeight()/2)+300, 200, canvas.getHeight()-500);
        pen.setStyle(Paint.Style.STROKE);
        canvas.drawRect(rect7, pen);

        pen.setColor(Color.BLUE);
        int count = 0;
        float x = 20;
        while (count < 5){
            canvas.drawLine(100 + x, canvas.getHeight()-500, 100+x, (canvas.getHeight()/2)+300, pen);
            x += 20;
            count++;
        }
        count = 0;
        x = 20;
        while(count < 7){
            canvas.drawLine(100, (canvas.getHeight()-655)+x, 200, (canvas.getHeight()/2)+300+x, pen);
            x += 20;
            count++;
        }

        pen.setColor(Color.WHITE);
        x = 30;
        int z = 0;
        count = 0;
        while(count < 11){
            if (260+x > 400){
                canvas.drawLine(260, canvas.getHeight()-700+x, 400, canvas.getHeight()-700+z,pen);
                z+=30;
            } else {
                canvas.drawLine(260, canvas.getHeight()-700+x, 260+x, canvas.getHeight()-700,pen);
            }
            x += 30;
            count++;
        }

        x = 20;
        while(count < 15){
            canvas.drawLine(260+x, (canvas.getHeight()/2)+600, 400, canvas.getHeight()-700+z,pen);
            x += 30;
            z += 30;
            count++;
        }

        pen.setColor(Color.BLACK);
        pen.setStrokeWidth(6);
        canvas.rotate(35, 260, (canvas.getHeight()/2)+50);
        count = 0;
        x = 5;
        z = 20;
        while (count < 3){

            canvas.drawLine(210+x, (canvas.getHeight()/2)+30+z, 310-x, (canvas.getHeight()/2)+30+z, pen);
            x += 5;
            z += 20;
            count++;
        }

        x = 0;
        while(count < 5){
            canvas.drawLine(215+x, (canvas.getHeight()/2)+110-z, 315-x, (canvas.getHeight()/2)+110-z, pen);
            count++;
            x += 22;
            z += 20;
        }

        canvas.rotate(35, 260, (canvas.getHeight()/2)+50);
        //Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.lain);
        //canvas.drawBitmap(bitmap, 0, 0, pen);
        //canvas.rotate(45, 200, 200);
        //pen.setTextSize(150);
        //canvas.drawText("Hello!", 50, 100, pen);
        //canvas.rotate(-45, 200, 200);
    }
}
