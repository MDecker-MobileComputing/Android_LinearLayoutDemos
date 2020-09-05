package de.mide.linearlayout_demos;

import android.app.Activity;
import android.os.Bundle;


/**
 * Diese Activity lädt eine Layout-Datei mit einem LinearLayout in einem ScrollView.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class ScrollViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView( R.layout.scrollview);
    }

}
