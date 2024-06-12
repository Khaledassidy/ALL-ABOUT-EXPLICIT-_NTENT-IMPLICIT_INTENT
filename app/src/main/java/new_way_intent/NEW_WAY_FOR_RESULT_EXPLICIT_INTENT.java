package new_way_intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


import com.example.intent_implicit_intent_explicit_intent.R;

import Explicit_Intent.Explicit_Intent_7_for_result_tringle;
import Explicit_Intent.Explicit_Intent_8_for_result_rectangle;

public class NEW_WAY_FOR_RESULT_EXPLICIT_INTENT extends AppCompatActivity {

    Button click,click2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_way_for_result_explicit_intent);
        click=findViewById(R.id.button_new_way_explicit_intent);
        click2=findViewById(R.id.button2_new_way_explicit_intent);


        /*
            ne7na bas kona nesta3ml startactivityforresult() 3ashen bejoun badna nerja3 la hay l actovity ba3den
            neje nesta3mel onactivityresult() 3ashen na3m 3amlyee 2aw she task bel raj3a w setresult()
            keen yetl3lna fo2 startactivityforresult() 5at ma3neta eno hay l mehod depricated ma3ad da3meta google eja mehods badela
            lesh ma3d da3meta google?
            ne7na bas kona nestad3e  startactivityforresult() ba3den nestad3e
           onactivityresult() 3ashen na3m task b3amlyet rojo3 bas 2alak eno fe senarios btseer hay l mehod b 3amlyet onactivityresult() ma btesd3aa b3na tene tkoun l activity ta3elak null ma tkoun mawjoude
           ya3ne kenet maftou7a mawjoude b ram ba3den mara2 wa2t tawel fa hay l activity yale badak terj3la damaret la7ala w enta manak 3arfeen mara2 wa2t taweel 2aw sar aye zarf ada ela tdamer la7ala hay l activity fa enta bas teje la terja3la ta3mel error eno l activity l 3am terj3la null





         */


        /*

        hayde tare2a ma3ad testa3mela ma3ad testa3mel   startActivityForResult(intent_tringle, 1);

        Intent intent=new Intent();
        Intent intent_tringle = new Intent(this, Explicit_Intent_7_for_result_tringle.class);
        startActivityForResult(intent_tringle, 1);


        */


        /*
            fa sho howe l 7al?
            ma3ad testa3mel startactivityforresult();

            testa3mel badela Activity Result Launcher

            Activity Result Launcher:bedal mote7a 3a mostawa l mashro3 2awl ma tblesh w t7ota bedal mawjoude 3ala toul ta2rebn ka2nak 3mlt she shabih bel static bedal mote7 ween manken bel mashro3 bnel application

             Activity Result Launcher:3ebara 3an class mawjoud 3ana bel android enta mn 5elelo bta3ml 3amlyet l entekl mn activity la activity 2aw action ya3ne momken ykoun explicit_intent or implicit_intent heed class jehez bjam3lak kol 3amlyeeet l 2ente2al 3amlyet tash8el l activity 2aw action le btlzm result bas terja3 3al activity
             ya3ne aye sha8le btelzm feha onactivityresult() 2aw onpermissionresult() aye sha8le bel 3awde bteshmel aye sha8le feha 3awde lal activity ta3etak sawe2 kont b activity w badak terja3 la activity m3ayane

             2awl sha8le btektob esmo lal class ActivityResultLauncher

             w heed elo generic type ya3ne nou3 l data le badak tersela lal ActivityResultLauncher : ActivityResultLauncher<> been hawde le braket bt7ot nou3 le badak yeh Integer,Double,Intent l badak yeh

             exmple:
             hala2 ana bade erselo la heed l class intent 3ashen ysha8ela
             ActivityResultLauncher<Intent> w ba3den btktob esmo ka2no variable  ActivityResultLauncher<Intent> khaled
             ba3den btsajlo ya3ne bta3ml heek: ActivityResultLauncher<Intent> khaled=registerForActivityResult(

        )

            ba3den bt7ot new w l 3amlye le enta badak ta3mela le heye  new ActivityResultContracts.StartActivityForResult() ya3ne startactivityforresult
            ba3den fasle w l parameter tene howe l call back l 3amlye le bado nfeza bas yerja3 mn l activity :
              new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {

                        sho badak ta3mel bas yerja3 mn l activity hedek 3ala hay l activity w byeb3lk ActivityResult ta3et hedek l activity fa houn batal lezm requset_code wala result code 5als mobeshratan

                        ya3ne enta abl kont testa3mle setresult bt7ot feha l intent w heek hala2 houn nafs she 7a ta3mel setresult b activity tenye w 7a testa2bla bel  public void onActivityResult(ActivityResult o)

                        bas terja3 7a ta3mel call w yredalk she esmo ActivityResult o feha l ma3lomet le 7atyta b set result bte5od l badak yeh l intent aye she badak yeh la te5od l intent bta3ml heek   o.getData() btrje3lak l intent
                        7ata iza 2arslk result_code bt2olo        o.getResultCode() beredlk l result code



                    }
                }


                tyeb hala2 keef badak tsha8ela btrou7 masaln bt3ml click listenr w bt7ot :khaled.launch();
                fa btle2e eno bye5od parametr intent lesh l2no mnekteshef eno generic type howe nou3 l baynet l badak tersela lal ActivityResultLuncher ne7na badana nsha8el intent so 3mlna generic type intent






                heek:

                 ActivityResultLauncher<Intent> khaled=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                        Toast.makeText(getApplicationContext(),"Activity return back",Toast.LENGTH_SHORT).show();

                    }
                }
        );

        khaled.launch(new Intent(getApplicationContext(),Explicit_Intent_7_for_result_tringle.class));








        */




        //exmple:


        ActivityResultLauncher<Intent> khaled=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                        Toast.makeText(getApplicationContext(),"Activity return back form 1",Toast.LENGTH_SHORT).show();

                    }
                }
        );

        click.setOnClickListener(v->{


            khaled.launch(new Intent(getApplicationContext(),Explicit_Intent_7_for_result_tringle.class));

        });



        //hala2 3mlt button tene ana samyto click2 mnshof eno onactivity result batal lezm nesta3ml result_code l2no kel activity la7ala 3ana onactivityResult ya3ne iza kabst 3ala l button l 2ola w rje3t 7a testad3a toast Activity return back form 1 iza kabsna 3al tene button w rje3na 7a testd3a Activity return form 2

        ActivityResultLauncher<Intent> khaled2=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                        Toast.makeText(getApplicationContext(),"Activity return back form 2",Toast.LENGTH_SHORT).show();

                    }
                }
        );

        click2.setOnClickListener(v->{
            khaled2.launch(new Intent(getApplicationContext(), Explicit_Intent_8_for_result_rectangle.class));

        });

    }
}