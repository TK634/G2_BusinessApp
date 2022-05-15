package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class BusinessPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_page2);

        Button btn = findViewById(R.id.ButtonToBusiness3);
        btn.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn.getContext(), BusinessPage3.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY2", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });
    }

}