package com.example.a8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    SeekBar seekbar;
    TextView text;
    TextView text2;
    TextView rahamaara;

    int maara;

    BottleDispenser automaatti = BottleDispenser.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        seekbar = findViewById(R.id.seekBar);
        text = findViewById(R.id.textView);
        text2 = findViewById(R.id.seekBarText);
        rahamaara = findViewById(R.id.moneyAmount);

        automaatti.setContext(getApplicationContext());

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                maara = i;
                text2.setText(Integer.toString(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.pullo_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    public void lisaaRahaa(View v) {
        automaatti.lisaaRahaa(maara);
        rahamaara.setText("Rahaa tällä hetkellä: " + automaatti.getRahaa());
        text.setText("Klink! Lisää rahaa laitteeseen " + maara + "!");
    }

    public void ostaPullo(View v) {
        boolean ostonOnnistuminen = automaatti.ostaPullo(spinner.getSelectedItemPosition());
        if(!ostonOnnistuminen){
            text.setText("Syötä rahaa ensin!");
        } else {
            text.setText("KACHUNK! Pullo tipahti masiinasta!");
            rahamaara.setText("Rahaa tällä hetkellä: " + automaatti.getRahaa());
        }
    }

    public void palautaRahat(View v) {
        text.setText("Klink klink. Sinne menivät rahat! Rahaa tuli ulos " + automaatti.getRahaa());
        automaatti.palautaRahat();
        rahamaara.setText("Rahaa tällä hetkellä: " + automaatti.getRahaa());
    }


}


