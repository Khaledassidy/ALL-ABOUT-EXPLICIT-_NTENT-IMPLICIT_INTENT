package Explicit_Intent;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intent_implicit_intent_explicit_intent.R;

/*

application la keef bseer fe tawasoul been l Activity mnesta5dem feha l intent

la n2ool 3ana Activity A w bade ente2l 3ala Activity B mn 5elel button
3ashen ente2l lezm 5ale bele fekret l intent


fa ana la7 jahez l intent b activity A w eb3ata lal intent la android system w l android sysytem 7a yetwala 3amlyet l search w l ente2el la activity B

3ashen 2a3mel 3amlyet l tawasoul 3ande 2 function:
-startActivity()
-startActivityForResult()
haw l tnen besta5demoun 3ashen sha8el l intent le ana jahzta w 7atet feha l properties
l intent mn 8eer ma sha8ela 3al fade ma byemshe l 7al
3ashen sha8ela lal intent besta5dem wa7de menon

bas sho l far2 bynetoun la haw l function haw l tnen btsha8el l intent bas fe far2 baset:
-startActivity():hayde btsha8el l intent w btemna3 3amlyet l rojo3 ya3ne ana re7t mn activity A la Activity B l startActivity() btmna3 3amlyet l rojo3 la activity A mn Activity B
-startActivityForResult():hayde btesma7 b 3amlyet rojo3 ya3ne re7na mn activity A la activity B w btesma7le erja3 mn activity B la A
ya3ne a7yenan ne7na mnente2l mn Activity A la activity B bdoun 7aje la bas nerja3 mn activity B la A na3mel aye 3mlye bas nerja3 lal activity A so houn mnesta5dem startActivity()
ya3ne a7yenan ne7na mnente2l mn Activity A la activity B bas b 7aje la bas nerja3 mn activity B la A na3mel  3mlye bas nerja3 lal activity A so houn mnesta5dem startActivityForResult() exmple iza 3mlna application a5bar fa ne7na bas nokbous 3ala 5bar menon 7a nfout nshofo w bas nerja3 be7je eno na3mel update la ka2me ta3et l a5bar fa houn enta b7aje ta3ref aymta reje3 mn activity B w t7dade l 3amlye le badak yeha ten3aml b activity A




hala2 bade 2a3ml l application ente2l mn explicit_Intent la explicit_Intent2 fa hal lezm esta3ml l proprites ta3wlet l intent l houne :-componented
                                                                                                                                       -Action
                                                                                                                                       -Category
                                                                                                                                       -Data
                                                                                                                                       -Extra
                                                                                                                                       -flag





7asab iza 3am nesta3ml explicit_intent 2aw implicit_intent

masaln houn 3am nesta3ml explicit intent so akeed badna nesta3ml:
commponent 3ashn n7aded aye actvitiy badna nrou7 3lyha
iza badna ne7na bas nente2l 3ala l activity tenye badna nersel data so 7a nesta5dem extra lesh mesh data?
l2no data btesta5dam aktar she bel implicit intent mesh bel explicit intent bel explicit intent mnesta5dem extra l2no mazel ne7na 3arfanen ween ray7en aye activity ray7en 3lyha w men ween tal3en mn aye activity fa ana l tenten l activity ana 3mloun ba3ref ma3lometoun fa be2dar esta5dem l extra bkol sohole ka bundle w 3abe feha l data le bade ersela sho ma kenet
bas data btesta5dam aktar bel implicit intent aktr she mtl application l picture bade 2a3ml share fa lezm yeft7lk l app le bya3mlo share la soura fa 2awl ma tefta7 l application tene la7 tezhar l soura bl application tene meeen l 2arsal soura mn applciation sowar la application tene 3an tare2 Data l application tene 2eder ye7sal 3al soura mn 5elel l Data nafs she iza bade a3mel call w ersel l ra2m
l extra mnesta5dema aktr she iza kona 3arfanen mn ween tal3een w laween ray7en




*/


//hala2 3mlt button ana exmp click 2awl ekbous 3lee 7a ente2l 3ala l explicit_intent_2:
public class Explicit_Intent extends AppCompatActivity {

    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        click=findViewById(R.id.click);


        //houn 7a a3ml listner w b2alb lisnter b 7ot 3mlyet l ente2l eno bas tekbous 3al button bente2l la activity explicit_intent_2


        click.setOnClickListener(v->{
            //first step:ba3mel intent object mn l intent
            //hala2 b2alb l praces fene 7aded 6 proprteis ta3wlet l intent mtl commponent w hal ossas w fene etrko fade 7adedo btare2a tenye
            //fe kaza constructor fene na2e le bade yeh
            //fe constructor fene 7aded bas mn aye activity bade ente2l w la ween la aye activity bade osal
            //keef 2awl parameter howe:l activity le mawjoud feha ya3ne l context fa besta3ml ya getbasecontext(),getapplication context 2aw esm l calss ba3den dot this:Explicit_Intent.this
            //tene parameter besta3ml l activity yale bade ente2l 3lyha so b7et esm l activity ba3den dot class howe bye5od l class le enta badak trou7 3lee:Explicit_Intent_2.class hayde Explicit_Intent_2.class btrje3lak esm l calss le enta badak trou7 3lee w ma7alo
            Intent intent = new Intent(getBaseContext(),Explicit_Intent_2.class);
            //3ashen sha8el l intent ba3ml startactivity() ya3ne ma bade 2a3ml she b 3mlyet l rojo3 l startactiviyty() bte5od l intent le enta 3mlta ya3ne k2no 3am t2olo sha8le hay l intent
            //bas hala2 ba3d ma nta2lt lal activity w rje3t 7a erja3 la hay l activity bas ne7na sta3mlna startactivity() ma bt5lene 2a3ml aye she bas erja3
            startActivity(intent);
        });

    }
}