package com.ngtkn.customprogressbar;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new Dialog(this);

    }

    public void openDialog(View view){
        dialog.setContentView(R.layout.custom_progess_bar);
        dialog.show();
    }
}
