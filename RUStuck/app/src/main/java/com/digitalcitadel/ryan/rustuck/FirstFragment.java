package com.digitalcitadel.ryan.rustuck;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ryan on 2/11/16.
 */
public class FirstFragment extends Fragment{

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = layoutInflater.inflate(R.layout.fragment_one_layout, container, false);
        return rootView;
    }
}
