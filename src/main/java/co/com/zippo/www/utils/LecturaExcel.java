package co.com.zippo.www.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class LecturaExcel {
    public static ArrayList<String> productos;
    public static String url;

    public static ArrayList<String> validaciones;
    public static ArrayList<String> valCat;

    public static void obtenerDatos() {
        ArrayList<Map<String, String>> datos;
        productos = new ArrayList<String>();
        url="";
        validaciones=new ArrayList<String>();
        valCat=new ArrayList<String>();

        String nombreArchivo="Datos.xlsx";
        String hoja1="url";
        String encHoja1="URL";
        String hoja2="productos";
        String encHoja2="keyword";
        String hoja3="validarCat";
        String encHoja3="Producto";
        String hoja4="validarHome";
        String encHoja4="Texto";
        try{
            datos=Excel.readExcel(nombreArchivo,hoja1);
            url=String.valueOf(datos.get(0).get(encHoja1));
            datos.clear();
            datos=Excel.readExcel(nombreArchivo,hoja2);
            for (Map<String,String> dato: datos) {
                productos.add(dato.get(encHoja2));
            }
            datos.clear();
            datos=Excel.readExcel(nombreArchivo,hoja3);
            for (Map<String,String> dato: datos) {
                valCat.add(dato.get(encHoja3));
            }
            datos.clear();
            datos=Excel.readExcel(nombreArchivo,hoja4);
            for (Map<String,String> dato: datos) {
                validaciones.add(dato.get(encHoja4));
            }
        }catch (IOException e){e.printStackTrace();}
    }
}
