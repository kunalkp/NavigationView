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
 * Created by Admin on 04-06-2015.
 */
public class AreaOfCircleFragment extends Fragment {

    EditText mEdt_Radius,mEdt_Result;
    Button mBtn_Calculate;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_areaofcircle,container,false);

        mEdt_Radius = (EditText) v.findViewById(R.id.edt_radius);
        mEdt_Result = (EditText) v.findViewById(R.id.edt_result);

        mBtn_Calculate = (Button) v.findViewById(R.id.button);

        mBtn_Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double radius,result;

                radius = Double.parseDouble(mEdt_Radius.getText().toString());
                result = 3.14*radius*radius;
                mEdt_Result.setText(String.valueOf(result));
            }
        });
        return v;
    }
}
