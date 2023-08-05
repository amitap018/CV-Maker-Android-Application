package com.amit018.cv_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class skills extends AppCompatActivity {
Button btn_save_in_skill,btn_add_in_skill;
EditText skill_in_skill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        btn_save_in_skill=findViewById(R.id.btn_save_in_skills);
        skill_in_skill=findViewById(R.id.skill_in_skill);

        SharedPreferences sp=getSharedPreferences("Mypref",MODE_PRIVATE);
        SharedPreferences.Editor editor =sp.edit();

        btn_save_in_skill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("skills_in_skill",skill_in_skill.getText().toString());
                editor.apply();
                Toast.makeText(skills.this, "Saved", Toast.LENGTH_SHORT).show();

            }
        });

    }
}