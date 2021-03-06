/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
//import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author vasqu
 */
public class Teorema_12_Dep extends javax.swing.JFrame {

    private List<JTextField> texfieldAgregar;
    private List<JLabel> labelAgregar;
    int indice;
    //String indiceLbGuia;
    String indiceLbInfo = "";
    String datos = "";

    /**
     * Creates new form Teorema_12_independientes
     */
    public Teorema_12_Dep() {
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        initComponents();
        jPanel1.setBackground(new Color(200, 227, 212));
        panelAgregar.setBackground(new Color(200, 227, 212));
        //jPanel2.setBackground(new Color(8, 29, 240, 200));
        setLocationRelativeTo(null);

        texfieldAgregar = new ArrayList<>();
        labelAgregar = new ArrayList<>();
        indice = 0;
        texfieldAgregar.add(textfielUno);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        panelAgregar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textfielUno = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        botonQuitar = new javax.swing.JButton();
        botonAgregarElemeto = new javax.swing.JButton();
        labelRespuesta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        labelMostrarUnionPA = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(null);

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelAgregar.setLayout(new javax.swing.BoxLayout(panelAgregar, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 33)); // NOI18N
        jLabel1.setText("P(A1) ");
        jLabel1.setToolTipText("");
        panelAgregar.add(jLabel1);

        textfielUno.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textfielUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelAgregar.add(textfielUno);

        jScrollPane1.setViewportView(panelAgregar);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 60, 455, 62);

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("LIMPIAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(40, 300, 130, 40);

        jButton5.setBackground(new java.awt.Color(0, 153, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("CALCULAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(230, 310, 210, 70);

        botonQuitar.setBackground(new java.awt.Color(0, 153, 0));
        botonQuitar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonQuitar.setText("ELIMINAR");
        botonQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarActionPerformed(evt);
            }
        });
        jPanel1.add(botonQuitar);
        botonQuitar.setBounds(510, 360, 210, 42);

        botonAgregarElemeto.setBackground(new java.awt.Color(0, 153, 0));
        botonAgregarElemeto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonAgregarElemeto.setText("AGREAGAR P(A2)");
        botonAgregarElemeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarElemetoActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgregarElemeto);
        botonAgregarElemeto.setBounds(510, 300, 210, 47);

        labelRespuesta.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        labelRespuesta.setText("---");
        jPanel1.add(labelRespuesta);
        labelRespuesta.setBounds(190, 170, 350, 53);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 33)); // NOI18N
        jLabel2.setText("TOTAL:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 170, 109, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("=");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 70, 27, 40);

        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        labelMostrarUnionPA.setBackground(new java.awt.Color(200, 227, 212));
        labelMostrarUnionPA.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        labelMostrarUnionPA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMostrarUnionPA.setText("P(A1)");
        labelMostrarUnionPA.setOpaque(true);
        jScrollPane2.setViewportView(labelMostrarUnionPA);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 50, 170, 81);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 370, 130, 42);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Teorema_12 regresarMenu = new Teorema_12();
        regresarMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

