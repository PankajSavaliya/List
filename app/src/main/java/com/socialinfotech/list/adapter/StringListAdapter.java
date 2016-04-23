package com.socialinfotech.list.adapter;

/**
 * Created by pankaj on 23/04/16.
 */

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.socialinfotech.list.R;
import com.socialinfotech.list.ResultEntity;


import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class StringListAdapter extends RecyclerView.Adapter<StringListAdapter.ViewHolder> {

    public ArrayList<ResultEntity> data;
    private Context mContext;
    private Resources resources;

    public StringListAdapter(Context context, ArrayList<ResultEntity> data) {
        this.data = data;
        this.mContext = context;
        this.resources = mContext.getResources();
    }

    @Override
    public StringListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final StringListAdapter.ViewHolder holder, final int position) {
        final ResultEntity model = data.get(position);
        holder.text.setText(model.getTitle());
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void add(ResultEntity string) {
        insert(string, data.size());
    }

    public void insert(ResultEntity string, int position) {
        data.add(position, string);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        data.remove(position);
        notifyDataSetChanged();
    }

    public void clear() {
        int size = data.size();
        data.clear();
        notifyItemRangeRemoved(0, size);
    }

    public void addAll(List<ResultEntity> strings) {
        int startIndex = data.size();
        data.addAll(startIndex, strings);
        notifyItemRangeInserted(startIndex, strings.size());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        @Bind(R.id.text)
        TextView text;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


}
