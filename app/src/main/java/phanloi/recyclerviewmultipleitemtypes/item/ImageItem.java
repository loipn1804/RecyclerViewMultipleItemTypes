package phanloi.recyclerviewmultipleitemtypes.item;

import phanloi.recyclerviewmultipleitemtypes.model.Image;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class ImageItem implements Item {
    private Image mImage;

    public ImageItem(Image image) {
        mImage = image;
    }

    public Image getImage() {
        return mImage;
    }
}
