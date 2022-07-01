/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso2;

import javax.swing.DefaultListModel;

/**
 *
 * @author Achicopalado
 */
public class Simulacion extends javax.swing.JFrame {

    /**
     * Creates new form simulacion
     */
    
    DefaultListModel levelQueue1P1 = new DefaultListModel();
    DefaultListModel levelQueue2P1 = new DefaultListModel();
    DefaultListModel levelQueue3P1 = new DefaultListModel();
    DefaultListModel reforcementQueue1 = new DefaultListModel();    
    DefaultListModel levelQueue1P2 = new DefaultListModel();
    DefaultListModel levelQueue2P2 = new DefaultListModel();
    DefaultListModel levelQueue3P2 = new DefaultListModel();
    DefaultListModel reforcementQueue2 = new DefaultListModel();    
    DefaultListModel levelQueue1P3 = new DefaultListModel();
    DefaultListModel levelQueue2P3 = new DefaultListModel();
    DefaultListModel levelQueue3P3 = new DefaultListModel();
    DefaultListModel reforcementQueue3 = new DefaultListModel();    
    public Simulacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

public DefaultListModel writeJlist(Cola cola, Node node, DefaultListModel queue) {
    for (int i = 0; i < cola.getSize(); i++) {
        Phones phone = (Phones) node.getData();
        queue.addElement("ID: " + phone.id + " Trofeos: " + phone.trophies);
        node = node.getNext();
    }
    return queue;
}
    
public void updateQueuesP1(Cola queue1, Cola queue2, Cola queue3, Cola reforce) {
            idPlant1.setText("Xperia 10 IV");

    Node first1 = queue1.getFirst();
    Node first2 = queue2.getFirst();
    Node first3 = queue3.getFirst();
    Node firstR = reforce.getFirst();

    
    levelQueue1P1.removeAllElements();
    levelQueue1P1 = writeJlist(queue1, first1, levelQueue1P1);
    jList1.setModel(levelQueue1P1);
    cont1.setText(Integer.toString(queue1.getSize()));

    levelQueue2P1.removeAllElements();
    levelQueue2P1 = writeJlist(queue2, first2, levelQueue2P1);
    jList2.setModel(levelQueue2P1);
    cont2.setText(Integer.toString(queue2.getSize()));

    levelQueue3P1.removeAllElements();
    levelQueue3P1 = writeJlist(queue3, first3, levelQueue3P1);
    jList3.setModel(levelQueue3P1);
    cont3.setText(Integer.toString(queue3.getSize()));
    
    reforcementQueue1.removeAllElements();
    reforcementQueue1 = writeJlist(reforce, firstR, reforcementQueue1);
    jListR1.setModel(reforcementQueue1);     
            }    
public void updateQueuesP2(Cola queue1, Cola queue2, Cola queue3, Cola reforce) {
        idPlant2.setText("Xperia 10 III");

    Node first1 = queue1.getFirst();
    Node first2 = queue2.getFirst();
    Node first3 = queue3.getFirst();
    Node firstR = reforce.getFirst();
    
    levelQueue1P2.removeAllElements();
    levelQueue1P2 = writeJlist(queue1, first1, levelQueue1P2);
    jList4.setModel(levelQueue1P2);
    cont4.setText(Integer.toString(queue1.getSize()));

    levelQueue2P2.removeAllElements();
    levelQueue2P2 = writeJlist(queue2, first2, levelQueue2P2);
    jList5.setModel(levelQueue2P2);
    cont5.setText(Integer.toString(queue2.getSize()));

    levelQueue3P2.removeAllElements();
    levelQueue3P2 = writeJlist(queue3, first3, levelQueue3P2);
    jList6.setModel(levelQueue3P2);
    cont6.setText(Integer.toString(queue3.getSize()));
 
    reforcementQueue2.removeAllElements();
    reforcementQueue2 = writeJlist(reforce, firstR, reforcementQueue2);
    jListR2.setModel(reforcementQueue2);    
    
            }    
public void updateQueuesP3(Cola queue1, Cola queue2, Cola queue3, Cola reforce) {
    idPlant3.setText("Xperia Pro-1");
    Node first1 = queue1.getFirst();
    Node first2 = queue2.getFirst();
    Node first3 = queue3.getFirst();
    Node firstR = reforce.getFirst();
    
    
    levelQueue1P3.removeAllElements();
    levelQueue1P3 = writeJlist(queue1, first1, levelQueue1P3);
    jList7.setModel(levelQueue1P3);
    cont7.setText(Integer.toString(queue1.getSize()));

    levelQueue2P3.removeAllElements();
    levelQueue2P3 = writeJlist(queue2, first2, levelQueue2P3);
    jList8.setModel(levelQueue2P3);
    cont8.setText(Integer.toString(queue2.getSize()));

    levelQueue3P3.removeAllElements();
    levelQueue3P3 = writeJlist(queue3, first3, levelQueue3P3);
    jList9.setModel(levelQueue3P3);
    cont9.setText(Integer.toString(queue3.getSize()));

    reforcementQueue3.removeAllElements();
    reforcementQueue3 = writeJlist(reforce, firstR, reforcementQueue3);
    jListR3.setModel(reforcementQueue3);

    
            }    
    
//    
//public void updateRevision (Phones phone, Phones phone2, Phones phone3) {
//    if (phone == null) {
//        idPlant1.setText("No se ha seleccionado");
//        idPlant2.setText("No se ha seleccionado");
//        idPlant3.setText("No se ha seleccionado");
//    } else {
//      
//        if (phone.plant == 1) {
//          idPlant1.setText(Integer.toString(phone.id));
//      } else if(phone.plant == 2) {
//          idPlant2.setText(Integer.toString(phone.id));        
//      } else if (phone.plant == 3){
//          idPlant3.setText(Integer.toString(phone.id));        
//        
//    } 
//    }
//}    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListR3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListR1 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListR2 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cont3 = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        idPlant2 = new javax.swing.JTextField();
        idPlant3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jScrollPane16 = new javax.swing.JScrollPane();
        jList9 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane17 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        idPlant1 = new javax.swing.JTextField();
        cont1 = new javax.swing.JTextField();
        cont2 = new javax.swing.JTextField();
        cont4 = new javax.swing.JTextField();
        cont5 = new javax.swing.JTextField();
        cont6 = new javax.swing.JTextField();
        cont7 = new javax.swing.JTextField();
        cont8 = new javax.swing.JTextField();
        cont9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Planta N°3");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Simulación SONY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cola N°2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Planta N°2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jListR3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jListR3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 590, 130, 170));

