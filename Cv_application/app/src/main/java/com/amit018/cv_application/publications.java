package com.amit018.cv_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class publications extends AppCompatActivity {

    Button btn_save_in_public, btn_add_in_public;
    EditText paperName , journalName, year_in_public, summary_in_public;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publications);

        btn_save_in_public=findViewById(R.id.btn_save_in_public);
        paperName=findViewById(R.id.paperName_in_public);
        journalName=findViewById(R.id.journalName_in_public);
        year_in_public=findViewById(R.id.year_in_public);
        summary_in_public=findViewById(R.id.description_in_public);

        SharedPreferences sp=getSharedPreferences("Mypref",MODE_PRIVATE);
        SharedPreferences.Editor editor =sp.edit();


        btn_save_in_public.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("PaperName",paperName.getText().toString());
                editor.putString("JournalName",journalName.getText().toString());
                editor.putString("Year_in_public",year_in_public.getText().toString());
                editor.putString("summary_in_public",summary_in_public.getText().toString());
                editor.apply();

                Toast.makeText(publications.this, "Saved", Toast.LENGTH_SHORT).show();


            }
        });


    }
}