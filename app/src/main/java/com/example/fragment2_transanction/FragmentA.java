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


public class FragmentA extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("FragmentA", "onCreateView");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("FragmentA", "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FragmentA", "onCreate");

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("FragmentA", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("FragmentA", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("FragmentA", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("FragmentA", "onPause");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.d("FragmentA", "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("FragmentA", "onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("FragmentA", "onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("FragmentA", "onDetach");
    }
}