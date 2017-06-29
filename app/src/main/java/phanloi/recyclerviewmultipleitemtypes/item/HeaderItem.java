package phanloi.recyclerviewmultipleitemtypes.item;

import phanloi.recyclerviewmultipleitemtypes.model.Header;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class HeaderItem implements Item {
    private Header mHeader;

    public HeaderItem(Header header) {
        mHeader = header;
    }

    public Header getHeader() {
        return mHeader;
    }
}
