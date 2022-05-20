package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class User3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user03);

        Button btn = findViewById(R.id.ButtonToUser4);
        btn.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn.getContext(), User4.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY3", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });

    }
}

//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//
//public class User3 extends AppCompatActivity {
//
//    //    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_user2);
////
////        Button btn = findViewById(R.id.ButtonToUser3);
////        btn.setOnClickListener(v -> {
////            // Intent を生成
////            // 第一引数はこの処理のContext
////            // 第二引数に遷移先画面のSampleActivityを指定
////            Intent newIntent = new Intent(btn.getContext(), User3.class);
////
////            // Intent にデータを保存
////            newIntent.putExtra("KEY2", "value");
////
////            // 新規画面表示実行
////            startActivity(newIntent);
////
////        });
////    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_user3);
//
//
//        //(デザイン画面のidと対応させる)
//        final EditText solo = findViewById(R.id.radio_solo);
//        final EditText age = findViewById(R.id.radioButton_group);
//        Button btn_character = findViewById(R.id.ButtonToUser4);
//
//
//        CharacterInformation cha = new CharacterInformation();
//        btn_character.setOnClickListener(v -> {
//
//
//            Character character = new Character(solo.getText().toString(), age.getText().toString(), name.getText().toString());
//            cha.add(character).addOnSuccessListener(suc -> {
//                Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
//            }).addOnFailureListener(er -> {
//                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
//            });
//
//            FirebaseDatabase database = FirebaseDatabase.getInstance();
//            DatabaseReference myRef = database.getReference("users");
//            myRef.setValue(character);
//
//            // Intent を生成
//            // 第一引数はこの処理のContext
//            // 第二引数に遷移先画面のSampleActivityを指定
//            Intent newIntent = new Intent(btn_character.getContext(), User4.class);
//
//            // Intent にデータを保存
//            newIntent.putExtra("KEY1", "value");
//
//            // 新規画面表示実行
//            startActivity(newIntent);
//
//
//        });
//    }
//}
