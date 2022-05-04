package com.example.activity_intentusebundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.activity_intentusebundle.Model.DanhBa;

public class MainActivity2 extends AppCompatActivity {
    TextView mTxtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTxtView=findViewById(R.id.txtText);


        Intent intent=getIntent();

        int a=intent.getIntExtra("a",0);
        double b=intent.getDoubleExtra("b",0);
        boolean c=intent.getBooleanExtra("c",true);
        String d=intent.getStringExtra("d");
        DanhBa e= (DanhBa) intent.getSerializableExtra("e");

        mTxtView.setText("");
        mTxtView.append("a="+a+"\n");
        mTxtView.append("b="+b+"\n");
        mTxtView.append("c="+c+"\n");
        mTxtView.append("d="+d+"\n");
        mTxtView.append("e="+e+"\n");
    }
}