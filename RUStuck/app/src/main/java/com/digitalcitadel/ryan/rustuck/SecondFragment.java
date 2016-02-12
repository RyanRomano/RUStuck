package com.digitalcitadel.ryan.rustuck;

/**
 * Created by ryan on 2/11/16.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SecondFragment extends Fragment {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View rootView = layoutInflater.inflate(R.layout.fragment_two_layout, container, false);
        button1 = (Button) rootView.findViewById(R.id.button1);
        button2 = (Button) rootView.findViewById(R.id.button2);
        button3 = (Button) rootView.findViewById(R.id.button3);
        button4 = (Button) rootView.findViewById(R.id.button4);
        return rootView;
    }

    @Override
    public void onStart()
    {
        super.onStart();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Button1Activity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Button2Activity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Button3Activity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Button4Activity.class);
                startActivity(intent);
            }
        });
    }
}
