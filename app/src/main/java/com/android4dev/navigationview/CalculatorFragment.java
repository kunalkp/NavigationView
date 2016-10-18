package com.android4dev.navigationview;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by KUNAL on 9/13/2016.
 */
public class CalculatorFragment extends Fragment{

    EditText mEdt_Input;
    Button mBtn_0,mBtn_1,mBtn_2,mBtn_3,mBtn_4,mBtn_5,mBtn_6,mBtn_7,mBtn_8,mBtn_9;
    Button mBtn_Clear,mBtn_Mul,mBtn_Div,mBtn_Add,mBtn_Sub,mBtn_Equal,mBtn_Dot;
    float mValueOne , mValueTwo ;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(
                R.layout.fragment_calculator,container,false);

        mEdt_Input = (EditText) v.findViewById(R.id.edt_input);

        mBtn_0 = (Button) v.findViewById(R.id.btn_0);
        mBtn_1 = (Button) v.findViewById(R.id.btn_1);
        mBtn_2 = (Button) v.findViewById(R.id.btn_2);
        mBtn_3 = (Button) v.findViewById(R.id.btn_3);
        mBtn_4 = (Button) v.findViewById(R.id.btn_4);
        mBtn_5 = (Button) v.findViewById(R.id.btn_5);
        mBtn_6 = (Button) v.findViewById(R.id.btn_6);
        mBtn_7 = (Button) v.findViewById(R.id.btn_7);
        mBtn_8 = (Button) v.findViewById(R.id.btn_8);
        mBtn_9 = (Button) v.findViewById(R.id.btn_9);
        mBtn_Clear = (Button) v.findViewById(R.id.btn_clear);
        mBtn_Dot = (Button) v.findViewById(R.id.btn_dot);
        mBtn_Equal = (Button) v.findViewById(R.id.btn_equals);
        mBtn_Add = (Button) v.findViewById(R.id.btn_add);
        mBtn_Mul = (Button) v.findViewById(R.id.btn_mul);
        mBtn_Sub = (Button) v.findViewById(R.id.btn_sub);
        mBtn_Div = (Button) v.findViewById(R.id.btn_div);

        mBtn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdt_Input.setText(mEdt_Input.getText()+"0");
            }
        });

        mBtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdt_Input.setText(mEdt_Input.getText()+"1");
            }
        });

        mBtn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdt_Input.setText(mEdt_Input.getText()+"2");
            }
        });

        mBtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdt_Input.setText(mEdt_Input.getText()+"3");
            }
        });

        mBtn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdt_Input.setText(mEdt_Input.getText()+"4");
            }
        });

        mBtn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdt_Input.setText(mEdt_Input.getText()+"5");
            }
        });

        mBtn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdt_Input.setText(mEdt_Input.getText()+"6");
            }
        });

        mBtn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdt_Input.setText(mEdt_Input.getText()+"7");
            }
        });

        mBtn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdt_Input.setText(mEdt_Input.getText()+"8");
            }
        });

        mBtn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdt_Input.setText(mEdt_Input.getText()+"9");
            }
        });

        mBtn_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdt_Input.setText(mEdt_Input.getText()+".");
            }
        });

        mBtn_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdt_Input.setText("");
            }
        });

        mBtn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mEdt_Input == null){
                    mEdt_Input.setText("");
                }else {
                    mValueOne = Float.parseFloat(mEdt_Input.getText() + "");
                    mAddition = true;
                    mEdt_Input.setText(null);
                }
            }
        });

        mBtn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(mEdt_Input.getText() + "");
                mSubtract = true ;
                mEdt_Input.setText(null);
            }
        });

        mBtn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(mEdt_Input.getText() + "");
                mMultiplication = true ;
                mEdt_Input.setText(null);
            }
        });

        mBtn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(mEdt_Input.getText()+"");
                mDivision = true ;
                mEdt_Input.setText(null);
            }
        });

        mBtn_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(mEdt_Input.getText() + "");

                if (mAddition == true){

                    mEdt_Input.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    mEdt_Input.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    mEdt_Input.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    mEdt_Input.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
            }
        });

        return v;
    }
}
