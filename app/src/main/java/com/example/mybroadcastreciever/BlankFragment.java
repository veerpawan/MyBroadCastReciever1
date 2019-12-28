package com.example.mybroadcastreciever;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BlankFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        Intent intent = new Intent();
        intent.setAction("com.tutorialspoint.CUSTOM_INTENT");

        getActivity().sendBroadcast(intent);
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }


}
