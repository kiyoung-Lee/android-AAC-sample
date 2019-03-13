package com.example.luke.aac_sample;

import android.arch.lifecycle.Lifecycle;

public class LifeCycleSampleModule {

    private Lifecycle lifecycle;

    public LifeCycleSampleModule(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public void test(){
        if(lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)){
            System.out.println("Activity Created");
        }
    }
}
