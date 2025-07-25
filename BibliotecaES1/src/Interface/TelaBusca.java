/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Aplicacao.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Júlia
 */
public class TelaBusca extends javax.swing.JFrame {

    /**
     * Creates new form TelaCatalogo
     */
    public TelaBusca() {
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

        TxtBuscaTitulo = new javax.swing.JTextField();
        BotaoBuscarTitulo = new javax.swing.JButton();
        TxtBuscaISBN = new javax.swing.JTextField();
        BotaoBuscarISBN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar por livro");
        setResizable(false);

        TxtBuscaTitulo.setText("Buscar por titulo");

        BotaoBuscarTitulo.setText("Buscar");
        BotaoBuscarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarTituloActionPerformed(evt);
            }
        });

        TxtBuscaISBN.setText("Buscar por ISBN");

        BotaoBuscarISBN.setText("Buscar");
        BotaoBuscarISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarISBNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtBuscaISBN)
                    .addComponent(TxtBuscaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoBuscarTitulo)
                    .addComponent(BotaoBuscarISBN))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBuscaISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoBuscarISBN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBuscaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoBuscarTitulo))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoBuscarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarTituloActionPerformed
        // TODO add your handling code here:
        ControladorBiblioteca biblioteca = new ControladorBiblioteca();
        String titulo = TxtBuscaTitulo.getText();
        Livro livro = biblioteca.BuscarLivroTitulo(titulo);
        if(livro == null){
            JOptionPane.showMessageDialog(null, "O livro não foi encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "O livro foi encontrado!");
        }
    }//GEN-LAST:event_BotaoBuscarTituloActionPerformed

    private void BotaoBuscarISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarISBNActionPerformed
        // TODO add your handling code here:
        ControladorBiblioteca biblioteca = new ControladorBiblioteca();
        String ISBN = TxtBuscaISBN.getText();
        Livro livro = biblioteca.BuscarLivroISBN(ISBN);
        if(livro == null){
            JOptionPane.showMessageDialog(null, "O livro não foi encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "O livro foi encontrado!");
        }
    }//GEN-LAST:event_BotaoBuscarISBNActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBusca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBuscarISBN;
    private javax.swing.JButton BotaoBuscarTitulo;
    private javax.swing.JTextField TxtBuscaISBN;
    private javax.swing.JTextField TxtBuscaTitulo;
    // End of variables declaration//GEN-END:variables
}
