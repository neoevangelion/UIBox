package com.tuyuanlin.uibox.demo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.security.InvalidParameterException;

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 */

public class ListWindowAdapter extends RecyclerView.Adapter<ListWindowAdapter.ViewHolder> {

    private static final int NORMAL_LIST_ITEM = 0;
    private static final int WINDOW_LIST_ITEM = 1;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view;
        switch (viewType) {
            case NORMAL_LIST_ITEM:
                view = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.view_normal_list_item, viewGroup, false);
                break;
            case WINDOW_LIST_ITEM:
                view = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.view_window_list_item, viewGroup, false);
                break;
            default:
                throw new InvalidParameterException();
        }

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 5) {
            return WINDOW_LIST_ITEM;
        }
        return NORMAL_LIST_ITEM;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class NormalViewHolder extends ViewHolder {

        public NormalViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class ListWindowViewHolder extends ViewHolder {

        public ListWindowViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
