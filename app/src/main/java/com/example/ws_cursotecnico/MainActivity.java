package com.example.ws_cursotecnico;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSomar(View v){
        //Cria objetos X e Y que estão na Activity Main
        EditText editX = findViewById(R.id.editX);
        EditText editY = findViewById(R.id.editX);

        float x, y;

        try {
            //Pega os números dos edits
            x = Float.parseFloat(editX.getText().toString());
            y = Float.parseFloat(editY.getText().toString());

            //calcula
            float resultado = x * y;

            //Salvar resultado no edit
            EditText editResultado = findViewById(R.id.editY);
            editResultado.setText(Float.toString(resultado));

            //mensagem ao usuário
            Toast.makeText(getApplicationContext(), "Cálculo realizado com sucesso!", Toast.LENGTH_LONG).show();

        } catch (Exception e){
            Toast.makeText(getApplicationContext(), "Informe os dados de X e Y corretamente!", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickLimpar(View v){
        //Cria objetos X e Y que estão na Activity Main
        EditText editX = findViewById(R.id.editX);
        EditText editY = findViewById(R.id.editY);
        EditText editResultado = findViewById(R.id.editResultado);

        //limpar edit
        editX.setText("-1");
        editY.setText("-1");
        editResultado.setText("-1");
    }
}
