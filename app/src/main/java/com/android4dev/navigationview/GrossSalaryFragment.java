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
public class GrossSalaryFragment extends Fragment {
    EditText mEdt_accept;
    Button mBtn_cal;
    TextView mView_result;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

         final View v = inflater.inflate
                (R.layout.fragment_grosssalary, container, false);

        mEdt_accept = (EditText) v.findViewById(R.id.edt_accept);
        mBtn_cal = (Button) v.findViewById(R.id.btn_cal);

        mBtn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int basic;
                double hra,da,pf,tax,gross;

                basic = Integer.parseInt(mEdt_accept.getText().toString());

                if (basic <= 0 && basic >=4000){
                    hra = (basic * 10) / 100;
                    da = (basic * 50) / 100;
                    pf = (basic * 15) / 100;
                    tax = (basic * 2) / 100;

                    gross = (basic + hra + da) - (pf + tax);
                }
                else if (basic <= 4001 && basic >=8000){
                    hra = (basic * 20) / 100;
                    da = (basic * 60) / 100;
                    pf = (basic * 10) / 100;
                    tax = (basic * 5) / 100;

                    gross = (basic + hra + da) - (pf + tax);
                }
                else if (basic <= 8001 && basic >=12000){
                    hra = (basic * 25) / 100;
                    da = (basic * 70) / 100;
                    pf = (basic * 10) / 100;
                    tax = (basic * 8) / 100;

                    gross = (basic + hra + da) - (pf + tax);
                }
                else{
                    hra = (basic * 30) / 100;
                    da = (basic * 80) / 100;
                    pf = (basic * 15) / 100;
                    tax = (basic * 10) / 100;

                    gross = (basic + hra + da) - (pf + tax);
                }

                mView_result = (TextView) v.findViewById(R.id.view);
                mView_result.setText(String.valueOf(gross));
            }
        });
        return v;
    }
}
