package de.mide.android.linearlayout_demo;

import android.app.Activity;
import android.os.Bundle;


/**
 * Diese Activity lädt eine Layout-Datei mit verschachtelten LinearLayouts.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class VerschachteltActivity extends Activity {


    /**
     * Lifecycle-Methode zur Initialisierung des Activity-Objekts.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView( R.layout.verschachtelt );
    }

}