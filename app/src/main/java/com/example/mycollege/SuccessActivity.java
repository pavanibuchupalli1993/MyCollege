package com.example.mycollege;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;

public class SuccessActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success_layout);
        final TextView dataTv = findViewById(R.id.text);

        dataTv.setText("Name: "+getIntent().getStringExtra("name")+"\n"+"Registration Id: "+getIntent().getStringExtra("id")+"\n"+
                "Your Choosed Subjects: "+"\n"+getIntent().getStringExtra("list"));

    }
}
