package vista;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaJuego extends javax.swing.JFrame {

    JLabel casilleros[] = new JLabel[9];
    String jugadorUno;
    String jugadorDos;
    String turno = "X";
    
    int cont1 = 0, cont2 = 0;
    int partidaGanada[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {1, 4, 7},
        {2, 5, 8},
        {3, 6, 9},
        {1, 5, 9},
        {3, 5, 7}};

    public VentanaJuego(String jugadorUno, String jugadorDos) {
        initComponents();
        this.jugadorUno = jugadorUno;
        this.jugadorDos = jugadorDos;
        lblJugadorUno.setText(jugadorUno + "(X):");
        lblJugadorDos.setText(jugadorDos + "(O):");
        indicarTurno();
        casilleros[0] = casilla1;
        casilleros[1] = casilla2;
        casilleros[2] = casilla3;
        casilleros[3] = casilla4;
        casilleros[4] = casilla5;
        casilleros[5] = casilla6;
        casilleros[6] = casilla7;
        casilleros[7] = casilla8;
        casilleros[8] = casilla9;
    }

    private void presionar(int casillero) {
        if (casilleros[casillero - 1].getText().equals("")) {
            casilleros[casillero - 1].setText(turno);
            cambiarTurno();
            obtenerGanador();
        }

    }
    private void indicarTurno(){
        lblTurno.setText("Turno de " +turno);
    }

    private void cambiarTurno() {
        if (turno.equals("O")) {
            turno = "X";

        } else {
            turno = "O";
        }
        indicarTurno();
    }

    private void obtenerGanador() {
        for (int i = 0; i < partidaGanada.length; i++) {
            if (casilleros[partidaGanada[i][0] - 1].getText().equalsIgnoreCase("x")
                    && (casilleros[partidaGanada[i][1] - 1].getText().equalsIgnoreCase("x")
                    && (casilleros[partidaGanada[i][2] - 1].getText().equalsIgnoreCase("x")))) {
                JOptionPane.showMessageDialog(null, "Ha ganado el jugador " + jugadorUno, "Victoria", JOptionPane.INFORMATION_MESSAGE);
                cont1++;
                lblJugadorUno.setText(jugadorUno + "(X):" + " " + String.valueOf(cont1));
                reiniciarJuego();
            }
            if (casilleros[partidaGanada[i][0] - 1].getText().equalsIgnoreCase("o")
                    && (casilleros[partidaGanada[i][1] - 1].getText().equalsIgnoreCase("o")
                    && (casilleros[partidaGanada[i][2] - 1].getText().equalsIgnoreCase("o")))) {
                JOptionPane.showMessageDialog(null, "Ha ganado el jugador " + jugadorDos, "Victoria", JOptionPane.INFORMATION_MESSAGE);
                cont2++;
                lblJugadorDos.setText(jugadorDos + "(O):" + " " + String.valueOf(cont2));
                reiniciarJuego();
            }

        }
    }

    private void reiniciarJuego() {
        for (int i = 0; i < casilleros.length; i++) {
            casilleros[i].setText("");

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        casilla3 = new javax.swing.JLabel();
        casilla1 = new javax.swing.JLabel();
        casilla2 = new javax.swing.JLabel();
        casilla4 = new javax.swing.JLabel();
        casilla5 = new javax.swing.JLabel();
        casilla6 = new javax.swing.JLabel();
        casilla7 = new javax.swing.JLabel();
        casilla8 = new javax.swing.JLabel();
        casilla9 = new javax.swing.JLabel();
        lblJugadorUno = new javax.swing.JLabel();
        lblJugadorDos = new javax.swing.JLabel();
        lblPuntosUno = new javax.swing.JLabel();
        lblPuntosDos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casilla3.setBackground(new java.awt.Color(255, 255, 255));
        casilla3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        casilla3.setForeground(new java.awt.Color(0, 0, 0));
        casilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla3.setOpaque(true);
        casilla3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casilla3MousePressed(evt);
            }
        });
        jPanel2.add(casilla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 70, 70));

        casilla1.setBackground(new java.awt.Color(255, 255, 255));
        casilla1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        casilla1.setForeground(new java.awt.Color(0, 0, 0));
        casilla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla1.setOpaque(true);
        casilla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casilla1MousePressed(evt);
            }
        });
        jPanel2.add(casilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        casilla2.setBackground(new java.awt.Color(255, 255, 255));
        casilla2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        casilla2.setForeground(new java.awt.Color(0, 0, 0));
        casilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla2.setOpaque(true);
        casilla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casilla2MousePressed(evt);
            }
        });
        jPanel2.add(casilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 70));

        casilla4.setBackground(new java.awt.Color(255, 255, 255));
        casilla4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        casilla4.setForeground(new java.awt.Color(0, 0, 0));
        casilla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla4.setOpaque(true);
        casilla4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casilla4MousePressed(evt);
            }
        });
        jPanel2.add(casilla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 70, 70));

        casilla5.setBackground(new java.awt.Color(255, 255, 255));
        casilla5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        casilla5.setForeground(new java.awt.Color(0, 0, 0));
        casilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla5.setOpaque(true);
        casilla5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casilla5MousePressed(evt);
            }
        });
        jPanel2.add(casilla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 70, 70));

        casilla6.setBackground(new java.awt.Color(255, 255, 255));
        casilla6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        casilla6.setForeground(new java.awt.Color(0, 0, 0));
        casilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla6.setOpaque(true);
        casilla6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casilla6MousePressed(evt);
            }
        });
        jPanel2.add(casilla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 70, 70));

        casilla7.setBackground(new java.awt.Color(255, 255, 255));
        casilla7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        casilla7.setForeground(new java.awt.Color(0, 0, 0));
        casilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla7.setOpaque(true);
        casilla7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casilla7MousePressed(evt);
            }
        });
        jPanel2.add(casilla7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 70, 70));

        casilla8.setBackground(new java.awt.Color(255, 255, 255));
        casilla8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        casilla8.setForeground(new java.awt.Color(0, 0, 0));
        casilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla8.setOpaque(true);
        casilla8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casilla8MousePressed(evt);
            }
        });
        jPanel2.add(casilla8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 70, 70));

        casilla9.setBackground(new java.awt.Color(255, 255, 255));
        casilla9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        casilla9.setForeground(new java.awt.Color(0, 0, 0));
        casilla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla9.setOpaque(true);
        casilla9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casilla9MousePressed(evt);
            }
        });
        jPanel2.add(casilla9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 70, 70));

        lblJugadorUno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblJugadorUno.setForeground(new java.awt.Color(0, 0, 0));

        lblJugadorDos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblJugadorDos.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setText("Reiniciar tablero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Developed by Franco");

        lblTurno.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(0, 0, 0));
        lblTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJugadorDos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(lblPuntosDos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblJugadorUno, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPuntosUno, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jButton1)
                    .addGap(128, 128, 128))
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(lblTurno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblJugadorUno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPuntosUno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblJugadorDos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPuntosDos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casilla1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla1MousePressed
        presionar(1);
    }//GEN-LAST:event_casilla1MousePressed

    private void casilla2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla2MousePressed
        presionar(2);
    }//GEN-LAST:event_casilla2MousePressed

    private void casilla3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla3MousePressed
        presionar(3);
    }//GEN-LAST:event_casilla3MousePressed

    private void casilla4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla4MousePressed
        presionar(4);
    }//GEN-LAST:event_casilla4MousePressed

    private void casilla5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla5MousePressed
        presionar(5);
    }//GEN-LAST:event_casilla5MousePressed

    private void casilla6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla6MousePressed
        presionar(6);
    }//GEN-LAST:event_casilla6MousePressed

    private void casilla7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla7MousePressed
        presionar(7);
    }//GEN-LAST:event_casilla7MousePressed

    private void casilla8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla8MousePressed
        presionar(8);
    }//GEN-LAST:event_casilla8MousePressed

    private void casilla9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casilla9MousePressed
        presionar(9);
    }//GEN-LAST:event_casilla9MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reiniciarJuego();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel casilla1;
    private javax.swing.JLabel casilla2;
    private javax.swing.JLabel casilla3;
    private javax.swing.JLabel casilla4;
    private javax.swing.JLabel casilla5;
    private javax.swing.JLabel casilla6;
    private javax.swing.JLabel casilla7;
    private javax.swing.JLabel casilla8;
    private javax.swing.JLabel casilla9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblJugadorDos;
    private javax.swing.JLabel lblJugadorUno;
    private javax.swing.JLabel lblPuntosDos;
    private javax.swing.JLabel lblPuntosUno;
    private javax.swing.JLabel lblTurno;
    // End of variables declaration//GEN-END:variables
}
