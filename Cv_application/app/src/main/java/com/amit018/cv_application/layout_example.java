package com.amit018.cv_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout_example extends AppCompatActivity {
Button btn_personal;
Button btn_exp;
Button btn_skills;
    Button btn_award;
    Button btn_public;
    Button btn_grants;
Button btn_certi;
Button btn_edu;
Button btn_viewCv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_example);

        btn_personal= findViewById(R.id.btn_contact);
        btn_personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),personal_info.class);
                startActivity(intent);
            }
        });

        btn_exp = findViewById(R.id.btn_exp);
        btn_exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),experience.class);
                startActivity(intent);
            }
        });

        btn_skills=findViewById(R.id.btn_skill);
        btn_skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),skills.class);
                startActivity(intent);
            }
        });

btn_award=findViewById(R.id.btn_award);
        btn_award.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),award.class);
                startActivity(intent);
            }
        });

        btn_public=findViewById(R.id.btn_public);
        btn_public.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),publications.class);
                startActivity(intent);
            }
        });


        btn_grants=findViewById(R.id.btn_grants);
        btn_grants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),grants.class);
                startActivity(intent);
            }
        });

btn_certi=findViewById(R.id.btn_certificate);
btn_certi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(),certificate.class);
        startActivity(intent);
    }
});

btn_edu =findViewById(R.id.btn_edu);
btn_edu.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(),education.class);
        startActivity(intent);
    }
});

btn_viewCv=findViewById(R.id.btn_viewCv);
btn_viewCv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(),sample_template_11.class);
        startActivity(intent);
    }
});

    }
}