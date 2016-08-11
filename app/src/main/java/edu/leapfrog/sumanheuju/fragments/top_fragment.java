package edu.leapfrog.sumanheuju.fragments;

/**
 * Created by Suman Heuju on 8/1/2016.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class top_fragment extends Fragment {
    private static EditText topTextInput;
    private static EditText bottomTextInput;

    TopFragmentListener activityCommander;

    public interface TopFragmentListener{
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (TopFragmentListener) context;
        }catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);

        topTextInput = (EditText)view.findViewById(R.id.topTextInput);
        bottomTextInput = (EditText) view.findViewById(R.id.bottomTextInput);

        final Button btnChange = (Button) view.findViewById(R.id.btnChange);

        btnChange.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        buttonClicked(v);
                    }
                }
        );
        return view;
    }

    public void buttonClicked(View view){
        activityCommander.createMeme(topTextInput.getText().toString() , bottomTextInput.getText().toString());
    }
}
