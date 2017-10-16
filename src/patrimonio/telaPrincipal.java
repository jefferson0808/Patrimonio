/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrimonio;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author comp16
 */
public class telaPrincipal extends javax.swing.JFrame {

   
    public telaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        areadetrabalho = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        botaoarquivo = new javax.swing.JMenu();
        botaorelatorio = new javax.swing.JMenuItem();
        botaosairprincipal = new javax.swing.JMenuItem();
        botaocontrole = new javax.swing.JMenu();
        botaocadastro = new javax.swing.JMenu();
        cadastrobem = new javax.swing.JMenuItem();
        cadastroconta = new javax.swing.JMenuItem();
        cadastrolocal = new javax.swing.JMenuItem();
        cadastrosetor = new javax.swing.JMenuItem();
        botaoalteracao = new javax.swing.JMenu();
        alteracaobem = new javax.swing.JMenuItem();
        alteracaoconta = new javax.swing.JMenuItem();
        alteracaolocal = new javax.swing.JMenuItem();
        alteracaosetor = new javax.swing.JMenuItem();
        botaomovimentar = new javax.swing.JMenuItem();
        consultabem = new javax.swing.JMenuItem();
        botaobaixar = new javax.swing.JMenuItem();
        botaoexcluirbem = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout areadetrabalhoLayout = new javax.swing.GroupLayout(areadetrabalho);
        areadetrabalho.setLayout(areadetrabalhoLayout);
        areadetrabalhoLayout.setHorizontalGroup(
            areadetrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );
        areadetrabalhoLayout.setVerticalGroup(
            areadetrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Menu");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cadastro");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cadastrar Bens");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cadastrar Conta");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cadastrar Local");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cadastrar Setor");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Alterar");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Alterar Bens");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Alterar Conta");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Alterar Local");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Alterar Setor");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        botaoarquivo.setText("Arquivo");

        botaorelatorio.setText("Relatorio");
        botaoarquivo.add(botaorelatorio);

        botaosairprincipal.setText("Sair");
        botaoarquivo.add(botaosairprincipal);

        jMenuBar1.add(botaoarquivo);

        botaocontrole.setText("Controle");

        botaocadastro.setText("Cadastro");
        botaocadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocadastroActionPerformed(evt);
            }
        });

        cadastrobem.setText("Bem");
        cadastrobem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrobemMouseClicked(evt);
            }
        });
        cadastrobem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrobemActionPerformed(evt);
            }
        });
        botaocadastro.add(cadastrobem);

        cadastroconta.setText("Conta");
        botaocadastro.add(cadastroconta);

        cadastrolocal.setText("Local");
        botaocadastro.add(cadastrolocal);

        cadastrosetor.setText("Setor");
        botaocadastro.add(cadastrosetor);

        botaocontrole.add(botaocadastro);

        botaoalteracao.setText("Alteração");

        alteracaobem.setText("Bem");
        botaoalteracao.add(alteracaobem);

        alteracaoconta.setText("Conta");
        botaoalteracao.add(alteracaoconta);

        alteracaolocal.setText("Local");
        botaoalteracao.add(alteracaolocal);

        alteracaosetor.setText("Setor");
        botaoalteracao.add(alteracaosetor);

        botaocontrole.add(botaoalteracao);

        botaomovimentar.setText("Movimentar Bem");
        botaocontrole.add(botaomovimentar);

        consultabem.setText("Consulta Bem");
        botaocontrole.add(consultabem);

        botaobaixar.setText("Baixa de Bem");
        botaocontrole.add(botaobaixar);

        botaoexcluirbem.setText("Exclusão de Bem");
        botaocontrole.add(botaoexcluirbem);

        jMenuBar1.add(botaocontrole);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areadetrabalho))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areadetrabalho)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocadastroActionPerformed
    
       
    }//GEN-LAST:event_botaocadastroActionPerformed

    private void cadastrobemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrobemActionPerformed
     CadastroSetor cb = new CadastroSetor();
       
        areadetrabalho.add(cb);
        cb.setVisible(true);
    }//GEN-LAST:event_cadastrobemActionPerformed

    private void cadastrobemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrobemMouseClicked
       CadastroSetor cb = new CadastroSetor();
        cb.setVisible(true);
    }//GEN-LAST:event_cadastrobemMouseClicked

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
      DefaultMutableTreeNode test = (DefaultMutableTreeNode)
        jTree1.getSelectionPath().getLastPathComponent();
        
             if(null == test.getUserObject().toString()){}else
             
                 switch (test.getUserObject().toString()) {
            case "Cadastrar Bens":
                CadastroBem CadastroBem = new CadastroBem();
                areadetrabalho.add(CadastroBem);
                CadastroBem.setVisible(true);
                break;
            case "Cadastrar Conta":
                CadastroConta CadastroConta = new CadastroConta();
                areadetrabalho.add(CadastroConta);
                CadastroConta.setVisible(true);
                break;
            case "Cadastrar Local":
                CadastroLocal CadastroLocal = new CadastroLocal();
                areadetrabalho.add(CadastroLocal);
                CadastroLocal.setVisible(true);
                break;
            case "Cadastrar Setor":
                CadastroSetor CadastroSetor = new CadastroSetor();
                areadetrabalho.add(CadastroSetor);
                CadastroSetor.setVisible(true);
                break;
            case "Alterar Bens":
                AlterarBem AlterarBens = new AlterarBem();
                areadetrabalho.add(AlterarBens);
                AlterarBens.setVisible(true);
                break;
            case "Alterar Conta":
                AlterarConta AlterarConta = new AlterarConta();
                areadetrabalho.add(AlterarConta);
                AlterarConta.setVisible(true);
                break;
            case "Alterar Local":
                AlterarLocal AlterarLocal = new AlterarLocal();
                areadetrabalho.add(AlterarLocal);
                AlterarLocal.setVisible(true);
                break;
            case "Alterar Setor":
                AlterarSetor AlterarSetor = new AlterarSetor();
                areadetrabalho.add(AlterarSetor);
                AlterarSetor.setVisible(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jTree1MouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new telaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alteracaobem;
    private javax.swing.JMenuItem alteracaoconta;
    private javax.swing.JMenuItem alteracaolocal;
    private javax.swing.JMenuItem alteracaosetor;
    private javax.swing.JDesktopPane areadetrabalho;
    private javax.swing.JMenu botaoalteracao;
    private javax.swing.JMenu botaoarquivo;
    private javax.swing.JMenuItem botaobaixar;
    private javax.swing.JMenu botaocadastro;
    private javax.swing.JMenu botaocontrole;
    private javax.swing.JMenuItem botaoexcluirbem;
    private javax.swing.JMenuItem botaomovimentar;
    private javax.swing.JMenuItem botaorelatorio;
    private javax.swing.JMenuItem botaosairprincipal;
    private javax.swing.JMenuItem cadastrobem;
    private javax.swing.JMenuItem cadastroconta;
    private javax.swing.JMenuItem cadastrolocal;
    private javax.swing.JMenuItem cadastrosetor;
    private javax.swing.JMenuItem consultabem;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables

    void setMaximumSize(int FULLSCREEN_ENTER) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setVisible(CadastroSetor cb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
