package com.example.parulchopra.pinnacle_new_app;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Frag_cardview_showsubjects.MainListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment f1;
        f1 = new Frag_cardview_showsubjects();
        FragmentManager fn = getSupportFragmentManager();
        FragmentTransaction ft = fn.beginTransaction();
        ft.replace(R.id.frame1, f1);
        ft.commit();

    }

    @Override
    public void subjectSelected(int position) {
       Intent i= new Intent(this,OnsubjectClick.class);

      startActivity(i);

    }
}
