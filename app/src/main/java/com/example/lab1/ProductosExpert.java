package com.example.lab1;
import java.util.ArrayList;
import java.util.List;

public class ProductosExpert {
    List<String> getproductos(String producto){
        List <String> productos= new ArrayList<>();
        if(producto.equals("Solido")){
            productos.add("Martillo");
            productos.add("Destornillador");
        }else {
            if (producto.equals("Liquido")) {
                productos.add("Agua");
                productos.add("Petroleo");
            }else{
                productos.add("Bulto de papas");
                productos.add("Bulto de pepinos");
            }
        }
        return productos;
    }
}