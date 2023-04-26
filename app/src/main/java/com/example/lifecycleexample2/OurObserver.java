package com.example.lifecycleexample2;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

public class OurObserver  implements DefaultLifecycleObserver {
    private Context context;
    private Lifecycle lifecycle;

    public OurObserver(Context context, Lifecycle lifecycle)
    {
        this.context = context;
        this.lifecycle = lifecycle;
    }
    public void onStop(LifecycleOwner owner)
    {

        Toast.makeText(context, "On Stop", Toast.LENGTH_LONG).show();
    }
    public void onStart(LifecycleOwner owner)
    {
        Toast.makeText(context, "Our activity is on the on started", Toast.LENGTH_LONG).show();
    }
    public void onResume(LifecycleOwner owner)
    {
       // legal java code that you want to execute when the activity is on this state in its life cycle.
        Toast.makeText(context, "Our application is on resume ", Toast.LENGTH_LONG).show();
    }

}
