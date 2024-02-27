package com.example.lab1;
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getMarcas(String color){
        List <String> marcas= new ArrayList<>();
        if(color.equals("Red")){
            marcas.add("Red  Beer");
            marcas.add("Red BeerOFF");
        }else {
            if (color.equals("Dark")) {
                marcas.add("DarkON  Beer");
                marcas.add("DarkEspecial Beer");
            }else{
                marcas.add("Anber lucky");
                marcas.add("Beer bst");
            }
        }
        return marcas;
    }
}