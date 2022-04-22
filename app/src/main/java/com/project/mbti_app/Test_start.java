package com.project.mbti_app;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Test_start extends AppCompatActivity {

    Button test_next;
    RelativeLayout r1;
    TextView matching;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_start);
        Intent intent=getIntent();
        String pho_num= intent.getStringExtra("pho_num");
        AnimatorSet bouncer = new AnimatorSet();
        r1=findViewById(R.id.r1);
        matching=findViewById(R.id.matching);
        r1.animate().translationYBy(150f).setDuration(1l);
        r1.animate().translationYBy(-150f).alphaBy(1f).setStartDelay(20l).setDuration(800l);
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(matching, "scaleY", 1, 1.05f, 1);
        animator1.setDuration(1200l).setInterpolator(new BounceInterpolator());
        animator1.setRepeatCount(ValueAnimator.INFINITE);
        animator1.setRepeatMode(ValueAnimator.RESTART);
        ObjectAnimator animator2 =ObjectAnimator.ofFloat(matching, "scaleX", 1, 1.05f, 1);
        animator2.setDuration(1200l).setInterpolator(new BounceInterpolator());
        animator2.setRepeatCount(ValueAnimator.INFINITE);
        animator2.setRepeatMode(ValueAnimator.RESTART);

        bouncer.play(animator1).with(animator2);
        bouncer.start();

        test_next=findViewById(R.id.test_next);
        test_next.animate().alpha(1f).setStartDelay(20l).setDuration(1250l);
        test_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test_start.this, test_qna.class);
                intent.putExtra("pho_num",pho_num);
                startActivity(intent);
                finishAffinity();
            }
        });
    }
}