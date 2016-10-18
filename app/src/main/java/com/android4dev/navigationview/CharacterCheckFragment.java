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
 * Created by KUNAL on 9/13/2016.
 */
public class CharacterCheckFragment extends Fragment {
    EditText mEdt_accept;
    Button mBtn_check;
    TextView mView_result;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_charactercheck, container, false);
        mEdt_accept = (EditText) v.findViewById(R.id.edt_accept);
        mView_result = (TextView) v.findViewById(R.id.view);
        mBtn_check = (Button) v.findViewById(R.id.btn_check);

        mBtn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Character ch;
                ch = mEdt_accept.getText().charAt(0);

                if (ch>=65 && ch<=90){
                    CharSequence text = "It's a Capital Letter";
                    mView_result.setText(text);
                }
                else if (ch>=97 && ch<=122) {
                    CharSequence text = "It's a Small Letter";
                    mView_result.setText(text);
                }
                else if (ch>=48 && ch<=57) {
                    CharSequence text = "It's a Digit";
                    mView_result.setText(text);
                }
                else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)|| (ch>=91 && ch<=96)||(ch>=123 && ch<=127)) {
                    CharSequence text = "It's a Special Character";
                    mView_result.setText(text);
                }
                else {
                    CharSequence text = "It's neither a Letter nor a digit and a Special Character";
                    mView_result.setText(text);
                }
            }
        });

        return v;
    }
}
