package com.example.project1.ui.gallery;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.project1.R;
import com.example.project1.databinding.FragmentGalleryBinding;

import java.math.BigInteger;

public class GalleryFragment extends Fragment {

    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bta,btb,btc,btd,bte,btf,btdeci,bthexa,btocta,btbin;
    Button bang,cong,tru,nhan,chia,c,ce,cham, abs;
    TextView manchinh, manphu, manhexa, manocta, mandec, manbin;
    String tinhtoan;
    String pheptoan;
    Integer mode,k;
    String hex1, dec1, octa1, bin1;
    Boolean checkdot=false, checkBang=false;
    String n1,n2, res, change;
    BigInteger value;




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
        bta = view.findViewById(R.id.buttonA);
        btb = view.findViewById(R.id.buttonB);
        btc = view.findViewById(R.id.buttonC);
        btd = view.findViewById(R.id.buttonD);
        bte = view.findViewById(R.id.buttonE);
        btf = view.findViewById(R.id.buttonF);
        cham = view.findViewById(R.id.buttoncham);
        bang = view.findViewById(R.id.buttonbang);
        cong = view.findViewById(R.id.buttoncong);
        tru = view.findViewById(R.id.buttontru);
        nhan = view.findViewById(R.id.buttonnhan);
        chia = view.findViewById(R.id.buttonchia);
        abs = view.findViewById(R.id.buttonabs);
        c = view.findViewById(R.id.buttonclear);
        ce = view.findViewById(R.id.buttonCE);
        manbin = view.findViewById(R.id.bin);
        manhexa = view.findViewById(R.id.hexa);
        mandec = view.findViewById(R.id.deci);
        manocta = view.findViewById(R.id.octa);
        bthexa = view.findViewById(R.id.buttonhexa);
        btocta = view.findViewById(R.id.buttonocta);
        btbin = view.findViewById(R.id.buttonbin);
        btdeci = view.findViewById(R.id.buttondeci);



