package com.example.newactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class BusinessPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_page2);

        //スピナー
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter.add("レストラン");
        adapter.add("居酒屋");
        adapter.add("洋食");
        adapter.add("カフェ（喫茶店）");
        adapter.add("バー");
        adapter.add("ファストフード");
        Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        spinner.setAdapter(adapter);

        //ホームボタン
        ImageButton Homebtn = findViewById(R.id.HomeButton);
        Homebtn.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(Homebtn.getContext(), BusinessPage4.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY7", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });

        //ホームボタン
        ImageButton btn = findViewById(R.id.ProfileButton);
        btn.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn.getContext(), BusinessPage4.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY7", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });

        Button nextbtn = findViewById(R.id.ButtonToNext);
        nextbtn.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn.getContext(), BusinessPage3.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY7", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });
        }

    }




