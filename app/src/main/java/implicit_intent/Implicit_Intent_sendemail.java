package implicit_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


import com.example.intent_implicit_intent_explicit_intent.R;

public class Implicit_Intent_sendemail extends AppCompatActivity {

    Button send;
    EditText msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent_sendemail);
        send=findViewById(R.id.button_send_msg);
        msg=findViewById(R.id.editTextText_themsg);

        send.setOnClickListener(v->{
            String message=msg.getText().toString();
            Intent intent=new Intent();
            //houn l action send badna neb3at message fa 7a tefta7 3al email 3al message
            intent.setAction(Intent.ACTION_SEND);

            //3ana function esma settype bas badna n7aded sho no3 l data le badna nersela ya3ne ne7na madna neb3at msg typ keef naw3a mn7ot text/plain
            intent.setType("text/plain");


            //hala2 badna nesta3ml she defined using put extra masln l email ma elo subject w text fa ne7na badna text fa mnesta3ml Intent.EXTRA_TEXT

            intent.putExtra(Intent.EXTRA_TEXT,"this is my message"+message);
            startActivity(intent);
        });
    }

}