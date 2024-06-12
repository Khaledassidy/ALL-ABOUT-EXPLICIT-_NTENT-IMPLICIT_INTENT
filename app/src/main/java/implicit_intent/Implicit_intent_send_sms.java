package implicit_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


import com.example.intent_implicit_intent_explicit_intent.R;

public class Implicit_intent_send_sms extends AppCompatActivity {

    Button send_msg;
    EditText phone_numebr;
    EditText the_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent_send_sms);
        //exercise eno 3ande tnen edit text w button bade ektob l ra2m telephone w l msg w bas ekbous 7a ykono l l phone number w l msg n7ato b section l msg
        //sa3eta de8re fene eb3at l msg

        send_msg=findViewById(R.id.button_send);
        phone_numebr=findViewById(R.id.editText_phone);
        the_msg=findViewById(R.id.editTextText_msg);

        send_msg.setOnClickListener(v->{
            String phonenumber=phone_numebr.getText().toString();
            String msg=the_msg.getText().toString();
            Intent intent=new Intent();

            //ne7na bas badna nefta7 l application l msg 7ata yen7at feh l phone w l msg ya3ne hayde btezbat b action.view
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri=Uri.parse("sms:"+phonenumber);
            intent.setData(uri);
            //bhay tare2a bas 7a yet7awal number 3ala application l msg


            //tyb hala2 badna n7ot l msg 3al keybord fa mnesta3ml put extra l badak yeh feek t7ot intent.extra_text,keef t7ot "text",feek "msg" aye she bas ykoun mafhoum

            intent.putExtra(Intent.EXTRA_TEXT,msg);
            startActivity(intent);
        });


    }


    //for any app sms:

    /*
    Intent intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.putExtra("sms_body", message);
    intent.putExtra(Intent.EXTRA_STREAM, attachment);
    if (intent.resolveActivity(getPackageManager()) != null) {
        startActivity(intent);
}

    EXTRA_STREAM:for vedio,image attachment





for only sms app:

   Intent intent = new Intent(Intent.ACTION_SEND);
    intent.setData(Uri.parse("smsto:"));  // Only SMS apps respond to this.
    intent.putExtra("sms_body", message);
    intent.putExtra(Intent.EXTRA_STREAM, attachment);
    if (intent.resolveActivity(getPackageManager()) != null) {
        startActivity(intent);
    }






    there are another action same as sento but send multiple msg
    ACTION_SEND_MULTIPLE


    we can also use that for setdata

    mms:<phone_number>
    mmsto:<phone_number>










     */


















}