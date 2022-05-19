package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class BusinessPage4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_page4);

        Button btn1 = findViewById(R.id.ButtonToPlan);
        btn1.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn1.getContext(), BusinessPage5.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY4", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });

        Button btn2 = findViewById(R.id.ButtonToReserve);
        btn2.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn2.getContext(), BusinessPage6.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY5", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });

        Button btn3 = findViewById(R.id.ButtonToAnalysis);
        btn3.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn3.getContext(), BusinessPage7.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY6", "value");

            // 新規画面表示実行
            startActivity(newIntent);
        });

    }
}