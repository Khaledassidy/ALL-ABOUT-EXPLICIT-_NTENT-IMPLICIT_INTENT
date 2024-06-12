package Explicit_Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.intent_implicit_intent_explicit_intent.R;

public class Explicit_Intent_5 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent5);
        textView=findViewById(R.id.textView2);


        Intent intent=getIntent();
        String user_neme=intent.getStringExtra("user_name");
        textView.setText(user_neme);
    }
}