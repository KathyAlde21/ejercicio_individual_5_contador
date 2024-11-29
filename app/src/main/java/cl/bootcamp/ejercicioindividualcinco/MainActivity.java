package cl.bootcamp.ejercicioindividualcinco;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //variable para almacenar contador
    private int counter = 0;
    //muestra valor contador
    private TextView counterText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicio elementos aumento y decremento botones
        counterText = findViewById(R.id.text_counter);

        //botones aumentar y disminuir el contador
        Button btnIncrement = findViewById(R.id.button_increment);
        Button btnDecrement = findViewById(R.id.button_decrement);

        btnIncrement.setOnClickListener((View.OnClickListener) this);
        btnDecrement.setOnClickListener((View.OnClickListener) this);

        //inicializando contador
        updateCounter();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_increment:
                counter++;
                break;

            case R.id.button_decrement:
                counter--;
                break;
        }
        updateCounter();
    }

    private void updateCounter() {
        counterText.setText(String.valueOf(counter));
    }
}