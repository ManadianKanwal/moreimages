package com.lec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView image1;
Button btn1;
int first_image;
int images[]={R.drawable.scene,R.drawable.pic,R.drawable.picture,R.drawable.nature,R.drawable.tree};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        image1=findViewById(R.id.image1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_image++;
                first_image=first_image % images.length;
                image1.setImageResource(images[first_image]);
            }
        });
    }
}
