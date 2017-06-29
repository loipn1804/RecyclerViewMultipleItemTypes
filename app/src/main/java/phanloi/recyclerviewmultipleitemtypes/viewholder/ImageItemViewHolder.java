package phanloi.recyclerviewmultipleitemtypes.viewholder;

import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.BindView;
import phanloi.recyclerviewmultipleitemtypes.R;
import phanloi.recyclerviewmultipleitemtypes.item.ImageItem;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class ImageItemViewHolder extends BaseItemViewHolder<ImageItem> {

    @BindView(R.id.imageView)
    ImageView mImageView;

    public ImageItemViewHolder(ViewGroup parent, int resId) {
        super(parent, resId);
    }

    @Override
    public void setItem(ImageItem item) {
        super.setItem(item);

        mImageView.setImageResource(item.getImage().getResId());
    }
}
