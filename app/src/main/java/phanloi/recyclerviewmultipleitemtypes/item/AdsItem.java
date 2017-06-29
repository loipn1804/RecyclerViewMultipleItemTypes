package phanloi.recyclerviewmultipleitemtypes.item;

import phanloi.recyclerviewmultipleitemtypes.model.Ads;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class AdsItem implements Item {
    private Ads mAds;

    public AdsItem(Ads ads) {
        mAds = ads;
    }

    public Ads getAds() {
        return mAds;
    }
}
