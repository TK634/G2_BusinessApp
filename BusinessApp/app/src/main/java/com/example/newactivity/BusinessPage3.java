package com.example.newactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class BusinessPage3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_page3);

        Button btn = findViewById(R.id.ButtonToBusiness4);
        btn.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn.getContext(), BusinessPage4.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY3", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });
        //ホームボタン
        ImageButton btn2 = findViewById(R.id.HomeButton);
        btn2.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn.getContext(), BusinessPage4.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY7", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });

    }
}