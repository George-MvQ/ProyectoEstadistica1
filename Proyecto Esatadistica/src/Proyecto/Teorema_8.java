
package Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author George Vasquez
 */
public class Teorema_8 extends javax.swing.JFrame {

    /**
     * Creates new form Teorema_8
     */
    public Teorema_8() {
        initComponents();
          //para centrar en pantalla ui al iniciar
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlabelRespuesta = new javax.swing.JLabel();
        jtextFieldPA = new javax.swing.JTextField();
        jtextFieldPB = new javax.swing.JTextField();
        jtextFieldPC = new javax.swing.JTextField();
        jtextFieldPAnB = new javax.swing.JTextField();
        jtextFieldPAnC = new javax.swing.JTextField();
        jtextFieldPBnC = new javax.swing.JTextField();
        jtextFieldPAnBnC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jbotonCalcular = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CONCEPTO Y FORMULA", jPanel1);

        jPanel2.setLayout(null);

        jlabelRespuesta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlabelRespuesta.setText("------------");
        jPanel2.add(jlabelRespuesta);
        jlabelRespuesta.setBounds(200, 150, 310, 39);

        jtextFieldPA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtextFieldPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jtextFieldPA);
        jtextFieldPA.setBounds(200, 50, 50, 40);

        jtextFieldPB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtextFieldPB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jtextFieldPB);
        jtextFieldPB.setBounds(290, 50, 50, 40);

        jtextFieldPC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtextFieldPC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jtextFieldPC);
        jtextFieldPC.setBounds(380, 50, 50, 40);

        jtextFieldPAnB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtextFieldPAnB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jtextFieldPAnB);
        jtextFieldPAnB.setBounds(470, 50, 50, 40);

        jtextFieldPAnC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtextFieldPAnC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jtextFieldPAnC);
        jtextFieldPAnC.setBounds(560, 50, 50, 40);

        jtextFieldPBnC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtextFieldPBnC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jtextFieldPBnC);
        jtextFieldPBnC.setBounds(650, 50, 50, 40);

        jtextFieldPAnBnC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtextFieldPAnBnC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jtextFieldPAnBnC);
        jtextFieldPAnBnC.setBounds(740, 50, 50, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("+");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(260, 60, 20, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("+");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(350, 60, 20, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(440, 60, 20, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(530, 60, 20, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(620, 60, 20, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("+");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(710, 60, 20, 22);

        jLabel8.setText("P(A)");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(210, 90, 30, 14);

        jLabel9.setText("P(B)");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(305, 90, 30, 14);

        jLabel10.setText("P(C)");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(390, 90, 30, 14);

        jLabel11.setText("P(A ∩ B)");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(475, 90, 50, 14);

        jLabel12.setText("P(A ∩ C)");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(565, 90, 50, 14);

        jLabel13.setText("P(B ∩ C)");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(655, 90, 50, 14);

        jLabel14.setText("P(A∩B∩C)");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(740, 90, 50, 14);

        jbotonCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbotonCalcular.setText("CALCULAR");
        jbotonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonCalcularActionPerformed(evt);
            }
        });
        jPanel2.add(jbotonCalcular);
        jbotonCalcular.setBounds(80, 270, 100, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("LIMPIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(660, 270, 100, 50);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("P(A U B U C) =");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(20, 50, 170, 39);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("P(A U B U C) =");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(20, 150, 170, 39);

        jTabbedPane1.addTab("CALCULADORA TEOREMA 8", jPanel2);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(352, 352, 352))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu regresarMenu = new Menu();
        regresarMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    jlabelRespuesta.setText("---------");
    jtextFieldPA.setText("");
    jtextFieldPAnB.setText("");
    jtextFieldPAnBnC.setText("");
    jtextFieldPAnC.setText("");
    jtextFieldPB.setText("");
    jtextFieldPBnC.setText("");
    jtextFieldPC.setText(""); 
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbotonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonCalcularActionPerformed
           
        try{
        jlabelRespuesta.setText(Double.toString( (double)Math.round(  Funcion.teoremaOcho(
                (float)Double.parseDouble( jtextFieldPA.getText()), 
                (float)Double.parseDouble( jtextFieldPB.getText()), 
                (float)Double.parseDouble( jtextFieldPC.getText()),
                (float)Double.parseDouble( jtextFieldPAnB.getText()), 
                (float)Double.parseDouble( jtextFieldPAnC.getText()), 
                (float)Double.parseDouble( jtextFieldPBnC.getText()),
                (float)Double.parseDouble( jtextFieldPAnBnC.getText()))*100)/100));
        }catch (Exception e){  JOptionPane.showMessageDialog(null,"Error al ingresar los datos\nPor favor vuelva a intentar\n"+ e);}
    }//GEN-LAST:event_jbotonCalcularActionPerformed

    
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
            java.util.logging.Logger.getLogger(Teorema_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema_8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbotonCalcular;
    private javax.swing.JLabel jlabelRespuesta;
    private javax.swing.JTextField jtextFieldPA;
    private javax.swing.JTextField jtextFieldPAnB;
    private javax.swing.JTextField jtextFieldPAnBnC;
    private javax.swing.JTextField jtextFieldPAnC;
    private javax.swing.JTextField jtextFieldPB;
    private javax.swing.JTextField jtextFieldPBnC;
    private javax.swing.JTextField jtextFieldPC;
    // End of variables declaration//GEN-END:variables
}
