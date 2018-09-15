package de.mide.linearlayout_demos;

import android.app.Activity;
import android.os.Bundle;


/**
 * App enthält mehrere Layout-Dateien mit LinearLayout.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class MainActivity extends Activity {

    /**
     * Es muss immer genau eine der setContentView()-Anweisungen
     * einkommentiert sein.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView( R.layout.platzmangel );

        //setContentView( R.layout.verschachtelt );
    }
}
