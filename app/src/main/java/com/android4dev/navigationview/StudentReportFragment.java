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
public class StudentReportFragment extends Fragment {
    EditText mEdt_m1,mEdt_m2,mEdt_m3,mEdt_m4,mEdt_m5,mEdt_m6;
    TextView mView_Result;
    Button mBtn_result;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View v = inflater.inflate
                (R.layout.fragment_studentreport, container, false);

        mEdt_m1 = (EditText) v.findViewById(R.id.edt_m1);
        mEdt_m2 = (EditText) v.findViewById(R.id.edt_m2);
        mEdt_m3 = (EditText) v.findViewById(R.id.edt_m3);
        mEdt_m4 = (EditText) v.findViewById(R.id.edt_m4);
        mEdt_m5 = (EditText) v.findViewById(R.id.edt_m5);
        mEdt_m6 = (EditText) v.findViewById(R.id.edt_m6);
        mView_Result = (TextView) v.findViewById(R.id.view_result);

        mBtn_result = (Button) v.findViewById(R.id.btn_result);
        mBtn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double percent;
                int total = 0;
                int count = 0;
                int m1 = Integer.parseInt(mEdt_m1.getText().toString());
                int m2 = Integer.parseInt(mEdt_m2.getText().toString());
                int m3 = Integer.parseInt(mEdt_m3.getText().toString());
                int m4 = Integer.parseInt(mEdt_m4.getText().toString());
                int m5 = Integer.parseInt(mEdt_m5.getText().toString());
                int m6 = Integer.parseInt(mEdt_m6.getText().toString());
                total = m1+m2+m3+m4+m5+m6;
                percent = total/6;
                String result1 = Double.toString(percent);

                if (m1<35) {
                    count++;
                }
                if (m2<35) {
                    count++;
                }
                if (m3<35) {
                    count++;
                }
                if (m4<35) {
                    count++;
                }
                if (m5<35) {
                    count++;
                }
                if (m6<35) {
                    count++;
                }

                String s;

                if (count==1||count==2) {
                    s = "A.T.K.T";
                    mView_Result = (TextView) v.findViewById(R.id.view_result);
                    mView_Result.setText(s);
                }
                else if (count>2) {
                    s = "Fail";
                    mView_Result=(TextView) v.findViewById(R.id.view_result);
                    mView_Result.setText(s);
                }
                else
                {
                    if (percent>=75) {
                        s = "Distinction";
                    }
                    else if (percent>=60 && percent<75) {
                        s = "First Class";
                    }
                    else if (percent<60 && percent>=50) {
                        s = "Second class";
                    }
                    else if(percent>=35 && percent<50) {
                        s = "Pass Class";
                    }
                    else {
                        s = "Fail";
                    }
                    mView_Result=(TextView) v.findViewById(R.id.view_result);
                    mView_Result.setText(s+" with "+result1);
                }
            }
        });
        mEdt_m1.setText("");
        mEdt_m2.setText("");
        mEdt_m3.setText("");
        mEdt_m4.setText("");
        mEdt_m5.setText("");
        mEdt_m6.setText("");
        return v;
    }
}
