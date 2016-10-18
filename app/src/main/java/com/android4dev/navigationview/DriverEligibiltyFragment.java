package com.android4dev.navigationview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by KUNAL on 9/13/2016.
 */
public class DriverEligibiltyFragment extends Fragment {

    String [] Status = {"Married","Unmarried"};
    String [] Gender = {"Male","Female"};

    EditText mEdt_Age;
    TextView result;
    Button mBtn_Check;
    AutoCompleteTextView mAuto_Status,mAuto_Gender;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_drivereligibilty,container,false);

        mAuto_Status = (AutoCompleteTextView) v.findViewById(R.id.edt_status);
        mAuto_Status.setAdapter(new ArrayAdapter<String>(
                getActivity(),android.R.layout.simple_list_item_1,Status
        ));

        mAuto_Gender = (AutoCompleteTextView) v.findViewById(R.id.edt_gender);
        mAuto_Gender.setAdapter(new ArrayAdapter<String>(
                getActivity(),android.R.layout.simple_list_item_1,Gender
        ));

        mEdt_Age = (EditText) v.findViewById(R.id.edt_age);
        result = (TextView) v.findViewById(R.id.view_show);

        mBtn_Check = (Button) v.findViewById(R.id.btn_check);
        mBtn_Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int age;
                String status,gender;

                status = mAuto_Status.getText().toString();
                age = Integer.parseInt(mEdt_Age.getText().toString());
                gender = mAuto_Gender.getText().toString();

                if(status.equals("Married")) {
                    CharSequence text = "The driver is insured.";
                    result.setText(text);
                }

                if(status.equals("Unmarried") && gender.equals("Male")  &&  age >= 30) {
                    CharSequence text = "The driver is insured.";
                    result.setText(text);
                }
                if(status.equals("Unmarried") && gender.equals("Female") && age >= 25) {
                    CharSequence text = "The driver is insured.";
                    result.setText(text);
                }
                else{
                    CharSequence text = "The driver is not insured.";
                    result.setText(text);
                }
            }
        });
        return v;
    }
}
