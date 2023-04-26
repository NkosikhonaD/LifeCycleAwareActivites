package com.example.lifecycleexample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;

import android.os.Bundle;
// https://developer.android.com/topic/libraries/architecture/lifecycle

public class MainActivity extends AppCompatActivity
{
    private LifecycleRegistry lifecycleRegistry;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lifecycleRegistry = new LifecycleRegistry(this);
        lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        lifecycleRegistry.addObserver(new OurObserver(this,getLifecycle()));
    }
    public void onStart() {

        super.onStart();
        lifecycleRegistry.setCurrentState(Lifecycle.State.STARTED);
    }
    @Override
    public void onPause() {

        super.onPause();
        lifecycleRegistry.setCurrentState(Lifecycle.State.STARTED);
    }
    @Override
    public void onResume() {

        super.onResume();
        lifecycleRegistry.setCurrentState(Lifecycle.State.RESUMED);
    }
    // onResume. onDestroy ect.. onStop ect

}