/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso2;

/**
 *
 * @author Achicopalado
 */
public class ProyectoSO2 {

    /**
     * @param args the command line arguments
     */
    
    public static int id = 0;
    public static int released = 0;
    public static int addingCounter = 0;
    public static Cola reforcementQueue1 = new Cola();
    public static Cola reforcementQueue2 = new Cola();
    public static Cola reforcementQueue3 = new Cola();
    public static Cola level1QueueP1 = new Cola();
    public static Cola level2QueueP1 = new Cola();
    public static Cola level3QueueP1 = new Cola();
    public static Cola level1QueueP2 = new Cola();
    public static Cola level2QueueP2 = new Cola();
    public static Cola level3QueueP2 = new Cola();
    public static Cola level1QueueP3 = new Cola();
    public static Cola level2QueueP3 = new Cola();
    public static Cola level3QueueP3 = new Cola();
    
    

    
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.addPhone();
        AI ai = new AI();
        
        Phones phone1;
        Phones phone2;
        Phones phone3;
        
        Simulacion simu = new Simulacion();
        simu.setTitle("Plantas sony");
        simu.setLocationRelativeTo(null);
        simu.setVisible(true);
        
        while (true) {
            phone1 = admin.selectPhone(1);
            phone1 = admin.selectPhone(2);
            phone1 = admin.selectPhone(3);
            
            simu.updateQueuesP1(level1QueueP1, level2QueueP1, level3QueueP1, reforcementQueue1);
            simu.updateQueuesP2(level1QueueP2, level2QueueP2, level3QueueP2, reforcementQueue2);
            simu.updateQueuesP3(level1QueueP3, level2QueueP3, level3QueueP3, reforcementQueue3);
            
            
            
        
        }
        
        

        
        
        
//        Simulacion window = new Simulacion();
//        window.setTitle("Phones Clash Royale");
//        window.setLocationRelativeTo(null);
//        window.setVisible(true);
    }
    
}
