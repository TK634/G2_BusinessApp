package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class User9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user9);

//マッチング待機中
        Button btn = findViewById(R.id.ButtonToUser10);
        btn.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn.getContext(), User10_GoogleMap.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY10", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });

//マッチング相手がいます
        Button btn1 = findViewById(R.id.ButtonToUser11);
        btn1.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn1.getContext(), User11_GoogleMap.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY11", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });
    }
}