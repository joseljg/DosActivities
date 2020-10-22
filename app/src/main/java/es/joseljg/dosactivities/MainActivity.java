package es.joseljg.dosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_CIUDAD =  "es.joseljg.DosActivities2.ciudad";
    public static final String EXTRA_HABITANTES = "es.joseljg.DosActivities2.habitantes";
    EditText edt_url = null;
    EditText edt_ciudad = null;
    EditText edt_num_habitantes = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_url = findViewById(R.id.edt_uri1);
        edt_ciudad = findViewById(R.id.edt_ciudad);
        edt_num_habitantes = findViewById(R.id.edt_habitantes);
    }

    public void irActivity2(View view) {
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }

    public void irActivity2Boton2(View view) {
        Intent intent = new Intent(this, Activity2.class);
        String url = String.valueOf(edt_url.getText());
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void irActivity2boton3(View view) {
        //---------------------------------------------------------------------------
        String ciudad = String.valueOf(edt_ciudad.getText());
        //----------------------------------------------------------------------------
        String textohabitantes = String.valueOf(edt_num_habitantes.getText());
        int habitantes = 0;
        try {
            habitantes = Integer.valueOf(textohabitantes);
        }catch ( NumberFormatException e )
        {
            Log.i("error_conversion" , "error al convertir los habitantes desde texto a entero");
        }        //----------------------------------------------------------------------
        Intent intent = new Intent(this, Activity2.class);
        //-------------------------------------------------------------------------------
        intent.putExtra(EXTRA_CIUDAD, ciudad);
        intent.putExtra(EXTRA_HABITANTES, habitantes);
        //-------------------------------------------------------------------------------
        startActivity(intent);
    }

    public void irActivity2boton4(View view) {
        String ciudad = edt_ciudad.getText().toString();
        String textohabitantes = edt_num_habitantes.getText().toString();
        int habitantes = 0;
        try {
            habitantes = Integer.valueOf(textohabitantes);
        }catch ( NumberFormatException e )
        {
            Log.i("error_conversion" , "error al convertir los habitantes desde texto a entero");
        }

        //----------------------------------------------------------------------
        Bundle extras = new Bundle();
        extras.putString(EXTRA_CIUDAD,ciudad);
        extras.putInt(EXTRA_HABITANTES, habitantes);
        //----------------------------------------------------------------------
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtras(extras);
        startActivity(intent);
        //----------------------------------------------------------------------
    }
}