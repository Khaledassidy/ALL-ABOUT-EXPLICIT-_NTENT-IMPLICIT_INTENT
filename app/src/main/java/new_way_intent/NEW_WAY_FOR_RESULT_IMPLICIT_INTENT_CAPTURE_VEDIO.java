package new_way_intent;

import android.content.Intent;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


import com.example.intent_implicit_intent_explicit_intent.R;

import java.net.URI;

public class NEW_WAY_FOR_RESULT_IMPLICIT_INTENT_CAPTURE_VEDIO extends AppCompatActivity {
    Button take_vedio_profile_new_way;
    VideoView vedio_new_way;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_way_for_result_implicit_intent_capture_vedio);
       take_vedio_profile_new_way=findViewById(R.id.button_capture_vedio_new_way);
       vedio_new_way=findViewById(R.id.vedio_view);

        ActivityResultLauncher<Intent> activityResultLauncher= registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                        Uri uri=o.getData().getData();
                        vedio_new_way.setVideoURI(uri);
                        vedio_new_way.start();

                    }
                }
        );


        take_vedio_profile_new_way.setOnClickListener(v->{
            Intent intent=new Intent();
            intent.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
            //INTENT_ACTION_VIDEO_CAMERA:hyde nafsa bas eno btfout 3ala app l camera bseer feek ta3ml edit lal vedio kelo
            if(intent.resolveActivity(getPackageManager())!=null) {
                activityResultLauncher.launch(intent);
            }
            else{

                Toast.makeText(this,"no app find",Toast.LENGTH_SHORT).show();

            }
        });
    }


}