package com.example.form;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btOK;
    EditText etName, etMSSV, etCCCD, etNum, etMail;
    boolean check = false;
    CheckBox conditionCheck ;
    boolean checkBoxState = conditionCheck.isChecked();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etName = findViewById(R.id.Name);
        etMSSV = findViewById(R.id.MSSV);
        etCCCD = findViewById(R.id.CCCD);
        etNum = findViewById(R.id.Phone);
        etMail = findViewById(R.id.mail);

        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = CheckAll();
                if (check) {
                }
            }
        });

    }
    private boolean CheckAll(){
        if (etName.length()==0){
            etName.setError("Chưa nhập thông tin");
            return false;
        }
        if (etMSSV.length()==0) {
            etMSSV.setError("Chưa nhập thông tin");
            return false;
        }
        if (etCCCD.length()==0){
            etCCCD.setError("Chưa nhập thông tin");
            return false;
        }
        if (etNum.length()==0){
            etNum.setError("Chưa nhập thông tin");
            return false;
        }
        if (etMail.length()==0){
            etMail.setError("Chưa nhập thông tin");
            return false;
        }
        if (!checkBoxState ){
            conditionCheck.setError("Chưa đồng ý điều khoản");
            return false;
        }
        return true;
    }
}