package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.ButtonToBusiness2);
        btn1.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn1.getContext(), BusinessPage2.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY1", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });

        Button btn2 = findViewById(R.id.ButtonToBusiness4);
        btn2.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn2.getContext(), BusinessPage4.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY8", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });

    }

}