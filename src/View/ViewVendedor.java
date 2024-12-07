package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Usuario;
import DAO.UsuarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewVendedor extends javax.swing.JInternalFrame {

    //Usuario modelUsuario = new Usuario();
    ArrayList<Usuario> listaModelUsuarios = new ArrayList<>();
    String alterarSalvar;
    
    Usuario usuario;
    UsuarioDAO usuarioDAO;
    
    public ViewVendedor() {
        usuarioDAO = new UsuarioDAO();
        initComponents();
        this.setVisible(true);
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
        this.carregarUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        lb_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lb_login = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        txt_senha = new javax.swing.JTextField();
        lb_senha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_usuario = new javax.swing.JTable();
        bt_cancelar = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();
        bt_novo = new javax.swing.JButton();
        lb_cpf = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbb_cargo = new javax.swing.JComboBox();

        setClosable(true);

        lb_codigo.setText("Código");

        txt_codigo.setEditable(false);
        txt_codigo.setEnabled(false);

        lb_nome.setText("Nome:");

        lb_login.setText("Login:");

        lb_senha.setText("Senha:");

        tb_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_usuario);

        bt_cancelar.setText("Cancelar");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });

        bt_salvar.setText("Salvar");
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });

        bt_excluir.setText("Excluir");
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        bt_alterar.setText("Alterar");
        bt_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarActionPerformed(evt);
            }
        });

        bt_novo.setText("Novo");
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        lb_cpf.setText("CPF:");

        jLabel6.setText("Cargo:");

        cbb_cargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CAIXA", "VENDEDOR", "ADM" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_login)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_codigo)
                                        .addGap(62, 62, 62)
                                        .addComponent(lb_nome))
                                    .addComponent(lb_login))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_senha)
                            .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addComponent(bt_salvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cpf)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_cpf)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(179, 179, 179))
                            .addComponent(cbb_cargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_codigo)
                    .addComponent(lb_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cpf)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_login)
                    .addComponent(lb_senha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancelar)
                    .addComponent(bt_salvar)
                    .addComponent(bt_excluir)
                    .addComponent(bt_alterar)
                    .addComponent(bt_novo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        limparCampos();
        desabilitaHabilitaCampos(false);
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        //Verifica se os campos obrigatorios estão preenchidos
        if(txt_nome.getText().isEmpty() || txt_cpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            txt_nome.requestFocus();
        }
        else
        {
            //passa todos os valor para o modelo
            usuario = new Usuario();
            
            int id = 0;
            if (txt_codigo.getText() != null && !txt_codigo.getText().trim().isEmpty()) {
                try {
                    id = Integer.parseInt(txt_codigo.getText().trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "O campo de código deve ser numérico.");
                }
            }
        
            usuario.setId(id);
            usuario.setNome(this.txt_nome.getText());
            usuario.setCpf(this.txt_cpf.getText());
            usuario.setCargo(this.cbb_cargo.getSelectedItem().toString());
            usuario.setLogin(this.txt_login.getText());
            usuario.setSenha(this.txt_senha.getText());

            if (this.alterarSalvar.equals("salvar")) {
                try {
                    //função para salvar o uuario no banco de dados
                    usuarioDAO.Salvar(usuario);
                }catch(SQLException e){
                    Logger.getLogger(ViewVendedor.class.getName()).log(Level.SEVERE, null, e);
                    JOptionPane.showMessageDialog(null, "ERRO: " + e);
                }
                    JOptionPane.showMessageDialog(null, "Gravado com sucesso");
                    carregarUsuarios();
                    this.limparCampos();
                    this.desabilitaHabilitaCampos(false);
            } else {
                try {
                    //função para alterar o usuario no banco de dados
                    usuarioDAO.Editar(usuario);
                }catch(Exception e){
                    Logger.getLogger(ViewVendedor.class.getName()).log(Level.SEVERE, null, e);
                    JOptionPane.showMessageDialog(null, "ERRO: " + e);
                }
                JOptionPane.showMessageDialog(null, "Alterado com sucesso");
                carregarUsuarios();
                this.limparCampos();
                this.desabilitaHabilitaCampos(false);
            }
        }
        
        
    }//GEN-LAST:event_bt_salvarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        //identifica o registro selecionado
        int linha = tb_usuario.getSelectedRow();
        int id = (int) tb_usuario.getValueAt(linha, 0);
        
        if(txt_codigo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Selecione um vendedor");
        }
        else
        {
            usuario = new Usuario();
            usuario.setId(Integer.parseInt(txt_codigo.getText()));
            int confirm = JOptionPane.showConfirmDialog(null, "Deseja excluir: " + txt_nome.getText());
            if (confirm == 0)
            {
               try {
                usuarioDAO.Deletar(usuario);
            } catch (SQLException e) {
                Logger.getLogger(ViewVendedor.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "ERRO: " + e);
            }
                JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
                limparCampos();
                carregarUsuarios();
                this.desabilitaHabilitaCampos(true);
            }            
        }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed
        //identifica o registro selecionado
        int linha = tb_usuario.getSelectedRow();
        int id = (int) tb_usuario.getValueAt(linha, 0);
        alterarSalvar = "alterar";
        
        usuario = new Usuario();
        
        try {
            usuario = usuarioDAO.BuscarUsuarioPorId(String.valueOf(id));
        } catch (Exception e) {
            Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, e);
        }
        
        txt_codigo.setText(String.valueOf(usuario.getId()));
        txt_nome.setText(usuario.getNome());
        txt_cpf.setText(usuario.getCpf());
        cbb_cargo.setSelectedItem(usuario.getCargo());
        txt_login.setText(usuario.getLogin());
        txt_senha.setText(usuario.getSenha());        
        desabilitaHabilitaCampos(true);
    }//GEN-LAST:event_bt_alterarActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        desabilitaHabilitaCampos(true);
        limparCampos();
        alterarSalvar = "salvar";
    }//GEN-LAST:event_bt_novoActionPerformed

    private void carregarUsuarios() {
        try{
            listaModelUsuarios = usuarioDAO.listarTodosUsuarios();
            DefaultTableModel modelo = (DefaultTableModel) tb_usuario.getModel();
            modelo.setNumRows(0);           

            for (Usuario usuario : listaModelUsuarios) {
                modelo.addRow(new Object[]{
                    usuario.getId(),
                    usuario.getNome(),
                    usuario.getCpf()
                });            
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar usuários: " + e.getMessage());
        }
    }
    
    private void limparCampos() {
        txt_codigo.setText("");
        txt_nome.setText("");
        txt_cpf.setText("");
        txt_login.setText("");
        txt_senha.setText("");
    }
    
    private void desabilitaHabilitaCampos(boolean condicao) {
        txt_codigo.setEnabled(condicao);
        txt_nome.setEnabled(condicao);
        txt_cpf.setEditable(condicao);
        cbb_cargo.setEditable(condicao);
        txt_login.setEnabled(condicao);
        txt_senha.setEnabled(condicao);
        bt_salvar.setEnabled(condicao);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JComboBox cbb_cargo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_login;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JTable tb_usuario;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_login;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_senha;
    // End of variables declaration//GEN-END:variables
}
