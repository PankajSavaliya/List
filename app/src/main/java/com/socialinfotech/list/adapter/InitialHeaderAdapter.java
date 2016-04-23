package com.socialinfotech.list.adapter;

/**
 * Created by pankaj on 23/04/16.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.eowise.recyclerview.stickyheaders.StickyHeadersAdapter;
import com.socialinfotech.list.R;
import com.socialinfotech.list.ResultEntity;

import java.util.List;

public class InitialHeaderAdapter implements StickyHeadersAdapter<InitialHeaderAdapter.ViewHolder> {

    private List<ResultEntity> items;

    public InitialHeaderAdapter(List<ResultEntity> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.header, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder headerViewHolder, int position) {
        headerViewHolder.letter.setText(items.get(position).getHeader());
    }

    @Override
    public long getHeaderId(int position) {
        return items.get(position).getHeader().charAt(0);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView letter;

        public ViewHolder(View itemView) {
            super(itemView);
            letter = (TextView) itemView.findViewById(R.id.header_text);
        }
    }
}