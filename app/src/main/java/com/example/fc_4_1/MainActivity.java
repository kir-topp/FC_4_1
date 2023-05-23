package com.example.fc_4_1;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView ball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ball = findViewById(R.id.ball);
        animateBall();
    }

    private void animateBall() {
        ObjectAnimator animatorX = ObjectAnimator.ofFloat(ball, "translationX", 0f, 500f);
        animatorX.setDuration(2000);
        animatorX.setInterpolator(new LinearInterpolator());
        animatorX.setRepeatCount(ObjectAnimator.INFINITE);
        animatorX.setRepeatMode(ObjectAnimator.REVERSE);

        ObjectAnimator animatorY = ObjectAnimator.ofFloat(ball, "translationY", 0f, 500f);
        animatorY.setDuration(2000);
        animatorY.setInterpolator(new LinearInterpolator());
        animatorY.setRepeatCount(ObjectAnimator.INFINITE);
        animatorY.setRepeatMode(ObjectAnimator.REVERSE);

        animatorX.start();
        animatorY.start();
    }
}
