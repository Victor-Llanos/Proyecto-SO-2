/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author yunch
 */
public class DataManage {

    public static boolean isInt(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int readTime() {
        String path = "test\\time.txt";
        File f = new File(path);
        int Time = 2;
        String line;
        try {
            FileReader fr = new FileReader(f);
            try (BufferedReader br = new BufferedReader(fr)) {
                
                while ((line = br.readLine()) != null) {
                    if (isInt(line)) {
                        Time = Integer.parseInt(line);
                        return Time;
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en la lectura de los datos iniciales", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        return Time;
    }

    public static void writeData(Phones ph) {
        String path = "test\\data.csv";
        File f = new File(path);
        try {
            FileWriter fw = new FileWriter(f, true);
            try (PrintWriter pw = new PrintWriter(fw, true)) {
                pw.print(ph.id +";"+ph.plant+";"+ph.trophies+"\n");
            }
        } catch (IOException e) {

        }

    }

}
