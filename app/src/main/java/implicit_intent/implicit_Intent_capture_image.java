package implicit_intent;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.intent_implicit_intent_explicit_intent.R;

/*exercice in implicit intent:
-2awlan 3ana button w image view
-bas 2okbous 3al button la7 yefta7 application l camera w te5od soura m3ayane
-ba3den bas terja3 3ala l activity la7 tente2l soura le sawrta b application l camera 3ala l activity ta3etak w ten7at soura bl image view







*/






public class implicit_Intent_capture_image extends AppCompatActivity {

    Button take_picture_profile;
    ImageView profile_image;

    final static int CAPTURE_IMAGE_REQ_CODE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent_capture_image);
        take_picture_profile=findViewById(R.id.button_capture_image);
        profile_image=findViewById(R.id.image_profile);


        take_picture_profile.setOnClickListener(v->{
            //sho l 3amlye le bade 2a3mela tash8el l intent ta3et taswer
            Intent intent=new Intent();
            //hala2 badna n7ot l action ta3el taswer
            //action taswer esmo camera_capture mawjoud b class esmo mediastore
            //mediastore:class 5aso kel she bel media metl l image,vedio,voice aye she 5aso bel media
            intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);

            //mba 2no ne7na badna nerja3 3al activity n7ot soura mnesta3mel startactivityforresult()

                //startActivityForResult(intent, CAPTURE_IMAGE_REQ_CODE);



            //fe ba3d sha8le la robma ne7na 3am na3mel hay l action le heye eno nsawer bas ma fe wala application 3ana 3al telephone bya3mel heed so 7a ya3mel crush l app keef mn7ola
            //badna nef7as eno fe she app bya3mel heek 3amlye so 3mlna keef:
            //intent.resolveActivity(getPackageManager())!=null heed satr ma3neto eno fe she application bta3mel hay l implicit intent so iza fe ya3ne 7a tkoun not equll null so fout w 3meel startactivityforresult
            //ne7na elnelo rou7 3meel resolve lal activity w 3atyne l package le ana sha8al feha
            //intent.resolveActivity(getPackageManager()):hyde le katbto 7a tjeble lista ta3et l applications le btnafez hay l 3amlye le heye eno btefta7 camera w 7a tjeeb 2awl app feha la hay lista ya3ne heed le katbto 7a tjeble masaln lista feha:appliction camera,application X,application y,keloun beswro w 7a tjeble 2awl application bhay lista l howe l camera w 7a tshofo hal besewe null tab3an ma bsewe null
            //iza raj3tle lista fadye hayde le katbta:intent.resolveActivity(getPackageManager()) so 7a traj3le null so ma 7a ya3mel startactivityforresult
            //bas law reje3 mn hay intent.resolveActivity(getPackageManager()) fe application wa7ad 3al 2alele 7a ynafez l 3mlye le heye startactivityfor result
            //intent.resolveActivity() hyde l method brdlak she object mn nou3 commonnet name
            //intent.resolveActivity(getPackageManager()) iza hyde 7a traj3lk 2awl application b lista so iza ma keen fe wala application b lista ya3ne 2awl 3onsour null
            //law fe 3al 2a2al application wa7ad b nafezlak hay l 3amlye fa ma7ayerj3lk null so 7a yfout ynafezlk l startactivityforresult


            if(intent.resolveActivity(getPackageManager())!=null) {
                startActivityForResult(intent, CAPTURE_IMAGE_REQ_CODE);
            }
            else{
                //iza ma la2et wala app bel lista ya3ne null so tba3 toast ma fe wala app
                Toast.makeText(this,"no app find",Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //houn badna nraje3 l soura ba3d ma nerja3 la hay l activity

        //2awl she bade eta2ak iza howe jeye mn activity l camera ya3ne result code howe CAPTURE_IMAGE_REQ_CODE
        //tyeb hal byerja3 result_code?
        //2alak byerja3 result code iza sawrlak soura bshakl salem ya3ne sawar soura w raj3lak soura bshakkl salem w 7aykoun esmo result code:  RESULT_OK w 2emto -1 iza sawara w raj3lk soura feha mashekl ya3ne swara w sar feh meshkle feha lal image 7a yraje3lk : RESULT_CANCELED w 2emto zero
        //so hala2 bade 2ool iza reje3 mn activity l camera w result code ok ya3ne soura ma feha mashekl raj3lk yeha bshkl salem

        //ne7na hala2 ba3d ma n5les w nsha8le l app w ne5bous l button fa 7a tefta7 l camera iza sawrt 7a yetl3le eshrten wa7de  esharet correct wa7de esharet wrong iza kabst correct 7a yraj3le soura w kamne 7a yraje3 reselt_code esmo ok,iza kabst wrong 7a yraje3le result_code esmo cancelled
        if(requestCode==CAPTURE_IMAGE_REQ_CODE && resultCode==RESULT_OK){
            //hala2 houn bade 7ot soura bel image view howe 7a yraj3lk yeha bel intent
            //bas ma fe she 3ana esmo getimage
            //soura bas terja3 bterja3 bshe esmo bitmap
            //soura bas terja3 bel intent bterja3 bshe esmo 3ala shakl esmo bitmap
            //bitmap:5areta mn l bits ya3ne ne7na mna3ref eno bit howe 0,1 fa l byerja3lk mn l intent soura nafsha bas 3al shakl bits 0,1 ne7na mnasmeha bitmap
            //fa fe she 3ana bel image view esmo   profile_image.setImageBitmap(); bte5od bitmap input w bte3redlak yeha 3al image view


            //fa hala2 2awl she 5alene jeeb soura
            //bt3ref bitmap variable 2awl she w btsame le badak yeh   Bitmap bitmap
            //ba3den bt7ot l intent ya3ne data.getextars()
            //data.getextars():btrj3lk bundle kemle houne lama 3mlo application l camera 7ato data bel extars
            //ba3den bt7ot dot get w been 2 qutation data ya3ne 3atne l ma3lomet le b2albl variable le esmo data houne samo l l baynet data    data.getExtras().get("data");
            //ya3ne baynet l bitmap l 5asa bel soura bterja3 b bundle jowa l intent w bterja3 b variable esmo data houne heek samo data ya3ne houne b 5azno l ma3lomet application l image b extras le howe bundle w samo l variable data
            //ba3d feh sha8le 2a5era .get("data") btrj3lk varible mn nou3 object fa bedal 3leek bas ta3ml casting (Bitmap)




            //heek la 7syeer:
            Bitmap bitmap=(Bitmap) data.getExtras().get("data");
            // Bitmap bitmap=(Bitmap) data.getExtras().get("data"); :la nerja3 ne5tesr heed satr howe 3ebra 3an ested3a2 l intent w b3den bjeeb l bundle le jowa l intent w ba3den bjeeb l bitmap l howe mawjoud b variable esmo data w ba3den brou7 ba3mela casting w ta7wel la bitmap l2no .get btraj3le variable mn nou3 object






            profile_image.setImageBitmap(bitmap);
        }
        //houn bade 7ot iza 7at wrong ya3ne sawar soura bas 7at x
        else if (requestCode==CAPTURE_IMAGE_REQ_CODE && resultCode==RESULT_CANCELED) {
            Toast.makeText(this, "Result code cancelled", Toast.LENGTH_SHORT).show();
        }
    }
}