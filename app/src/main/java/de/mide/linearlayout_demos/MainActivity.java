package de.mide.linearlayout_demos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * Diese Activity stellt ein Hauptmenü dar, mit dem zu anderen Activities abgesprungen
 * werden kann.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class MainActivity extends Activity implements View.OnClickListener {

    /** Button zum Absprung auf Activity zur Demonstration von Platzmangel. */
    private Button _platzmangelButton = null;

    /** Button zum Absprung auf Activity,  die Layout-Datei mit verschachtelten LinearLayouts lädt. */
    private Button _verschachteltButton = null;

    /** Button zum Absprung auf Activity, die Layout-Datei mit einem LinearLayout in einem Scrollview lädt. */
    private Button _scrollviewButton = null;


    /**
     * Lifecycle-Methode: Lädt Layout-Datei, füllt Member-Variablen mit Referenzen
     * auf die beiden Button und setzt das Event-Handler-Objekt für diese beiden
     * Buttons.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView( R.layout.activity_main );

        _platzmangelButton   = findViewById(R.id.platzmangel_button  );
        _verschachteltButton = findViewById(R.id.verschachtelt_button);
        _scrollviewButton    = findViewById(R.id.scrollview_button   );

        _platzmangelButton.setOnClickListener(   this );
        _verschachteltButton.setOnClickListener( this );
        _scrollviewButton.setOnClickListener(    this );
    }


    /**
     * Event-Handler-Methode für die Buttons, mit der die Navigation zu einer der
     * anderen Activites ausgelöst wird. Es wird zusätzlich ein Toast mit dem
     * Hinweis, dass man mit dem Back-Button zurück zum Hauptmenü kommt, angezeigt.
     *
     * @param view  Referenz auf Button, der das Event ausgelöst hat.
     */
    @Override
    public void onClick(View view) {

        Intent intent = null;

        if (view == _platzmangelButton) {

            intent = new Intent(this, PlatzmangelActivity.class);
            startActivity(intent);

        }
        else if (view == _verschachteltButton) {

            intent = new Intent(this, VerschachteltActivity.class);
            startActivity(intent);

        }
        else if (view == _scrollviewButton) {

            intent = new Intent(this, ScrollViewActivity.class);
            startActivity(intent);
        }

        Toast.makeText(this, R.string.hinweis_backbutton ,Toast.LENGTH_SHORT).show();
    }

}
