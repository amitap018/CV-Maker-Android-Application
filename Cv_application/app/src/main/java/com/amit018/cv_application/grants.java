package com.amit018.cv_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class grants extends AppCompatActivity {

    Button btn_save_in_grants, btn_add_in_grants;
    EditText grantName, orgName_in_grant, year_in_grant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grants);

        btn_save_in_grants=findViewById(R.id.btn_save_in_grants);
        grantName=findViewById(R.id.grantName_in_grants);
        orgName_in_grant=findViewById(R.id.orgName_in_grants);
        year_in_grant=findViewById(R.id.year_in_grants);

        SharedPreferences sp=getSharedPreferences("Mypref",MODE_PRIVATE);
        SharedPreferences.Editor editor =sp.edit();

        btn_save_in_grants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("grantName",grantName.getText().toString());
                editor.putString("orgName_in_grant",orgName_in_grant.getText().toString());
                editor.putString("Year_in_grant",year_in_grant.getText().toString());
                editor.apply();
                Toast.makeText(grants.this, "Saved", Toast.LENGTH_SHORT).show();

            }
        });
    }
}