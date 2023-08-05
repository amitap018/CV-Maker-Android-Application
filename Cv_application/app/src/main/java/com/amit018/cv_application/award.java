package com.amit018.cv_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class award extends AppCompatActivity {

    Button btn_save_in_award, btn_add_in_award;
    EditText awardName , orgName_in_award, year_in_award, summary_in_award;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_award);

        btn_save_in_award=findViewById(R.id.btn_save_in_award);
        awardName=findViewById(R.id.awardName_in_award);
        orgName_in_award=findViewById(R.id.orgName_in_award);
        year_in_award=findViewById(R.id.year_in_award);
        summary_in_award=findViewById(R.id.description_in_award);

        SharedPreferences sp=getSharedPreferences("Mypref",MODE_PRIVATE);
        SharedPreferences.Editor editor =sp.edit();

        btn_save_in_award.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("awardName",awardName.getText().toString());
                editor.putString("orgName_in_award",orgName_in_award.getText().toString());
                editor.putString("year_in_award",year_in_award.getText().toString());
                editor.putString("summary_in_award",summary_in_award.getText().toString());
                editor.apply();
                Toast.makeText(award.this, "Saved", Toast.LENGTH_SHORT).show();
            }
        });


    }
}