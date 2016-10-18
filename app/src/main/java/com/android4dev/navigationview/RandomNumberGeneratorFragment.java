package com.android4dev.navigationview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by KUNAL on 9/13/2016.
 */
public class RandomNumberGeneratorFragment extends Fragment {
    TextView show;
    Button mBtn_find;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_randomnumbergenerator, container, false);

        show = (TextView) v.findViewById(R.id.view_show);

        mBtn_find = (Button) v.findViewById(R.id.btn_find);
        mBtn_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random r = new Random();
                int Low = 10;
                int High = 100;
                int Result = r.nextInt(High-Low) + Low;
                show.setText(String.valueOf(Result));
            }
        });
        return v;
    }
}
