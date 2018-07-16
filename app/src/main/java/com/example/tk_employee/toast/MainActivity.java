package com.example.tk_employee.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout mylinearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // mylinearLayout=findViewById(R.id.custom_toast_layout);
        LayoutInflater inflater=getLayoutInflater();

        //View layout=inflater.inflate(R.layout.custom_toast,
          //      (ViewGroup)findViewById(R.id.custom_toast_layout));

        //View layout=inflater.inflate(R.layout.custom_toast,mylinearLayout);
        View layout=inflater.inflate(R.layout.custom_toast,null);

        Toast myToast=new Toast(getApplicationContext());
        myToast.setDuration(Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.NO_GRAVITY,0,0);
        myToast.setView(layout);
        myToast.show();
    }
}
