package com.example.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nameEt=findViewById(R.id.nameEt);
        final EditText regNumEt=findViewById(R.id.regNumEt);
        final CheckBox sub1=findViewById(R.id.sub1);
        CheckBox sub2=findViewById(R.id.sub2);
        CheckBox sub3=findViewById(R.id.sub3);
        CheckBox sub4=findViewById(R.id.sub4);
        CheckBox sub5=findViewById(R.id.sub5);
        Button submit=findViewById(R.id.submit);
        final ArrayList<String> list=new ArrayList<>();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              boolean  flag=true;
                if(nameEt.getText().toString().isEmpty())
                {
                   nameEt.setError("Please Enter Name");
                   flag=false;
                }
                if(nameEt.getText().toString().isEmpty())
                {
                    nameEt.setError("Please Registartion Number");
                    flag=false;
                }
                if(list.size()!=3)
                {
                    Toast.makeText(MainActivity.this,"Please Select Three Subjects",Toast.LENGTH_SHORT).show();
                    flag=false;
                }
                if(flag) {
                    Toast.makeText(MainActivity.this,"Submited Successfully",Toast.LENGTH_SHORT).show();

                    Intent intent=new Intent(MainActivity.this,SuccessActivity.class);
                    intent.putExtra("name",nameEt.getText().toString());
                    intent.putExtra("id",regNumEt.getText().toString());
                    intent.putExtra("list", TextUtils.join("\n",list));
                    startActivity(intent);
                }
            }
        });

        sub1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                if(!list.contains(buttonView.getText().toString()))
                    {
                        list.add(buttonView.getText().toString());
                    }
                }else
                {
                    if(list.contains(buttonView.getText().toString()))
                    {
                        list.remove(buttonView.getText().toString());
                    }
                }
            }
        });

        sub2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    if(!list.contains(buttonView.getText().toString()))
                    {
                        list.add(buttonView.getText().toString());
                    }
                }else
                {
                    if(list.contains(buttonView.getText().toString()))
                    {
                        list.remove(buttonView.getText().toString());
                    }
                }
            }
        });
        sub3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    if(!list.contains(buttonView.getText().toString()))
                    {
                        list.add(buttonView.getText().toString());
                    }
                }else
                {
                    if(list.contains(buttonView.getText().toString()))
                    {
                        list.remove(buttonView.getText().toString());
                    }
                }
            }
        });
        sub4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    if(!list.contains(buttonView.getText().toString()))
                    {
                        list.add(buttonView.getText().toString());
                    }
                }else
                {
                    if(list.contains(buttonView.getText().toString()))
                    {
                        list.remove(buttonView.getText().toString());
                    }
                }
            }
        });
        sub5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    if(!list.contains(buttonView.getText().toString()))
                    {
                        list.add(buttonView.getText().toString());
                    }
                }else
                {
                    if(list.contains(buttonView.getText().toString()))
                    {
                        list.remove(buttonView.getText().toString());
                    }
                }
            }
        });

    }
}