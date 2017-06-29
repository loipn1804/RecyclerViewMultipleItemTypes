package phanloi.recyclerviewmultipleitemtypes.model;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class Header {
    private String mString;

    public Header(String header) {
        this.mString = header;
    }

    public String getString() {
        return mString;
    }

    public void setString(String string) {
        this.mString = string;
    }
}
