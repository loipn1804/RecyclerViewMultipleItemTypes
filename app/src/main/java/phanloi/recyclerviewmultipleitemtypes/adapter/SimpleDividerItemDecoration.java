package phanloi.recyclerviewmultipleitemtypes.adapter;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class SimpleDividerItemDecoration extends RecyclerView.ItemDecoration {
    private Drawable mDivider;
    private int padding;
    private boolean showFirstDivider = true;
    private boolean showLastDivider = true;

    public SimpleDividerItemDecoration(Drawable divider, int padding, boolean showFirstDivider, boolean showLastDivider) {
        this.mDivider = divider;
        this.padding = padding;
        this.showFirstDivider = showFirstDivider;
        this.showLastDivider = showLastDivider;
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        int left = parent.getPaddingLeft() + padding;
        int right = parent.getWidth() - parent.getPaddingRight() - padding;

        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            boolean shouldDraw = true;
            if (i == 0) {
                shouldDraw = showFirstDivider;
            } else if (i == childCount - 1) {
                shouldDraw = showLastDivider;
            }
            if (shouldDraw) {
                View child = parent.getChildAt(i);

                RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

                int top = child.getBottom() + params.bottomMargin;
                int bottom = top + mDivider.getIntrinsicHeight();

                mDivider.setBounds(left, top, right, bottom);
                mDivider.draw(c);
            }
        }
    }
}
