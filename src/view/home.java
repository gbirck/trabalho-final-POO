package view;

import view.CadastroEstagiario;
//import view.Restaurante;
import view.CadastroFuncionario;

import view.Parte2;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnParte1 = new javax.swing.JMenu();
        mnFunc = new javax.swing.JMenu();
        mnFuncCad = new javax.swing.JMenuItem();
        mnEst = new javax.swing.JMenu();
        mnEstCad = new javax.swing.JMenuItem();
        mnParte2 = new javax.swing.JMenu();
        Evento = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cazona");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Daily Event");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cazona.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        mnParte1.setText("Parte 1");

        mnFunc.setText("Funcionário");

        mnFuncCad.setText("Cadastro");
        mnFuncCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFuncCadActionPerformed(evt);
            }
        });
        mnFunc.add(mnFuncCad);

        mnParte1.add(mnFunc);

        mnEst.setText("Estagiário");

        mnEstCad.setText("Cadastro");
        mnEstCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEstCadActionPerformed(evt);
            }
        });
        mnEst.add(mnEstCad);

        mnParte1.add(mnEst);

        jMenuBar1.add(mnParte1);

        mnParte2.setText("Parte 2");
        mnParte2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnParte2MenuSelected(evt);
            }
        });

        Evento.setText("Eventos");
        Evento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoActionPerformed(evt);
            }
        });
        mnParte2.add(Evento);

        jMenuBar1.add(mnParte2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnFuncCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFuncCadActionPerformed
        CadastroFuncionario tela = new CadastroFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_mnFuncCadActionPerformed

    private void mnEstCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEstCadActionPerformed
        CadastroEstagiario tela = new CadastroEstagiario();
        tela.setVisible(true);
    }//GEN-LAST:event_mnEstCadActionPerformed

    private void mnParte2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnParte2MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_mnParte2MenuSelected

    private void EventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoActionPerformed
        Parte2 tela = new Parte2();
        tela.setVisible(true);
    }//GEN-LAST:event_EventoActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Evento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnEst;
    private javax.swing.JMenuItem mnEstCad;
    private javax.swing.JMenu mnFunc;
    private javax.swing.JMenuItem mnFuncCad;
    private javax.swing.JMenu mnParte1;
    private javax.swing.JMenu mnParte2;
    // End of variables declaration//GEN-END:variables
}
