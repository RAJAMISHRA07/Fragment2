package com.example.admin.fragment2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //this method will be called by login fragment - with data
    public void passData(String uname){
        Toast.makeText(MainActivity.this,"GOT IT.."+uname,Toast.LENGTH_LONG).show();
        //pass this datA TO welcome fragment 3
        FragmentManager fragmentManager=getSupportFragmentManager();
        F2 f2=(F2)fragmentManager.findFragmentById(R.id.fregment2);
        if (f2!=null){
            //second fragment is available now send data to welcome fragment
            f2.catchData(uname);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
