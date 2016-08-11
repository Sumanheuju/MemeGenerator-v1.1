package edu.leapfrog.sumanheuju.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements top_fragment.TopFragmentListener {

    @Override
    public void createMeme(String top, String bottom) {
        bottom_fragment bottomFragment = (bottom_fragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.createMemeText(top,bottom);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
