package com.example.newactivity;

import com.example.newactivity.BusinessMember;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BusinessMemberEmail {
    private DatabaseReference databaseReference;
    public BusinessMemberEmail(){
        FirebaseDatabase db =FirebaseDatabase.getInstance();
        databaseReference = db.getReference(BusinessMember.class.getSimpleName());
    }

    public Task<Void> add(BusinessMember men){

        return databaseReference.push().setValue(men);
    }
}
