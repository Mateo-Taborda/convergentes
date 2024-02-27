package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBeer(View view){
        TextView resultado = (TextView) findViewById(R.id.textResultsearch);
        Spinner color = (Spinner) findViewById(R.id.spinner);
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> marcas = expert.getMarcas(beerType);
        StringBuilder marcaFormateada = new StringBuilder();
        for(String m: marcas){
            marcaFormateada.append(m).append('\n');
        }
        resultado.setText(marcaFormateada);
    }
}