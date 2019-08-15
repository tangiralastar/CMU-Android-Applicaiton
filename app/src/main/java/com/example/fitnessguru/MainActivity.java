package com.example.fitnessguru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = (TextView) findViewById(R.id.textView1);
        if(txtView != null) {
            String para = "Zumba is a cardio workout where you dance to high-energy music with choreographed steps.\n" +
                    "It is one of the best ways to lose weight and get fit.\n\n" +
                    "To schedule your demo class, call us at +1 571 620 9189 \n\n" +
                    "We are located at 12734 NE 101st Pl Kirkland, Washington \n\n" +
                    "We are open from 8AM to 8PM Weekdays and 9AM to 7PM on Weekends\n\n"
                    ;

            txtView.setText(para);
            txtView.setMovementMethod(new ScrollingMovementMethod());
        }
    }
}
