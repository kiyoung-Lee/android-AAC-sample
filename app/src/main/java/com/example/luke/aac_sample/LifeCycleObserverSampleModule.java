package com.example.luke.aac_sample;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

public class LifeCycleObserverSampleModule implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateStart(){
        System.out.println("start OnCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onReasume(){
        System.out.println("start OnResume");
    }
}
