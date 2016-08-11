package edu.leapfrog.sumanheuju.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Suman Heuju on 8/1/2016.
 */
public class bottom_fragment extends Fragment {

    private static TextView topMemeText,bottomMemeText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container ,false);

        topMemeText = (TextView) view.findViewById(R.id.textView);
        bottomMemeText = (TextView) view.findViewById(R.id.textView2);
        return view;
    }

    public void createMemeText(String top, String bottom){
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }
}
