package com.example.retrofit;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomListAdapter extends BaseAdapter {
        List<User> listData;
        LayoutInflater layoutInflater;
        Context context;
    public CustomListAdapter(Context aContext, List<User> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
        this.context=aContext;
    }
        @Override
        public int getCount() {
        return listData.size();
    }
        @Override
        public Object getItem(int position) {
        return listData.get(position);
    }
        @Override
        public long getItemId(int position) {
        return position;
    }
        public View getView(int position, View v, ViewGroup vg ) {
        ViewHolder holder;
        if (v == null) {
            v = layoutInflater.inflate(R.layout.list_row, null);
            holder = new ViewHolder();
            holder.mWord = (TextView) v.findViewById(R.id.userid);
            holder.mNum = (TextView) v.findViewById(R.id.id);
            holder.mTitle = (TextView) v.findViewById(R.id.title);

            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }
        holder.mWord.setText(""+listData.get(position).getUserId());
        holder.mNum.setText(""+listData.get(position).getId());
        holder.mTitle.setText(""+listData.get(position).getTitle());

        return v;
    }
        static class ViewHolder {
            TextView mWord;
            TextView mNum;
            TextView mTitle;

        }
    }