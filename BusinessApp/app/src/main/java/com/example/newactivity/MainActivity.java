package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get email and password by Edittext
        final EditText email = findViewById(R.id.email);
        final EditText password =findViewById(R.id.password);
        Button btn_submit = findViewById(R.id.ButtonToBusiness2);
        BusinessMemberEmail ema = new BusinessMemberEmail();
        btn_submit.setOnClickListener(v -> {
            BusinessMember men = new BusinessMember(email.getText().toString(),password.getText().toString());
            ema.add(men).addOnSuccessListener(suc->{
                Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->{
                Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
            });
        });



        btn_submit.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn_submit.getContext(), BusinessPage2.class);

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


