/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pacote.visao;

/**
 *
 * @author lies
 */
public class MenuInicial extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MenuInicial() {
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

        painelLogo = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        painelBotoes = new javax.swing.JPanel();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadastroCliente = new javax.swing.JMenuItem();
        menuCadastroMedicos = new javax.swing.JMenuItem();
        menuCadastroProdutos = new javax.swing.JMenuItem();
        menuVisualizar = new javax.swing.JMenu();
        menuVisualizarCliente = new javax.swing.JMenuItem();
        menuVisualizarMedico = new javax.swing.JMenuItem();
        menuVisualizarProduto = new javax.swing.JMenuItem();
        menuAlterar = new javax.swing.JMenu();
        menuAlterarCliente = new javax.swing.JMenuItem();
        menuAlterarMedico = new javax.swing.JMenuItem();
        menuAlterarProduto = new javax.swing.JMenuItem();
        menuExcluir = new javax.swing.JMenu();
        menuExcluirCliente = new javax.swing.JMenuItem();
        menuExcluirMedico = new javax.swing.JMenuItem();
        menuExcluirProduto = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmácias 1.0");

        painelLogo.setBackground(new java.awt.Color(255, 255, 255));
        painelLogo.setName(""); // NOI18N

        labelLogo.setBackground(new java.awt.Color(255, 255, 255));
        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/img/logo.png"))); // NOI18N

        painelBotoes.setBackground(new java.awt.Color(0, 117, 145));

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        painelTitulo.setBackground(new java.awt.Color(0, 117, 145));

        labelTitulo.setBackground(new java.awt.Color(153, 153, 153));
        labelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Farmácias 1.0");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelLogoLayout = new javax.swing.GroupLayout(painelLogo);
        painelLogo.setLayout(painelLogoLayout);
        painelLogoLayout.setHorizontalGroup(
            painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(painelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelLogoLayout.setVerticalGroup(
            painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLogoLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuCadastro.setText("Cadastro");

        menuCadastroCliente.setText("Clientes");
        menuCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroCliente);

        menuCadastroMedicos.setText("Médicos");
        menuCadastroMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroMedicosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroMedicos);

        menuCadastroProdutos.setText("Produtos");
        menuCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroProdutosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroProdutos);

        jMenuBar1.add(menuCadastro);

        menuVisualizar.setText("Visualizar");

        menuVisualizarCliente.setText("Clientes");
        menuVisualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVisualizarClienteActionPerformed(evt);
            }
        });
        menuVisualizar.add(menuVisualizarCliente);

        menuVisualizarMedico.setText("Médicos");
        menuVisualizarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVisualizarMedicoActionPerformed(evt);
            }
        });
        menuVisualizar.add(menuVisualizarMedico);

        menuVisualizarProduto.setText("Produtos");
        menuVisualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVisualizarProdutoActionPerformed(evt);
            }
        });
        menuVisualizar.add(menuVisualizarProduto);

        jMenuBar1.add(menuVisualizar);

        menuAlterar.setText("Alterar");

        menuAlterarCliente.setText("Clientes");
        menuAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarClienteActionPerformed(evt);
            }
        });
        menuAlterar.add(menuAlterarCliente);

        menuAlterarMedico.setText("Médicos");
        menuAlterarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarMedicoActionPerformed(evt);
            }
        });
        menuAlterar.add(menuAlterarMedico);

        menuAlterarProduto.setText("Produtos");
        menuAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarProdutoActionPerformed(evt);
            }
        });
        menuAlterar.add(menuAlterarProduto);

        jMenuBar1.add(menuAlterar);

        menuExcluir.setText("Excluir");

        menuExcluirCliente.setText("Clientes");
        menuExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirClienteActionPerformed(evt);
            }
        });
        menuExcluir.add(menuExcluirCliente);

        menuExcluirMedico.setText("Médicos");
        menuExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirMedicoActionPerformed(evt);
            }
        });
        menuExcluir.add(menuExcluirMedico);

        menuExcluirProduto.setText("Produtos");
        menuExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirProdutoActionPerformed(evt);
            }
        });
        menuExcluir.add(menuExcluirProduto);

        jMenuBar1.add(menuExcluir);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuSair.add(menuItemSair);

        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroClienteActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CadastroClientes().setVisible(true);
    }//GEN-LAST:event_menuCadastroClienteActionPerformed

    private void menuCadastroMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroMedicosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CadastroMedicos().setVisible(true);
    }//GEN-LAST:event_menuCadastroMedicosActionPerformed

    private void menuCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroProdutosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CadastroProdutos().setVisible(true);
    }//GEN-LAST:event_menuCadastroProdutosActionPerformed

    private void menuVisualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVisualizarClienteActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new VisualizarCliente().setVisible(true);
    }//GEN-LAST:event_menuVisualizarClienteActionPerformed

    private void menuVisualizarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVisualizarMedicoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new VisualizarMedico().setVisible(true);
    }//GEN-LAST:event_menuVisualizarMedicoActionPerformed

    private void menuVisualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVisualizarProdutoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new VisualizarProduto().setVisible(true);
    }//GEN-LAST:event_menuVisualizarProdutoActionPerformed

    private void menuAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarClienteActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AlterarCliente().setVisible(true);
    }//GEN-LAST:event_menuAlterarClienteActionPerformed

    private void menuAlterarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarMedicoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AlterarMedico().setVisible(true);
    }//GEN-LAST:event_menuAlterarMedicoActionPerformed

    private void menuAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarProdutoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AlterarProduto().setVisible(true);
    }//GEN-LAST:event_menuAlterarProdutoActionPerformed

    private void menuExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirClienteActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ExcluirCliente().setVisible(true);
    }//GEN-LAST:event_menuExcluirClienteActionPerformed

    private void menuExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirMedicoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ExcluirMedico().setVisible(true);
    }//GEN-LAST:event_menuExcluirMedicoActionPerformed

    private void menuExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirProdutoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ExcluirProduto().setVisible(true);
    }//GEN-LAST:event_menuExcluirProdutoActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menuItemSairActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JMenu menuAlterar;
    private javax.swing.JMenuItem menuAlterarCliente;
    private javax.swing.JMenuItem menuAlterarMedico;
    private javax.swing.JMenuItem menuAlterarProduto;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCadastroCliente;
    private javax.swing.JMenuItem menuCadastroMedicos;
    private javax.swing.JMenuItem menuCadastroProdutos;
    private javax.swing.JMenu menuExcluir;
    private javax.swing.JMenuItem menuExcluirCliente;
    private javax.swing.JMenuItem menuExcluirMedico;
    private javax.swing.JMenuItem menuExcluirProduto;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuVisualizar;
    private javax.swing.JMenuItem menuVisualizarCliente;
    private javax.swing.JMenuItem menuVisualizarMedico;
    private javax.swing.JMenuItem menuVisualizarProduto;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelLogo;
    private javax.swing.JPanel painelTitulo;
    // End of variables declaration//GEN-END:variables
}