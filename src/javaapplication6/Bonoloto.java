/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author ddizoya
 */
public class Bonoloto extends javax.swing.JFrame {

    int trigger;
    int aciertos;
    Random r = new Random();
    ArrayList impresion = new ArrayList();
    ArrayList<Integer> aleatorio = new ArrayList<>();
    ArrayList<Integer> respUsuario = new ArrayList<>();

    public Bonoloto() {
        initComponents();
        setTitle("Bonoloto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void respUsuario(int num) {
        respUsuario.add(num);
        if (trigger < 6) {
            trigger++;
        }
    }

    public void random() {
        for (int i = 0; i < 6; i++) {
            int y = r.nextInt(49) + 1;
            for (int x = 0; x < 6; i++) {
                if (aleatorio.indexOf(x) == y) {
                    i--;
                } else {
                    aleatorio.add(y);
                }
            }
        }
    }

    public void comparacion() {
        for (int i = 0; i < aleatorio.size(); i++) {
            int a = aleatorio.get(i);
            int b = respUsuario.get(i);
            if (a == b) {
                aciertos++;
            }
        }
    }

    public void impresion() {
        jLabel7.setText(String.valueOf(aleatorio.get(0)));
        jLabel8.setText(String.valueOf(aleatorio.get(1)));
        jLabel9.setText(String.valueOf(aleatorio.get(2)));
        jLabel10.setText(String.valueOf(aleatorio.get(3)));
        jLabel11.setText(String.valueOf(aleatorio.get(4)));
        jLabel12.setText(String.valueOf(aleatorio.get(5)));
    }

    public void init() {
        if (trigger == 5) {
            comparacion();
            impresion();
            jPanel2.setVisible(false);
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        panelResultados = new javax.swing.JPanel();
        labelUsuarios = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelAgraciados = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(new java.awt.GridLayout(10, 5));

        jButton1.setText("1");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText("2");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setText("3");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setText("4");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton4.setContentAreaFilled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setText("5");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton5.setContentAreaFilled(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setText("6");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton6.setContentAreaFilled(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setText("7");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton7.setContentAreaFilled(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setText("8");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton8.setContentAreaFilled(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel2.add(jButton8);

        jButton9.setText("9");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton9.setContentAreaFilled(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel2.add(jButton9);

        jButton10.setText("10");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton10.setContentAreaFilled(false);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel2.add(jButton10);

        jButton11.setText("11");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton11.setContentAreaFilled(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel2.add(jButton11);

        jButton12.setText("12");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton12.setContentAreaFilled(false);
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jPanel2.add(jButton12);

        jButton13.setText("13");
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton13.setContentAreaFilled(false);
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel2.add(jButton13);

        jButton14.setText("14");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton14.setContentAreaFilled(false);
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jPanel2.add(jButton14);

        jButton15.setText("15");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton15.setContentAreaFilled(false);
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jPanel2.add(jButton15);

        jButton16.setText("16");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton16.setContentAreaFilled(false);
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jPanel2.add(jButton16);

        jButton17.setText("17");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton17.setContentAreaFilled(false);
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });
        jPanel2.add(jButton17);

        jButton18.setText("18");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton18.setContentAreaFilled(false);
        jPanel2.add(jButton18);

        jButton19.setText("19");
        jButton19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton19.setContentAreaFilled(false);
        jPanel2.add(jButton19);

        jButton20.setText("20");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton20.setContentAreaFilled(false);
        jPanel2.add(jButton20);

        jButton21.setText("21");
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton21.setContentAreaFilled(false);
        jPanel2.add(jButton21);

        jButton22.setText("22");
        jButton22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton22.setContentAreaFilled(false);
        jPanel2.add(jButton22);

        jButton23.setText("23");
        jButton23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton23.setContentAreaFilled(false);
        jPanel2.add(jButton23);

        jButton24.setText("24");
        jButton24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton24.setContentAreaFilled(false);
        jPanel2.add(jButton24);

        jButton25.setText("25");
        jButton25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton25.setContentAreaFilled(false);
        jPanel2.add(jButton25);

        jButton26.setText("26");
        jButton26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton26.setContentAreaFilled(false);
        jPanel2.add(jButton26);

        jButton27.setText("27");
        jButton27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton27.setContentAreaFilled(false);
        jPanel2.add(jButton27);

        jButton28.setText("28");
        jButton28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton28.setContentAreaFilled(false);
        jPanel2.add(jButton28);

        jButton29.setText("29");
        jButton29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton29.setContentAreaFilled(false);
        jPanel2.add(jButton29);

        jButton30.setText("30");
        jButton30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton30.setContentAreaFilled(false);
        jPanel2.add(jButton30);

        jButton31.setText("31");
        jButton31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton31.setContentAreaFilled(false);
        jPanel2.add(jButton31);

        jButton32.setText("32");
        jButton32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton32.setContentAreaFilled(false);
        jPanel2.add(jButton32);

        jButton33.setText("33");
        jButton33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton33.setContentAreaFilled(false);
        jPanel2.add(jButton33);

        jButton34.setText("34");
        jButton34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton34.setContentAreaFilled(false);
        jPanel2.add(jButton34);

        jButton35.setText("35");
        jButton35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton35.setContentAreaFilled(false);
        jPanel2.add(jButton35);

        jButton36.setText("36");
        jButton36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton36.setContentAreaFilled(false);
        jPanel2.add(jButton36);

        jButton37.setText("37");
        jButton37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton37.setContentAreaFilled(false);
        jPanel2.add(jButton37);

        jButton38.setText("38");
        jButton38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton38.setContentAreaFilled(false);
        jPanel2.add(jButton38);

        jButton39.setText("39");
        jButton39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton39.setContentAreaFilled(false);
        jPanel2.add(jButton39);

        jButton40.setText("40");
        jButton40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton40.setContentAreaFilled(false);
        jPanel2.add(jButton40);

        jButton41.setText("41");
        jButton41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton41.setContentAreaFilled(false);
        jPanel2.add(jButton41);

        jButton42.setText("42");
        jButton42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton42.setContentAreaFilled(false);
        jPanel2.add(jButton42);

        jButton43.setText("43");
        jButton43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton43.setContentAreaFilled(false);
        jPanel2.add(jButton43);

        jButton44.setText("44");
        jButton44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton44.setContentAreaFilled(false);
        jPanel2.add(jButton44);

        jButton45.setText("45");
        jButton45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton45.setContentAreaFilled(false);
        jPanel2.add(jButton45);

        jButton46.setText("46");
        jButton46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton46.setContentAreaFilled(false);
        jPanel2.add(jButton46);

        jButton47.setText("47");
        jButton47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton47.setContentAreaFilled(false);
        jPanel2.add(jButton47);

        jButton48.setText("48");
        jButton48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton48.setContentAreaFilled(false);
        jPanel2.add(jButton48);

        jButton49.setText("49");
        jButton49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 7, 7)));
        jButton49.setContentAreaFilled(false);
        jPanel2.add(jButton49);

        panelResultados.setLayout(new javax.swing.BoxLayout(panelResultados, javax.swing.BoxLayout.Y_AXIS));

        labelUsuarios.setForeground(new java.awt.Color(240, 23, 23));
        labelUsuarios.setText("Números escogidos");
        panelResultados.add(labelUsuarios);

        jPanel4.setMaximumSize(new java.awt.Dimension(165, 26));
        jPanel4.setMinimumSize(new java.awt.Dimension(165, 26));
        jPanel4.setPreferredSize(new java.awt.Dimension(165, 26));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.X_AXIS));
        jPanel4.add(jLabel13);
        jPanel4.add(jLabel14);
        jPanel4.add(jLabel15);
        jPanel4.add(jLabel16);
        jPanel4.add(jLabel17);
        jPanel4.add(jLabel18);

        panelResultados.add(jPanel4);

        labelAgraciados.setForeground(new java.awt.Color(240, 23, 23));
        labelAgraciados.setText("Números agraciados");
        panelResultados.add(labelAgraciados);

        jPanel1.setMaximumSize(new java.awt.Dimension(165, 26));
        jPanel1.setMinimumSize(new java.awt.Dimension(165, 26));
        jPanel1.setPreferredSize(null);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.X_AXIS));

