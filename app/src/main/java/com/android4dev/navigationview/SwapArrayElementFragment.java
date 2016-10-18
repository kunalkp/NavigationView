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
 * Created by KUNAL on 9/13/2016.
 */
public class SwapArrayElementFragment extends Fragment {

    EditText mEdt_Accept;
    TextView mView_Show,mView_swap;
    Button mBtn_swap,mBtn_view,mBtn_add;


    int [] mMyarray = new int[5];
    int mCount;
    StringBuilder mMyAllData , SwapData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate
                (R.layout.fragment_swaparrayelement,container,false);

        mEdt_Accept = (EditText) v.findViewById(R.id.edt_accept);
        mView_Show = (TextView) v.findViewById(R.id.view_show);
        mView_swap = (TextView) v.findViewById(R.id.view_swap);

        mBtn_add = (Button) v.findViewById(R.id.btn_accept);
        mBtn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mCount < 5){
                    mMyarray[mCount] = Integer.parseInt(mEdt_Accept.getText().toString());
                    mCount++;
                    mEdt_Accept.setText("");
                }
                else{
                    mEdt_Accept.setText("");
                    Toast.makeText(getActivity(),"Array is Full", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mMyAllData = new StringBuilder();
        mBtn_view = (Button) v.findViewById(R.id.btn_view);
        mBtn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int value: mMyarray){
                    mMyAllData.append(value).append("  ");
                }
                mView_Show.setText(mMyAllData.toString());
            }
        });

        SwapData = new StringBuilder();
        mBtn_swap = (Button) v.findViewById(R.id.btn_swap);
        mBtn_swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp = mMyarray[0];
                mMyarray[0] = mMyarray[4];
                mMyarray[4] = temp;
                for(int value: mMyarray){
                    SwapData.append(value).append("  ");
                }
                mView_swap.setText(SwapData.toString());
            }
        });
        return v;
    }
}
