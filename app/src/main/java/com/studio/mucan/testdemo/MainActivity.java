package com.studio.mucan.testdemo;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "19d5811d-aef7-41ad-9a5b-8cb771171de9", Analytics.class, Crashes.class);


        Button mEmailSignInButton = (Button) findViewById(R.id.start_button);
        mEmailSignInButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                attemptStart();
            }
        });
    }

    private void attemptStart() {
        Intent intent = new Intent(getApplication(), null);
        startActivity(intent);
    }
}
