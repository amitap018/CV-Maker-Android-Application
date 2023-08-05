package com.amit018.cv_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class personal_info extends AppCompatActivity {
Button btn_save_in_per;
TextInputLayout til_name,til_email,til_address,til_dob,til_phone;
EditText name1,email1,dob1,phone1,address1;


    boolean isEmailValid(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
        private boolean isValidMobile(String phone) {
            return android.util.Patterns.PHONE.matcher(phone).matches();
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        til_name=findViewById(R.id.til_name_in_per);
        til_email=findViewById(R.id.til_email_in_per);
        til_address=findViewById(R.id.til_address_in_per);
        til_dob=findViewById(R.id.til_dob_in_per);
        til_phone=findViewById(R.id.til_phone_in_per);
        email1 =findViewById(R.id.email_in_per);
        name1=findViewById(R.id.name_in_per);
        address1=findViewById(R.id.address_in_per);
        phone1=findViewById(R.id.phone_in_per);
        dob1=findViewById(R.id.dob_in_per);


        btn_save_in_per=findViewById(R.id.btn_save_in_per);
     btn_save_in_per.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String emailVar = email1.getText().toString();
             String validPhone = phone1.getText().toString();

             if (!isEmailValid(emailVar)){
                 til_email.setError("Invalid Email");
             }

             if (!isValidMobile(validPhone)){
                 til_phone.setError("Invalid Phone Number");
             }

             if(isValidMobile(validPhone) && isEmailValid(emailVar)){
               //  Intent intent = new Intent(getApplicationContext(),sample_template_11.class);

               //  String name =
                 String address = address1.getText().toString();
                 String email = email1.getText().toString();
                 String phone = phone1.getText().toString();
                 String dob = dob1.getText().toString();

              //  intent.putExtra("iname",name);
               // intent.putExtra("iaddress",address);
               //  intent.putExtra("iphone",phone);
               //  intent.putExtra("iemail",email);
               //  intent.putExtra("idob",dob);
                //startActivity(intent);
                 SharedPreferences sp=getSharedPreferences("Mypref",MODE_PRIVATE);
                 SharedPreferences.Editor editor =sp.edit();
                 editor.putString("sname", name1.getText().toString());
                 editor.putString("saddress",address);
                 editor.putString("semail",email);
                 editor.putString("sphone",phone);
                 editor.putString("sdob",dob);
                 editor.apply();
                 Toast.makeText(personal_info.this, "Saved", Toast.LENGTH_SHORT).show();

             }
         }
     });

        MaterialDatePicker<Long> datePicker =
                MaterialDatePicker.Builder.datePicker()
                        .setTitleText("Select date")
                        .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                        .build();

        til_dob.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePicker.show(getSupportFragmentManager(),"Matrial_Date");
            }
        });

datePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
    @Override
    public void onPositiveButtonClick(Object selection) {
        dob1.setText(datePicker.getHeaderText());
    }

});
    }
}
