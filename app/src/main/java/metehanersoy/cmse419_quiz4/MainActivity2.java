package metehanersoy.cmse419_quiz4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ListView listView;

    ArrayList<String> mylist;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        listView = findViewById(R.id.listView);

        mylist = (ArrayList<String>) getIntent().getStringArrayListExtra("List");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,mylist);

        listView.setAdapter(adapter);
        

    }
}