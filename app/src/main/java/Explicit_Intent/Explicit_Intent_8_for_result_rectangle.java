package Explicit_Intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intent_implicit_intent_explicit_intent.R;

public class Explicit_Intent_8_for_result_rectangle extends AppCompatActivity {

    EditText width,height;
    Button calculate_rectangle;

    final static int VALID_RESULT_CODE=1;
    final static int IN_VALID_RESULT_CODE=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent8_for_result_rectangle);
        width=findViewById(R.id.editTextText_width);
        height=findViewById(R.id.editTextText_height2);
        calculate_rectangle=findViewById(R.id.button_calculate_rectangle);


        //2awl she bade 2a3ml eno bas ekbous 3ala button l calculate yen7asab l aria

        calculate_rectangle.setOnClickListener(v->{
            int width_calculation=Integer.parseInt(width.getText().toString());
            int height_calculation=Integer.parseInt(height.getText().toString());

            //hala2 houn bte5telf ma bade 2o3oud nateje bhay l activity la bel activity ra2seye ta3et explicit_intent_6_for_result
            //2awl she ba3ml 7sebet l ariea
            int ariea=width_calculation*height_calculation;
            //fa hala2 bade 3abe l nateje l areia b intent w raje3 l intent
            //hay l intent bade sha8el feha activity wala she bade bade 3abe feha data
            Intent intent=new Intent();
            //intent.putExtra("rectangle_ariea",ariea);

            //hala2 3ashen raje3 l data hay ya3ne bade raje3 l intent fa bade esta3ml l function l esma setresult()

            //setResult():bte5od mene 2 parametr
            //1-result_code:nafs fekret l request_code bas bel raj3a ya3ne  enta w reje3 ya3ne masln enta hay l activity bada te7sob l areia bas iza keen l width w l height bel negative badak t2olo eno nateje feha error w traje3 toul w l 3ard ma traje3 l areia laken iza da5al l width w l heght bel positive yraje3 l areia 3ade
            //fa enta houn badak ta3ml 3mlyten wa7de iza keen l width w height positive wa7de iza keen l width w l height bel negative iza keen l width w l height negative badak traje3 l width w l height iza positive badak traje3 l ariea
            //fa 3ashen tmayzlo m 3mlyet raj3a eno enta reje3 ma3ak areia wala ma3ak width w height bta7ded l result code
            //fa hala2 7adedlo 1 3ande kamen cosntant sebten ba3d shway mne7ke 3anoun mtl result_Ok,w Result_cancel
            //2-intent:l inetnt iza badak traje3 ma3lomet 3al activity iza ma badak traje3 ma3lomet 3ade feek ma traje3 intent


            //houn 7a esta3ml requset code 7a 2olo iza keen l ariea negative ya3ne akked wa7de mn l base 2aw l height negative fa raje3 l width w l height iza la2 positve raje3 l areia

            //iza keen areia negative 7a yraje3 l width w l height 7aykoun l result_code 2
            if(ariea<0){
                intent.putExtra("Rectangle_width",width_calculation);
                intent.putExtra("Rectangle_height",height_calculation);
                setResult(IN_VALID_RESULT_CODE,intent);
            }

            //8eer heek  iza keen l aria positive raje3 l ariea w 7a ykoun l result_code 1
            else{
                intent.putExtra("rectangle_ariea",ariea);
                setResult(VALID_RESULT_CODE,intent);
            }


            // setResult(1,intent);

            //ba3den mnesta5dem function esma finish() mawjoude b life cycle hay iza badak tsaker l activity ya3ne bas ta3ml finish btale3 l activity mn l stack w bterja3 lal activity lal 2abla
            finish();
        });

        //w houn bel nesbe lal result_code kamen final static w btseer t3ayteloun esm l class


    }
}