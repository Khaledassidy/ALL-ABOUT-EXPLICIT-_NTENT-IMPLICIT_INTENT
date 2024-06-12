package new_way_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


import com.example.intent_implicit_intent_explicit_intent.R;

import java.lang.reflect.Array;
import java.net.URI;

public class NEW_WAY_FOR_RESULT_IMPLICIT_INTENT_EMAIL extends AppCompatActivity {
Button send_email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_way_for_result_implicit_intent_email);
        send_email=findViewById(R.id.button_send_email);


        ActivityResultLauncher<Intent> activityResultLauncher=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {

                    }
                }
        );

        send_email.setOnClickListener(v->{
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("*/*"); //this type all application that send msg,email..etc can open teligram,email,insta
            //but if you want only application email the action and type change:
            // Intent intent = new Intent(Intent.ACTION_SENDTO);
            //and type:intent.setData(Uri.parse("mailto:")); Only email apps handle this.
            String emialaddrs[]=new String[]{"ka530893@gmail.com"};

            intent.putExtra(Intent.EXTRA_EMAIL,emialaddrs );
            intent.putExtra(Intent.EXTRA_SUBJECT, "assigment");

            String email="how are youdzvdxfsvds";
            Uri uri=Uri.parse(email);
            intent.putExtra(Intent.EXTRA_TEXT,"rfesfe");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        });
    }
}