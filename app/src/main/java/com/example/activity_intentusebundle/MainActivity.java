package com.example.activity_intentusebundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.activity_intentusebundle.Model.DanhBa;

public class MainActivity extends AppCompatActivity {
    Button mBtnMoActivity,mBtnMoActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnMoActivity=findViewById(R.id.btnButton);

        mBtnMoActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);


                intent.putExtra("a",13);
                intent.putExtra("b",5.5);
                intent.putExtra("c",false);
                intent.putExtra("d","Obama");
                DanhBa bill=new DanhBa(1,"Obama","0993475869");
                intent.putExtra("e",bill);

                startActivity(intent);

            }
        });

        mBtnMoActivity2=findViewById(R.id.btnButtonBundle);

        mBtnMoActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(MainActivity.this,MainActivity3.class);

               Bundle bundle=new Bundle();

               bundle.putInt("a",10);
               bundle.putDouble("b",9.9);
               bundle.putBoolean("c",false);
               bundle.putString("d","Obama");
               DanhBa danhBa=new DanhBa(1,"Obama","0993749372");
               bundle.putSerializable("e",danhBa);

               intent.putExtra("myBundle",bundle);

               startActivity(intent);
            }
        });
    }
}