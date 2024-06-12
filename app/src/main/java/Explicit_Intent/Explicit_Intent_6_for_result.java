package Explicit_Intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.intent_implicit_intent_explicit_intent.R;




//la7 nblesh b este3ml startactivity for result ya3ne keef fena nafez 3mlye bel 3awde

//sho 7a yseer 7a ykoun 3ana bhay l activity 2 button wa7de rectangle wa7de tringle w text view bte3red nateje
//bas nokbous 3ala triangle 7a yen2lne 3ala activity jdede w bas nokbous 3al tringle 7a yen2lne 3ala activity kamen jdede
//la n2ol ne7na b tringle masln w 7atyna l 2ar2am bas nokbous 3ala l button la no7soub 7a traj3ne 3a hay l activity w t7etele nateje w nafs she bel nesbe lal rectangle


//note ne7na bas nerja3 la n7ot l result b7aje la function esma OnActivityResult() hay l function mawjoude bel life cycle bt5lene 2awl ma erja3 mn l activity l rectangle 2aw l tringle btestad3a la7ala bas bshart hay ma btestad3a ela iza kent 2e5ed b3een l 2e3tebr eno badak terja3 ya3ne mestad3e startActivityForResult()
//wl l result enta ma badak teb3ato la hay l activity fa enta btesta3mel function esma onResult() bt7ot feha le badak teb3ata 3end 3mlyet rojo3
//setResult() bteb3at l nateje bel intent la system w system braje3a la hay l activity b function l OnActivityResult()

//fa enta bhay l 7ale b7je la 3 function:
//-StartActivityForResult()
//-OnActivityResult()
//-SetResult()

public class Explicit_Intent_6_for_result extends AppCompatActivity {

    Button Triangle, Rectangle;
    TextView Result;

