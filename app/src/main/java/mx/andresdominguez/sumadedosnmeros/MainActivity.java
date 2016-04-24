package mx.andresdominguez.sumadedosnmeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sumar(View view){
        EditText numUno = (EditText) findViewById(R.id.numUno);
        EditText numDos = (EditText) findViewById(R.id.numDos);
        String numUnos = numUno.toString();
        String numDo = numUno.toString();
        Integer intUno = Integer.parseInt(numUnos);
        Integer intDos = Integer.parseInt(numDo);
        Integer resultado = intUno + intDos;

        TextView resultados = (TextView) findViewById(R.id.resultado);
        resultados.setText("La suma de " + numUnos + " + " + numDo + " es " + resultado + ".");





    }
}
