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
 * Created by KUNAL on 9/9/2016.
 */
public class UnitConverterFragment extends Fragment{

    EditText mEdt_feet,mEdt_inch,mEdt_centimeter;
    Button mBtn_convert;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate
                (R.layout.fragment_unit_converter,container,false);

        mEdt_feet = (EditText) v.findViewById(R.id.edt_feet);
        mEdt_inch = (EditText) v.findViewById(R.id.edt_inch);
        mEdt_centimeter = (EditText) v.findViewById(R.id.edt_centimeter);

        mBtn_convert = (Button) v.findViewById(R.id.btn_convert);
        mBtn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer feet,inch,totalInches;
                double Centimeter_per_inch = 2.54;
                Integer inches_per_foot = 12;
                double centimeter;

                feet = Integer.parseInt(mEdt_feet.getText().toString());
                inch = Integer.parseInt(mEdt_inch.getText().toString());

                totalInches = inches_per_foot * feet + inch ;

                centimeter = Centimeter_per_inch * totalInches;

                mEdt_centimeter.setText(String.valueOf(centimeter));
            }
        });

        return v;
    }
}