        jLabel7.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel7.setName(""); // NOI18N
        jPanel1.add(jLabel7);

        jLabel8.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel8.setName(""); // NOI18N
        jPanel1.add(jLabel8);

        jLabel9.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel9.setName(""); // NOI18N
        jPanel1.add(jLabel9);

        jLabel10.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel10.setName(""); // NOI18N
        jPanel1.add(jLabel10);

        jLabel11.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel11.setName(""); // NOI18N
        jPanel1.add(jLabel11);

        jLabel12.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel12.setName(""); // NOI18N
        jPanel1.add(jLabel12);

        panelResultados.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(panelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        respUsuario(1);
        jButton1.setEnabled(false);
        init();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        respUsuario(2);
        jButton2.setEnabled(false);
        init();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        respUsuario(3);
        jButton3.setEnabled(false);
        init();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        respUsuario(4);
        jButton4.setEnabled(false);
        init();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        respUsuario(5);
        jButton5.setEnabled(false);
        init();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        respUsuario(6);
        jButton6.setEnabled(false);
        init();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        respUsuario(7);
        jButton7.setEnabled(false);
        init();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        respUsuario(8);
        jButton8.setEnabled(false);
        init();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        respUsuario(9);
        jButton9.setEnabled(false);
        init();
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        respUsuario(10);
        jButton10.setEnabled(false);
        init();
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        respUsuario(11);
        jButton11.setEnabled(false);
        init();
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        respUsuario(12);
        jButton12.setEnabled(false);
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        respUsuario(13);
        jButton13.setEnabled(false);
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        respUsuario(14);
        jButton14.setEnabled(false);
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        respUsuario(15);
        jButton15.setEnabled(false);
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        respUsuario(16);
        jButton16.setEnabled(false);
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        respUsuario(17);
        jButton17.setEnabled(false);
    }//GEN-LAST:event_jButton17MouseClicked

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
            java.util.logging.Logger.getLogger(Bonoloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bonoloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bonoloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bonoloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bonoloto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelAgraciados;
    private javax.swing.JLabel labelUsuarios;
    private javax.swing.JPanel panelResultados;
    // End of variables declaration//GEN-END:variables
}
