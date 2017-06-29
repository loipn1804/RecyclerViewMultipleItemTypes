package phanloi.recyclerviewmultipleitemtypes.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import phanloi.recyclerviewmultipleitemtypes.R;
import phanloi.recyclerviewmultipleitemtypes.item.TextItem;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class TextItemViewHolder extends BaseItemViewHolder<TextItem> {

    @BindView(R.id.txt1)
    TextView mTxt1;
    @BindView(R.id.txt2)
    TextView mTxt2;

    public TextItemViewHolder(ViewGroup parent, int resId) {
        super(parent, resId);
    }

    @Override
    public void setItem(TextItem item) {
        super.setItem(item);

        mTxt1.setText(item.getText().getString1());
        mTxt2.setText(item.getText().getString2());
    }
}
