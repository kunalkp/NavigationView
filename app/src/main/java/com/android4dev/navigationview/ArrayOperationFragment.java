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
public class ArrayOperationFragment extends Fragment {
    EditText mEdt_add;
    TextView mTxt_view, mTxt_Res;
    Button mBtn_add, mBtn_view, mBtn_sort, mBtn_sum_odd, mBtn_num_even;

    int[] mMyarray = new int[5];
    int mCount;
    StringBuilder mMyAllData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_arrayoperation, container, false);

        mEdt_add=(EditText) v.findViewById(R.id.editText);
        mTxt_view=(TextView) v.findViewById(R.id.textView2);
        mTxt_Res=(TextView) v.findViewById(R.id.textView3);
        mBtn_add=(Button) v.findViewById(R.id.button);
        mBtn_view=(Button) v.findViewById(R.id.button2);
        mBtn_sort=(Button) v.findViewById(R.id.button3);
        mBtn_sum_odd=(Button) v.findViewById(R.id.button4);
        mBtn_num_even=(Button) v.findViewById(R.id.button5);

        mBtn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mCount < 5){
                    mMyarray[mCount] = Integer.parseInt(mEdt_add.getText().toString());
                    mCount++;
                    mEdt_add.setText("");
                }
                else{
                    mEdt_add.setText("");
                    Toast.makeText(getActivity(), "Array is Full", Toast.LENGTH_SHORT).show();
                    mBtn_add.setEnabled(false);
                }
            }
        });

        mMyAllData = new StringBuilder();

        mBtn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int value : mMyarray) {
                    mMyAllData.append(value).append(" , ");
                }
                mTxt_view.setText(mMyAllData.toString());
            }


        });

        mBtn_sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp = 0;
                String s="";
                for(int i=0; i < 5; i++){
                    for(int j=1; j < (5-i); j++){
                        if(mMyarray[j-1] > mMyarray[j]){
                            temp = mMyarray[j-1];
                            mMyarray[j-1] = mMyarray[j];
                            mMyarray[j] = temp;
                        }
                    }
                }
                for(int i=0;i<5;i++) {
                    s=s+mMyarray[i]+" , ";
                }
                mTxt_Res.setText(s);
            }
        });

        mBtn_sum_odd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum=0;
                for(int i=0;i<5;i++) {
                    if(mMyarray[i]%2==1) {
                        sum=sum+mMyarray[i];
                    }
                }
                mTxt_Res.setText(Integer.toString(sum));
            }
        });

        mBtn_num_even.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = 0;
                for(int i=0;i<5;i++) {
                    if(mMyarray[i]%2==0) {
                        ans =ans + mMyarray[i];
                    }
                }
                mTxt_Res.setText(Integer.toString(ans));
            }
        });
        return v;
    }
}