package com.example.newpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainLider extends AppCompatActivity {

    public ImageButton myImageButton1, myImageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlideractyvity);

        int ind= (int) getIntent().getIntExtra("ind",0);
        myImageButton1 = (ImageButton) findViewById(R.id.imageButton2);
        myImageButton2 = (ImageButton) findViewById(R.id.imageButton4);


        myImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainLider.this, BarcodeCaptureActivity.class);
                startActivity(intent2);

            }
        });



        final Context context = this;
        if (ind==1) {
            Button a = new Button(context);
            Button b = new Button(context);
            Button c = new Button(context);
            //c.setAdapter(new ArrayAdapter<String>(this, R.layout.fragment_item, ItemFragment.class));
            LinearLayout ll = (LinearLayout) findViewById(R.id.linearlayout);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            ll.addView(a, lp);
            ll.addView(b, lp);
            ll.addView(c, lp);

            a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent11 = new Intent(MainLider.this, transaction.class );
                    intent11.putExtra("ind",1);
                    startActivity(intent11);

                }
            });

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent11 = new Intent(context, Check.class );
                    intent11.putExtra("ind",2);
                    startActivity(intent11);

                }
            });

            c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent11 = new Intent(context, Check.class );
                    intent11.putExtra("ind",3);
                    startActivity(intent11);

                }
            });
        }

        myImageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



            }
        });

    }
    protected void onPause() {
        super.onPause();

    }
    protected void onResume() {
        super.onResume();

    }
}
