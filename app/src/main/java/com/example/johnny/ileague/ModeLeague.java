package com.example.johnny.ileague;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ModeLeague extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_league);
    }

    TableLayout t1 = (TableLayout) findViewById(R.id.main_table);

    TableRow tr_head = new TableRow(this);
    tr_head.setId(10);
    tr_head.setBackgroundColor(Color.GRAY);
    tr_head.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));

    TextView label_spieler = new TextView(this);
         label_spieler.setId(20);
         label_spieler.setText("Spieler");
         label_spieler.setPadding(5, 5, 5, 5);
         tr_head.addView(label_spieler);// add the column to the table row here

    TextView label_sieg = new TextView(this);
         label_sieg.setId(21);// define id that must be unique
         label_sieg.setText("S"); // set the text for the header
         label_sieg.setPadding(5, 5, 5, 5); // set the padding (if required)
         tr_head.addView(label_sieg); // add the column to the table row here

    TextView label_unentschieden = new TextView(this);
         label_unentschieden.setId(22);// define id that must be unique
         label_unentschieden.setText("U"); // set the text for the header
         label_unentschieden.setPadding(5, 5, 5, 5); // set the padding (if required)
         tr_head.addView(label_unentschieden); // add the column to the table row here

    TextView label_niederlage = new TextView(this);
         label_niederlage.setId(23);// define id that must be unique
         label_niederlage.setText("N"); // set the text for the header
         label_niederlage.setPadding(5, 5, 5, 5); // set the padding (if required)
         tr_head.addView(label_niederlage); // add the column to the table row here

    TextView label_tore = new TextView(this);
         label_tore.setId(24);// define id that must be unique
         label_tore.setText("S"); // set the text for the header
         label_tore.setPadding(5, 5, 5, 5); // set the padding (if required)
         tr_head.addView(label_tore); // add the column to the table row here

    TextView label_gegentore = new TextView(this);
         label_gegentore.setId(25);// define id that must be unique
         label_gegentore.setText("GT"); // set the text for the header
         label_gegentore.setTextColor(Color.BLACK); // set the color
         label_gegentore.setPadding(5, 5, 5, 5); // set the padding (if required)
         tr_head.addView(label_gegentore); // add the column to the table row here

    TextView label_tordif = new TextView(this);
         label_tordif.setId(26);// define id that must be unique
         label_tordif.setText("TD"); // set the text for the header
         label_tordif.setPadding(5, 5, 5, 5); // set the padding (if required)
         tr_head.addView(label_tordif); // add the column to the table row here

    TextView label_punkte = new TextView(this);
         label_punkte.setId(27);// define id that must be unique
         label_punkte.setText("PKT"); // set the text for the header
         label_punkte.setPadding(5, 5, 5, 5); // set the padding (if required)
         tr_head.addView(label_punkte); // add the column to the table row here

    tl.addView(tr_head, new TableLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));

    
    Integer count=0;
 for(int i=0 ; spielerlist[i]=null ; i++) {
       String spieler;
       int sieg;
       int unentschieden;
       int niederlage;
       int tore;
       int gegentore;
       int tordif = tore-gegentore;
       int punkte;

// Create the table row
        TableRow tr = new TableRow(this);
        if(count%2!=0) tr.setBackgroundColor(Color.GRAY);
        tr.setId(100+count);
        tr.setLayoutParams(new LayoutParams(
                LayoutParams.FILL_PARENT,
                LayoutParams.WRAP_CONTENT));

//Create two columns to add as table data
        // Create a TextView to add date
        TextView labelSPIELER = new TextView(this);
        labelSPIELER.setId(200+count);
        labelSPIELER.setText(spieler);
        labelSPIELER.setPadding(2, 0, 5, 0);
        labelSPIELER.setTextColor(Color.WHITE);
        tr.addView(labelSPIELER);

        TextView labelSIEG = new TextView(this);
        labelSIEG.setId(200+count);
        labelSIEG.setText(sieg.toString());
        labelSIEG.setTextColor(Color.WHITE);
        tr.addView(labelSIEG);

        TextView labelUNENTSCHIEDEN = new TextView(this);
        labelUNENTSCHIEDEN.setId(200+count);
        labelUNENTSCHIEDEN.setText(sieg.toString());
        labelUNENTSCHIEDEN.setTextColor(Color.WHITE);
        tr.addView(labelUNENTSCHIEDEN);

        TextView labelNIEDERLAGE = new TextView(this);
        labelNIEDERLAGE.setId(200+count);
        labelNIEDERLAGE.setText(sieg.toString());
        labelNIEDERLAGE.setTextColor(Color.WHITE);
        tr.addView(labelNIEDERLAGE);

        TextView labelTORE = new TextView(this);
        labelTORE.setId(200+count);
        labelTORE.setText(sieg.toString());
        labelTORE.setTextColor(Color.WHITE);
        tr.addView(labelTORE);

        TextView labelGEGENTORE = new TextView(this);
        labelGEGENTORE.setId(200+count);
        labelGEGENTORE.setText(sieg.toString());
        labelGEGENTORE.setTextColor(Color.WHITE);
        tr.addView(labelGEGENTORE);

        TextView labelTORDIF = new TextView(this);
        labelTORDIF.setId(200+count);
        labelTORDIF.setText(sieg.toString());
        labelTORDIF.setTextColor(Color.WHITE);
        tr.addView(labelTORDIF);

        TextView labelPUNKTE = new TextView(this);
        labelPUNKTE.setId(200+count);
        labelPUNKTE.setText(sieg.toString());
        labelPUNKTE.setTextColor(Color.WHITE);
        tr.addView(labelPUNKTE);

// finally add this to the table row
        tl.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.FILL_PARENT,
                LayoutParams.WRAP_CONTENT));
        count++;
    }
}
