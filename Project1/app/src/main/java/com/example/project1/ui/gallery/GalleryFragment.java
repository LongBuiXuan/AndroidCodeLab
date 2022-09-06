package com.example.project1.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.project1.R;
import com.example.project1.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bta,btb,btc,btd,bte,btf;
    Button bang,cong,tru,nhan,chia,c,ce,cham;
    TextView manchinh, manphu, manhexa, manocta, mandec, manbin;
    String tinhtoan;
    String pheptoan;
    Boolean checkdot=false, checkBang=false;
    Integer n1,n2, res;



    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        manchinh = view.findViewById(R.id.man_hinh0);
        manphu = view.findViewById(R.id.man_hinh_phu1);
        bt0 = view.findViewById(R.id.button0);
        bt1 = view.findViewById(R.id.button1);
        bt2 = view.findViewById(R.id.button2);
        bt3 = view.findViewById(R.id.button3);
        bt4 = view.findViewById(R.id.button4);
        bt5 = view.findViewById(R.id.button5);
        bt6 = view.findViewById(R.id.button6);
        bt7 = view.findViewById(R.id.button7);
        bt8 = view.findViewById(R.id.button8);
        bt9 = view.findViewById(R.id.button9);
        cham = view.findViewById(R.id.buttoncham);
        bang = view.findViewById(R.id.buttonbang);
        cong = view.findViewById(R.id.buttoncong);
        tru = view.findViewById(R.id.buttontru);
        nhan = view.findViewById(R.id.buttonnhan);
        chia = view.findViewById(R.id.buttonchia);
        c = view.findViewById(R.id.buttonclear);
        ce = view.findViewById(R.id.buttonCE);
        manbin = view.findViewById(R.id.bin);
        manhexa = view.findViewById(R.id.hexa);
        mandec = view.findViewById(R.id.deci);
        manocta = view.findViewById(R.id.octa);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                manphu.setText("");
                manchinh.setText("");
                manocta.setText("");
                manhexa.setText("");
                mandec.setText("");
                manbin.setText("");
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
        //cham.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View view) {
              //  if (!checkBang){
                //    if(!checkdot){
                  //      tinhtoan = manchinh.getText().toString();
                    //    manchinh.setText(tinhtoan + ".");
                      //  checkdot = true;
                    //}

                //}
            //}
        //});
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manchinh.getText() == "") {
                    n1 = 0;
                    manphu.setText("0 + ");

                }
                else {
                    n1 = Integer.parseInt( manchinh.getText()+"");
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
                    n1 = Integer.parseInt(manchinh.getText() + "");
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
                    n1 = Integer.parseInt( manchinh.getText()+"");
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
                    n1 = Integer.parseInt( manchinh.getText()+"");
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
                    n2 = Integer.parseInt(manchinh.getText() + "");
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
                    manbin.setText(Integer.toBinaryString(res));
                    mandec.setText(res + "");
                    manhexa.setText(Integer.toHexString(res));
                    manocta.setText(Integer.toOctalString(res));
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