package com.example.newpay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class Check extends AppCompatActivity {
    transaction Transaction =new transaction();
    public double TshirtPr=25.50;
    public double WatchesPr=299.00;
    public double PantsPr=32.99;
    public double SocksPr=6.58;
    public Button myButton2;
    public Button myButton3;
    public Button myButton4;
    public Button myButton5;
    public Button myButton6;
    public Button myButton7;
    public double total1=0;
    public double total2=0;
    public double total3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liderorluser);
        final int ind= getIntent().getIntExtra("ind",0);



        myButton2 = (Button) findViewById(R.id.button3);
        myButton3 = (Button) findViewById(R.id.button4);
        myButton3 = (Button) findViewById(R.id.button8);
        myButton4 = (Button) findViewById(R.id.button9);
        myButton5 = (Button) findViewById(R.id.button10);
        myButton6 = (Button) findViewById(R.id.button11);
        myButton7=(Button) findViewById(R.id.button12);

        myButton3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
//                Intent intent1 = new Intent(Check.this, MainLider.class);
//                startActivity(intent1);
                System.out.println("T-Shirt");
                //total+=TshirtPr;
                if (ind==1) {
                    total1 +=TshirtPr;
                }
                if (ind==2) {
                    total2 +=TshirtPr;
                }
                if (ind==3) {
                    total3 +=TshirtPr;
                }
               // Toast.makeText(Check.class,"T-Shirt",1);
            }
        });

        myButton4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(Check.this, MainLider.class);
//                startActivity(intent);
                if (ind==1) {
                    total1 += WatchesPr;
                }
                if (ind==2) {
                    total2 += WatchesPr;
                }
                if (ind==3) {
                    total3 += WatchesPr;
                }
                System.out.println("Watches");
            }
        });
        myButton5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(Check.this, MainLider.class);
//                startActivity(intent);
                //total+=PantsPr;
                if (ind==1) {
                    total1 += PantsPr;
                }
                if (ind==2) {
                    total2 += PantsPr;
                }
                if (ind==3) {
                    total3 += PantsPr;
                }
                System.out.println("Pants");
            }
        });

        myButton6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
               // total+=SocksPr;
                if (ind==1) {
                    total1 += SocksPr;
                }
                if (ind==2) {
                    total2 += SocksPr;
                }
                if (ind==3) {
                    total3 += SocksPr;
                }
                System.out.println("Socks");
            }
        });

        myButton7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
//
                Intent intent21 = new Intent(Check.this, transaction.class);
//                Intent intent31 = new Intent(Check.this, transaction.class);
//                Intent intent41 = new Intent(Check.this, transaction.class);
//                if (ind==1) {
//                    intent21.putExtra("amount",total1);
//                    intent21.putExtra("payer","5774e24d8d4e1d6636d769b47fc5a1161cc6133c");
//                    startActivity(intent21);
//                }
//                if (ind==2) {
//                    intent31.putExtra("amount",total2);
//                    intent31.putExtra("payer","08dc927294f2d52746e5082fa60e3f46c31fb56a");
//                    startActivity(intent21);
//                }
//                if (ind==3) {
//                    intent41.putExtra("amount",total2);
//                    intent41.putExtra("payer","6c740963c9480dfb5a8656bc576ce0cde7549ba6");
//                    startActivity(intent21);
//                }

                //intent21.putExtra("amount",total1);
                //intent21.putExtra("payer","5774e24d8d4e1d6636d769b47fc5a1161cc6133c");
                startActivity(intent21);
            }
        });

    }
}
