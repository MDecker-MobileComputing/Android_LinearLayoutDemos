package de.mide.android.linearlayout_demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


/**
 * Diese Activity lädt eine Layout-Datei mit einem LinearLayout, mit dem Platzmangel
 * demonstriert wird.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class PlatzmangelActivity extends AppCompatActivity {

    /**
     * Lifecycle-Methode zur Initialisierung des Activity-Objekts.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView( R.layout.platzmangel );
    }

}