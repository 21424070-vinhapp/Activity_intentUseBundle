package com.example.activity_intentusebundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.activity_intentusebundle.Model.DanhBa;

public class MainActivity extends AppCompatActivity {
    Button mBtnMoActivity;

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
    }
}