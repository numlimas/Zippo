package com.zippo.www.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class LecturaExcel {
    public static ArrayList<String> productos;
    public static String url;

    public static void obtenerDatos() {
        ArrayList<Map<String, String>> datos;
        productos = new ArrayList<String>();
        url="";
        String nombreArchivo="Datos.xlsx";
        String hoja1="url";
        String encHoja1="URL";
        String hoja2="productos";
        String encHoja2="keyword";
        try{
            datos=Excel.readExcel(nombreArchivo,hoja2);
            for (Map<String,String> dato: datos) {
                productos.add(dato.get(encHoja2));
            }
            datos.clear();
            datos=Excel.readExcel(nombreArchivo,hoja1);
            url=String.valueOf(datos.get(0).get(encHoja1));

        }catch (IOException e){e.printStackTrace();}
    }
}
