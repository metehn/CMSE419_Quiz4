package metehanersoy.cmse419_quiz4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton2,radioButton3,radioButton4,radioButton5,radioButton6,radioButton7,radioButton8;

    Button button;

    ArrayList<String> selected_list;

    int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        radioButton2 = findViewById( R.id.radioButton2  );
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        radioButton5 = findViewById(R.id.radioButton5);
        radioButton6 = findViewById(R.id.radioButton6);
        radioButton7 = findViewById(R.id.radioButton7);
        radioButton8 = findViewById(R.id.radioButton8);

        selected_list = new ArrayList<String>();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              if(counter > 3){

                  Toast.makeText(MainActivity.this, "You can select at most 3 courses", Toast.LENGTH_SHORT).show();
                  selected_list.clear();
                  counter =0;
                  radioButton2.setChecked(false);
                  radioButton3.setChecked(false);
                  radioButton4.setChecked(false);
                  radioButton5.setChecked(false);
                  radioButton6.setChecked(false);
                  radioButton7.setChecked(false);
                  radioButton8.setChecked(false);
              }
              else if(counter == 0){
                  Toast.makeText(MainActivity.this, "You should select at least 1 course", Toast.LENGTH_SHORT).show();
                  selected_list.clear();
                  counter =0;
                  radioButton2.setChecked(false);
                  radioButton3.setChecked(false);
                  radioButton4.setChecked(false);
                  radioButton5.setChecked(false);
                  radioButton6.setChecked(false);
                  radioButton7.setChecked(false);
                  radioButton8.setChecked(false);
              }
              else{
                  Intent new_intent = new Intent(MainActivity.this,MainActivity2.class);

                  new_intent.putExtra("List",selected_list);
                  startActivity(new_intent);

              }

            }
        });

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    selected_list.add(radioButton2.getText().toString());
                    counter++;

            }
        });



        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selected_list.add(radioButton3.getText().toString());
                counter++;

            }
        });

        radioButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_list.add(radioButton4.getText().toString());
                counter++;
            }
        });
        radioButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_list.add(radioButton5.getText().toString());
                counter++;
            }
        });

        radioButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_list.add(radioButton6.getText().toString());
                counter++;
            }
        });

        radioButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_list.add(radioButton7.getText().toString());
                counter++;
            }
        });

        radioButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_list.add(radioButton8.getText().toString());
                counter++;
            }
        });





    }






}