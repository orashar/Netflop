package com.example.untitled;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class ListOneAdapter extends ArrayAdapter<Item> {

    public ListOneAdapter(Context context, ArrayList<Item> items){
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.column_layout, parent, false);
        }
        Item currentItem = getItem(position);

        TextView itemTitleTextview = (TextView) listItemView.findViewById(R.id.item_title_text);
        itemTitleTextview.setText(currentItem.getItemTitle());

        TextView itemIconTextview = (TextView) listItemView.findViewById(R.id.item_icon_text);
        itemIconTextview.setText(currentItem.getItemIcon());

        return listItemView;
    }
}
