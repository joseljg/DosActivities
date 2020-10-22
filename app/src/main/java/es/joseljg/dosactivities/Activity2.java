package es.joseljg.dosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView txt_informacion_recibida = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txt_informacion_recibida = findViewById(R.id.txt_informacion_recibida);
        Intent intent = getIntent();
      
        String ciudad =  intent.getStringExtra(MainActivity.EXTRA_CIUDAD);
        int habitantes =  intent.getIntExtra(MainActivity.EXTRA_HABITANTES,0);
        if(ciudad != null)
        {
            String resultado = "ciudad -> " + ciudad + "\n" + " ,poblacion-> " + habitantes ;
            txt_informacion_recibida.setText(resultado);
        }

       //-----------------------------------------------------------------------
 /*       Bundle extras = intent.getExtras();
        if (extras != null) {
            String ciudad = extras.getString(MainActivity.EXTRA_CIUDAD);
            int habitantes = extras.getInt(MainActivity.EXTRA_HABITANTES);
            String resultado = "ciudad -> " + ciudad + "\n" + " ,poblacion-> " + habitantes;
            txt_informacion_recibida.setText(resultado);
        }
        */
        //----------------------------------------------------------------------
    }
    public void cerrarActivity2(View view) {
        finish();
    }


}