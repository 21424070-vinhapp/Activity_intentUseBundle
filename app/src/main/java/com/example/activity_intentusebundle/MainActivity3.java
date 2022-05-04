package com.example.activity_intentusebundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.activity_intentusebundle.Model.DanhBa;

public class MainActivity3 extends AppCompatActivity {
    TextView mTxtView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mTxtView2=findViewById(R.id.txtText2);

        Intent intent=getIntent();

        Bundle bundle=intent.getBundleExtra("myBundle");

        int a=bundle.getInt("a",0);
        double b=bundle.getDouble("b",0);
        boolean c=bundle.getBoolean("c",true);
        String d=bundle.getString("d");
        DanhBa danhba= (DanhBa) bundle.getSerializable("e");

        mTxtView2.setText("");
        mTxtView2.append("a="+a+"\n");
        mTxtView2.append("b="+b+"\n");
        mTxtView2.append("c="+c+"\n");
        mTxtView2.append("d="+d+"\n");
        mTxtView2.append("e="+danhba+"\n");
    }
}