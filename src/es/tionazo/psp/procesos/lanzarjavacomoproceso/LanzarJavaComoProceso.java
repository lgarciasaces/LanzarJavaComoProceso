package es.tionazo.psp.procesos.lanzarjavacomoproceso;

import java.io.File;
import java.io.IOException;

public class LanzarJavaComoProceso {

    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder("java", "HolaMundo");

        // creamos un objeto tipo File en el que establecemos la ruta en la que se encuentra la clase (.class) del proyecto HolaMundo que queremos ejecutar
        //File rutaHolaMundo = new File("C:\\src\\psp\\procesos\\LanzarJavaComoProceso\\out\\production\\LanzarJavaComoProceso\\es\\tionazo\\psp\\procesos\\lanzarjavacomoproceso");

        // Dado que ambas clases se encuentran en el mismo proyecto, comparten la carpeta raiz, por lo que podríamos simplificar la ruta con un punto (.) hasta el out
        File rutaHolaMundo = new File(".\\out\\production\\LanzarJavaComoProceso\\es\\tionazo\\psp\\procesos\\lanzarjavacomoproceso");
        // configuramos el directorio o ruta en la que debe buscar nuestra clase HolaMundo
        pb.directory(rutaHolaMundo);

        /*
            Aunque el código está totalmente correcto, Veremos que no aparece ningún mensaje, dado que no estamos leyendo la salida del proceso lanzado
        */

        try {
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
