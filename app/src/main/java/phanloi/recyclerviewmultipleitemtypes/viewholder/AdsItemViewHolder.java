package phanloi.recyclerviewmultipleitemtypes.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import phanloi.recyclerviewmultipleitemtypes.R;
import phanloi.recyclerviewmultipleitemtypes.item.AdsItem;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class AdsItemViewHolder extends BaseItemViewHolder<AdsItem> {

    @BindView(R.id.txtAds)
    TextView mTxtAds;

    public AdsItemViewHolder(ViewGroup parent, int resId) {
        super(parent, resId);
    }

    @Override
    public void setItem(AdsItem item) {
        super.setItem(item);

        mTxtAds.setText(item.getAds().getString());
    }
}
