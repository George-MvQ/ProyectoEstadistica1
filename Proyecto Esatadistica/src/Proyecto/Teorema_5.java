/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author George Vasquez
 */
public class Teorema_5 extends javax.swing.JFrame {

    private List<JTextField> texfieldAgregar;
    private List<JLabel> labelAgregar;
    int indice;
    String guardarDatos = "";
    int xx;
    int xy;
    //varaibles para la imagen 
    ImageIcon imagen;
    Icon icono;

    /**
     * Creates new form Teorema_5
     */
    public Teorema_5() {
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        initComponents();
        jPanel1.setBackground(new Color(245, 232, 199));
        jPanel2.setBackground(new Color(245, 232, 199));
        jPanel3.setBackground(new Color(111, 76, 91,190));
        panelAgregar.setBackground(new Color(245, 232, 199));
        setLocationRelativeTo(null);
        this.ajusteImagenLbl(labelImagen1, "src/Imagenes/01.png");
        this.ajusteImagenLbl(labelImagen2, "src/Imagenes/02.png");
        
        texfieldAgregar = new ArrayList<>();
        labelAgregar = new ArrayList<>();
        indice = 0;
        texfieldAgregar.add(textfielUno);
        textfielUno.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                agreagAlabel(evt);
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        botonMenu1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonQuitar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelAgregar = new javax.swing.JPanel();
        textfielUno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textFieldNumerador = new javax.swing.JTextField();
        labelSumatoria = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelTamNr = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelRespuesta = new javax.swing.JLabel();
        botonMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        labelPruebas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        labelNumerador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelImagen1 = new javax.swing.JLabel();
        labelImagen2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseDragged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        jPanel1.setLayout(null);

        botonMenu1.setBackground(new java.awt.Color(204, 0, 51));
        botonMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonMenu1.setText("MENU");
        botonMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenu1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonMenu1);
        botonMenu1.setBounds(320, 410, 101, 40);

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel10.setText("TEOREMA 5");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(250, 10, 220, 60);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("El número de formas de partir un conjunto de n objetos en r celdas con n1 elementos en la");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 60, 750, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("primera celda, n2 elementos en la segunda, y así sucesivamente , es");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 90, 590, 22);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jLabel13.setText(")");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(190, 170, 40, 130);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jLabel14.setText("(");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 170, 40, 130);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 204));
        jLabel15.setText("n1, n2,...,nr");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(50, 250, 150, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setText("=");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(240, 220, 30, 50);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 204));
        jLabel17.setText("n1! n2!...nr!'");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(290, 260, 160, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setText("n");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(110, 200, 20, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("__________");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(290, 220, 150, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("n!");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(360, 210, 30, 30);

        jLabel21.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 51));
        jLabel21.setText("Fórmula");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(10, 150, 110, 40);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("donde  n1 + n2...+nr = n");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(20, 340, 320, 40);

        jTabbedPane1.addTab("CONCEPTO Y FORMULA", jPanel1);

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(null);

        botonQuitar.setBackground(new java.awt.Color(158, 119, 119));
        botonQuitar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonQuitar.setText("QUITAR");
        botonQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarActionPerformed(evt);
            }
        });
        jPanel2.add(botonQuitar);
        botonQuitar.setBounds(610, 230, 130, 60);

        botonAgregar.setBackground(new java.awt.Color(158, 119, 119));
        botonAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonAgregar.setText("AGREGAR");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(botonAgregar);
        botonAgregar.setBounds(610, 310, 130, 60);

        botonCalcular.setBackground(new java.awt.Color(158, 119, 119));
        botonCalcular.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonCalcular.setText("CALCULAR");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });
        jPanel2.add(botonCalcular);
        botonCalcular.setBounds(610, 390, 130, 60);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel1.setText("TOTAL:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 320, 240, 60);

        jButton4.setBackground(new java.awt.Color(158, 119, 119));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("LIMPIAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(150, 390, 130, 60);

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelAgregar.setLayout(new javax.swing.BoxLayout(panelAgregar, javax.swing.BoxLayout.LINE_AXIS));

        textfielUno.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        textfielUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelAgregar.add(textfielUno);

        jScrollPane1.setViewportView(panelAgregar);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(60, 70, 200, 50);

        jLabel3.setFont(new java.awt.Font("YouYuan", 0, 120)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("(");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 10, 60, 150);

        jLabel4.setFont(new java.awt.Font("YouYuan", 0, 120)); // NOI18N
        jLabel4.setText("=");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(320, -10, 70, 170);

        jLabel5.setFont(new java.awt.Font("YouYuan", 0, 120)); // NOI18N
        jLabel5.setText(")");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(260, 0, 70, 150);

        textFieldNumerador.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        textFieldNumerador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldNumerador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldNumeradorKeyReleased(evt);
            }
        });
        jPanel2.add(textFieldNumerador);
        textFieldNumerador.setBounds(60, 10, 200, 50);

        labelSumatoria.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        labelSumatoria.setText("---");
        jPanel2.add(labelSumatoria);
        labelSumatoria.setBounds(410, 160, 320, 70);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 90)); // NOI18N
        jLabel6.setText("∑");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(280, 140, 80, 105);

        labelTamNr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTamNr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(labelTamNr);
        labelTamNr.setBounds(280, 130, 70, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(290, 240, 50, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        jLabel7.setText("n");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(350, 170, 60, 60);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel9.setText("r");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(380, 200, 34, 30);

        labelRespuesta.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        labelRespuesta.setText("---");
        jPanel2.add(labelRespuesta);
        labelRespuesta.setBounds(260, 320, 340, 50);

        botonMenu.setBackground(new java.awt.Color(158, 119, 119));
        botonMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonMenu.setText("MENU");
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });
        jPanel2.add(botonMenu);
        botonMenu.setBounds(10, 390, 130, 60);

        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        labelPruebas.setBackground(new java.awt.Color(245, 232, 199));
        labelPruebas.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        labelPruebas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPruebas.setText("--------!");
        labelPruebas.setOpaque(true);
        jScrollPane2.setViewportView(labelPruebas);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(450, 70, 260, 50);

        jScrollPane3.setBorder(null);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        labelNumerador.setBackground(new java.awt.Color(245, 232, 199));
        labelNumerador.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        labelNumerador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumerador.setText("--------!");
        labelNumerador.setOpaque(true);
        jScrollPane3.setViewportView(labelNumerador);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(450, 0, 260, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("________________________");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(440, 40, 280, 30);
        jPanel2.add(labelImagen1);
        labelImagen1.setBounds(-20, 110, 240, 200);
        jPanel2.add(labelImagen2);
        labelImagen2.setBounds(250, 330, 350, 130);

        jTabbedPane1.addTab("CALCULADORA TEOREMA 5", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarActionPerformed

        quitarComponentes();
        labelCadena();
        System.out.println(guardarDatos);

    }//GEN-LAST:event_botonQuitarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

        JTextField txt = new JTextField();
        JLabel lbl = new JLabel(",");
        //este codigo me permite cambiar el tipo de letra, negrita o simple y tamaño de letra
        lbl.setFont(new Font("Tahoma", Font.BOLD, 25));
        //con esto estoy centrando el texto dentro de mi textfiel
        txt.setHorizontalAlignment(JTextField.CENTER);
        txt.setFont(new Font("Tahoma", Font.BOLD, 25));
        txt.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                agreagAlabel(evt);
            }
        });
        panelAgregar.add(lbl);
        panelAgregar.add(txt);
        texfieldAgregar.add(txt);
        labelAgregar.add(lbl);
        indice++;

        panelAgregar.updateUI();


    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        try {
            comprobacionSumatoria();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos\nPor favor vuelva a intentar\n" + e);
        }
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        labelRespuesta.setText("--------");
        textFieldNumerador.setText("");
        labelTamNr.setText("");
        jLabel8.setText("");
        labelSumatoria.setText("---");
        labelNumerador.setText("--------!");

        while (indice != 0) {
            quitarComponentes();
        }
        labelPruebas.setText("--------!");
        texfieldAgregar.get(0).setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        botonCalcular.requestFocus();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void textFieldNumeradorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNumeradorKeyReleased

        String captura = "";
        captura = textFieldNumerador.getText() + "!";
        labelNumerador.setText(captura);
    }//GEN-LAST:event_textFieldNumeradorKeyReleased

    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        regresarAlMenu();
    }//GEN-LAST:event_botonMenuActionPerformed


    private void botonMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenu1ActionPerformed
        regresarAlMenu();
    }//GEN-LAST:event_botonMenu1ActionPerformed

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void jTabbedPane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jTabbedPane1MouseDragged

    //mis funciones 
    void quitarComponentes() {
// labelAgregar.clear();
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
            System.out.println("tamaño del texfiel:  " + texfieldAgregar.size());
            System.out.println("tamaño del label:  " + labelAgregar.size());
            System.out.println("tama del indice " + indice);
            System.out.println("-------------------------\n");*/

            if (indice == 0) {
                labelAgregar.clear();
                panelAgregar.updateUI();
                indice = 0;
                /*System.out.println("tamaño del texfiel:  " + texfieldAgregar.size());
                System.out.println("tamaño del label:  " + labelAgregar.size());
                System.out.println("tama del inice " + indice);*/

            }

        }

    }

    ///con este metodo agreago todo lo que encuentre los texfiel a los labels
    private void agreagAlabel(java.awt.event.FocusEvent evt) {
//String dts="";

        labelCadena();

        // guardarDatos = "";
    }

    double operacionTeorema4() {

        Funcion fc = new Funcion();
        double numerador = fc.factorial(Integer.parseInt(textFieldNumerador.getText().replaceAll("\\s+", "")));
        double denominador = 1;
        for (int i = 0; i < texfieldAgregar.size(); i++) {

            denominador *= fc.factorial(Integer.parseInt((texfieldAgregar.get(i).getText().replaceAll("\\s+", ""))));
        }

        return numerador / denominador;
    }

    double sumatoriaR() {
        double sumatoria = 0;
        for (int i = 0; i < texfieldAgregar.size(); i++) {

            sumatoria += Integer.parseInt((texfieldAgregar.get(i).getText().replaceAll("\\s+", "")));
        }
        return sumatoria;
    }

    void comprobacionSumatoria() {

        int conjuntoNobjetos = Integer.parseInt(textFieldNumerador.getText());

        labelTamNr.setText(Integer.toString(texfieldAgregar.size()));

        if (sumatoriaR() == conjuntoNobjetos) {
            labelSumatoria.setText("= n");
            labelRespuesta.setText(Double.toString(operacionTeorema4()));
            jLabel8.setText("r = 1");
        } else {
            labelSumatoria.setText("≠ n");
            jLabel8.setText("r = 1");
            JOptionPane.showMessageDialog(null, "la operecion no podra se realizada por la regla del teorema 5\nProbablemente necesite usar el teorema 4");

        }

    }

    //agreagaralabel
    void labelCadena() {

        guardarDatos = "";
        for (int i = 0; i < texfieldAgregar.size(); i++) {
            guardarDatos += texfieldAgregar.get(i).getText() + "!  ";
            labelPruebas.setText(guardarDatos);
        }
        guardarDatos = "";

    }

    void regresarAlMenu() {
        Menu regresarMenu = new Menu();
        regresarMenu.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Teorema_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema_5().setVisible(true);
            }
        });
    }

    
    //metodo para imagen
   void ajusteImagenLbl (JLabel lbl,String ubicacion){
   this.imagen=new ImageIcon(ubicacion);
   this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
   lbl.setIcon(this.icono);
   this.repaint();
   }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonMenu;
    private javax.swing.JButton botonMenu1;
    private javax.swing.JButton botonQuitar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelImagen1;
    private javax.swing.JLabel labelImagen2;
    private javax.swing.JLabel labelNumerador;
    private javax.swing.JLabel labelPruebas;
    private javax.swing.JLabel labelRespuesta;
    private javax.swing.JLabel labelSumatoria;
    private javax.swing.JLabel labelTamNr;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JTextField textFieldNumerador;
    private javax.swing.JTextField textfielUno;
    // End of variables declaration//GEN-END:variables
}
