/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoso2;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author mvlop
 */
public class AI {

    public void iaProbability(Phones phone) {
        Admin admin = new Admin();

        int limit = 100;

        Random probability = new Random();
        int probability2 = probability.nextInt(limit);

        //"time" se debe poder modificar por infertaz 
        int time = 15;

        if (phone != null) {

            try {
                TimeUnit.SECONDS.sleep(time);

            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado con la AI", "ERROR", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }

            if (probability2 <= 40) {
                //System.out.println("salió al mercado");
                DataManage.writeData(phone);
                JOptionPane.showMessageDialog(null, "Salió al mercado");
                ProyectoSO2.released++;
            } else if (probability2 > 40 && probability2 <= 67) {
                //System.out.println("Empató");
                JOptionPane.showMessageDialog(null, "Empató");
                //falta crearla (nombre tentativo)
                //admin.empEnqueue(phone);
            } else {
                //System.out.println("Requiere refuerzos");
                JOptionPane.showMessageDialog(null, "Requiere refuerzos");
                admin.reEnqueue(phone);
            }
        }
        ProyectoSO2.addingCounter++;
    }
    

}
