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
public class ArithmaticOperationsFragment extends Fragment {
    EditText mEdt_fno,mEdt_sno,mEdt_Result;
    Button mBtn_add,mBtn_sub,mBtn_mul,mBtn_div;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_arithmaticoperations, container, false);

        mEdt_fno = (EditText) v.findViewById(R.id.edt_no1);
        mEdt_sno = (EditText) v.findViewById(R.id.edt_no2);
        mEdt_Result = (EditText) v.findViewById(R.id.edt_result);

        mBtn_add = (Button) v.findViewById(R.id.btn_add);
        mBtn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fno,sno;
                double result;
                fno = Integer.parseInt(mEdt_fno.getText().toString());
                sno = Integer.parseInt(mEdt_sno.getText().toString());
                result = fno + sno;
                mEdt_Result.setText(String.valueOf(result));
            }
        });

        mBtn_sub = (Button) v.findViewById(R.id.btn_sub);
        mBtn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fno,sno;
                double result;
                fno = Integer.parseInt(mEdt_fno.getText().toString());
                sno = Integer.parseInt(mEdt_sno.getText().toString());
                result = fno - sno;
                mEdt_Result.setText(String.valueOf(result));
            }
        });

        mBtn_mul = (Button) v.findViewById(R.id.btn_mul);
        mBtn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fno,sno;
                double result;
                fno = Integer.parseInt(mEdt_fno.getText().toString());
                sno = Integer.parseInt(mEdt_sno.getText().toString());
                result = fno * sno;
                mEdt_Result.setText(String.valueOf(result));
            }
        });

        mBtn_div = (Button) v.findViewById(R.id.btn_div);
        mBtn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fno,sno;
                double result;
                fno = Integer.parseInt(mEdt_fno.getText().toString());
                sno = Integer.parseInt(mEdt_sno.getText().toString());
                result = (fno / sno);
                mEdt_Result.setText(String.valueOf(result));
            }
        });
        return v;
    }
}
