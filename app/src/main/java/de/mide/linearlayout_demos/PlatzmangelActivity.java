package de.mide.linearlayout_demos;

import android.app.Activity;
import android.os.Bundle;


/**
 * Diese Activity lädt eine Layout-Datei mit einem LinearLayout, mit dem Platzmangel
 * demonstriert wird.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class PlatzmangelActivity extends Activity {

    /**
     * Lifecycle-Methode zur Initialisierung des Activity-Objekts.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView( R.layout.platzmangel );
    }

}