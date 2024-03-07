package com.example.customlistview;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) this.findViewById(R.id.listViews);

        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();


        list.add(new DataFlags(R.drawable.ru, R.string.russian, R.string.russianRUB, R.string.moskva));
        list.add(new DataFlags(R.drawable.za, R.string.africa, R.string.africaZAR, R.string.capetown));
        list.add(new DataFlags(R.drawable.sg, R.string.singapore, R.string.singaporeSGD, R.string.singa));
        list.add(new DataFlags(R.drawable.tr, R.string.turkish, R.string.turkishTRY, R.string.ankara));
        list.add(new DataFlags(R.drawable.mf, R.string.french, R.string.FranceEUR, R.string.parish));
        list.add(new DataFlags(R.drawable.ca, R.string.canada, R.string.CanadaDOL, R.string.ottava));



        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}