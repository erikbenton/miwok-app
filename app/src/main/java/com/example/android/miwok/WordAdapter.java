package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word>
{

    private Context mContext;
    private List<Word> wordList;
    private int mColorResource;

    public WordAdapter(@NonNull Activity context, ArrayList<Word> list, int colorResource)
    {
        super(context, 0, list);
        mContext = context;
        wordList = list;
        mColorResource = colorResource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItem = convertView;

        if(listItem == null)
        {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = wordList.get(position);

        ImageView imageView = (ImageView) listItem.findViewById(R.id.image);

        if(currentWord.hasImage())
        {
            // Adding image to the list
            imageView.setImageResource(currentWord.getImageResourceId());
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }

        TextView defaultTranslationView = (TextView) listItem.findViewById(R.id.default_text_view);
        defaultTranslationView.setText(currentWord.getDefaultTranslation());

        TextView miwokTranslationView = (TextView) listItem.findViewById(R.id.miwok_text_view);
        miwokTranslationView.setText(currentWord.getMiwokTranslation());

        View textContainer = listItem.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(mContext, mColorResource);
        textContainer.setBackgroundColor(color);


        return listItem;
    }
}
