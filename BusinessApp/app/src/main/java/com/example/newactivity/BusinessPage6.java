package com.example.newactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageButton;

public class BusinessPage6 extends AppCompatActivity implements CalendarView.OnDateChangeListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_page6);

        ImageButton btn = findViewById(R.id.HomeButton);
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

        //カレンダービューで選択した日付を表示
        CalendarView calendarView = (CalendarView) findViewById(R.id.Business6calendarView);        calendarView.setOnDateChangeListener(this);
        calendarView.setOnDateChangeListener(this);
    }
    //カレンダーで日付を選択するとReservationDetailsページを表示
    public void onSelectedDayChange(CalendarView view, int year, int month,
                                    int dayOfMonth) {

        Intent varIntent = new Intent(BusinessPage6.this, ReservationDetails.class);

        startActivity(varIntent);

    }
}