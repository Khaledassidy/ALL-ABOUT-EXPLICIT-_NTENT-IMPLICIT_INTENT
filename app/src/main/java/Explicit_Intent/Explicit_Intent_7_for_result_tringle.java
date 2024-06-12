package Explicit_Intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


import com.example.intent_implicit_intent_explicit_intent.R;

public class Explicit_Intent_7_for_result_tringle extends AppCompatActivity {

    EditText base,height;
    Button calculte_tringle;
    final static int VALID_RESULT_CODE=1;
    final static int IN_VALID_RESULT_CODE=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent7_for_result_tringle);
        base=findViewById(R.id.editTextText_base);
        height=findViewById(R.id.editTextText_height);
        calculte_tringle=findViewById(R.id.button_calculate_triangle);




        //2awl she bade 2a3ml eno bas ekbous 3ala button l calculate yen7asab l aria

        calculte_tringle.setOnClickListener(v->{
            int base_calculation=Integer.parseInt(base.getText().toString());
            int height_calculation=Integer.parseInt(height.getText().toString());

            //hala2 houn bte5telf ma bade 2o3oud nateje bhay l activity la bel activity ra2seye ta3et explicit_intent_6_for_result
            //2awl she ba3ml 7sebet l ariea
            double ariea=base_calculation*height_calculation*0.5;
            //fa hala2 bade 3abe l nateje l areia b intent w raje3 l intent
            //hay l intent bade sha8el feha activity wala she bade bade 3abe feha data


            Intent intent=new Intent();
            //intent.putExtra("triangle_ariea",ariea);

            //hala2 3ashen raje3 l data hay ya3ne bade raje3 l intent fa bade esta3ml l function l esma setresult()

            //setResult():bte5od mene 2 parametr
            //1-result_code:nafs fekret l request_code bas bel raj3a ya3ne  enta w reje3 ya3ne masln enta hay l activity bada te7sob l areia bas iza keen l base w l height bel negative badak t2olo eno nateje feha error w traje3 base w l height ma traje3 l areia laken iza da5al l base w l heght bel positive yraje3 l areia 3ade
            //fa enta houn badak ta3ml 3mlyten wa7de iza keen l base w height positive wa7de iza keen l base w l height bel negative iza keen l base w l height negative badak traje3 l base w l height iza positive badak traje3 l ariea
            //fa 3ashen tmayzlo m 3mlyet raj3a eno enta reje3 ma3ak areia wala ma3ak base w height bta7ded l result code
            //fa hala2 7adedlo 2 3ande kamen cosntant sebten ba3d shway mne7ke 3anoun mtl result_Ok,w Result_cancel
            //2-intent:l inetnt iza badak traje3 ma3lomet 3al activity iza ma badak traje3 ma3lomet 3ade feek ma traje3 intent
            //setResult(2,intent);

            //houn 7a esta3ml requset code 7a 2olo iza keen l ariea negative ya3ne akked wa7de mn l base 2aw l height negative fa raje3 l width w l height iza la2 positve raje3 l areia

            //iza keen areia negative 7a yraje3 l base w l height 7aykoun l result_code 2
            if(ariea<0){
                intent.putExtra("triangle_base",base_calculation);
                intent.putExtra("triangle_height",height_calculation);
                setResult(IN_VALID_RESULT_CODE,intent);
            }

            //8eer heek  iza keen l aria positive raje3 l ariea w 7a ykoun l result_code 1
            else{
                intent.putExtra("triangle_ariea",ariea);
                setResult(VALID_RESULT_CODE,intent);
            }


            //ba3den mnesta5dem function esma finish() mawjoude b life cycle hay iza badak tsaker l activity ya3ne bas ta3ml finish btale3 l activity mn l stack w bterja3 lal activity lal 2abla
            finish();
        });

    }
}