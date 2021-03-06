package com.example.spiffy.loginactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Home_Activity extends AppCompatActivity {

    private static final String TAG = "Home_Activity";
    public static final String EXTRA = "INFO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        User user = (User)getIntent().getSerializableExtra(EXTRA);
        String welcome = String.format(getResources().getString(R.string.message_format), user.getUsername());
        TextView welcomeText = (TextView) findViewById(R.id.welcome_text);
        welcomeText.setText(welcome);

    }
}
