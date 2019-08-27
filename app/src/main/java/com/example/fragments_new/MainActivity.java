package com.example.fragments_new;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void frag1(View view) {

        Fragment newFragment = new Fragment1();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frag, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void frag2(View view)
    {
        Fragment newFragment = new Fragment2();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frag, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
