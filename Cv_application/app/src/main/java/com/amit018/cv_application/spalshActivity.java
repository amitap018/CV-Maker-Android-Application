package com.amit018.cv_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class spalshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        Thread thread=new Thread(){

            public void run(){
                try {
                    sleep(1500);
                }catch (Exception e)
                {
                    e.printStackTrace();
            }
                finally {
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
                }

        };
        thread.start();
    }
}