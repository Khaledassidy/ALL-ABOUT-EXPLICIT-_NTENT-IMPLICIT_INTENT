package implicit_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intent_implicit_intent_explicit_intent.R;

public class implicit_intent_google extends AppCompatActivity {

    Button google;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent_google);
        google=findViewById(R.id.google);
        //exercise usein implicit intent to open google



        google.setOnClickListener(v->{
            String google="https://www.google.com";
            Uri uri=Uri.parse(google);
            Intent intent=new Intent();
            //or Intent intent=new Intent(Intent.ACTION_VIEW,uri);
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        });


    }
}