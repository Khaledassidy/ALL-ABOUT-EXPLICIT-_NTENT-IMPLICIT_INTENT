package new_way_intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


import com.example.intent_implicit_intent_explicit_intent.R;

public class NEW_WAY_FOR_RESULT_IMPLICIT_INTENT_CONTACTS extends AppCompatActivity {
Button select_contact,add_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_way_for_result_implicit_intent_contacts);
        select_contact=findViewById(R.id.button_capture_select_contact);
        add_contact=findViewById(R.id.textView_add_contact);



        ActivityResultLauncher<Intent> activityResultLauncher=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                        Uri contactUri = o.getData().getData();


           //heed l code ma fhemto bas tare2a keef jeeb ra2m ta3el contact

//                        String[] projection = new String[]{ContactsContract.CommonDataKinds.Phone.NUMBER};
//                        Cursor cursor = getContentResolver().query(contactUri, projection,
//                                null, null, null);
//                        // If the cursor returned is valid, get the phone number.
//                        if (cursor != null && cursor.moveToFirst()) {
//                            int numberIndex = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
//                            String number = cursor.getString(numberIndex);
//                            // Do something with the phone number.
//                            //...
//                            diplay.setText(number+"");
//                        }
                    }



                }
        );



        select_contact.setOnClickListener(v->{
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_PICK);
            intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
            if (intent.resolveActivity(getPackageManager())== null) {
                activityResultLauncher.launch(intent);
            }
        });


        //add contact
        ActivityResultLauncher<Intent> activityResultLauncher1=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {

                    }



                }
        );

        add_contact.setOnClickListener(v->{
            Intent intent = new Intent(Intent.ACTION_INSERT);
            intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
            intent.putExtra(ContactsContract.Intents.Insert.NAME, "khaled_assidi_2002");
            intent.putExtra(ContactsContract.Intents.Insert.EMAIL, "lebanon_2002@hotmail.com");
            intent.putExtra(ContactsContract.Intents.Insert.PHONE,"81906189");
                activityResultLauncher1.launch(intent);

        });



    }


}