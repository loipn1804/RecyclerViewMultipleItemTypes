package phanloi.recyclerviewmultipleitemtypes.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import phanloi.recyclerviewmultipleitemtypes.R;
import phanloi.recyclerviewmultipleitemtypes.item.HeaderItem;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class HeaderItemViewHolder extends BaseItemViewHolder<HeaderItem> {

    @BindView(R.id.txtHeader)
    TextView mTxtHeader;

    public HeaderItemViewHolder(ViewGroup parent, int resId) {
        super(parent, resId);
    }

    @Override
    public void setItem(HeaderItem item) {
        super.setItem(item);

        mTxtHeader.setText(item.getHeader().getString());
    }
}