        abs.setEnabled(false);
        cham.setEnabled(false);
        bta.setEnabled(false);
        btb.setEnabled(false);
        btc.setEnabled(false);
        btd.setEnabled(false);
        bte.setEnabled(false);
        btf.setEnabled(false);


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
        bta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "a");
                }
            }
        });
        btb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "b");
                }
            }
        });
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "c");
                }
            }
        });
        btd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "d");
                }
            }
        });
        bte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "e");
                }
            }
        });
        btf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = manchinh.getText().toString();
                    manchinh.setText(tinhtoan + "f");
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

        TextWatcher DeciText = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                tinhtoan = manchinh.getText().toString();
                if (!tinhtoan.equals("")) {
                    k = Integer.parseInt(manchinh.getText() + "");
                }
                manbin.setText(Integer.toBinaryString(k));
                mandec.setText(k + "");
                manhexa.setText(Integer.toHexString(k));
                manocta.setText(Integer.toOctalString(k));

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        TextWatcher HexaText = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                tinhtoan = manchinh.getText().toString();
                if (!tinhtoan.equals("")) {
                    k = Integer.parseInt(manchinh.getText() + "", 16);
                }
                manbin.setText(Integer.toBinaryString(k));
                mandec.setText(k + "");
                manhexa.setText(Integer.toHexString(k));
                manocta.setText(Integer.toOctalString(k));

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        TextWatcher OctaText = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                tinhtoan = manchinh.getText().toString();
                if (!tinhtoan.equals("")) {
                    k = Integer.parseInt(manchinh.getText() + "", 8);
                }
                manbin.setText(Integer.toBinaryString(k));
                mandec.setText(k + "");
                manhexa.setText(Integer.toHexString(k));
                manocta.setText(Integer.toOctalString(k));

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        TextWatcher BinText = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                tinhtoan = manchinh.getText().toString();
                if (!tinhtoan.equals("")) {
                    k = Integer.parseInt(manchinh.getText() + "", 2);
                }
                manbin.setText(Integer.toBinaryString(k));
                mandec.setText(k + "");
                manhexa.setText(Integer.toHexString(k));
                manocta.setText(Integer.toOctalString(k));

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };


        bthexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                manchinh.removeTextChangedListener(DeciText);
                manchinh.removeTextChangedListener(OctaText);
                manchinh.removeTextChangedListener(BinText);
                manchinh.addTextChangedListener(HexaText);
                bta.setEnabled(true);
                btb.setEnabled(true);
                btc.setEnabled(true);
                btd.setEnabled(true);
                bte.setEnabled(true);
                btf.setEnabled(true);
                bt9.setEnabled(true);
                bt8.setEnabled(true);
                bt7.setEnabled(true);
                bt6.setEnabled(true);
                bt5.setEnabled(true);
                bt4.setEnabled(true);
                bt3.setEnabled(true);
                bt2.setEnabled(true);

            }
        });

        btdeci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                manchinh.removeTextChangedListener(HexaText);
                manchinh.removeTextChangedListener(OctaText);
                manchinh.removeTextChangedListener(BinText);
                manchinh.addTextChangedListener(DeciText);
                bta.setEnabled(false);
                btb.setEnabled(false);
                btc.setEnabled(false);
                btd.setEnabled(false);
                bte.setEnabled(false);
                btf.setEnabled(false);
                bt9.setEnabled(true);
                bt8.setEnabled(true);
                bt7.setEnabled(true);
                bt6.setEnabled(true);
                bt5.setEnabled(true);
                bt4.setEnabled(true);
                bt3.setEnabled(true);
                bt2.setEnabled(true);

            }
        });

        btocta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                manchinh.removeTextChangedListener(DeciText);
                manchinh.removeTextChangedListener(HexaText);
                manchinh.removeTextChangedListener(BinText);
                manchinh.addTextChangedListener(OctaText);

                bta.setEnabled(false);
                btb.setEnabled(false);
                btc.setEnabled(false);
                btd.setEnabled(false);
                bte.setEnabled(false);
                btf.setEnabled(false);
                bt9.setEnabled(false);
                bt8.setEnabled(false);
                bt7.setEnabled(true);
                bt6.setEnabled(true);
                bt5.setEnabled(true);
                bt4.setEnabled(true);
                bt3.setEnabled(true);
                bt2.setEnabled(true);

            }
        });

        btbin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                manchinh.removeTextChangedListener(DeciText);
                manchinh.removeTextChangedListener(HexaText);
                manchinh.removeTextChangedListener(OctaText);
                manchinh.addTextChangedListener(BinText);

                bta.setEnabled(false);
                btb.setEnabled(false);
                btc.setEnabled(false);
                btd.setEnabled(false);
                bte.setEnabled(false);
                btf.setEnabled(false);
                bt9.setEnabled(false);
                bt8.setEnabled(false);
                bt7.setEnabled(false);
                bt6.setEnabled(false);
                bt5.setEnabled(false);
                bt4.setEnabled(false);
                bt3.setEnabled(false);
                bt2.setEnabled(false);

            }
        });



        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manchinh.getText() == "") {
                    n1="";
                    manphu.setText("0 + ");

                }
                else {
                    n1 = manchinh.getText().toString();
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
                    n1="";
                    manphu.setText("0 + ");

                }
                else {
                    n1 = manchinh.getText().toString();
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
                    n1 = "";
                    manphu.setText("0 + ");

                }
                else {
                    n1 = manchinh.getText().toString();
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
                    n1="";
                    manphu.setText("0 + ");

                }
                else {
                    n1 = manchinh.getText().toString();
                    manphu.setText(manchinh.getText().toString() + " / ");
                }
                manchinh.setText("");
                tinhtoan ="";
                pheptoan = "/";
                checkdot = false;
                checkBang = false;

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