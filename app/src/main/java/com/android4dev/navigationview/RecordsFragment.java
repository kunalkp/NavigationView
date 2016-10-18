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
import android.widget.Toast;

/**
 * Created by KUNAL on 9/14/2016.
 */
public class RecordsFragment extends Fragment {

    EditText studName,studAge;
    Button studAdd,view;
    TextView mEdt_show;
    StringBuilder nameBuild,ageBuild;
    String [] mName = new String[5];
    int [] mAge = new int[5];
    int mCount=0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_record,container,false);


        studName = (EditText) v.findViewById(R.id.edt_name);
        studAge = (EditText) v.findViewById(R.id.edt_age);
        studAdd = (Button) v.findViewById(R.id.btn_add);
        view = (Button) v.findViewById(R.id.btn_view);
        mEdt_show = (TextView) v.findViewById(R.id.view);
        studAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mCount < 5){
                    mName[mCount] = (studName.getText().toString());
                    mAge [mCount] = Integer.parseInt(studAge.getText().toString());
                    mCount++;
                    studName.setText("");
                    studAge.setText("");
                }
                else {
                    studName.setEnabled(false);
                    studAge.setEnabled(false);
                    studAdd.setEnabled(false);
                    studName.setText("");
                    studAge.setText("");
                    Toast.makeText(getActivity(), "Array is Full", Toast.LENGTH_SHORT).show();
                }
            }
        });

        nameBuild = new StringBuilder();
        ageBuild = new StringBuilder();
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(String name: mName){
                    nameBuild.append(name).append(" ");
                }
                for(int age: mAge){
                    ageBuild.append(age).append("      ");
                }
                mEdt_show.setText(nameBuild.toString()+ "\n" + ageBuild.toString());
            }
        });
        return v;
    }
}
