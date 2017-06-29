package phanloi.recyclerviewmultipleitemtypes;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import phanloi.recyclerviewmultipleitemtypes.item.AdsItem;
import phanloi.recyclerviewmultipleitemtypes.item.CustomItem;
import phanloi.recyclerviewmultipleitemtypes.item.HeaderItem;
import phanloi.recyclerviewmultipleitemtypes.item.ImageItem;
import phanloi.recyclerviewmultipleitemtypes.item.Item;
import phanloi.recyclerviewmultipleitemtypes.item.TextItem;
import phanloi.recyclerviewmultipleitemtypes.model.Ads;
import phanloi.recyclerviewmultipleitemtypes.model.Custom;
import phanloi.recyclerviewmultipleitemtypes.model.Header;
import phanloi.recyclerviewmultipleitemtypes.model.Image;
import phanloi.recyclerviewmultipleitemtypes.model.Text;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 24, 2017
 */

public class ItemBuilder {
    public static List<Item> randomList(Context context) {
        HeaderItem headerItem = new HeaderItem(new Header("This is Header"));
        TextItem textItem = new TextItem(new Text(context.getString(R.string.text_1), context.getString(R.string.text_2)));
        ImageItem imageItem = new ImageItem(new Image(R.drawable.sample));
        AdsItem adsItem = new AdsItem(new Ads(context.getString(R.string.ads)));
        CustomItem customItem = new CustomItem(new Custom("Something"));

        List<Item> itemList = new ArrayList<>();
        itemList.add(headerItem);
        itemList.add(imageItem);
        itemList.add(textItem);
        itemList.add(customItem);

        int i = 0;
        Random random = new Random();
        while (i < 10) {
            i++;
            switch (random.nextInt(3)) {
                case 0:
                    itemList.add(textItem);
                    break;
                case 1:
                    itemList.add(imageItem);
                    break;
                case 2:
                    itemList.add(customItem);
                    break;
            }
        }

        itemList.add(adsItem);

        return itemList;
    }
}
