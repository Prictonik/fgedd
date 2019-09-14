package com.example.newpay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LiderOrUser extends AppCompatActivity {

    public Button myButton2;
    public Button myButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liderorluser);

        myButton2 = (Button) findViewById(R.id.button3);
        myButton3 = (Button) findViewById(R.id.button4);

        myButton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiderOrUser.this, MainLider.class);
                startActivity(intent);
            }
        });

        myButton3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiderOrUser.this, MainUser.class);
                startActivity(intent);
            }
        });

    }
}
