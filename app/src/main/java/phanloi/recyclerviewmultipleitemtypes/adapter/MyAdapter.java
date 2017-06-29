package phanloi.recyclerviewmultipleitemtypes.adapter;

import android.view.ViewGroup;

import phanloi.recyclerviewmultipleitemtypes.R;
import phanloi.recyclerviewmultipleitemtypes.item.AdsItem;
import phanloi.recyclerviewmultipleitemtypes.item.CustomItem;
import phanloi.recyclerviewmultipleitemtypes.item.HeaderItem;
import phanloi.recyclerviewmultipleitemtypes.item.ImageItem;
import phanloi.recyclerviewmultipleitemtypes.item.Item;
import phanloi.recyclerviewmultipleitemtypes.item.TextItem;
import phanloi.recyclerviewmultipleitemtypes.viewholder.AdsItemViewHolder;
import phanloi.recyclerviewmultipleitemtypes.viewholder.BaseItemViewHolder;
import phanloi.recyclerviewmultipleitemtypes.viewholder.CustomItemViewHolder;
import phanloi.recyclerviewmultipleitemtypes.viewholder.HeaderItemViewHolder;
import phanloi.recyclerviewmultipleitemtypes.viewholder.ImageItemViewHolder;
import phanloi.recyclerviewmultipleitemtypes.viewholder.TextItemViewHolder;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class MyAdapter extends BaseItemAdapter {
    private static final int ITEM_HEADER = 0;
    private static final int ITEM_TEXT = 1;
    private static final int ITEM_IMAGE = 2;
    private static final int ITEM_ADS = 3;
    private static final int ITEM_CUSTOM = 4;

    @Override
    public int getItemViewType(int position) {
        Item item = getItemAt(position);

        if (item instanceof HeaderItem) {
            return ITEM_HEADER;
        }

        if (item instanceof TextItem) {
            return ITEM_TEXT;
        }

        if (item instanceof ImageItem) {
            return ITEM_IMAGE;
        }

        if (item instanceof AdsItem) {
            return ITEM_ADS;
        }

        if (item instanceof CustomItem) {
            return ITEM_CUSTOM;
        }

        throw new RuntimeException("Not support item " + item);
    }

    @Override
    public BaseItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {

            case ITEM_HEADER:
                return new HeaderItemViewHolder(parent, R.layout.item_header);

            case ITEM_TEXT:
                return new TextItemViewHolder(parent, R.layout.item_text);

            case ITEM_IMAGE:
                return new ImageItemViewHolder(parent, R.layout.item_image);

            case ITEM_ADS:
                return new AdsItemViewHolder(parent, R.layout.item_ads);

            case ITEM_CUSTOM:
                return new CustomItemViewHolder(parent, R.layout.item_custom);

            default:
                throw new RuntimeException("Not support type=" + viewType);
        }
    }
}
