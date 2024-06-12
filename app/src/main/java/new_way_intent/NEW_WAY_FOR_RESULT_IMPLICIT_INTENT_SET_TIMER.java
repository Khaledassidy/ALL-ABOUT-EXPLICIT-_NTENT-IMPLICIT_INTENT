package new_way_intent;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.intent_implicit_intent_explicit_intent.R;

public class NEW_WAY_FOR_RESULT_IMPLICIT_INTENT_SET_TIMER extends AppCompatActivity {
    Button set_timer;
    EditText enter_msg,enter_the_timer;
    NumberPicker numberPicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_way_for_result_implicit_intent_set_timer);
        set_timer=findViewById(R.id.button_set_timer);
        enter_msg=findViewById(R.id.editText_timer_messgage);
        enter_the_timer=findViewById(R.id.set_timer);



        //kamen bhay badna permisiion howe nafso zeto ta3ell alarm
        //    <uses-permission android:name="com.android.alarm.permission.SET_ALARM" />

        ActivityResultLauncher<Intent> intentActivityResultLauncher=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                        Toast.makeText(NEW_WAY_FOR_RESULT_IMPLICIT_INTENT_SET_TIMER.this, "back to activity", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        set_timer.setOnClickListener(v->{

            Intent intent=new Intent();
            intent.setAction(AlarmClock.ACTION_SET_TIMER);
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, enter_msg.getText().toString());
            intent.putExtra(AlarmClock.EXTRA_LENGTH, Integer.parseInt(enter_the_timer.getText().toString()));
            //hyde iza badak dal b2alb l activity ta3elak w ybyen timer ka notification bt7ot true 2ama iza bada tente2l 3ala application timer kelo bt7ot false
            intent.putExtra(AlarmClock.EXTRA_SKIP_UI, false);

            if(intent.resolveActivity(getPackageManager())!=null){
                intentActivityResultLauncher.launch(intent);
            }
        });
    }
}