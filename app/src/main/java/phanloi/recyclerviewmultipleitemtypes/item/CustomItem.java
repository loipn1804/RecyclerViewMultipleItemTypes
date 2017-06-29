package phanloi.recyclerviewmultipleitemtypes.item;

import phanloi.recyclerviewmultipleitemtypes.model.Custom;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class CustomItem implements Item {
    private Custom mCustom;

    public CustomItem(Custom custom) {
        mCustom = custom;
    }

    public Custom getCustom() {
        return mCustom;
    }
}
