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
public class Simulacion extends javax.swing.JFrame {

    /**
     * Creates new form simulacion
     */
    public Simulacion() {
        initComponents();
    }

public void updateRevision (Phones phone) {
    if (phone == null) {
        idPlant1.setText("No se ha seleccionado");
        idPlant2.setText("No se ha seleccionado");
        idPlant3.setText("No se ha seleccionado");
    } else {
      
        if (phone.plant == 1) {
          idPlant1.setText(Integer.toString(phone.id));
      } else if(phone.plant == 2) {
          idPlant2.setText(Integer.toString(phone.id));        
      } else if (phone.plant == 3){
          idPlant3.setText(Integer.toString(phone.id));        
        
    } 
    }
}    

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
        p3c3 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        reC = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        p1c2 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        p1c3 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        p2c1 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        p2c2 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        p2c3 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        p3c1 = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        p3c2 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        p1c4 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        p3id = new javax.swing.JTextField();
        idPlant1 = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        idPlant2 = new javax.swing.JTextField();
        p2id = new javax.swing.JTextField();
        idPlant3 = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        p1id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        p3c3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(p3c3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 590, 130, 170));

        reC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(reC);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 130, 390));

        p1c2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane3.setViewportView(p1c2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 130, 170));

        p1c3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane4.setViewportView(p1c3);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 130, 170));

        p2c1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane5.setViewportView(p2c1);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 130, 170));

        p2c2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane6.setViewportView(p2c2);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 130, 170));

        p2c3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane7.setViewportView(p2c3);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, 130, 170));

        p3c1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane8.setViewportView(p3c1);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, 130, 170));

        p3c2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane9.setViewportView(p3c2);

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
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        p1c4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane10.setViewportView(p1c4);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 130, 170));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cola N°1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        p3id.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        p3id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3idActionPerformed(evt);
            }
        });
        jPanel1.add(p3id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, 120, -1));

        idPlant1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        idPlant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPlant1ActionPerformed(evt);
            }
        });
        jPanel1.add(idPlant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 120, -1));

        status.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 170, -1));

        idPlant2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        idPlant2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPlant2ActionPerformed(evt);
            }
        });
        jPanel1.add(idPlant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 120, -1));

        p2id.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        p2id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2idActionPerformed(evt);
            }
        });
        jPanel1.add(p2id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 120, -1));

        idPlant3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        idPlant3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPlant3ActionPerformed(evt);
            }
        });
        jPanel1.add(idPlant3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 120, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane11.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, 180, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane12.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 180, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane13.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 180, -1));

        p1id.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        p1id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1idActionPerformed(evt);
            }
        });
        jPanel1.add(p1id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 120, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cola Refuerzo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p3idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3idActionPerformed

    private void idPlant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPlant1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPlant1ActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void idPlant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPlant2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPlant2ActionPerformed

    private void p2idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2idActionPerformed

    private void idPlant3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPlant3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPlant3ActionPerformed

    private void p1idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1idActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JList<String> p1c2;
    private javax.swing.JList<String> p1c3;
    private javax.swing.JList<String> p1c4;
    private javax.swing.JTextField p1id;
    private javax.swing.JList<String> p2c1;
    private javax.swing.JList<String> p2c2;
    private javax.swing.JList<String> p2c3;
    private javax.swing.JTextField p2id;
    private javax.swing.JList<String> p3c1;
    private javax.swing.JList<String> p3c2;
    private javax.swing.JList<String> p3c3;
    private javax.swing.JTextField p3id;
    private javax.swing.JList<String> reC;
    private javax.swing.JTextField status;
    // End of variables declaration//GEN-END:variables
}
