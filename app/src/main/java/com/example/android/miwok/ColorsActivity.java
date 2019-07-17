package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        final ArrayList<Color> colors = new ArrayList<Color>();
        colors.add(new Color("red","wetetti",R.raw.color_red,
                R.drawable.color_red));
        colors.add(new Color("green","chokokki",R.raw.color_green,
                R.drawable.color_green));
        colors.add(new Color("brown","ṭakaakki",R.raw.color_brown,
                R.drawable.color_brown));
        colors.add(new Color("gray","ṭopopp",R.raw.color_gray,
                R.drawable.color_gray));
        colors.add(new Color("black","kululli",R.raw.color_black,
                R.raw.color_black));
        colors.add(new Color("white","kelelli",R.raw.color_white,
                R.drawable.color_white));
        colors.add(new Color("dusty yellow","ṭopiisә",
                R.raw.color_dusty_yellow, R.drawable.color_dusty_yellow));
        colors.add(new Color("mustard yellow","chiwiiṭә",
                R.raw.color_mustard_yellow,R.drawable.color_mustard_yellow));
        ColorAdapter adapter = new ColorAdapter(this,colors,R.color.category_colors);
        ListView listView =  findViewById(R.id.colors_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Color color = colors.get(position);
                mediaPlayer = MediaPlayer.create(ColorsActivity.this,color.getcAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
