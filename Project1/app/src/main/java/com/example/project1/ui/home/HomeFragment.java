package com.example.project1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.project1.R;
import com.example.project1.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    Button bang,cong,tru,nhan,chia,c,ce,cham;
    TextView manchinh, manphu;
    String tinhtoan;
    String pheptoan;
    Boolean checkdot=false, checkBang=false;
    double n1,n2, res;

    private FragmentHomeBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        manchinh = view.findViewById(R.id.man_hinh);
        manphu = view.findViewById(R.id.man_hinh_phu);
        bt0 = view.findViewById(R.id.bt0);
        bt1 = view.findViewById(R.id.bt1);
        bt2 = view.findViewById(R.id.bt2);
        bt3 = view.findViewById(R.id.bt3);
        bt4 = view.findViewById(R.id.bt4);
        bt5 = view.findViewById(R.id.bt5);
        bt6 = view.findViewById(R.id.bt6);
        bt7 = view.findViewById(R.id.bt7);
        bt8 = view.findViewById(R.id.bt8);
        bt9 = view.findViewById(R.id.bt9);
        cham = view.findViewById(R.id.btDot);
        bang = view.findViewById(R.id.btEq);
        cong = view.findViewById(R.id.btPlus);
        tru = view.findViewById(R.id.btMinus);
        nhan = view.findViewById(R.id.btMulti);
        chia = view.findViewById(R.id.btDiv);
        c = view.findViewById(R.id.btC);
        ce = view.findViewById(R.id.btCE);

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

        return view;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}