    final static int TRIANGLE_REQ_CODE=1;
    final static int RECTANGLE_REQ_CODE=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent6);
        Triangle = findViewById(R.id.button_triangle);
        Rectangle = findViewById(R.id.button_rectangle);
        Result = findViewById(R.id.result);

        //explicit intent

        Triangle.setOnClickListener(v -> {
            Intent intent_tringle = new Intent(this, Explicit_Intent_7_for_result_tringle.class);
            //hala2 be ma 2no nbadna nerja3 la hay l activity w badna na3mel 7adas bas nerja3 fa mnesta3ml hala2 startactivityforresult()
            //startActivityForResult();:bte5od 2 parameter 2awl wa7ad l intent tene wa7ad l requset_code
            //request_code:3ebara 3an variable naw3o integer 3ebra 3an eno iza enta nta2lt mn hay shshe la kaza shshe fa w enta reje3 ya3ref mn aye shshe enta rje3t
            //ya3ne ana bas ekbous rectangle 7a ente2l 3al rectangle,w bas ekbous tringle 7a ente2l 3ala triangle tyeb bas bade erja3 msln mn activity l tringle keef bade 2a3ref eno rje3t mena mesh mn l rectangle mn 5elel l requset code w nafs she bel nesbe lal tringle
            //ma bda2yan 2a3te aye ra2m bade yeh 7a 2a3te ana 7alyan 1
            //bas ana erja3 mn hay aye activity rectangle 2aw tringle 7a yraje3le l requset code fa sa3eta 7a 2a3ef mn aye activity ana jeye
            startActivityForResult(intent_tringle, TRIANGLE_REQ_CODE);
        });

        Rectangle.setOnClickListener(v -> {
            Intent intent_rectangle = new Intent(this, Explicit_Intent_8_for_result_rectangle.class);
            //hala2 houn 7a 2a3te l requset code 2 3ashn 2a3ref eno iza rje3t mn activity l rectangle 7a yraj3le l code howe 2
            startActivityForResult(intent_rectangle, RECTANGLE_REQ_CODE);
        });


    }

    //hala2 3ashen bas erja3 la houn mn l activity bade 2a3ml masln e3roud nateje 2aw aye she masln fa hala2 bestad3e l function l heye mawjoude b life cycle l onactivityresult()
    //bestad3eha barat l oncrate() method


    //hay l method la7ala btesd3a 2awl ma erja3 bas hay l method ma btestd3a 7ata law kont keteba ela iza kont mesta5den startactivityforresult()
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //hay l medtod bas tesd3a bteb3tle 3 sha8let:
        //-requestCode:bteb3tle l requset code le ana kont be3to fo2 3ashn 2a3ref mn aye shshe rej3en law rje3na mn tringle so 7a ykoun 1 iza mn rectangle 7a ykoun 2
        //-resultCode:hayde law enta reje3 mn she activity badak twade7 she m3ayan
        //-intent:howe w reje3 byb3at l intent braje3 l intent ma3o enta bt3abe feha data bl activity l tringle w rectangle w bterja3 bteb3ata la system w system byeb3ata lal hay l function


        //hala2 ne7na ba3d ma 3mlna activity rectangle w tringle w 3mlna intent w setresult fa howe 7a yraje3lak l intent hay l function fa enta badak testa2bla w t3roda b l textview
        //howe lama 7a yerja3 mn shshet rectangle w tringle 7a yestad3e hay l function  w ba3tlha requset code le enta 7atyto w l result code w l intent l 7aytyta bl setresult()
        //fa hala2 enta badak testa2bl l data w bt7ota b textview


        //fa 2awl she bade 2a3ml condition 3al requset_code eno enta mn aye shshe reje3 mn rectangle wala mn tringle 7asab l requset code l 7atyto l howe ta3el l tringle 1 w ta3el rectangle 2

        //enta reje3 mn activity l triangle
        /*if(requestCode==1){
            //hala2 bade jeeb l areia l 2ademe w 7et 7eda l ariea l jdede fa 2awl she bjeeb l ariea l 2ademe
            //heed le keen mawjoud
            String old_aria_tringle=Result.getText().toString();

            //hala2 le bado jeyek mn l intent
            //bte7tolo deffult value eno iza ma l2yto 7eto 0 lal tringle_areia
            double new_areia_tringle=data.getDoubleExtra("triangle_ariea",0);

            //hala2 badak t7otoun ta7t ba3doun lal old w new
            Result.setText(old_aria_tringle+"\nTriangle:"+new_areia_tringle);



        }*/
        //enta reje3 mn activity l rectangle
        /*else if(requestCode==2) {
            //hala2 bade jeeb l areia l 2ademe w 7et 7eda l ariea l jdede fa 2awl she bjeeb l ariea l 2ademe
            //heed le keen mawjoud
            String old_aria_rectangle = Result.getText().toString();

            //hala2 le bado jeyek mn l intent
            //bte7tolo deffult value eno iza ma l2yto 7eto 0 lal tringle_areia
            int new_areia_rectangle = data.getIntExtra("rectangle_ariea", 0);

            //hala2 badak t7otoun ta7t ba3doun lal old w new
            Result.setText(old_aria_rectangle + "\nRectangle:" + new_areia_rectangle);
        }*/


        //hala2 houn 7a esta3ml l requset code
        if (requestCode == TRIANGLE_REQ_CODE) {
            if (resultCode ==Explicit_Intent_7_for_result_tringle.VALID_RESULT_CODE ) {
                //iza ne7na jeyen mn triangle w l aria positive

                //hala2 bade jeeb l areia l 2ademe w 7et 7eda l ariea l jdede fa 2awl she bjeeb l ariea l 2ademe
                //heed le keen mawjoud
                String old_aria_tringle = Result.getText().toString();
                //hala2 le bado jeyek mn l intent
                //bte7tolo deffult value eno iza ma l2yto 7eto 0 lal tringle_areia
                double new_areia_tringle = data.getDoubleExtra("triangle_ariea", 0);

                //hala2 badak t7otoun ta7t ba3doun lal old w new
                Result.setText(old_aria_tringle + "\nTriangle:" + new_areia_tringle);

                //iza rej3een mn triangle w l ariea negative raje3 l base wl height w elon eno error
            } else if (resultCode == Explicit_Intent_7_for_result_tringle.IN_VALID_RESULT_CODE) {
                //hala2 bade jeeb l areia l 2ademe w 7et 7eda l ariea l jdede fa 2awl she bjeeb l ariea l 2ademe
                //heed le keen mawjoud
                String old_aria_tringle = Result.getText().toString();

                //bade jeeb l base w l height
                int base = data.getIntExtra("triangle_base", 0);
                int height = data.getIntExtra("triangle_height", 0);

                Result.setText(old_aria_tringle + "\nError in Triangle :" + " the base: " + base + " the height: " + height);

            }


        } else if (requestCode == RECTANGLE_REQ_CODE) {
            if(resultCode==Explicit_Intent_8_for_result_rectangle.VALID_RESULT_CODE) {
                //rej3een mn activity rectangle w l width w l height positive

                //hala2 bade jeeb l areia l 2ademe w 7et 7eda l ariea l jdede fa 2awl she bjeeb l ariea l 2ademe
                //heed le keen mawjoud
                String old_aria_rectangle = Result.getText().toString();

                //hala2 le bado jeyek mn l intent
                //bte7tolo deffult value eno iza ma l2yto 7eto 0 lal tringle_areia
                int new_areia_rectangle = data.getIntExtra("rectangle_ariea", 0);

                //hala2 badak t7otoun ta7t ba3doun lal old w new
                Result.setText(old_aria_rectangle + "\nRectangle:" + new_areia_rectangle);


                //iza rej3een mn rectangle w l ariea negative raje3 l width wl height w elon eno error
            } else if (resultCode==Explicit_Intent_8_for_result_rectangle.IN_VALID_RESULT_CODE) {
                //hala2 bade jeeb l areia l 2ademe w 7et 7eda l ariea l jdede fa 2awl she bjeeb l ariea l 2ademe
                //heed le keen mawjoud
                String old_aria_rectangle = Result.getText().toString();

                //hala2 le bado jeyek mn l intent
                //bte7tolo deffult value eno iza ma l2yto 7eto 0 lal tringle_areia
                int new_areia_rectangle = data.getIntExtra("rectangle_ariea", 0);

                //bade jeeb l base w l height
                int width = data.getIntExtra("Rectangle_width", 0);
                int height = data.getIntExtra("Rectangle_height", 0);

                Result.setText(old_aria_rectangle + "\nError in Rectangle :" + " the width: " + width + " the height: " + height);
            }
        }


        //e5er sha8le la net3emal ma3 requset code w result code btare2a afdal l android 3ando eshaya sebten
        //be2olak mazel houne sebten yofdal t3arefoun ka final static btseer t3ayetlo b esm l class barke nseet w bta3rfo global
        //lesh static 3ashen 2e2dar estad3ehoun b esm l class
        //exmple :       final static int RECTANGLE_REQ_CODE=1;
                       //final static int TRIANGLE_REQ_CODE=2;

        //w bel nesbe lal key kamen enta w 3am t7ot extra 2aw bundle kamen yofdal tsamehoun b static final w t3ayetloun b esm l class

        //hala2 ana 7a 8ayeroun

        //hala2 l android 3emele kamen heek eshay final static jehze fene esta3meloun bas yo7baz est3meloun bel implicit intent

        //RESULT_OK:KEMTO -1
        //RESULT_CANCELED:KEMTO 0
        //RESULT_FIRST_USER:KEMTO 1


    }
}