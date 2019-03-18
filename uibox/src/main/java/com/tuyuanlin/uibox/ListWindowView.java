package com.tuyuanlin.uibox;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 */

public class ListWindowView extends FrameLayout {
    public ListWindowView(Context context) {
        this(context, null);
    }

    public ListWindowView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ListWindowView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ListWindowView(Context context, @Nullable AttributeSet attrs, int defStyleAttr,
            int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {

    }
}
