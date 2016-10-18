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
public class ArmstrongNumberFragment extends Fragment {
    EditText mEdt_from, mEdt_to;
    TextView show;
    Button mBtn_find;
    String s = "";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_armstrongnumber, container, false);

        mEdt_from = (EditText) v.findViewById(R.id.edt_from);
        mEdt_to = (EditText) v.findViewById(R.id.edt_to);
        show = (TextView) v.findViewById(R.id.view_show);

        mBtn_find = (Button) v.findViewById(R.id.btn_find);
        mBtn_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer from, to;
                int n = 0, a;

                from = Integer.parseInt(mEdt_from.getText().toString());
                to = Integer.parseInt(mEdt_to.getText().toString());
                if (to <= 500) {
                    for (int i = from; i <= to; i++) {
                        int sum = 0;
                        n = i;
                        while (n != 0) {
                            a = n % 10;
                            n = n / 10;
                            sum += (a * a * a);
                        }

                        if (sum == i) {
                            s = s + "" + sum + "\n";
                        }
                    }
                    show.setText(String.valueOf(s));
                }
                else{
                    Toast.makeText(getActivity(), "Enter Value less than 500", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return v;
    }
}
