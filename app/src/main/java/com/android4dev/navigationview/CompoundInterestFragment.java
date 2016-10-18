package com.android4dev.navigationview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by KUNAL on 9/13/2016.
 */
public class CompoundInterestFragment extends Fragment {
    EditText mEdt_Principle,mEdt_Rate,mEdt_Years,mEdt_cpy;
    TextView mView_CI;
    Button mBtn_Check;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_compundinterest, container, false);
        mEdt_Principle = (EditText) v.findViewById(R.id.edt_principle);
        mEdt_Rate = (EditText) v.findViewById(R.id.edt_rate);
        mEdt_Years = (EditText) v.findViewById(R.id.edt_years);
        mEdt_cpy = (EditText) v.findViewById(R.id.edt_cpy);
        mView_CI = (TextView) v.findViewById(R.id.view_ci);

        mBtn_Check=(Button) v.findViewById(R.id.btn_check);

        mBtn_Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p,n,t;
                double a,r;

                p = Integer.parseInt(mEdt_Principle.getText().toString());
                n = Integer.parseInt(mEdt_cpy.getText().toString());
                t = Integer.parseInt(mEdt_Years.getText().toString());
                r = Double.parseDouble(mEdt_Rate.getText().toString());

                r = r/100;
                a = p * Math.pow(1+r/n,(n*t));
                mView_CI.setText(String.valueOf(a));
            }
        });
        return v;
    }
}
