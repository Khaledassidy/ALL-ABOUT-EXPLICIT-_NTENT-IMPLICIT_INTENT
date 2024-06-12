package new_way_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.intent_implicit_intent_explicit_intent.R;

public class NEW_WAY_FOR_RESULT_IMPLICIT_INTENT_MAP_LOCATION extends AppCompatActivity {
Button location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_way_for_result_implicit_intent_map_location);
        location=findViewById(R.id.button_location);



        ActivityResultLauncher<Intent> activityResultLauncher=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {

                    }
                }
        );



        location.setOnClickListener(v->{
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_VIEW);

            //33.86155319213867_35.51543426513672 my location
            //target to baabda:,33.83333206176758_35.53333282470703
            //mode: method of trasnportation:&mode=
            /*d:driving tarin,bus
              b:bicycle
              w:walk by foot
              l:motorcycle

            */
            Uri uri=Uri.parse("google.navigation:q34.005836.2181,=&mode=w");
            //to sho the map at specific location:geo:34.0058,36.2181
            //if you want this specific location at specicifc zoom such as at zoom 11:geo:34.0058,36.2181?z=11
            intent.setData(uri);


            //hala2 iza badna nefta7 l app ta3et l google bas lezm n7ot l pacakge ta3ela
            intent.setPackage("com.google.android.apps.maps");
            if (intent.resolveActivity(getPackageManager()) != null) {
                activityResultLauncher.launch(intent);
            }





        });

    }
}