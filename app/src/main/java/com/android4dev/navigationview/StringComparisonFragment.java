package com.android4dev.navigationview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by KUNAL on 9/13/2016.
 */
public class StringComparisonFragment extends Fragment {
    EditText mEdt_Str1, mEdt_Str2, mEdt_Result;
    Button mBtn_Check;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_stringcomparison, container, false);

        mEdt_Str1 = (EditText) v.findViewById(R.id.edt_str1);
        mEdt_Str2 = (EditText) v.findViewById(R.id.edt_str2);
        mEdt_Result = (EditText) v.findViewById(R.id.edt_result);

        mBtn_Check = (Button) v.findViewById(R.id.btn_check);
        mBtn_Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = mEdt_Str1.getText().toString();
                String str2 = mEdt_Str2.getText().toString();
                String equal,notEqual;
                equal = "Strings are Equal !!!";
                notEqual = "Strings are not Equal !!!";
                if(str1.equals(str2)){
                    Toast.makeText(getActivity(), "Equal", Toast.LENGTH_SHORT).show();
                    mEdt_Result.setText(String.valueOf(equal));
                }
                else {
                    Toast.makeText(getActivity(), "Not Equal", Toast.LENGTH_SHORT).show();
                    mEdt_Result.setText(String.valueOf(notEqual));
                }
            }
        });
        return v;
    }
}
