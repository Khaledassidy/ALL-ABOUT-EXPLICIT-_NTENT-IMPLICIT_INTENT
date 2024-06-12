package new_way_intent;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import com.example.intent_implicit_intent_explicit_intent.R;

public class NEW_WAY_FOR_RESULT_IMPLICIT_INTENT_CAPTURE_IMAGE extends AppCompatActivity {

    Button take_picture_profile_new_way;
    ImageView profile_picture_new_way;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_way_for_result_implicit_intent_capture_image);

        take_picture_profile_new_way=findViewById(R.id.button_capture_image_new_way);
        profile_picture_new_way=findViewById(R.id.image_profile_new_way);


        ActivityResultLauncher<Intent> activityResultLauncher= registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                        Bitmap bitmap=(Bitmap) o.getData().getExtras().get("data");
                        profile_picture_new_way.setImageBitmap(bitmap);
                    }
                }
        );





        take_picture_profile_new_way.setOnClickListener(v->{
             Intent intent=new Intent();
             intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
             //INTENT_ACTION_STILL_IMAGE_CAMERA:hayde nafsa bas eno btefta7 app l camera kola ya3ne bseer feek ta3mel add lal soura

             if(intent.resolveActivity(getPackageManager())!=null) {
                 activityResultLauncher.launch(intent);
             }
             else{

                 Toast.makeText(this,"no app find",Toast.LENGTH_SHORT).show();

             }
        });


    }




}