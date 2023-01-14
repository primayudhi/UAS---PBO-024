package id.ac.poliban.prima024.uas.project82e020320024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }
    public void btLogin(View view) {
        Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
    }

    public void btSigup(View view) {
        Intent intent = new Intent(IntroActivity.this, SignUpActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Signup", Toast.LENGTH_SHORT).show();
    }
}