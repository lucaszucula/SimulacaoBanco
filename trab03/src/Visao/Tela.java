
package Visao;
import Controlo.Banco;
import static Controlo.Banco.contaBancarias;
import Modelo.ContaBancaria;
import Modelo.ContaCorrente;
import Modelo.ContaPoupanca;
import javax.swing.JOptionPane;


/**
 *
 * @author Lucas
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    Banco banco = new Banco();
    
    public static int valor;
    public static String tipo;
    
    public Tela() {
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

        nrConta = new javax.swing.JLabel();
        tfNumeroConta = new javax.swing.JTextField();
        lbSaldo = new javax.swing.JLabel();
        tfSaldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbTipoConta = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jbSalvar = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();
        tfPesquisa = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nrConta.setText("Numero Da Conta");

        lbSaldo.setText("Saldo");

        jLabel3.setText("Tipo De Conta");

        cbTipoConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conta Corrente", "Conta poupanca", "I" }));

        Tabela.setModel(banco);
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbRemover.setText("Remover");
        jbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverActionPerformed(evt);
            }
        });

        tfPesquisa.setText("Escreva o numero da conta");

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar a Tabela");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nrConta, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tfNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(cbTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jbSalvar)
                .addGap(45, 45, 45)
                .addComponent(jbRemover)
                .addGap(37, 37, 37)
                .addComponent(jbActualizar)
                .addGap(61, 61, 61)
                .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nrConta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbTipoConta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbRemover)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar)
                    .addComponent(jbActualizar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

        Salvar();
        this.LimparCampus();

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        // TODO add your handling code here:
       Menu m = new Menu();
        try{
        if (this.tfPesquisa.getText().isEmpty() || this.tfPesquisa.getText().equals("Escreva o numero da conta")) {
            JOptionPane.showMessageDialog(null, "Ouve um erro, Por favor seleccione uma lina ou uma coluna na tabela abaixo, ou insira o numero da conta ao lado do botao pesquisar!!!", "ATENÃ‡ÃƒO", JOptionPane.ERROR_MESSAGE);

        } else {
            banco.Pesquisa(Integer.parseInt(tfPesquisa.getText()));
            if (banco.Pesquisa(Integer.parseInt(tfPesquisa.getText())).equals(null)) {
                  return;
            } else {
               valor =   banco.Pesquisa(Integer.parseInt(tfPesquisa.getText())).getNumeroDaConta();
               tipo = banco.Pesquisa(Integer.parseInt(tfPesquisa.getText())).getTipoDeConta();
                new Menu().setVisible(true);
               
            }

        }
        }catch(Exception erro){
                      JOptionPane.showMessageDialog(null, "Ouve um erro, Numero da conta inexistente !!!", "ATENÃ‡ÃƒO OUVE UM ERRO", JOptionPane.ERROR_MESSAGE);    

        }
        this.LimparCampus();
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        ContaBancaria b = banco.getValet(this.Tabela.getSelectedRow());

        this.tfNumeroConta.setText(String.valueOf(b.getNumeroDaConta()));
        this.tfSaldo.setText(String.valueOf(b.getSaldo()));
        this.tfPesquisa.setText(String.valueOf(b.getNumeroDaConta()));

    }//GEN-LAST:event_TabelaMouseClicked

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        this.Remover();
        this.LimparCampus();

    }//GEN-LAST:event_jbRemoverActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
           banco.Actuaalizar();
           this.LimparCampus();
    }//GEN-LAST:event_jbActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });

    }
    public void LimparCampus(){
        this.tfNumeroConta.setText("");
        this.tfSaldo.setText("");
    }
    public void Remover() {
        
        if (this.tfPesquisa.getText().isEmpty() || this.tfPesquisa.getText().equals("Escreva o numero da conta")) {
            JOptionPane.showMessageDialog(null, "Ouve um erro, Por favor seleccione uma lina ou uma coluna na tabela abaixo, ou insira o numero da conta ao lado do botao pesquisar!!!", "ATENÃ‡ÃƒO", JOptionPane.ERROR_MESSAGE);
        } else {
       banco.Remover(banco.Pesquisa(Integer.parseInt(tfPesquisa.getText())));
        }

    }

    public void Salvar() {
        int index = this.cbTipoConta.getSelectedIndex();
        switch (index) {
            case 0:

              //  ContaCorrente corente = new ContaCorrente(Integer.parseInt(this.tfNumeroConta.getText()), Double.parseDouble(this.tfSaldo.getText()), "Conta Corrente");
                banco.Inserir(corrente);
                //banco.verificar();
               // this.tfNumeroConta.setText(String.valueOf(banco.sentinela));
                break;
            case 1:
                ContaPoupanca contaPoupanca = new ContaPoupanca(Integer.parseInt(this.tfNumeroConta.getText()), Double.parseDouble(this.tfSaldo.getText()), "Conta Poupanca") {};
                banco.Inserir(contaPoupanca);
               // this.tfNumeroConta.setText(String.valueOf(banco.sentinela));
                break;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JComboBox<String> cbTipoConta;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbRemover;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel nrConta;
    private javax.swing.JTextField tfNumeroConta;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JTextField tfSaldo;
    // End of variables declaration//GEN-END:variables
}