//mis metodos 
    private void botonAgregarElemetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarElemetoActionPerformed
        agregarTexfiel();
        botonAgregarElemeto.setText("AGREGAR P(A" + Integer.toString(texfieldAgregar.size() + 1) + ")");
        botonQuitar.setText("ELIMINAR P(A" + Integer.toString(texfieldAgregar.size()) + ")");
        agregarLabelGuiaUnionPA();
    }//GEN-LAST:event_botonAgregarElemetoActionPerformed

    private void botonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarActionPerformed
        quitarComponentes();
        agregarLabelGuiaUnionPA();

        if (texfieldAgregar.size() > 1) {
            botonAgregarElemeto.setText("AGREGAR P(A" + Integer.toString(texfieldAgregar.size() + 1) + ")");
            botonQuitar.setText("ELIMINAR P(A" + Integer.toString(texfieldAgregar.size()) + ")");
        } else {
            botonAgregarElemeto.setText("AGREGAR P(A2)");
            botonQuitar.setText("ELIMINAR");
        }
    }//GEN-LAST:event_botonQuitarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            labelRespuesta.setText(Double.toString(operacionTeorema12()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar sus datos \nPor favor vuelva a intentar\n" + e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        while (indice != 0) {
            quitarComponentes();
            agregarLabelGuiaUnionPA();

        }
        indiceLbInfo = "";
        botonAgregarElemeto.setText("AGREGAR P(A2)");
        botonQuitar.setText("ELIMINAR");
        texfieldAgregar.get(0).setText("");

        labelRespuesta.setText("---");
    }//GEN-LAST:event_jButton4ActionPerformed
    int xx;
    int xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY(); // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    void agregarTexfiel() {
        indice++;
        JTextField txt = new JTextField();
        agregarInformacion();
        JLabel lbl = new JLabel(indiceLbInfo);
        //este codigo me permite cambiar el tipo de letra, negrita o simple y tama??o de letra
        lbl.setFont(new Font("Times New Roman", Font.BOLD, 36));
        //con esto estoy centrando el texto dentro de mi textfiel
        txt.setHorizontalAlignment(JTextField.CENTER);
        txt.setFont(new Font("Tahoma", Font.BOLD, 30));
        panelAgregar.add(lbl);
        panelAgregar.add(txt);
        texfieldAgregar.add(txt);
        labelAgregar.add(lbl);
        indiceLbInfo = "";
        panelAgregar.updateUI();
        //quitar al terminar 
        /* System.out.println("boton agragar");
        System.out.println("tama??o del arrayLyst: texfeil " + texfieldAgregar.size());
        System.out.println("tama label es " + labelAgregar.size());
        System.out.println("el valor del indice es: " + indice);
        System.out.println("-------------\n");*/

    }

//funcion para agregar guia de informacion a los labeles 
    void agregarInformacion() {
        String subindices = "";
        if (texfieldAgregar.size() != 0 && texfieldAgregar.size() <= 1) {
            indiceLbInfo = " P(A" + Integer.toString(texfieldAgregar.size() + 1);
            indiceLbInfo += "|A1)";
        } else if (indice > 1) {
            indiceLbInfo = " P(A" + Integer.toString(indice + 1) + " | ";
            for (int i = 0; i < texfieldAgregar.size(); i++) {
                if (i == 0) {
                    subindices += "A" + Integer.toString(i + 1);
                } else {
                    subindices += " ??? A" + Integer.toString(i + 1);
                }
            }
            indiceLbInfo += subindices + ")";

        }
    }

    void quitarComponentes() {

        //con esta instruccion elimino el componente dentro de nuestro progama en tiempo de ejecucion
        //primero digo que me elimine del panel el labol que se localiza en el arrayList segun el indice que le pase
        if (indice >= 1) {
            panelAgregar.remove(texfieldAgregar.get(indice));
            texfieldAgregar.remove(indice);
            indice--;
            panelAgregar.remove(labelAgregar.get(indice));
            labelAgregar.remove(indice);
            panelAgregar.updateUI();
            /*System.out.println("Boton eliminar");
            System.out.println("tama??o del texfiel:  " + texfieldAgregar.size());
            System.out.println("tama??o del label:  " + labelAgregar.size());
            System.out.println("tama del indice " + indice);
            System.out.println("-------------------------\n");*/

            if (indice == 0) {
                labelAgregar.clear();
                panelAgregar.updateUI();
                indice = 0;
                /*System.out.println("tama??o del texfiel:  " + texfieldAgregar.size());
                System.out.println("tama??o del label:  " + labelAgregar.size());
                System.out.println("tama del inice " + indice);*/

            }

        }

    }

    double operacionTeorema12() {
        double total = 1;
        for (int i = 0; i < texfieldAgregar.size(); i++) {
            total *= Double.parseDouble(texfieldAgregar.get(i).getText());
        }
        return total;
    }

    void agregarLabelGuiaUnionPA() {
        String inicio = "P(A1";

        for (int i = 0; i < indice; i++) {
            inicio += " ??? PA" + (i + 2);

        }

        labelMostrarUnionPA.setText(inicio + ")");

    }

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
            java.util.logging.Logger.getLogger(Teorema_12_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema_12_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema_12_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema_12_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema_12_Dep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarElemeto;
    private javax.swing.JButton botonQuitar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelMostrarUnionPA;
    private javax.swing.JLabel labelRespuesta;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JTextField textfielUno;
    // End of variables declaration//GEN-END:variables
}