        jListR1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane4.setViewportView(jListR1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, 130, 170));

        jList4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane5.setViewportView(jList4);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 130, 170));

        jList5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane6.setViewportView(jList5);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 130, 170));

        jListR2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane7.setViewportView(jListR2);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 370, 130, 170));

        jList7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane8.setViewportView(jList7);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, 130, 170));

        jList8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane9.setViewportView(jList8);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 130, 170));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Planta N°1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cola N°3");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AI Status");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cola N°1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        cont3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cont3.setEnabled(false);
        cont3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont3ActionPerformed(evt);
            }
        });
        jPanel1.add(cont3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 130, -1));

        status.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        status.setEnabled(false);
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 170, -1));

        idPlant2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        idPlant2.setEnabled(false);
        idPlant2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPlant2ActionPerformed(evt);
            }
        });
        jPanel1.add(idPlant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 120, -1));

        idPlant3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        idPlant3.setEnabled(false);
        idPlant3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPlant3ActionPerformed(evt);
            }
        });
        jPanel1.add(idPlant3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 120, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cola Refuerzo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, -1, -1));

        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 20, -1, -1));

        jList6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane15.setViewportView(jList6);

        jPanel1.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, 130, 170));

        jList9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane16.setViewportView(jList9);

        jPanel1.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 590, 130, 170));

        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 130, 170));

        jScrollPane10.setViewportView(jList2);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 130, 170));

        jScrollPane17.setViewportView(jList3);

        jPanel1.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 130, 170));

        idPlant1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        idPlant1.setEnabled(false);
        idPlant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPlant1ActionPerformed(evt);
            }
        });
        jPanel1.add(idPlant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 120, -1));

        cont1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cont1.setEnabled(false);
        cont1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont1ActionPerformed(evt);
            }
        });
        jPanel1.add(cont1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 130, -1));

        cont2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cont2.setEnabled(false);
        cont2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont2ActionPerformed(evt);
            }
        });
        jPanel1.add(cont2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 130, -1));

        cont4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cont4.setEnabled(false);
        cont4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont4ActionPerformed(evt);
            }
        });
        jPanel1.add(cont4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 130, -1));

        cont5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cont5.setEnabled(false);
        cont5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont5ActionPerformed(evt);
            }
        });
        jPanel1.add(cont5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 130, -1));

        cont6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cont6.setEnabled(false);
        cont6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont6ActionPerformed(evt);
            }
        });
        jPanel1.add(cont6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 130, -1));

        cont7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cont7.setEnabled(false);
        cont7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont7ActionPerformed(evt);
            }
        });
        jPanel1.add(cont7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 770, 130, -1));

        cont8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cont8.setEnabled(false);
        cont8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont8ActionPerformed(evt);
            }
        });
        jPanel1.add(cont8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 770, 130, -1));

        cont9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cont9.setEnabled(false);
        cont9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont9ActionPerformed(evt);
            }
        });
        jPanel1.add(cont9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 770, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cont3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont3ActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void idPlant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPlant2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPlant2ActionPerformed

    private void idPlant3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPlant3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPlant3ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void idPlant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPlant1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPlant1ActionPerformed

    private void cont1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont1ActionPerformed

    private void cont2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont2ActionPerformed

    private void cont4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont4ActionPerformed

    private void cont5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont5ActionPerformed

    private void cont6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont6ActionPerformed

    private void cont7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont7ActionPerformed

    private void cont8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont8ActionPerformed

    private void cont9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacion().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cont1;
    private javax.swing.JTextField cont2;
    private javax.swing.JTextField cont3;
    private javax.swing.JTextField cont4;
    private javax.swing.JTextField cont5;
    private javax.swing.JTextField cont6;
    private javax.swing.JTextField cont7;
    private javax.swing.JTextField cont8;
    private javax.swing.JTextField cont9;
    private javax.swing.JButton exit;
    private javax.swing.JTextField idPlant1;
    private javax.swing.JTextField idPlant2;
    private javax.swing.JTextField idPlant3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JList<String> jList7;
    private javax.swing.JList<String> jList8;
    private javax.swing.JList<String> jList9;
    private javax.swing.JList<String> jListR1;
    private javax.swing.JList<String> jListR2;
    private javax.swing.JList<String> jListR3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField status;
    // End of variables declaration//GEN-END:variables
}
