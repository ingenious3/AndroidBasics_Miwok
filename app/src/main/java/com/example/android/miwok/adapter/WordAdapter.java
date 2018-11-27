package com.example.android.miwok.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.data.Word;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    private MediaPlayer mMediaPlayer;

    public WordAdapter(@NonNull Context context, ArrayList<Word> word, int colorResourceId) {
        super(context, 0, word);
        mColorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if( listItemView == null ) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word word = getItem(position);
        TextView miwokText = (TextView)listItemView.findViewById(R.id.miwokText);
        TextView engText = (TextView)listItemView.findViewById(R.id.engText);
        miwokText.setText(word.getMiwokTranslation());
        engText.setText(word.getDefaultTranslation());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        engText.setBackgroundColor(color);

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        if(word.hasImage()) {
            image.setImageResource(word.getmImage());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
