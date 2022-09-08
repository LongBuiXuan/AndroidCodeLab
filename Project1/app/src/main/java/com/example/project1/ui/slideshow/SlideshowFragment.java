package com.example.project1.ui.slideshow;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.project1.Retrofit.Currency;
import com.example.project1.Retrofit.RetrofitInterface;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.example.project1.R;
import com.example.project1.databinding.FragmentSlideshowBinding;


public class SlideshowFragment extends Fragment {

    Button swap,update;
    EditText currencyToBeConverted;
    TextView currencyConverted,updatestatus;
    Spinner convertToDropdown;
    Spinner convertFromDropdown;
    JsonObject res, rates;
    double amount, rate1, rate2, rate;

    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);



        //Initialization
        currencyConverted = (TextView) view.findViewById(R.id.currency_converted);
        currencyToBeConverted = (EditText) view.findViewById(R.id.currency_to_be_converted);
        convertToDropdown = (Spinner) view.findViewById(R.id.convert_to);
        convertFromDropdown = (Spinner) view.findViewById(R.id.convert_from);
        swap = (Button) view.findViewById(R.id.btswap);
        update = (Button) view.findViewById(R.id.update);
        updatestatus =(TextView) view.findViewById(R.id.update_status);

        //Adding Functionality
        String[] dropDownList = {"USD","INR","EUR","NZD","VND","CNY","JPY"};
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, dropDownList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        convertToDropdown.setAdapter(adapter);
        convertFromDropdown.setAdapter(adapter);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RetrofitInterface.retrofitInterface.getExchangeCurrency("USD").enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                        res = response.body();
                        rates = res.getAsJsonObject("conversion_rates");
                        //double currency = Double.valueOf(currencyToBeConverted.getText().toString());
                        //double multiplier = Double.valueOf(rates.get(convertToDropdown.getSelectedItem().toString()).toString());
                        //double result = currency * multiplier;

                        updatestatus.setText("OK");

                    }

                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable t) {

                    }
                });



                    }
                });

        currencyToBeConverted.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                amount = Double.valueOf(currencyToBeConverted.getText().toString());
                rate1 = Double.valueOf(rates.get(convertToDropdown.getSelectedItem().toString()).toString());
                rate2 = Double.valueOf(rates.get(convertFromDropdown.getSelectedItem().toString()).toString());
                rate = rate1/rate2;
                double result = rate * amount;
                currencyConverted.setText(String.valueOf(result));
            }

            @Override
            public void afterTextChanged(Editable editable) {


            }
        });

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int spinner1Index = convertToDropdown.getSelectedItemPosition();

                convertToDropdown.setSelection(convertFromDropdown.getSelectedItemPosition());
                convertFromDropdown.setSelection(spinner1Index );
                amount = Double.valueOf(currencyToBeConverted.getText().toString());
                rate1 = Double.valueOf(rates.get(convertToDropdown.getSelectedItem().toString()).toString());
                rate2 = Double.valueOf(rates.get(convertFromDropdown.getSelectedItem().toString()).toString());
                rate = rate1/rate2;
                double result = rate * amount;
                currencyConverted.setText(String.valueOf(result));

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