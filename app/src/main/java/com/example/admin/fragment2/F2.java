package com.example.admin.fragment2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class F2 extends Fragment {
TextView textView;
    public  void  catchData(String uname){
        //apply the data to textview
        textView.setText("Welcome to : "+uname);
    }

    public F2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_f2, container, false);
        textView= (TextView) view.findViewById(R.id.textview);
        return view;
    }

}
