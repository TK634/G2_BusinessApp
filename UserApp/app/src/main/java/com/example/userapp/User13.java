package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.Button;

public class User13 extends AppCompatActivity {

//    private Paint paint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user13);

        Button btn = findViewById(R.id.ButtonToUser14);
        btn.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn.getContext(), User14.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY7", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });
    }
//    private Paint paint;
////    @Override
//    protected void onDraw(Canvas canvas) {
//// 線
//        paint.setStrokeWidth(15);
//        paint.setColor(Color.argb(255, 0, 255, 120));
//        // (x1,y1,x2,y2,paint) 始点の座標(x1,y1), 終点の座標(x2,y2)
//        canvas.drawLine(350, 850, 750, 630, paint);
}
