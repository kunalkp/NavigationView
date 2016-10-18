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
public class NotesBreakdownFragment extends Fragment {
    EditText mEdt_Amt;
    TextView mText_Show;
    Button mBtn_Check;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_notesbreakdown, container, false);

        mEdt_Amt = (EditText) v.findViewById(R.id.edt_amt);
        mText_Show = (TextView) v.findViewById(R.id.view_show);
        mBtn_Check = (Button) v.findViewById(R.id.btn_check);

        mBtn_Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rs,a,b,c,d,e,f,g,h;
                String fivehundred = "";
                String hundred = "";
                String fifty = "";
                String twenty = "";
                String ten = "";
                String five = "";
                String two = "";
                String one = "";

                rs = Integer.parseInt(mEdt_Amt.getText().toString());

                while (rs >= 500) {
                    a = rs / 500;
                    rs = rs % 500;
                    fivehundred = "500: " + a;
                }

                while (rs >= 100) {
                    b = rs / 100;
                    rs = rs % 100;
                    hundred = "100: " + b;
                }

                while (rs >= 50) {
                    c = rs / 50;
                    rs = rs % 50;
                    fifty = "50: " + c;
                }

                while (rs >= 20) {
                    d = rs / 20;
                    rs = rs % 20;
                    twenty = "20: " + d;
                }

                while (rs >= 10) {
                    e = rs / 10;
                    rs = rs % 10;
                    ten = "10: " + e;
                }

                while (rs >= 5) {
                    f = rs / 5;
                    rs = rs % 5;
                    five = "5: " + f;
                }

                while (rs >= 2) {
                    g = rs / 2;
                    rs = rs % 2;
                    two = "2: " + g;
                }

                while (rs >= 1) {
                    h = rs / 1;
                    rs = rs % 1;
                    one = "1: " + h;
                }

                mText_Show.setText(fivehundred + "\n" + hundred + "\n" + fifty + "\n" + twenty + "\n"
                        + ten + "\n" + five + "\n" + two + "\n" + one);
            }
        });
        return v;
    }
}
