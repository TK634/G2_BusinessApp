package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class User1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Get email and password by Edittext
        final EditText email = findViewById(R.id.email);
        final EditText password =findViewById(R.id.password);
        Button btn_submit = findViewById(R.id.ButtonToUser2);
        User1_MemberEmail ema = new User1_MemberEmail();
        btn_submit.setOnClickListener(v -> {

<<<<<<< HEAD:UserApp/app/src/main/java/com/example/userapp/MainActivity.java
            //emailとpasswordをfirebase側で見れるようにする

            Member men = new Member(email.getText().toString(),password.getText().toString());
=======

            User1_Member men = new User1_Member(email.getText().toString(),password.getText().toString());
>>>>>>> origin:UserApp/app/src/main/java/com/example/userapp/User1.java
            ema.add(men).addOnSuccessListener(suc->{
                Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->{
                Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
            });

<<<<<<< HEAD:UserApp/app/src/main/java/com/example/userapp/MainActivity.java
            //User2に遷移する
=======
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("users");
            myRef.setValue(men);
>>>>>>> origin:UserApp/app/src/main/java/com/example/userapp/User1.java

            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn_submit.getContext(), User2.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY1", "value");

            // 新規画面表示実行
            startActivity(newIntent);

<<<<<<< HEAD:UserApp/app/src/main/java/com/example/userapp/MainActivity.java
=======

>>>>>>> origin:UserApp/app/src/main/java/com/example/userapp/User1.java
        });

//        // Write a message to the database
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message2");
//
//        myRef.setValue("Hello, youtube!");
//
//        // Read from the database
//        myRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // This method is called once with the initial value and again
//                // whenever data at this location is updated.
//                String value = dataSnapshot.getValue(String.class);
//                Log.d("Sue", "Value is: " + value);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//                // Failed to read value
//                Log.w("Sue", "Failed to read value.", error.toException());
//            }
//        });



<<<<<<< HEAD:UserApp/app/src/main/java/com/example/userapp/MainActivity.java




=======

//        btn_submit.setOnClickListener(v -> {
//            // Intent を生成
//            // 第一引数はこの処理のContext
//            // 第二引数に遷移先画面のSampleActivityを指定
//            Intent newIntent = new Intent(btn_submit.getContext(), User2.class);
//
//            // Intent にデータを保存
//            newIntent.putExtra("KEY1", "value");
//
//            // 新規画面表示実行
//            startActivity(newIntent);

//        });
>>>>>>> origin:UserApp/app/src/main/java/com/example/userapp/User1.java
    }
}