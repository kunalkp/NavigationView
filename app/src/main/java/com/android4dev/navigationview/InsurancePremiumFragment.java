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
public class InsurancePremiumFragment extends Fragment {
    String [] Status = {"Excellent","Poor"};
    String [] Gender = {"Male","Female"};
    String [] Area = {"City","Village"};

    EditText mEdt_Age;
    TextView result;
    Button mBtn_Check;
    AutoCompleteTextView mAuto_Status,mAuto_Gender,mAuto_Area;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_insurancepremium,container,false);

        mAuto_Status = (AutoCompleteTextView) v.findViewById(R.id.edt_status);
        mAuto_Status.setAdapter(new ArrayAdapter<String>(
                getActivity(),android.R.layout.simple_list_item_1,Status
        ));

        mAuto_Gender = (AutoCompleteTextView) v.findViewById(R.id.edt_gender);
        mAuto_Gender.setAdapter(new ArrayAdapter<String>(
                getActivity(),android.R.layout.simple_list_item_1,Gender
        ));

        mAuto_Area = (AutoCompleteTextView) v.findViewById(R.id.edt_area);
        mAuto_Area.setAdapter(new ArrayAdapter<String>(
                getActivity(),android.R.layout.simple_list_item_1,Area
        ));

        mEdt_Age = (EditText) v.findViewById(R.id.edt_age);
        result = (TextView) v.findViewById(R.id.view_show);

        mBtn_Check = (Button) v.findViewById(R.id.btn_check);
        mBtn_Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int age;
                String status,gender,area;

                status = mAuto_Status.getText().toString();
                age = Integer.parseInt(mEdt_Age.getText().toString());
                gender = mAuto_Gender.getText().toString();
                area = mAuto_Area.getText().toString();

                if(status.equals("Excellent") && age>=25 && age<=35 && area.equals("City") && gender.equals("Male")) {
                    CharSequence text = "PREMIUM IS Rs 4 PER THOUSAND AND POLICY AMOUNT CANNOT EXCEED MORE THAN 2 LACS";
                    result.setText(text);
                }
                else if(status.equals("Excellent") && age>=25 && age<=35 && area.equals("City") && gender.equals("Female")) {
                    CharSequence text = "PREMIUM IS Rs 3 PER THOUSAND AND POLICY AMOUNT CANNOT EXCEED MORE THAN 1 LAC";
                    result.setText(text);
                }
                else if(status.equals("Poor") && age>=25 && age<=35 && area.equals("Village") && gender.equals("Male")) {
                    CharSequence text = "PREMIUM IS Rs 6 PER THOUSAND AND POLICY AMOUNT CANNOT EXCEED MORE THAN 10000";
                    result.setText(text);
                }
                else {
                    CharSequence text = "NOT INSURED";
                    result.setText(text);
                }
            }
        });
        return v;
    }
}
