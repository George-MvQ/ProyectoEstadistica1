/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author George Vasquez
 */
public class Teorema_9 extends javax.swing.JFrame {

    /**
     * Creates new form Teorema_9
     */
    
    boolean estadoComponente=false;
    String variableDespejar;
    
    
    public Teorema_9() {
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
        labelPResolver = new javax.swing.JLabel();
        labelPRespuesta = new javax.swing.JLabel();
        labelRespuesta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        botonDespeje = new javax.swing.JButton();
        labelGuia = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CONCEPTO Y FORMULA", jPanel1);

        jPanel2.setLayout(null);

        labelPResolver.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelPResolver.setText("P(A) =");
        jPanel2.add(labelPResolver);
        labelPResolver.setBounds(50, 20, 130, 50);

        labelPRespuesta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelPRespuesta.setText("P(A) =");
        jPanel2.add(labelPRespuesta);
        labelPRespuesta.setBounds(50, 120, 130, 60);

        labelRespuesta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelRespuesta.setText("---------");
        jPanel2.add(labelRespuesta);
        labelRespuesta.setBounds(170, 130, 230, 44);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("1 -");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(190, 20, 44, 44);

        jTextFieldNum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(jTextFieldNum);
        jTextFieldNum.setBounds(250, 20, 62, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 260, 117, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(290, 210, 101, 40);

        botonDespeje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonDespeje.setText("ELEJIR DESPEJE");
        botonDespeje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDespejeActionPerformed(evt);
            }
        });
        jPanel2.add(botonDespeje);
        botonDespeje.setBounds(230, 260, 163, 40);

        labelGuia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelGuia.setText("P(A') ");
        jPanel2.add(labelGuia);
        labelGuia.setBounds(260, 60, 60, 20);

        jTabbedPane1.addTab("CALCULADORA TEOREMA 9", jPanel2);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton1.setText("MENU");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jToggleButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       double datoIngresado;
      
        try{ 
            datoIngresado=  (double)Math.round( Funcion.TeoremaNueve((float)Double.parseDouble(jTextFieldNum.getText()))*10000)/10000 ;
            if((datoIngresado>1) || (datoIngresado<0)){
                  JOptionPane.showMessageDialog(null,"Error el dato ingresado no debe de ser negativo ni mayor a uno\nPor favor vuelva a intentar");
                   }
            else{
                   labelRespuesta.setText(Double.toString( datoIngresado));
            }
            
            
            
        }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Error al ingresar los datos\nPor favor vuelva a intentar\n"+ e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonDespejeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDespejeActionPerformed
            String [] opciones = {"HALLAR P(A)","HALLAR P(A')"};
    int entrada;
    //creando objeto combobox, a la vez mandado el arreglo de opciones 
    JComboBox cb = new JComboBox(opciones);
    //creando Joptionpane con cobobox
    entrada=JOptionPane.showConfirmDialog(this,cb,"Seleccione una opcion", JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE);
    //comprobado seleccion del ususario
    if(entrada==0){
        variableDespejar= (String) cb.getSelectedItem();
        
         if (variableDespejar.equals("HALLAR P(A)")){
        labelPResolver.setText("P(A) =");
        labelPRespuesta.setText("P(A) =");
        labelGuia.setText("P(A')");
        
         }
         else {
              labelPResolver.setText("P(A') = ");
              labelPRespuesta.setText("P(A') = ");
              labelGuia.setText("P(A)");
         }
    }
    
   
    }//GEN-LAST:event_botonDespejeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        labelRespuesta.setText("-------");
        jTextFieldNum.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Menu regresarMenu = new Menu();
        regresarMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    
    
    void componentesEstado(){
   
        
    }
    
    
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
            java.util.logging.Logger.getLogger(Teorema_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema_9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDespeje;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelGuia;
    private javax.swing.JLabel labelPResolver;
    private javax.swing.JLabel labelPRespuesta;
    private javax.swing.JLabel labelRespuesta;
    // End of variables declaration//GEN-END:variables
}
