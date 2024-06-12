package Explicit_Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.intent_implicit_intent_explicit_intent.R;


//houn nafs l 3mlto b activity ta3et  explicit_intent bade ente2l la  explicit_intent_2 bas houn bade esta3ml data 7ot data
public class Explicit_Intent_3 extends AppCompatActivity {
    Button click2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent3);
        click2=findViewById(R.id.click2);

        click2.setOnClickListener(v->{
            //first step:ba3mel intent object mn l intent
            //hala2 b2alb l praces fene 7aded 6 proprteis ta3wlet l intent mtl commponent w hal ossas w fene etrko fade 7adedo btare2a tenye
            //fe kaza constructor fene na2e le bade yeh
            //fe constructor fene 7aded bas mn aye activity bade ente2l w la ween la aye activity bade osal
            //keef 2awl parameter howe:l activity le mawjoud feha ya3ne l context fa besta3ml ya getbasecontext(),getapplication context 2aw esm l calss ba3den dot this:Explicit_Intent.this
            //tene parameter besta3ml l activity yale bade ente2l 3lyha so b7et esm l activity ba3den dot class howe bye5od l class le enta badak trou7 3lee:Explicit_Intent_2.class hayde Explicit_Intent_2.class btrje3lak esm l calss le enta badak trou7 3lee w ma7alo
            Intent intent = new Intent(getBaseContext(),Explicit_Intent_2.class);
           //hala2 houn bade 2a3te data la hay l intent 2olna l2no explicit intent mnesta3ml extra
            //tare2a  intent.putExtra() nafs l bundle bt7ot l key w l value ma bt7ot iza integer 2aw string howe la7alo mn l value 7a ya3ref
            //l key le bt7oto bado ykoun nafso zeto bas testad3ee
            //heeek 3abet b2alb l intent extra data fa hounek bl activity tenye bat2olo bade l value le b2alb l user name bjeble khaled
            intent.putExtra("user_name","khaled");
            startActivity(intent);
        });

    }
}