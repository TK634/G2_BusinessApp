package com.example.userapp;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

//member_emailという関数　firebaseと接続
public class User1_MemberEmail {
    private DatabaseReference databaseReference;
    public User1_MemberEmail(){
        FirebaseDatabase db =FirebaseDatabase.getInstance();
        databaseReference = db.getReference(User1_Member.class.getSimpleName());

    }

    public Task<Void> add(User1_Member member){

        return databaseReference.push().setValue(member);
    }
}
