package com.example.untitled;

public class Item {
    private String mItemTitle;
    private String mItemIcon;

    public Item(String title,String icon){
        mItemTitle = title;
        mItemIcon = icon;
    }

    public String getItemTitle(){
        return mItemTitle;
    }

    public String getItemIcon(){
        return mItemIcon;
    }
}
