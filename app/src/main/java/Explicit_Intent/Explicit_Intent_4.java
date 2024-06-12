package Explicit_Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.intent_implicit_intent_explicit_intent.R;


//houn bade 2a43mel exmple eno 3ande 2 activity explicit_intent_4 w  explicit_intent_5

//7a ykoun 3ande explicit_intent_4 b2alba edit text bade bas oktob b2alb l edittext she ba3den okbous 3ala button bade le katbo yen3arad b text view b2alb activity  explicit_intent_5
public class Explicit_Intent_4 extends AppCompatActivity {

    Button button_click;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent4);
        button_click=findViewById(R.id.button_click);
        name=findViewById(R.id.name);


      button_click.setOnClickListener(v->{
          Intent intent=new Intent(Explicit_Intent_4.this,Explicit_Intent_5.class);
          String user_name = name.getText().toString();
          intent.putExtra("user_name",user_name);
          startActivity(intent);


        });
    }
}