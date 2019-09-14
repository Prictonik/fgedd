package com.example.newpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainLider extends AppCompatActivity {

    public ImageButton myImageButton1, myImageButton2;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlideractyvity);


        myImageButton1 = (ImageButton) findViewById(R.id.imageButton2);
        myImageButton2 = (ImageButton) findViewById(R.id.imageButton4);
        button = (Button) findViewById(R.id.button7);

        myImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainLider.this, OcrCaptureActivity.class);
                startActivity(intent2);

                // Go camera detect;
            }
        });


        final Context context = this;



        myImageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                    Button a = new Button(context);
                    a.setText("test");
                    LinearLayout ll = (LinearLayout) findViewById(R.id.linearlayout);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    ll.addView(a, lp);
                    //a.setId(USERID + countID);



                    ListView b = new ListView(context);
                    b.getAdapter();

                    //linearLayout.addView(b);

            }
        });

    }
}
