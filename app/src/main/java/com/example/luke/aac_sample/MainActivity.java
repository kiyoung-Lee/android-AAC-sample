package com.example.luke.aac_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView testButton;
    private LifeCycleSampleModule module;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testButton = findViewById(R.id.test_button);

        getLifecycle().addObserver(new LifeCycleObserverSampleModule());
        module = new LifeCycleSampleModule(getLifecycle());
        setEvent();
    }

    private void setEvent(){
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                module.test();
            }
        });
    }
}
