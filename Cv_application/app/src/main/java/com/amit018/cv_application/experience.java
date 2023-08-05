package com.amit018.cv_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class experience extends AppCompatActivity {
    Button btn_save_in_exp, btn_add_in_exp;
    TextInputLayout til_Orgname_in_exp,til_jobTitle_in_exp,til_startYear_in_exp,til_lastYear_in_exp,til_summary_in_exp;
    EditText ogrName_in_exp,jobTitle_in_exp,startYear_in_exp,lastYear_in_exp,summary_in_exp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        btn_save_in_exp=findViewById(R.id.btn_save_in_exp);
        ogrName_in_exp=findViewById(R.id.ogrName_in_exp);
        jobTitle_in_exp=findViewById(R.id.jobTitle_in_exp);
        startYear_in_exp=findViewById(R.id.startYear_in_exp);
        lastYear_in_exp=findViewById(R.id.lastYear_in_exp);
        summary_in_exp =findViewById(R.id.summary_in_exp);

        SharedPreferences sp=getSharedPreferences("Mypref",MODE_PRIVATE);
        SharedPreferences.Editor editor =sp.edit();

        btn_save_in_exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("orgName_in_exp",ogrName_in_exp.getText().toString());
                editor.putString("jobTitle_in_exp",jobTitle_in_exp.getText().toString());
                editor.putString("start_in_exp",startYear_in_exp.getText().toString());
                editor.putString("last_in_exp",lastYear_in_exp.getText().toString());
                editor.putString("summary_in_exp",summary_in_exp.getText().toString());
                editor.apply();
                Toast.makeText(experience.this, "Saved", Toast.LENGTH_SHORT).show();
            }
        });

    }
}