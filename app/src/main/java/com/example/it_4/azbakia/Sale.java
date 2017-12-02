package com.example.it_4.azbakia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

public class Sale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);

        ArrayList<Book> b =new ArrayList<Book>();
        b.add(new Book("حوار مع صديقي الملحد","مصطفي محمود",R.drawable.hewar));
        b.add(new Book("سايكولوجية الجماهير","جوستاف لوبون",R.drawable.say));
        Bookadabtor itemsAdapter =new Bookadabtor(this,b);
        ListView ls=(ListView)findViewById(R.id.list1);
        ls.setAdapter(itemsAdapter);

    }
}
