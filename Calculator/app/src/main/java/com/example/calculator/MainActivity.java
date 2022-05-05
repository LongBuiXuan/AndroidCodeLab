package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    Button bang,cong,tru,nhan,chia,c,ce,cham;
    TextView manchinh, manphu;
    String tinhtoan;
    String pheptoan;
    Boolean checkdot=false, checkBang=false;
    double n1,n2, res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                manphu.setText("");
                manchinh.setText("");
                tinhtoan="";
                pheptoan="";
                checkBang = false;
                checkdot = false;

            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "0");
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "1");
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "2");
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "3");
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "4");
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "5");
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "6");
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "7");
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "8");
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "9");
                }
            }
        });
        cham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang){
                    if(!checkdot){
                        tinhtoan = manchinh.getText().toString();
                        manchinh.setText(tinhtoan + ".");
                        checkdot = true;
                    }

                }
            }
        });
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manchinh.getText() == "") {
                    n1 = 0;
                    manphu.setText("0 + ");

                }
                else {
                    n1 = Double.parseDouble( manchinh.getText()+"");
                    manphu.setText(manchinh.getText().toString() + " + ");
                }
                manchinh.setText("");
                tinhtoan ="";
                pheptoan = "+";
                checkdot = false;
                checkBang = false;

            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manchinh.getText() == "") {
                    n1 = 0;
                    manphu.setText("0 + ");

                }
                else {
                    n1 = Double.parseDouble( manchinh.getText()+"");
                    manphu.setText(manchinh.getText().toString() + " - ");
                }
                manchinh.setText("");
                tinhtoan ="";
                pheptoan = "-";
                checkdot = false;
                checkBang = false;

            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manchinh.getText() == "") {
                    n1 = 0;
                    manphu.setText("0 + ");

                }
                else {
                    n1 = Double.parseDouble( manchinh.getText()+"");
                    manphu.setText(manchinh.getText().toString() + " x ");
                }
                manchinh.setText("");
                tinhtoan ="";
                pheptoan = "x";
                checkdot = false;
                checkBang = false;

            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manchinh.getText() == "") {
                    n1 = 0;
                    manphu.setText("0 + ");

                }
                else {
                    n1 = Double.parseDouble( manchinh.getText()+"");
                    manphu.setText(manchinh.getText().toString() + " / ");
                }
                manchinh.setText("");
                tinhtoan ="";
                pheptoan = "/";
                checkdot = false;
                checkBang = false;

            }
        });
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang){
                    checkdot = false;
                    tinhtoan = manchinh.getText().toString();
                    n2 = Double.parseDouble(manchinh.getText() + "");
                    manphu.setText(manphu.getText().toString() + manchinh.getText().toString() + "");
                    manchinh.setText("");
                    if (pheptoan == "+")
                        res = n1 + n2;
                    else if (pheptoan == "-")
                        res = n1 - n2;
                    else if (pheptoan == "x")
                        res = n1 * n2;
                    else if (pheptoan == "/")
                        res = n1 / n2;
                    checkBang = true;
                    manchinh.setText(res + "");
                }
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang){
                    String val = manchinh.getText().toString();
                    if (!val.isEmpty()){
                        val = val.substring(0, val.length() - 1);
                        manchinh.setText(val);
                    }
                }
            }
        });
    }
    protected void anhxa()
    {
        bt0 = findViewById(R.id.bt0);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        cham = findViewById(R.id.btDot);
        bang = findViewById(R.id.btEq);
        cong = findViewById(R.id.btPlus);
        tru = findViewById(R.id.btMinus);
        nhan = findViewById(R.id.btMulti);
        chia = findViewById(R.id.btDiv);
        c = findViewById(R.id.btC);
        ce = findViewById(R.id.btCE);
        manchinh = findViewById(R.id.man_hinh);
        manphu = findViewById(R.id.man_hinh_phu);

    }
}