/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201503393;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Daniel De León
 */
public class Graficar {
    
    public void grafo(String archivo, String nombre) {// EN ESTE CREO EL ARCHIVO CON EL QUE SE GRAFICA
        try {
            File miDir = new File(".");
            String directo = miDir.getCanonicalPath();
            File vo = new File(directo + "\\Reportes\\" + nombre + ".txt");// creas una carpeta con el nombre REPORTES en la carpeta de tu proyecto
            BufferedWriter bw;
            if (vo.exists()) {
                bw = new BufferedWriter(new FileWriter(vo));
                bw.write("digraph G\n{" + archivo + "\n}");
//                bw.newLine();
//                bw.write("digraph G\n{" + archivo + "\n}");

            } else {
                bw = new BufferedWriter(new FileWriter(vo));
                bw.write("digraph G\n{" + archivo + "\n}");
            }

            bw.close();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public void generar(String name) {
        try {

            File miDir = new File(".");
            String directo = miDir.getCanonicalPath();

            String dotPath = directo + "\\Graphviz 2.28\\bin\\dot.exe";

            String fileInputPath = directo + "\\Reportes\\" + name + ".txt";
            String fileOutputPath = directo + "\\Reportes\\" + name + ".jpg";

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec(cmd);
            System.out.println("YA SE GENERO LA IMAGEN");
            p.waitFor();
        } catch (Exception ex) {
            System.out.println("Error en Generar");
            ex.printStackTrace();
        } finally {
        }
    }
}
