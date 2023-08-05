package com.amit018.cv_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class sample_template_11 extends AppCompatActivity  {
TextView text1, text2,text3, text4,text5,exp_1,exp_2,exp_3,skill_1,award_1,award_2,award_3,public_1,public_2,public_3,grant_2,grant_1,certif_1,certif_2;
Button floatingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_template11);
        text1=findViewById(R.id.personal_info);
        text2=findViewById(R.id.textView2);
        text3=findViewById(R.id.textView3);
        text4=findViewById(R.id.textView4);
        text5=findViewById(R.id.textView5);
        exp_1=findViewById(R.id.exp_1);
        exp_2=findViewById(R.id.exp_2);
        exp_3=findViewById(R.id.exp_3);
        skill_1=findViewById(R.id.skill_1);
        award_1=findViewById(R.id.award_1);
        award_2=findViewById(R.id.award_2);
        award_3=findViewById(R.id. award_3);
        public_1=findViewById(R.id.public_1);
        public_2=findViewById(R.id.public_2);
        public_3=findViewById(R.id.public_3);
        grant_1=findViewById(R.id.grant_1);
        grant_2=findViewById(R.id.grant_2);
        certif_1=findViewById(R.id.certif_1);
        certif_2=findViewById(R.id.certif_2);
floatingBtn=findViewById(R.id.floatingBtn);
        SharedPreferences sp=getSharedPreferences("Mypref",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();


       // Intent i = getIntent();
        String name = sp.getString("sname",String.valueOf(MODE_PRIVATE) );
        String rdob = sp.getString("sdob",null);
        String raddress = sp.getString("saddress",null);
        String rphone = sp.getString("sphone",null);
        String remail = sp.getString("semail",null);

        text1.setText(name);
        text2.setText(rdob);
        text3.setText(raddress);
        text4.setText(rphone);
        text5.setText(remail);


        exp_1.setText(sp.getString("jobTitle_in_exp",null ));
        String orgName_in_exp= sp.getString("orgName_in_exp",null);
        String sYear_in_exp = sp.getString("start_in_exp",null);
        String lYear_in_exp = sp.getString("last_in_exp",null);
        String all_in_exp=orgName_in_exp + ","+ " "+ sYear_in_exp + " - "+ lYear_in_exp ;
        exp_2.setText(all_in_exp);
        exp_3.setText(sp.getString("summary_in_exp",null));


        skill_1.setText(sp.getString("skills_in_skill",null));


        award_1.setText(sp.getString("awardName",null ));
        String orgName_in_award = sp.getString("orgName_in_award",null);
        String year_in_award = sp.getString("year_in_award",null);
        String all_in_award = orgName_in_award + ", " + year_in_award;
        award_2.setText(all_in_award);
        award_3.setText(sp.getString("summary_in_award",null));


        public_1.setText(sp.getString("PaperName",null));
        String JournalName = sp.getString("JournalName",null);
        String year_in_public=sp.getString("Year_in_public",null);
        String all_in_public = JournalName + ", " + year_in_public;
        public_2.setText(all_in_public);
        public_3.setText(sp.getString("summary_in_public",null));


        grant_1.setText(sp.getString("grantName",null));
        String orgName_in_grant=sp.getString("orgName_in_grant",null);
        String year_in_grant=sp.getString("Year_in_grant",null);
        String all_in_grant= orgName_in_grant + ", " + year_in_grant;
        grant_2.setText(all_in_grant);


        certif_1.setText(sp.getString("CertificateName",null));
        String orgName_in_certi=sp.getString("orgName_in_certi",null);
        String year_in_certi=sp.getString("year_in_certi",null);
        String all_in_certi = orgName_in_certi + ", " + year_in_certi;
        certif_2.setText(all_in_certi);



    }


}




