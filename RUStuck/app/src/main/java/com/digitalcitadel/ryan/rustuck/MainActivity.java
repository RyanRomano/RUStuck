package com.digitalcitadel.ryan.rustuck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment fragmentOne = new FirstFragment();
        SecondFragment fragmentTwo = new SecondFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, fragmentOne)
                .add(R.id.fragment_container_2, fragmentTwo)
                .commit();
    }
}
