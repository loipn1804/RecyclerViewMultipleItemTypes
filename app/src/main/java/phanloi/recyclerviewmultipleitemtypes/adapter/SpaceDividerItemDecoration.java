package phanloi.recyclerviewmultipleitemtypes.adapter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class SpaceDividerItemDecoration extends RecyclerView.ItemDecoration {

    private final int mSpaceHeight;

    public SpaceDividerItemDecoration(int spaceHeight) {
        this.mSpaceHeight = spaceHeight;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                               RecyclerView.State state) {
        if (parent.getChildAdapterPosition(view) != parent.getAdapter().getItemCount() - 1) {
            outRect.bottom = mSpaceHeight;
        }
    }
}
