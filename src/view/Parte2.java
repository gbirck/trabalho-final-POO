
package view;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import models.dao.EventoDAO;
import models.entities.Evento;

/**
 *
 * @author User
 */
public class Parte2 extends javax.swing.JFrame {

    public Parte2() {
        setUndecorated(true); 
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CadastrarEvento = new javax.swing.JButton();
        VisualizarEvento = new javax.swing.JButton();
        ExcluirEvento = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadastrarEvento.setBackground(new java.awt.Color(0, 153, 153));
        CadastrarEvento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CadastrarEvento.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarEvento.setText("Cadastrar Evento");
        CadastrarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarEventoActionPerformed(evt);
            }
        });
        jPanel1.add(CadastrarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 210, 40));

        VisualizarEvento.setBackground(new java.awt.Color(0, 153, 153));
        VisualizarEvento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VisualizarEvento.setForeground(new java.awt.Color(255, 255, 255));
        VisualizarEvento.setText("Visualizar Evento");
        VisualizarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarEventoActionPerformed(evt);
            }
        });
        jPanel1.add(VisualizarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 210, 40));

        ExcluirEvento.setBackground(new java.awt.Color(0, 153, 153));
        ExcluirEvento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExcluirEvento.setForeground(new java.awt.Color(255, 255, 255));
        ExcluirEvento.setText("Excluir Evento");
        ExcluirEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirEventoActionPerformed(evt);
            }
        });
        jPanel1.add(ExcluirEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 210, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Eventos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Evento.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        btnClose.setBackground(new java.awt.Color(255, 0, 0));
        btnClose.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 8, 35, 27));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarEventoActionPerformed
        String nome = JOptionPane.showInputDialog("Nome do Evento:");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia:"));
        int hora= Integer.parseInt(JOptionPane.showInputDialog("Horario:"));

        System.out.println("Nome: " + nome);
        System.out.println("Dia: " + dia);
        System.out.println("Horario: " + hora);

        Evento evento = new Evento(nome, dia, hora);
        EventoDAO.create(evento);

        JOptionPane.showMessageDialog(this, "Evento cadastrado com sucesso!");
    }//GEN-LAST:event_CadastrarEventoActionPerformed

    private void VisualizarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarEventoActionPerformed
        String nome = JOptionPane.showInputDialog("Informe o nome do evento a visualizar:");
        Evento evento = EventoDAO.view(nome);

        if (evento!= null) {
            // Criar um JPanel para exibir as informações
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0, 2)); // Layout para organizar os campos em duas colunas

            // Adicionar JLabels e JTextFields para cada informação do estagiário
            panel.add(new JLabel("Nome do Evento:"));
            panel.add(new JLabel(evento.getNome()));

            panel.add(new JLabel("Dia:"));
            panel.add(new JLabel(String.valueOf(evento.getDia())));

            panel.add(new JLabel("Horario:"));
            panel.add(new JLabel(String.valueOf(evento.getHora())));

            //Mostrar o JOptionPane com o JPanel personalizado
            JOptionPane.showMessageDialog(this, panel, "Cadastro de Evento", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Evento não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_VisualizarEventoActionPerformed

    private void ExcluirEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirEventoActionPerformed
       String nome = JOptionPane.showInputDialog("Informe o nome do evento a excluir:");
       EventoDAO.delete(nome);
       JOptionPane.showMessageDialog(this, "Evento excluído com sucesso!");
    }//GEN-LAST:event_ExcluirEventoActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Parte2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parte2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parte2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parte2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Parte2 tela = new Parte2();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarEvento;
    private javax.swing.JButton ExcluirEvento;
    private javax.swing.JButton VisualizarEvento;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
