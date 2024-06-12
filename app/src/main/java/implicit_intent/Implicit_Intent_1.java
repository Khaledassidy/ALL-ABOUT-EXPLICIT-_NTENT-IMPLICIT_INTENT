package implicit_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


import com.example.intent_implicit_intent_explicit_intent.R;




//implicit intent 7adaf bekoun mano wade7

//3ande activity esma X feha button w edit text l user bado yda5el ra2m telephone b2alb l edittext
//w ba3d ma 7ot ra2m bade okbous 3al button fal application 7a t7wlne 3ala application l call w yen3arad ra2m hounek w ba3den 2e2dar etesel


//first step l activity x bada tersel intent lal android system tbal8o eno badak tsha8el activity b mowasafet mo3ayane ana b7adeda mane 3am 2olo la system sha8ele activity B masln la2 3am 2olo bas l mowasafet
//ya3ne mane 3am 7aded bade sha8el activity B la2 bade 2olo activity bta3mel kaza w kaza mansln bta3mel call
//w ba3den enta ya android system 7aded l application l monesbe ta3mel call ya3ne berou7 android system b fatesh 3alal l applications mn le 3andak bta3ml heed l action

//note:keef  l android system b fatesh 3alal l applications mn le 3andak bta3ml heed l action?
//kel application 3ande 3al telephone elo file esmo manifist le feh l proprteis ta3wlet kel application l activity l permission kel she w 3anda she esmo intent filter le b2olak hay l activity sho l eshya le bta3mela w sho l 3amlyet le bte2dar ta3mela w anwe3 data le momken testa2bela
//fa nezam system l android 3ando acces 3ala kel malefet l manifist b kel application b telephone fa bye5od nazra 3lyhoun w bya3ref sho fe activitys bta3mel hay l 3mlye 2aw la2
//l android system berou7 be dawer b list ta3et l manifist bekel activity w bshof sho l activity l monesbe l bta3mel heek 3amlye ble2e eno b application l call w l truecaller masaln fe activity bta3ml heek 3mlye msln






//hala2 bade tabe2 le 2olto 7a 2a3ml edit text w button w 7ot fe ra2m w bas okbous 3al button y7wlne 3ala application l call 2aw l applications le bya3mlo call
public class Implicit_Intent_1 extends AppCompatActivity {

    Button call;
    EditText enter_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.implicit_intent_1);
        call=findViewById(R.id.button_call);
        enter_number=findViewById(R.id.editTextText_phonenumber);

        call.setOnClickListener(v->{
            //2awl she bade 2e5od l number mn l edit text
            String number=enter_number.getText().toString();
            //ba3den bade 2a3ml intent heye 3ebra 3an implicit intent ma b7aded mn ween jeye la ween raye7 lezm 7aded l action le bade 2a3mlo
            Intent intent=new Intent();
            //la 7ot l action le bade 2a3mlo mtl call,share kaza ba3mel intent.setAction()
            //keef bade 2a3ref l action awjoud jowa class l intent bektob b2alb l braket intent w bshof kel l actions kel action m3rafe final heye strint
            //Intent.ACTION_DIAL:yezhrlak l ra2m b application l call ta3el l etesal
            //Intent.ACTION_VIEW:3ashen yezhrlk saf7a mo3yane 2aw link m3ayan mn l interent
            //Intent.ACTION_SEND:3ashn ya3mel la she share ta3ml send la soura 2aw she mn application la application

            //aye application 7ada 3emla bekoun keteb b2alb she activity eno heye btest2bl action mn nou3 dial
            intent.setAction(Intent.ACTION_DIAL);
            //hala2 iza bade 2awl ma 7ot ra2m ydo2 bsor3a sa3eta ba3mel :intent.setAction(Intent.ACTION_CALL);

            //hala2 keef bade en2ol l  ra2m l 7atyto bl edit text mn l edit text la application l call 3an tare2 l Data    intent.setData()
            // intent.setData():hay method bte5od paramet she esmo URI
            //URI:Universal or Uniform Resouces identifier
            //Universal or Uniform Resouces identifier heye bteshabh l URL l heye 3enwen la she m3ayan address ya3ne kel she sowar,ara2m ma3lomet mawjoude bel telephone heye m5zane b telephone fa enta 3ashn tete3mal ma3a ma btensa5a nas5 btet3ml ma3 l 3enwen ta3ela l address
            //enta bte5od 3enwen 3lyha w btet3mal ma3 l 3enwen taba3a mtl l website enta lama tefta7 website btektob l 3enwen ta3elo la te2dar tosalo fa enta houn 3ashn te2dar tousal la baynet mo3yane besta5dem l uri
            //l uri heye byeshbah l url l howe ta3el l webite bas l uri she 2a3am meno
            //ya3ne kamen iza bas na3ml share la soura mn l gallary la watsap 2aw she eno enta ma bte5od soura ma btensa5a nas5 bte5od 3enwen 3lyha w bteb3ata
            //fa hala2 bade 5azen l data ta3ete b she esmo uri w ba3den beb3zta la set data
            //ana 3ande number howe b2alb variable number la 7awlo la uri fe method 3ande esma uri.parse bt7wel string la uri
            //bas fe type m7adad badak t7oto bel parse kel sha8le ela namat l telephone elo namat soura ela namat l text l 3ade ela namat
            //namat ta3el telephone:"tel:"+ra2m telephone le ba2albo l variable ya3ne:"tel:"+number
            Uri uri=Uri.parse("tel:"+number);

            //la tezbat ta3et l action call lezm zabet l uri: Uri uri=Uri.parse("voicemail:"+number);


            //hala2 ba3te l uri la set data
            intent.setData(uri);

            //e5er she ba3ml startactivity w ba3teha l inetnt
            startActivity(intent);

            //bas houn 7a tl7ez eno ma tl3le ka2me l2no bel emulator ma3nde 8eer app wa7de bta3mel call l heye l call application



            //note:eno b tabae2 l phone 2aw 8ayro l bya3mlo call bekoun bel activity m3yane ma7tout eno 2awl she exported true ya3ne fe application tene mn bara yet3ml ma3a w bekoun eno ma7tout bhay l activity l intent filter bta3ml action esmo dial

            //note fene ba3den ma 2a3ml set data w set action fene b2alb l intent ana w 3am 3arefa 2a3tena 2awl parameter l action w tene parametr l uri mtl heek:   Intent intent=new Intent(Intent.ACTION_DIAL,uri);


        });




    }
}