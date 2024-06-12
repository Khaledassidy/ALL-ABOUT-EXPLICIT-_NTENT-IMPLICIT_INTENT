package new_way_intent;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.intent_implicit_intent_explicit_intent.R;


//To open a screen in the system Settings app when your app requires the user to change something, use one of the following intent actions:
//ya3ne 2aw2at b7aje la ndawer bluttoth,wifi,kaza
/*


Actions:

ACTION_SETTINGS
ACTION_WIRELESS_SETTINGS
ACTION_AIRPLANE_MODE_SETTINGS
ACTION_WIFI_SETTINGS
ACTION_APN_SETTINGS
ACTION_BLUETOOTH_SETTINGS
ACTION_DATE_SETTINGS
ACTION_LOCALE_SETTINGS
ACTION_INPUT_METHOD_SETTINGS
ACTION_DISPLAY_SETTINGS
ACTION_SECURITY_SETTINGS
ACTION_LOCATION_SOURCE_SETTINGS
ACTION_INTERNAL_STORAGE_SETTINGS
ACTION_MEMORY_CARD_SETTINGS









*/


//7a 2a3mel tnen ana w l be2e mtl ba3d


public class NEW_WAY_FOR_RESULT_IMPLICIT_INTENT_SETTING extends AppCompatActivity {

    Button wifi,bluttoth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_way_for_result_implicit_intent_setting);
        wifi=findViewById(R.id.button_wifi);
        bluttoth=findViewById(R.id.button_bl);


        ActivityResultLauncher<Intent> intentActivityResultLauncher=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                    }
                }
        );






        wifi.setOnClickListener(v->{
            Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        });




        ActivityResultLauncher<Intent> intentActivityResultLauncher1=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                    }
                }
        );




        bluttoth.setOnClickListener(v->{
            Intent intent = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        });
    }
}