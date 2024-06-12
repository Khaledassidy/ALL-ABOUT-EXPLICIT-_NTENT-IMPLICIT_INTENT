package Explicit_Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.intent_implicit_intent_explicit_intent.R;


//houn bade 2o3roud data b text view le bade ersela mn activity explicit_intent_3
public class Explicit_Intent_2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent2);
        textView=findViewById(R.id.textView);

        //ana bas ersel bersel l intent kola ya3ne hala2 bas eje mn actvity explicit_intent_3 la activity explicit_intent_2 bersel kel l intent le mawjoude b 2alb activity explicit_intent_3 la explicit_intent_2

        //hala2 bade esta2bl l data le ba3ata mn actvity explicit_intent_3 ana bersel la hay l activity l intent kola w mn 5elel l intent btale3 data
        //ba3d ma esta2bl data bade 7ota b text view

        //first bjeeb l intent le nbatett mn activity explicit_intent_3 mn 5elel function esma getIntent()
        //note law hay l lunch activity  w ana 7atet hay         Intent intent=getIntent(); 7a yser error l2no 7a tkoun l intent null

        //note kamen bas ana b application l gallary w bade 2a3ml share fa bas okbous 3ala aye application mn haw le byetl3ole bekono koloun ma7tot b2alboun code heek    Intent intent=getIntent();
        Intent intent=getIntent();

        //hala2 bade jeeb data w 2o3roda b textview besta3ml getextra bas b7aded sho naw3o la hal extra getIntextra(),getString extra
        //fe kamen getextars()iza bade jeeb bundle kent m2arsel bundle
        //b7aded b2alb l parancess l key taba3 data le sayfvo le howe username mtl l bundle byeshte8l nafs she
        //note badak tentebh ykoun le key le 7atyto houn nafso zeto l mawjoud b explic_intintet_3
        String name=intent.getStringExtra("user_name");
        //b7ot data b text view
        textView.setText(name);
    }
}