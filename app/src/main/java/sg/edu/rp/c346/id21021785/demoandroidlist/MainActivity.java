package sg.edu.rp.c346.id21021785.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> alAndroid;
    //ArrayAdapter aaAndroid;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        alAndroid = new ArrayList<>();

        //aaAndroid = new ArrayAdapter<AndroidVersion>(this, android.R.layout.simple_list_item_1, alAndroid);

        //lv.setAdapter(aaAndroid);

        alAndroid.add(new AndroidVersion("Pie", "9.0"));
        alAndroid.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        alAndroid.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));
        alAndroid.add(new AndroidVersion("Marshmallow", "6.0 - 6.0.1"));
        alAndroid.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        alAndroid.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        alAndroid.add(new AndroidVersion("KitKat", "4.1 - 4.3.1"));

        adapter = new CustomAdapter(this, R.layout.row, alAndroid);

        //aaAndroid.notifyDataSetChanged();

        lv.setAdapter(adapter);

    }
}