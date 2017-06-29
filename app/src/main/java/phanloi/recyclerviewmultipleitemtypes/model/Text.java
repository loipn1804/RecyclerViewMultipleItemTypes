package phanloi.recyclerviewmultipleitemtypes.model;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class Text {
    private String mString1;
    private String mString2;

    public Text(String string1, String string2) {
        mString1 = string1;
        mString2 = string2;
    }

    public String getString1() {
        return mString1;
    }

    public void setString1(String string1) {
        mString1 = string1;
    }

    public String getString2() {
        return mString2;
    }

    public void setString2(String string2) {
        mString2 = string2;
    }
}
