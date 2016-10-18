package com.android4dev.navigationview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by KUNAL on 9/9/2016.
 */
public class TemperatureConverterFragment extends Fragment {
    EditText mEdt_tempF,mEdt_tempC;
    Button mBtn_convert;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(
                R.layout.fragment_temperature_converter,container,false);

        mEdt_tempF = (EditText) v.findViewById(R.id.edt_tempF);
        mEdt_tempC = (EditText) v.findViewById(R.id.edt_tempC);

        mBtn_convert = (Button) v.findViewById(R.id.btn_convert);

        mBtn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double celsius,fahrenheit;

                fahrenheit = Double.parseDouble(mEdt_tempF.getText().toString());

                celsius = (fahrenheit - 32) * 5 / 9;

                mEdt_tempC.setText(String.valueOf(celsius));
            }
        });

        return v;
    }
}

