package com.example.it_4.azbakia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class exchange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange);

        ArrayList <String> cat=new ArrayList<String>();
        cat.add("تاريخي");
        cat.add("سير ذاتيه");
        cat.add("قصص قصيرة");
        cat.add("ساخر");
        cat.add("سياسي");
        cat.add("روايات مترجمه");
        cat.add("روايات خيالية");
        cat.add("رحلات");
        cat.add("علوم فضاء");
        cat.add("علوم طبيعية");
        cat.add("علوم الحيوان");
        cat.add("علوم البحار");
        cat.add("الطب");
        cat.add("الفلسفة");
        cat.add("الفيزياء");
        cat.add("الطاقة");
        cat.add("علم النفس");
        cat.add("ما وراء الطبيعة");
        cat.add("الكيمياء");
        cat.add("الميكانيكا");
        cat.add("الهندسة المعمارية");
        cat.add("تكنولوجيا");
        cat.add("برمجة");
        cat.add("الكهرباء");
        cat.add("تنمية بشرية");
        cat.add("الاقتصاد والادارة");
        cat.add("شعر");
        cat.add("مسرح");
        cat.add("كتب دينية");
        cat.add("عالم المرأه");
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cat);
        ListView ls=(ListView)findViewById(R.id.list);
        ls.setAdapter(itemsAdapter);


        ls.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,int position, long arg3)
            {

                Toast.makeText(exchange.this, "hello" + position, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
