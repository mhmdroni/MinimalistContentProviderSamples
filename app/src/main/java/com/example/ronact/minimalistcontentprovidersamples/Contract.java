package com.example.ronact.minimalistcontentprovidersamples;

import android.net.Uri;
import android.widget.SimpleCursorTreeAdapter;

/**
 * Created by Ronact on 11/12/2017.
 */

public final class Contract {
    private Contract(){}

    public static final String AUTHORITY = "com.example.ronact.minimalistcontentprovidersamples.provider";
    public static final String CONTENT_PATH = "words";
    public static final Uri CONTEN_URI = Uri.parse("content://" + AUTHORITY + "/" + CONTENT_PATH);
    static final int ALL_ITEMS = -2;
    static final String WORD_ID = "id";

    static final String SINGLE_RECORD_MIME_TYPE = "vnd.android.cursor.item/vnd.com.example.provider.words";
    static final String MULTIPLE_RECORD_MIME_TYPE = "vnd.android.cursor.dir/vnd.com.example.provider.words";

}
