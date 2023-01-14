package id.ac.poliban.mi.e020320024.Task_III_Fdae020320024.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import id.ac.poliban.mi.e020320024.Task_III_Fdae020320024.R;

public class IntroActivity extends AppCompatActivity {

    private ConstraintLayout startbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //Gán ánh xạ constrainLayout
        startbtn = findViewById(R.id.startbtn);
        //Click qua Main
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent chuyển activity
                startActivity(new Intent(IntroActivity.this, MainActivity.class));
            }
        });
    }
}