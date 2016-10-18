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
public class SteelGradeFragment extends Fragment {
    EditText mEdt_Hardness, mEdt_Carbon, mEdt_Tensile;
    TextView mView_Result;
    Button mBtn_Check;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_steelgrade, container, false);

        mEdt_Hardness = (EditText) v.findViewById(R.id.edt_hardness);
        mEdt_Carbon = (EditText) v.findViewById(R.id.edt_carbon);
        mEdt_Tensile = (EditText) v.findViewById(R.id.edt_tensile);
        mView_Result = (TextView) v.findViewById(R.id.view_show);
        mBtn_Check = (Button) v.findViewById(R.id.btn_check);

        mBtn_Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hard,ts;
                float cc;
                hard = Integer.parseInt(mEdt_Hardness.getText().toString());
                cc = Float.parseFloat(mEdt_Carbon.getText().toString());
                ts = Integer.parseInt(mEdt_Tensile.getText().toString());

                if(hard>50 && cc<0.7 && ts>5600 ) {
                    CharSequence text = "THE GRADE IS 10";
                    mView_Result.setText(text);
                }
                else if (hard>50 && cc<(0.7)) {
                    CharSequence text = "THE GRADE IS 9";
                    mView_Result.setText(text);
                }
                else if( cc<0.7 && ts>5600) {
                    CharSequence text = "THE GRADE IS 8";
                    mView_Result.setText(text);
                }
                else if( hard>50 && ts>5600) {
                    CharSequence text = "THE GRADE IS 7";
                    mView_Result.setText(text);
                }
                else if(hard>50  || cc<(0.7) || ts>5600) {
                    CharSequence text = "THE GRADE IS 6";
                    mView_Result.setText(text);
                }
                else {
                    CharSequence text = "THE GRADE IS 5";
                    mView_Result.setText(text);
                }
            }
        });

        return v;
    }
}
