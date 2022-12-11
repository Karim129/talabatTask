package com.example.talabattask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList< productClass> post = new ArrayList<>();
    ArrayList< productClass> post2 = new ArrayList<>();
    RecyclerView recyclerView1,recyclerView2,recyclerView3;
    String[] description ={"organic Banana","red peper","beef Bone"};
    int[] images={R.drawable.banana,R.drawable.peper,R.drawable.meat}; //add new images in drawable
    String[] description2 ={"Pulses","Rice"};
    int[] images2={R.drawable.pulses,R.drawable.rice}; //add new images in drawable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView1 = findViewById(R.id.rec_view1);
        recyclerView2 = findViewById(R.id.rec_view2);
        recyclerView3 = findViewById(R.id.rec_view3);
        Adaptor1 adapter1 = new Adaptor1(this,post);
        Adaptor2 adapter2 = new Adaptor2(this,post2);
        setproduct();
        setproduct2();
        recyclerView1.setAdapter(adapter1);
        recyclerView2.setAdapter(adapter2);
        recyclerView3.setAdapter(adapter1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView3.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
    private void setproduct(){
        for (int i = 0; i < description.length; i++){
            post.add(new productClass(description[i],images[i]));
        }
    } private void setproduct2(){
        for (int i = 0; i < description2.length; i++){
            post2.add(new productClass(description2[i],images2[i]));
        }
    }
}