package com.example.newactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;

public class BusinessPage6 extends AppCompatActivity implements CalendarView.OnDateChangeListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_page6);

        //後でここにボタン挿入


        CalendarView calendarView = (CalendarView) findViewById(R.id.Business6calendarView);        calendarView.setOnDateChangeListener(this);
        calendarView.setOnDateChangeListener(this);
    }

    public void onSelectedDayChange(CalendarView view, int year, int month,
                                    int dayOfMonth) {

        Intent varIntent = new Intent(BusinessPage6.this, ReservationDetails.class);

        startActivity(varIntent);

    }
}