package com.example.userapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;


import androidx.fragment.app.FragmentActivity;

import java.util.Locale;

public class User8_GoogleMap extends FragmentActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the layout file as the content view.
        setContentView(R.layout.activity_user11_google_map);

        Button btn = findViewById(R.id.ButtonToUser12);
        btn.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn.getContext(), User12.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY7", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });

        test0();

    }

    // 地名を入れて経路を検索
    private void test0(){
        // 起点
        String start = "京都駅";

        // 目的地
        String destination = "京都府嵐山駅";

        //経由地


        // 移動手段：電車:r, 車:d, 歩き:w
        String[] dir = {"r", "d", "w"};

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity");

        // 出発地, 目的地, 交通手段
        String str = String.format(Locale.US,
                "http://maps.google.com/maps?saddr=%s&daddr=%s&dirflg=%s",
                start, destination, dir[1]);

        intent.setData(Uri.parse(str));
        startActivity(intent);

    }

}