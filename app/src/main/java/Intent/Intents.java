

/*

Intent:3ebara 3an class in android ma3neto hadaf

Intent:3ebara 3an class byeta3mal ka tare2a le tawasoul w l ente2al been mokawanet l android.metl tawasoul been l activity w services bde5el l application 2aw barato
bade sha8el activity jdedede mn 2activity tenye la7 esta5dem l intent,bade sha8el service jdede mn service tenye bade esta5dem intent fa howe byesta5dam le tawasoul been 3anaser l android

class intent:class jehez enta bas bet7ded l 5asa2es ta3elou.l 5asa2es ta3elo 3ebara 3an configuration 2aw e3dadet la 3amalyet tawasoul le ana bade 2a3mela been l 3anaser b ma3na ana bade sha8el activity A mn Activity B 2aw l 3aks fa 7a yelzmne tare2a le tawasoul fa kel tafasel hay b7adeda b class l intent
keef ya3ne tawasoul been l 3anaser law bade ektoub email 7a ekbous kabse 7a yen2lne la activity jdede ma7al ma bektoum email 3amlyet l ent2al mn shshe l 2ola la shshe tenye n3amlet mn 5elele class l intent l2no howe le 3mlna fe 2e3dadet tawasoul le sta3mla heed l class 7adad eno bade yente2l mn activity ta3et l home l email la activity tenye ma7al ma mnktob email


//class l intenet 3ebara 3an sha8lten:Explicit intent,Implicit intent

//Implicit intent:(7adaf bekoun demne ya3ne ana ma 2oltelo sho bade 2a3mel bas howe la7alo fehem sho bade 2a3mel ben2an 3ala data mo3ayane ya3ne ana 2aw2at b7aje sha8el shshe jdede mn shshe ademe bas ma3rfen aye shshe bade sha8ela fa ana b7adedlo sho sha8let lezm ta3mela hay sheshe l jdede w l device la7alo bye5tar shshe le bada tnafez l 3amlye hayde)
exmple:law ana re7t 3al gallary w 2oltelo bade 2a3mel share la hay soura fa l device l android la7alo 7a y7awlne 3ala application ta3mel share betl3lk ka2eme mn l application mtl(watsap,teligram,discord,emai,gmail..etc)haw keloun bte2dar ta3mel share la soura 3lyhoun.tyeb hal enta 7adadt ween badak tente2l la2.3amlyet tawasoul hay demneyan enta 7adadt 3ande soura w bade 2a3mela share fa system l android la7alo jeeb kel l application le bt2dar ta3mel 3lyha share la soura)


Explicit intent:heye l hadaf wade7 ya3ne ana b2olo bade ente2l mn l activity A la Activity B
exmple:bas rou7 3ala application l mssages w 7et buuton new msseage fa how 7a yen2elne la activity jdede ma7al ma bektob mssage fa l hadaf wade7 ana 7adtlo iza 7ada kabas hay l kabse n2olo mn hay l activity la hay l activity


Intent class:mawjoud feh 6 mokawenet 2asaseye w feh 8ayroun l houne:
-component:howe l 3onour lale badak tente2l 3lee(ya3ne ana kenet b activity A bade ente2l la activity B fa houn l commponent howe l activity B yale bade ente2l 3lee) heed nou3 best3mlo bel explicit intent l2no 3arfen ana laween bade rou7 hadaf wade7
-Action:l action howe 3ebara 3an 3amlyet mtl bade 2a3ml send la soura bade 2a3ml send lal hay l msg houn bhay l 7ale ana 7adadt lawen bade ente2l la2 bhay l7ale 7adadt l action le bade 2a3mlo le howe eno send picture masaln w system l anroid la7alo tal3lk l application le byeb3ato soura w enta btn2e so houn l hadaf mesh wade7 system la7lo bado ya3ref so hay bel implicit intent
-Category:ta7ded 5asa2es mo3ayane lal action yale bade 2a3mlo ana bade fasel akatr b 3amlyet l action best5dem category hay btesta5dem bel implicit intent hay btest5dam akatr she iza 3ande 2 intent wa7de bade tersel wa7de bada test2bel so a7yenan b7aje esta3mel l category
-Data:mante2 enta bas badak ta3mel 3amlyet tawasoul ersel w este2bel mante2 fe data badak tersela ya3ne (enta badak ta3mel etesal so katbt l ra2m telephone bel myapplication  w 7atet call fa 7a tle2e ra2m sar mawjoud b application l call keef nta2al mn 5elel data so bteta3ml bel implicit intent) (enta badak trou7 mn Activity A la B w badak teb3at data la activity B mn A so kamen bel explicit intent n3ouza) data 3ebara 3an data le badak tersela mn jeha l 2ola la jeha tenye
-Extra:hay 3ebra 3ana data edfeye 2a7yenan ma badak test5dem l baynet l mawjoude bl data badak tersel data 5asa feek ya3ne enta bas badak tersel soura la yefta7 l application ta3el l beyrsel soura w mn demn data heye soura bas a7yenan enta b7aje te5od t7ot ma3lomet 8eer l mawjoude bel data btesta3mel extra use in impicit,explicit intents (extra asln heye 3ebara 3an  bundle keef kouna nesta3mel l bundle bnfs tare2a mnesta3ml l extra)
-flag:3amlyet l ente2al mn activity la activity w badak t7otela shrout mo3ayane bte7ot haw shrout b flag esmple ana bade sha8el Activity B b 5aseye mo3ayane bade ba3d ma teshte8l ma dal ma7fouza demn l activity le ba3da sha8ale,bade yeha ba3d ma teshte8l b fatra yseer kaza testa5dam b implicit intent,explicit intent.























 */













package Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.intent_implicit_intent_explicit_intent.R;

public class Intents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent);
    }
}