package com.amit018.cv_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class certificate extends AppCompatActivity {

    Button btn_save_in_certi, btn_add_in_certi;
    EditText certifName, orgName_in_certi, year_in_certi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);

        btn_save_in_certi=findViewById(R.id.btn_save_in_certi);
        certifName=findViewById(R.id.certiName_in_certi);
        orgName_in_certi=findViewById(R.id.orgName_in_certi);
        year_in_certi=findViewById(R.id.year_in_certi);

        SharedPreferences sp=getSharedPreferences("Mypref",MODE_PRIVATE);
        SharedPreferences.Editor editor =sp.edit();

        btn_save_in_certi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("CertificateName",certifName.getText().toString());
                editor.putString("orgName_in_certi",orgName_in_certi.getText().toString());
                editor.putString("year_in_certi",year_in_certi.getText().toString());
                editor.apply();

                Toast.makeText(certificate.this, "Saved", Toast.LENGTH_SHORT).show();

            }
        });
    }
}