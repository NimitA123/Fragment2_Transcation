package com.example.fragment2_transanction;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentB extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("FragmentB", "onCreatedView");
        return inflater.inflate(R.layout.fragment_b, container, false);

    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("FragmentB", "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FragmentB", "onCreate");

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("FragmentB", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("FragmentB", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("FragmentB", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("FragmentB", "onPause");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.d("FragmentB", "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("FragmentB", "onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("FragmentB", "onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("FragmentB", "onDetach");
    }
}