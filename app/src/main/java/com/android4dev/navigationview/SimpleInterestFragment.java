package com.android4dev.navigationview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by KUNAL on 9/13/2016.
 */
public class SimpleInterestFragment extends Fragment {
    EditText mEdt_amt,mEdt_rate,mEdt_time,mEdt_si;
    Button mBtn_cal;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate
                (R.layout.fragment_simpleinterest,container,false);

        mEdt_amt = (EditText) v.findViewById(R.id.edt_amt);
        mEdt_rate = (EditText) v.findViewById(R.id.edt_rate);
        mEdt_time = (EditText) v.findViewById(R.id.edt_time);
        mEdt_si = (EditText) v.findViewById(R.id.edt_si);

        mBtn_cal = (Button) v.findViewById(R.id.btn_cal);

        mBtn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double amt,rate,time,si;

                amt = Double.parseDouble(mEdt_amt.getText().toString());
                rate = Double.parseDouble(mEdt_rate.getText().toString());
                time = Double.parseDouble(mEdt_time.getText().toString());

                si = (amt * rate * time)/100;

                mEdt_si.setText(String.valueOf(si));
            }
        });
        return v;
    }
}
