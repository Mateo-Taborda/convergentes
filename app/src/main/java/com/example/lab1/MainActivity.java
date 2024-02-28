package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ProductosExpert expert = new ProductosExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickProduct(View view){
        TextView resultado = (TextView) findViewById(R.id.textResultsearch);
        Spinner color = (Spinner) findViewById(R.id.spinner);
        String productType = String.valueOf(color.getSelectedItem());
        List<String> productos = expert.getproductos(productType);
        StringBuilder productoFormateada = new StringBuilder();
        for(String m: productos){
            productoFormateada.append(m).append('\n');
        }
        resultado.setText(productoFormateada);
    }
}