package view;

import view.CadastroEstagiario;
//import view.Restaurante;
import view.CadastroFuncionario;

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
        panelPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnParte1 = new javax.swing.JMenu();
        mnFunc = new javax.swing.JMenu();
        mnFuncCad = new javax.swing.JMenuItem();
        mnEst = new javax.swing.JMenu();
        mnEstCad = new javax.swing.JMenuItem();
        mnParte2 = new javax.swing.JMenu();
        RestauranteMenu = new javax.swing.JMenuItem();

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

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );

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

        RestauranteMenu.setText("Eventos");
        RestauranteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestauranteMenuActionPerformed(evt);
            }
        });
        mnParte2.add(RestauranteMenu);

        jMenuBar1.add(mnParte2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void RestauranteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestauranteMenuActionPerformed
        //Restaurante tela = new Restaurante();
       // panelPrincipal.add(tela);
        //tela.setVisible(true);
    }//GEN-LAST:event_RestauranteMenuActionPerformed

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
    private javax.swing.JMenuItem RestauranteMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenu mnEst;
    private javax.swing.JMenuItem mnEstCad;
    private javax.swing.JMenu mnFunc;
    private javax.swing.JMenuItem mnFuncCad;
    private javax.swing.JMenu mnParte1;
    private javax.swing.JMenu mnParte2;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
