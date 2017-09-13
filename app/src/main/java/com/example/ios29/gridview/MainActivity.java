package com.example.ios29.gridview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView=(GridView)findViewById(R.id.gridview1);
        int[] imageld=new int[]{R.drawable.frid2,R.drawable.haha1,R.drawable.liaotian1
                ,R.drawable.haha2,R.drawable.liaotian,R.drawable.liaotian2};
        String[] title=new String[]{"朋友","朋友","朋友","朋友","朋友","朋友"};

        List<Map<String,Object>>listItems=new ArrayList<Map<String,Object>>();
        for(int i=0;i<imageld.length;i++){
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("image",imageld[i]);
            map.put("title",title[i]);
            listItems.add(map);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,
                listItems,R.layout.items,
                new String[]{"title","image"},
                new int[]{R.id.title,R.id.image});
        gridView.setAdapter(adapter);
    }
}
