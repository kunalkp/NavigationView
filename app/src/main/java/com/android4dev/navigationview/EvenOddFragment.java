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
 * Created by jaysingh on 28/8/16.
 */
public class EvenOddFragment extends Fragment {

    EditText mEdt_Number,mEdt_Result;
    Button mBtn_Check;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate
                (R.layout.fragment_oddeven,container,false);
        mEdt_Number= (EditText) v.findViewById(R.id.edt_number);
        mEdt_Result = (EditText) v.findViewById(R.id.edt_result);

        mBtn_Check = (Button) v.findViewById(R.id.button);

        mBtn_Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number;
                String Odd,Even;
                Odd="It's an Odd Number !!!";
                Even="It's an Even Number !!!";

                number = Integer.parseInt(mEdt_Number.getText().toString());
                if (number%2==0){
                    mEdt_Result.setText(String.valueOf(Even));
                }
                else {
                    mEdt_Result.setText(String.valueOf(Odd));
                }
            }
        });
        return v;
    }


}
