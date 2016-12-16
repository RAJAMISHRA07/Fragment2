package com.example.admin.fragment2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1 extends Fragment {
    //declare all variables
    EditText et1,et2;
    Button b;


    public F1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_f1, container, false);

        et1=(EditText)view.findViewById(R.id.edittext1);
        et2=(EditText)view.findViewById(R.id.edittext2);
        b=(Button)view.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //read data feom edit text
                String uname=et1.getText().toString();
                //pass data to parent activity
                MainActivity m= (MainActivity) getActivity();
                m.passData(uname);
            }
        });
        return view;
    }

}
