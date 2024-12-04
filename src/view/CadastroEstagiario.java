/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import models.entities.Estagiario;
import models.dao.EstagiarioDAO;
/**
 *
 * @author fezar
 */
public class CadastroEstagiario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroEstagiario
     */
    public CadastroEstagiario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelImg = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoVisualizar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        PanelImg.setBackground(new java.awt.Color(255, 255, 255));
        PanelImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnClose.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnClose.setText("X");
        btnClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoVisualizar.setText("Visualizar");
        botaoVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarActionPerformed(evt);
            }
        });

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Estagiário");

        javax.swing.GroupLayout PanelImgLayout = new javax.swing.GroupLayout(PanelImg);
        PanelImg.setLayout(PanelImgLayout);
        PanelImgLayout.setHorizontalGroup(
            PanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImgLayout.createSequentialGroup()
                .addGroup(PanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelImgLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelImgLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(PanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PanelImgLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelImgLayout.setVerticalGroup(
            PanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelImgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        String nome = JOptionPane.showInputDialog("Nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        String endereco = JOptionPane.showInputDialog("Endereço:");
        char sexo = JOptionPane.showInputDialog("Sexo (M/F):").charAt(0);
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura:"));
        String telefone = JOptionPane.showInputDialog("Telefone:");
        int registro = Integer.parseInt(JOptionPane.showInputDialog("Registro:"));
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Salário:"));
        float bolsa = Float.parseFloat(JOptionPane.showInputDialog("Bolsa:"));
        int horasServico = Integer.parseInt(JOptionPane.showInputDialog("Horas de Serviço:"));

        // Verificação dos valores capturados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura: " + altura);
        System.out.println("Telefone: " + telefone);
        System.out.println("Registro: " + registro);
        System.out.println("Salário: " + salario);
        System.out.println("Bolsa: (1 = SIM   0 = NÃO)" + bolsa);
        System.out.println("Horas de Servico: " + horasServico);

        Estagiario estagiario = new Estagiario(nome, idade, endereco, sexo, altura, telefone, registro, salario, bolsa, horasServico);
        EstagiarioDAO.create(estagiario);

        JOptionPane.showMessageDialog(this, "Estagiário cadastrado com sucesso!");
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarActionPerformed
    String nome = JOptionPane.showInputDialog("Informe o nome do estagiário a visualizar:");
    Estagiario estagiario = EstagiarioDAO.view(nome);

    if (estagiario != null) {
        // Criar um JPanel para exibir as informações
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2)); // Layout para organizar os campos em duas colunas

        // Adicionar JLabels e JTextFields para cada informação do estagiário
        panel.add(new JLabel("Nome:"));
        panel.add(new JLabel(estagiario.getNome()));

        panel.add(new JLabel("Idade:"));
        panel.add(new JLabel(String.valueOf(estagiario.getIdade())));

        panel.add(new JLabel("Endereço:"));
        panel.add(new JLabel(estagiario.getEndereco()));

        panel.add(new JLabel("Sexo:"));
        panel.add(new JLabel(String.valueOf(estagiario.getSexo())));

        panel.add(new JLabel("Altura:"));
        panel.add(new JLabel(String.valueOf(estagiario.getAltura())));

        panel.add(new JLabel("Telefone:"));
        panel.add(new JLabel(estagiario.getTelefone()));

        panel.add(new JLabel("Registro:"));
        panel.add(new JLabel(String.valueOf(estagiario.getRegistro())));

        panel.add(new JLabel("Salário:"));
        panel.add(new JLabel(String.valueOf(estagiario.getSalario())));

        panel.add(new JLabel("Bolsa:"));
        panel.add(new JLabel(String.valueOf(estagiario.getBolsa())));

        panel.add(new JLabel("Horas de Serviço:"));
        panel.add(new JLabel(String.valueOf(estagiario.getHorasServico())));

        // Mostrar o JOptionPane com o JPanel personalizado
        JOptionPane.showMessageDialog(this, panel, "Cadastro de Estagiário", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Estagiário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_botaoVisualizarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        String nome = JOptionPane.showInputDialog("Informe o nome do cadastro a excluir:");
        EstagiarioDAO.delete(nome);
        JOptionPane.showMessageDialog(this, "Cadastro excluído com sucesso!");
    }//GEN-LAST:event_botaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroEstagiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEstagiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEstagiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEstagiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEstagiario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelImg;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoVisualizar;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
