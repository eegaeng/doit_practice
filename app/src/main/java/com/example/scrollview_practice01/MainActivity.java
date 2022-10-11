package com.example.scrollview_practice01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgView1;
    ImageView imgView2;
    Button b1;

    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout_practice1);

        imgView1 = findViewById(R.id.img1);
        imgView2 = findViewById(R.id.img2);
        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                changeImage();
            }

            private void changeImage(){
                if (imageIndex == 0){
                    imgView1.setVisibility(View.VISIBLE);
                    imgView2.setVisibility(View.INVISIBLE);
                    imageIndex =1;
                }

                else if (imageIndex == 1){
                    imgView2.setVisibility(View.VISIBLE);
                    imgView1.setVisibility(View.INVISIBLE);
                    imageIndex =0;
                }
            }

        }
        );




    }
}