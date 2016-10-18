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
 * Created by KUNAL on 9/14/2016.
 */
public class TelephoneBillFragment extends Fragment {
    EditText mEdt_Calls;
    TextView mView_Bill;
    Button mBtn_Check;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_telephonebill, container, false);

        mEdt_Calls = (EditText) v.findViewById(R.id.edt_calls);
        mView_Bill = (TextView) v.findViewById(R.id.view_bill);
        mBtn_Check = (Button) v.findViewById(R.id.btn_result);
        mBtn_Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int calls;
                double bill;
                calls = Integer.parseInt(mEdt_Calls.getText().toString());

                if (calls <= 100) {
                    CharSequence text = "Your Bill is Rs.200";

                    mView_Bill.setText(text);

                } else if (calls > 100 && calls <= 150) {
                    calls = calls - 100;
                    bill = 200 + (0.60 * calls);
                    String r = "Your bill is Rs." + Double.toString(bill);
                    mView_Bill.setText(r);

                } else if (calls > 150 && calls <= 200) {
                    calls = calls - 150;
                    bill = 200 + (0.60 * 50) + (0.50 * calls);
                    String r = "Your bill is Rs." + Double.toString(bill);
                    mView_Bill.setText(r);
                } else {
                    calls = calls - 200;
                    bill = 200 + (0.60 * 50) + (0.50 * 50) + (0.40 * calls);
                    String r = "Your bill is Rs." + Double.toString(bill);
                    mView_Bill.setText(r);
                }
            }
        });
        return v;
    }
}
