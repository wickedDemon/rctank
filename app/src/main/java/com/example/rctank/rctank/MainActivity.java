package com.example.rctank.rctank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton arrowDownButton = (ImageButton) findViewById(R.id.arrow_down_button);
        ImageButton arrowLeftButton = (ImageButton) findViewById(R.id.arrow_left_button);
        ImageButton arrowRightButton = (ImageButton) findViewById(R.id.arrow_right_button);
        ImageButton arrowUpButton = (ImageButton) findViewById(R.id.arrow_up_button);
        ImageButton circleButton = (ImageButton) findViewById(R.id.circle_button);
        ImageButton l1Button = (ImageButton) findViewById(R.id.l1_button);
        ImageButton l2Button = (ImageButton) findViewById(R.id.l2_button);
        ImageButton r1Button = (ImageButton) findViewById(R.id.r1_button);
        ImageButton r2Button = (ImageButton) findViewById(R.id.r2_button);
        SeekBar speedSeekBar = (SeekBar) findViewById(R.id.speed_seek_bar);

        arrowDownButton.setOnClickListener(this);
        arrowLeftButton.setOnClickListener(this);
        arrowRightButton.setOnClickListener(this);
        arrowUpButton.setOnClickListener(this);
        circleButton.setOnClickListener(this);
        l1Button.setOnClickListener(this);
        l2Button.setOnClickListener(this);
        r1Button.setOnClickListener(this);
        r2Button.setOnClickListener(this);

        speedSeekBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.arrow_down_button:
                break;
            case R.id.arrow_left_button:
                break;
            case R.id.arrow_right_button:
                break;
            case R.id.arrow_up_button:
                break;
            case R.id.circle_button:
                break;
            case R.id.l1_button:
                break;
            case R.id.l2_button:
                break;
            case R.id.r1_button:
                break;
            case R.id.r2_button:
                break;
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
