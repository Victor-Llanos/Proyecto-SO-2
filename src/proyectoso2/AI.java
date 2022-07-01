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

    public void battle(Phones[] ph) {
        try {
            TimeUnit.SECONDS.sleep(DataManage.readTime());

        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado con la AI", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        Admin admin = new Admin();
        boolean buenos = true;
        Phones ganador = null;
        Phones[] empatados = new Phones[2];
        boolean win = false;
        boolean draw = false;
        boolean none = false;
        for (Phones ph1 : ph) {
            if (!ph1.good) {
                buenos = false;

            }
        }
        if (buenos) {
            
            if ((ph[2].wr == ph[0].wr) && (ph[0].wr == ph[1].wr)) {
                for (Phones ph1 : ph) {
                    admin.reEnqueue(ph1);
                    none = true;
                }

            } else if (ph[0].wr > ph[1].wr) {
                if (ph[0].wr > ph[2].wr) {
                    ganador = ph[0];
                    win = true;
                } else {
                    empatados[0] = ph[0];
                    empatados[1] = ph[2];
                    draw = true;
                }

            } else if (ph[1].wr > ph[0].wr) {
                if (ph[1].wr > ph[2].wr) {
                    ganador = ph[1];
                    win = true;
                } else {
                    empatados[0] = ph[1];
                    empatados[1] = ph[2];
                    draw = true;
                }

            } else {
                if (ph[2].wr > ph[0].wr) {
                    ganador = ph[2];
                    win = true;
                } else {
                    empatados[0] = ph[0];
                    empatados[1] = ph[1];
                    draw = true;
                }

            }
        } else {
            for (Phones ph1 : ph) {
                if (ph1.good) {
                    admin.reEnqueue(ph1);
                } else {
                    ph1.good = true;
                    admin.enqueueReforcement(ph1);
                }

            }
        }
        if (win) {
            System.out.println("Ganó:");
            System.out.println(ganador.name);
            System.out.println(ganador.info);
            DataManage.writeData(ganador);
        } else if (draw) {
            for (Phones empatado : empatados) {
                admin.reEnqueue(empatado);
            }

            System.out.println("Empatados:");
            System.out.println(empatados[0].name + " vs. " + empatados[1].name);
        }
        ProyectoSO2.addingCounter++;
    }

}
