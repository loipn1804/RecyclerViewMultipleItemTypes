package phanloi.recyclerviewmultipleitemtypes.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import phanloi.recyclerviewmultipleitemtypes.item.Item;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class BaseItemViewHolder<T extends Item> extends RecyclerView.ViewHolder {

    private T mItem = null;

    public BaseItemViewHolder(ViewGroup parent, int resId) {
        super(LayoutInflater.from(parent.getContext()).inflate(resId, parent, false));
        ButterKnife.bind(this, itemView);
        itemView.setTag(this);
    }

    public void setItem(T item) {
        mItem = item;
    }

    public T getItem() {
        return mItem;
    }
}
