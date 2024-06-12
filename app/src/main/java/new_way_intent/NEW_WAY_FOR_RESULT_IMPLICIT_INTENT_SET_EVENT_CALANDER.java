package new_way_intent;

import android.content.Intent;
import android.media.metrics.Event;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.intent_implicit_intent_explicit_intent.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class NEW_WAY_FOR_RESULT_IMPLICIT_INTENT_SET_EVENT_CALANDER extends AppCompatActivity {
Button make_event;
EditText title,location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_way_for_result_implicit_intent_set_event_calander);
        make_event=findViewById(R.id.button_create_event_new_way);
        title=findViewById(R.id.editTextText_title_event);
        location=findViewById(R.id.editTextText_location);

        ActivityResultLauncher<Intent> activityResultLauncher=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                    }
                }

        );






        make_event.setOnClickListener(v->{
            Intent intent = new Intent(Intent.ACTION_INSERT);
            intent.setData(CalendarContract.Events.CONTENT_URI);
            intent.putExtra(CalendarContract.Events.TITLE, title.getText().toString());
            intent.putExtra(CalendarContract.Events.EVENT_LOCATION, location.getText().toString());
            intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY,true);
            intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,20);
            intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,22);

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }



        });
    }







}




