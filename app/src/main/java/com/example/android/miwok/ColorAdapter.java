package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends ArrayAdapter<Color> {
    private int cColorResourceId;
    public ColorAdapter(Activity context, ArrayList<Color> colors, int cColorResourceId){
        super(context,0,colors);
        this.cColorResourceId = cColorResourceId;
    }

    @Override
    public View getView(int position, View ConvertView, ViewGroup parent) {
        View colorList = ConvertView;
        if(colorList == null){
            colorList = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,
                    false);
        }
        Color currentColor = getItem(position);
        TextView miwokTextView = colorList.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentColor.getcMiwokTranslation());
        TextView defaultTextView = colorList.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentColor.getcDefaultTranslation());
        ImageView imageView = colorList.findViewById(R.id.miwok_image);
        imageView.setImageResource(currentColor.getcImageResourceId());
        if (currentColor.HasImage()){
            imageView.setImageResource(currentColor.getcImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = colorList.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),cColorResourceId);
        textContainer.setBackgroundColor(color);
        return colorList;
    }
    }

