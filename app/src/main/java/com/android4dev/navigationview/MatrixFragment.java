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
 * Created by KUNAL on 9/16/2016.
 */
public class MatrixFragment extends Fragment {
    EditText edt_m1n1,edt_m1n2,edt_m1n3,edt_m1n4,edt_m2n1,edt_m2n2,edt_m2n3,edt_m2n4;
    TextView txt_m1,txt_m2,txt_ans;
    Button btn_add,btn_mul;

    int mat1[][]=new int[2][2];
    int mat2[][]=new int[2][2];
    int add[][]=new int[2][2];
    int mul[][]=new int[2][2];

    public void data() {
        mat1[0][0] = Integer.parseInt(edt_m1n1.getText().toString());
        mat1[0][1] = Integer.parseInt(edt_m1n2.getText().toString());
        mat1[1][0] = Integer.parseInt(edt_m1n3.getText().toString());
        mat1[1][1] = Integer.parseInt(edt_m1n4.getText().toString());
        mat2[0][0] = Integer.parseInt(edt_m2n1.getText().toString());
        mat2[0][1] = Integer.parseInt(edt_m2n2.getText().toString());
        mat2[1][0] = Integer.parseInt(edt_m2n3.getText().toString());
        mat2[1][1] = Integer.parseInt(edt_m2n4.getText().toString());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View v = inflater.inflate
                (R.layout.fragment_matrix, container, false);

        txt_m1 = (TextView) v.findViewById(R.id.txtmat1);
        txt_m2 = (TextView) v.findViewById(R.id.txtmat2);
        txt_ans = (TextView) v.findViewById(R.id.txtans);

        edt_m1n1 = (EditText) v.findViewById(R.id.edtm1n1);
        edt_m1n2 = (EditText) v.findViewById(R.id.edtm1n2);
        edt_m1n3 = (EditText) v.findViewById(R.id.edtm1n3);
        edt_m1n4 = (EditText) v.findViewById(R.id.edtm1n4);

        edt_m2n1 = (EditText) v.findViewById(R.id.edtm2n1);
        edt_m2n2 = (EditText) v.findViewById(R.id.edtm2n2);
        edt_m2n3 = (EditText) v.findViewById(R.id.edtm2n3);
        edt_m2n4 = (EditText) v.findViewById(R.id.edtm2n4);

        btn_add = (Button) v.findViewById(R.id.btnadd);
        btn_mul = (Button) v.findViewById(R.id.btnmul);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data();
                for (int i = 0; i < mat1.length; i++) {
                    for (int j = 0; j < mat2.length; j++) {
                        add[i][j] = mat1[i][j] + mat2[i][j];
                    }
                }
                StringBuilder addmatrix = new StringBuilder();

                for (int i = 0; i < mat1.length; i++) {
                    for (int j = 0; j < mat2.length; j++) {
                        addmatrix.append(add[i][j] + "     ");
                    }
                    addmatrix.append(" " + '\n');
                }
                txt_ans.setText(String.valueOf(addmatrix));
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data();
                for (int i = 0; i < mat1.length; i++) {
                    for (int j = 0; j < mat2.length; j++) {
                        mul[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            mul[i][j] = mul[i][j] + (mat1[i][k] * mat2[k][j]);
                        }
                    }
                }
                StringBuilder mulmatrix = new StringBuilder();

                for (int i = 0; i < mat1.length; i++) {
                    for (int j = 0; j < mat2.length; j++) {
                        mulmatrix.append(mul[i][j] + "     ");
                    }
                    mulmatrix.append(" " + '\n');
                }
                txt_ans.setText(String.valueOf(mulmatrix));
            }
        });
        return v;
    }
}
