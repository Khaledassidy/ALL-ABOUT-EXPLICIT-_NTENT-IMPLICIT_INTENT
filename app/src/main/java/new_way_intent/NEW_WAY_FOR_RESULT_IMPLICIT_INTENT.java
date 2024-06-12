package new_way_intent;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


import com.example.intent_implicit_intent_explicit_intent.R;

public class NEW_WAY_FOR_RESULT_IMPLICIT_INTENT extends AppCompatActivity {

    Button my_new_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_way_for_result_implicit_intent);
        my_new_button=findViewById(R.id.my_new_button2);


        //exercise 3al impilicit intent eno efta7 l gallary w na2e soura

        //first 3ade mnektob esm l calss w mna3mel resgester mtl l 3ade
        //bas le bye5telef hala2 eno howe sho bado yefta7 sho l generic type howe bado yefta7 l gallary ya3ne sowar w sowar string so generic type string
        //ya3ne bade erselo nou3 l data le bado yefta7a bel implicit intent String l2no image/* ya3ne string type         ActivityResultLauncher<String>
        // ba3den ba3mel regester  ActivityResultLauncher<String> khaled3=registerForActivityResult(
        //
        //        );

        //hala2 bado ye5telef yala bade 2a3mlo kenet 2a3mel l contart start activity hala2 bade a3mel action fa fe she 3ande esmo new ActivityResultContracts.GetContent()
        //GetContent():ana bade jeeb soura mn jehez bade jeeb malaf fa GetContent() nma3neta jeeb documnet jeeb soura mn telephone ta3elak

        //telet sha8le le bada te5telf 3andak l call back enta keen mn zamen yraje3lak intent 3nd l 3awde w ba3den traje3 l uri 3enwen soura fa hala2 l call back onactivity result 7a yraje3lak de8re l uri fa saret ashal



        ActivityResultLauncher<String> khaled3=registerForActivityResult(
                new ActivityResultContracts.GetContent(),
                new ActivityResultCallback<Uri>() {
                    @Override
                    public void onActivityResult(Uri o) {

                        Toast.makeText(getApplicationContext(),"back",Toast.LENGTH_SHORT).show();
                    }
                }
        );

        my_new_button.setOnClickListener(v->{
            //badak t7otolo bel lunch type le badak tefta7o le howe l image ya3ne "image/*"
            khaled3.launch("image/*");
        });
    }
}