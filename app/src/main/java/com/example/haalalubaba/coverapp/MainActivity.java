package com.example.haalalubaba.coverapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6;
    GridLayout mainGrid;
    TextView tX1, tX2,tX3,tX4,tX5,tX6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainGrid = (GridLayout)findViewById(R.id.mainGrid);
        cardView1 = (CardView) findViewById(R.id.cardView1);
        cardView2 = (CardView) findViewById(R.id.cardView2);
        cardView3 = (CardView) findViewById(R.id.cardView3);
        cardView4 = (CardView) findViewById(R.id.cardView4);
        cardView5 = (CardView) findViewById(R.id.cardView5);
        cardView6 = (CardView) findViewById(R.id.cardView6);

        cardView1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity4.class);
                startActivity(intent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity5.class);
                startActivity(intent);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity6.class);
                startActivity(intent);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity7.class);
                startActivity(intent);
            }
        });

    }


//    private void setSingleEvent(GridLayout mainGrid){
//        for(int i = 0; i<mainGrid.getChildCount();i++){
//            cardView = (CardView) findViewById(R.id.cardView1);
//            final int finalI = i;
//            cardView.setOnClickListener(new View.OnClickListener(){
//
//                @Override
//                public void onClick(View v) {
//                    if (finalI == 0){
//                        Intent intent = new Intent(MainActivity.this, Activity2.class);
//                        startActivity(intent);
//                    }
//
//                    else if (finalI == 1){
//                        Intent intent = new Intent(MainActivity.this, Activity3.class);
//                        startActivity(intent);
//                    }
//                    else if (finalI == 2){
//                        Intent intent = new Intent(MainActivity.this, Activity4.class);
//                        startActivity(intent);
//                    }
//                    else if (finalI == 3){
//                        Intent intent = new Intent(MainActivity.this, Activity5.class);
//                        startActivity(intent);
//                    }
//                    else if (finalI == 4){
//                        Intent intent = new Intent(MainActivity.this, Activity6.class);
//                        startActivity(intent);
//                    }
//
//
//                }
//            });
//        }
   // }

}
