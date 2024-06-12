package new_way_intent;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


import com.example.intent_implicit_intent_explicit_intent.R;

public class NEW_WAY_FOR_RESULT_IMPLICIT_INTENT_SET_ALARM extends AppCompatActivity {

    Button set_alarm;
    EditText hours,minute,msg;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent_set_alarm);
        set_alarm=findViewById(R.id.button_set_alarm);
        hours=findViewById(R.id.editTextTime_hour);
        minute=findViewById(R.id.editTextTime_minutes);
        result=findViewById(R.id.textview_result);
        msg=findViewById(R.id.editText_Alarm_messgage);

        ActivityResultLauncher<Intent> activityResultLauncher=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                                Toast.makeText(getApplicationContext(),"return back",Toast.LENGTH_SHORT).show();

                            }



                }
        );





        //application bt7ot se3a le badak yeha w l minute w bya3ml set lal alarm la7alo w bfout 3a application l clock
        //bas la7ta tezbat lezm ta3te l application ta3elak permission eno ye2dar ya3mel set lal alarm w l permission bta3te bel manificst
        //    <uses-permission android:name="com.android.alarm.permission.SET_ALARM" />
        set_alarm.setOnClickListener(v->{
            Intent intent =new Intent();
            intent.setAction(AlarmClock.ACTION_SET_ALARM);
            String hours_string=hours.getText().toString();
            String minutes_string=minute.getText().toString();







            int hours_int=Integer.parseInt(hours_string);
            int minutes_int=Integer.parseInt(minutes_string);

            intent.putExtra(AlarmClock.EXTRA_MESSAGE,msg.getText().toString());
            intent.putExtra(AlarmClock.EXTRA_HOUR,hours_int);
            intent.putExtra("hour",hours_int);
            intent.putExtra(AlarmClock.EXTRA_MINUTES,minutes_int);
            //ya3ne 5ale l alarm vibrate true ya3ne true vibrate false ya3ne false not vibrate
            intent.putExtra(AlarmClock.EXTRA_VIBRATE,false);
           if(intent.resolveActivity(getPackageManager())!=null) {
               if (hours_int <= 24 && minutes_int < 60 && hours_int >= 0 && minutes_int >= 0) {
                   activityResultLauncher.launch(intent);
               }
           }
        });

    }


}