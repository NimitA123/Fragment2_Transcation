package com.example.fragment2_transanction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mBtnAddA;
    private Button mBtnRemoveA;
    private Button mBtnReplaceAWithBWithBackStack;
    private Button mBtnReplaceAWithBWithoutBackStack;
    private Button mBtnAddB;
    private Button mBtnRemoveB;
    private Button mBtnReplaceBWithAWithBackStack;
    private Button mBtnReplaceBWithAWithoutBackStack;
    private Button mBtnReplaceBWithA;
    private FragmentManager fragmentManager;


/*To manage transction we have fragment manger which is actually class in android */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate");
        initView();
        /* this is automatically do new object for the fragmentManager*/
        fragmentManager = getSupportFragmentManager();
    }

    private void initView() {
        mBtnAddA = findViewById(R.id.btnAddA);
        mBtnAddB = findViewById(R.id.btnAddB);
        mBtnRemoveA = findViewById(R.id.btnRemoveA);
        mBtnRemoveB = findViewById(R.id.btnRemoveB);

        mBtnReplaceAWithBWithBackStack = findViewById(R.id.btnReplaceAWithBackStack);
        mBtnReplaceAWithBWithoutBackStack = findViewById(R.id.btnReplaceAWithBWithoutBackstack);
        mBtnReplaceBWithA = findViewById(R.id.btnReplaceBWithA);
         mBtnAddA.setOnClickListener(this);
         mBtnRemoveA.setOnClickListener(this);
        mBtnReplaceAWithBWithBackStack.setOnClickListener(this);
        mBtnReplaceAWithBWithoutBackStack.setOnClickListener(this);
       mBtnAddB.setOnClickListener(this);
        mBtnRemoveB.setOnClickListener(this);
    //    mBtnReplaceBWithAWithBackStack.setOnClickListener(this);
     //   mBtnReplaceBWithAWithoutBackStack.setOnClickListener(this);
         mBtnReplaceBWithA.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.btnAddA:
                addA();
                break;
            case R.id.btnAddB:
                addB();
                break;
            case R.id.btnRemoveA:
                removeA();
                break;
            case R.id.btnRemoveB:
                removeB();
                break;
            case R.id.btnReplaceAWithBackStack:
                ReplaceAWithBWithBackStack();
                break;
            case R.id.btnReplaceAWithBWithoutBackstack:
               replaceAwithB();
                break;
            case R.id.btnReplaceBWithA:
                ReplaceBWithA();
                break;

        }

    }

    private void ReplaceBWithA() {
        FragmentTransaction transaction  = fragmentManager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        transaction.replace(R.id.flContainer, fragmentA, "fragmentA").commit();
    }

    private void replaceAwithB() {
        FragmentTransaction transaction  = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        transaction.replace(R.id.flContainer, fragmentB, "fragmentB").commit();

    }


    private void ReplaceAWithBWithBackStack() {
        FragmentTransaction transaction  = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        transaction.replace(R.id.flContainer, fragmentB, "fragmentB").addToBackStack("FragB").commit();
    }

    private void removeB() {
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentByTag("fragmentB");
        if(fragmentB!= null) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(fragmentB).commit();
        }

    }

    private void removeA() {
        FragmentA fragmentA = (FragmentA) fragmentManager.findFragmentByTag("FragmentA");
        if(fragmentA!= null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(fragmentA).commit();
        }

    }

    private void addB() {
        FragmentTransaction transaction  = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        transaction.add(R.id.flContainer, fragmentB, "fragmentB").commit();
    }

    private void addA() {
       // FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        fragmentTransaction.add(R.id.flContainer, fragmentA, "FragmentA").commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
    }
}