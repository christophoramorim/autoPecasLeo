package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Cliente;
import DAO.ClienteDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewCliente extends javax.swing.JInternalFrame {
    ArrayList<Cliente> listaModelClientes = new ArrayList<>();
    
    String salvarAlterar;
    
    Cliente cliente;
    ClienteDAO clienteDAO;    
    
    public ViewCliente() {
        clienteDAO = new ClienteDAO();
        initComponents();
        this.setVisible(true);
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
        this.carregarClientes();
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
        lb_endereco = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        txt_bairro = new javax.swing.JTextField();
        lb_bairro = new javax.swing.JLabel();
        lb_cidade = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        cbb_uf = new javax.swing.JComboBox();
        lb_uf = new javax.swing.JLabel();
        lb_cep = new javax.swing.JLabel();
        lb_telefone = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_cliente = new javax.swing.JTable();
        bt_cancelar = new javax.swing.JButton();
        bt_novo = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        txt_cep = new javax.swing.JFormattedTextField();
        lb_cpf = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JFormattedTextField();
        txt_telefone = new javax.swing.JFormattedTextField();

        setClosable(true);

        lb_codigo.setText("Codigo:");

        txt_codigo.setEnabled(false);

        lb_nome.setText("Nome:");

        txt_nome.setEnabled(false);

        lb_endereco.setText("Endereço:");

        txt_endereco.setEnabled(false);

        txt_bairro.setEnabled(false);

        lb_bairro.setText("Bairro:");

        lb_cidade.setText("Cidade:");

        txt_cidade.setEnabled(false);

        cbb_uf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MS", "MT", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbb_uf.setEnabled(false);

        lb_uf.setText("UF:");

        lb_cep.setText("CEP:");

        lb_telefone.setText("Telefone:");

        tb_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do Cliente", "CPF", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_cliente);

        bt_cancelar.setText("Cancelar");
        bt_cancelar.setEnabled(false);
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });

        bt_novo.setText("Novo");
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        bt_salvar.setText("Salvar");
        bt_salvar.setEnabled(false);
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });

        bt_alterar.setText("Alterar");
        bt_alterar.setEnabled(false);
        bt_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarActionPerformed(evt);
            }
        });

        bt_excluir.setText("Excluir");
        bt_excluir.setEnabled(false);
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        try {
            txt_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cep.setEnabled(false);

        lb_cpf.setText("CPF:");

        try {
            txt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cpf.setEnabled(false);

        try {
            txt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_telefone.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_codigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nome)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_cpf)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_cpf)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_endereco, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_bairro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_bairro)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_cidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_uf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_cep)
                            .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_telefone)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_telefone)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_salvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_codigo)
                            .addComponent(lb_nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_cpf)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_endereco)
                    .addComponent(lb_bairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cidade)
                    .addComponent(lb_uf)
                    .addComponent(lb_cep)
                    .addComponent(lb_telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_novo)
                    .addComponent(bt_alterar)
                    .addComponent(bt_excluir)
                    .addComponent(bt_cancelar)
                    .addComponent(bt_salvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        this.desabilitaHabilitaCampos(false);
        preparaSalvarCancelar();
        this.limparCampos();
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        this.desabilitaHabilitaCampos(true);
        this.limparCampos();
        salvarAlterar = "salvar";
        preparaNovo();
    }//GEN-LAST:event_bt_novoActionPerformed

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        //Verifica se os campos obrigatorios estão preenchidos
        if(txt_nome.getText().isEmpty() || txt_cpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            txt_nome.requestFocus();
        }
        else
        {
            //Pegando todos os dados dos botões
            cliente = new Cliente();
            
            int id = 0;
            if (txt_codigo.getText() != null && !txt_codigo.getText().trim().isEmpty()) {
                try {
                    id = Integer.parseInt(txt_codigo.getText().trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "O campo de código deve ser numérico.");
                }
            }
            
            cliente.setIdCliente(id);
            cliente.setCliNome(this.txt_nome.getText());
            cliente.setCliCpf(this.txt_cpf.getText());
            cliente.setCliEndereco(this.txt_endereco.getText());
            cliente.setCliBairro(this.txt_bairro.getText());
            cliente.setCliCidade(this.txt_cidade.getText());
            cliente.setCliUf(this.cbb_uf.getSelectedItem().toString());
            cliente.setCliCep(this.txt_cep.getText());
            cliente.setCliTelefone(this.txt_telefone.getText());

            //identificando qual operação que irá realizar no banco de dados
            if (salvarAlterar.equals("salvar")) {
                try {
                    clienteDAO.Salvar(cliente);
                }catch(SQLException e){
                    Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, e);
                    JOptionPane.showMessageDialog(null, "ERRO: " + e);
                }

                JOptionPane.showMessageDialog(null, "Gravado com sucesso");
                carregarClientes();
                this.limparCampos();
                this.desabilitaHabilitaCampos(false);
                preparaSalvarCancelar();
                
            } else {
                try {
                    clienteDAO.Editar(cliente);
                }catch(SQLException e){
                   Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, e);
                   JOptionPane.showMessageDialog(null, "ERRO: " + e);
                }
                JOptionPane.showMessageDialog(null, "Alterado com sucesso");
                carregarClientes();
                this.limparCampos();
                this.desabilitaHabilitaCampos(false);
                preparaSalvarCancelar();
            }
        }
    }//GEN-LAST:event_bt_salvarActionPerformed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed
        this.desabilitaHabilitaCampos(true);
        preparaAlterar();
    }//GEN-LAST:event_bt_alterarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        int linha = tb_cliente.getSelectedRow();
        int codigoCliente = (int) tb_cliente.getValueAt(linha, 0);
        
        if(txt_codigo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Selecione um cliente");
        }
        else
        {
            cliente = new Cliente();
            cliente.setIdCliente(Integer.parseInt(txt_codigo.getText()));
            int confirm = JOptionPane.showConfirmDialog(null, "Deseja excluir: " + txt_nome.getText());
            if (confirm == 0)
            {
               try {
                clienteDAO.Deletar(cliente);
            } catch (SQLException e) {
                Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "ERRO: " + e);
            }
            JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
            limparCampos();
            carregarClientes();
            this.desabilitaHabilitaCampos(false);
            preparaExcluir();
            }            
        }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void tb_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clienteMouseClicked
        int linha = tb_cliente.getSelectedRow();
        int codigoCliente = (int) tb_cliente.getValueAt(linha, 0);
        salvarAlterar = "alterar";
       
        cliente = new Cliente();        

        try {
            cliente = clienteDAO.BuscarClientePorId(String.valueOf(codigoCliente));
        } catch (Exception e) {
            Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, e);
        }

        // Preenche os campos com os dados do cliente
        txt_codigo.setText(String.valueOf(cliente.getIdCliente()));
        txt_nome.setText(cliente.getCliNome());
        txt_cpf.setText(cliente.getCliCpf());
        txt_endereco.setText(cliente.getCliEndereco());
        txt_bairro.setText(cliente.getCliBairro());
        txt_cidade.setText(cliente.getCliCidade());
        cbb_uf.setSelectedItem(cliente.getCliUf());
        txt_cep.setText(cliente.getCliCep());
        txt_telefone.setText(cliente.getCliTelefone());
        preparaSelecaoTabela();
    }//GEN-LAST:event_tb_clienteMouseClicked

    private void desabilitaHabilitaCampos(boolean condicao) {
        txt_nome.setEnabled(condicao);
        txt_endereco.setEnabled(condicao);
        txt_bairro.setEnabled(condicao);
        txt_cidade.setEnabled(condicao);
        cbb_uf.setEnabled(condicao);
        txt_cep.setEnabled(condicao);
        txt_cpf.setEnabled(condicao);
        txt_telefone.setEnabled(condicao);
        bt_salvar.setEnabled(condicao);
        bt_excluir.setEnabled(condicao);
        bt_alterar.setEnabled(condicao);
        bt_cancelar.setEnabled(condicao);
    }
    
    private void limparCampos() {
        txt_codigo.setText("");
        txt_nome.setText("");
        txt_cpf.setText("");
        txt_endereco.setText("");
        txt_bairro.setText("");
        txt_cidade.setText("");
        txt_cep.setText("");
        txt_telefone.setText("");
    }

    
    public void preparaNovo(){
        bt_novo.setEnabled(false);
        bt_salvar.setEnabled(true);
        bt_cancelar.setEnabled(true);
        bt_excluir.setEnabled(false);
        bt_alterar.setEnabled(false);
        tb_cliente.setEnabled(false);
        tb_cliente.clearSelection();
    }
    
    public void preparaSalvarCancelar(){
        bt_novo.setEnabled(true);
        bt_salvar.setEnabled(false);
        bt_cancelar.setEnabled(false);
        tb_cliente.setEnabled(true);
    }
    
    public void preparaSelecaoTabela(){
        bt_novo.setEnabled(true);
        bt_excluir.setEnabled(true);
        bt_alterar.setEnabled(true);
    }
    
     public void preparaAlterar(){
        bt_novo.setEnabled(false);
        bt_excluir.setEnabled(false);
        bt_alterar.setEnabled(false);
        bt_salvar.setEnabled(true);
        bt_cancelar.setEnabled(true);
        tb_cliente.setEnabled(false);
        tb_cliente.clearSelection();
    }
     
     public void preparaExcluir(){
        bt_excluir.setEnabled(false);
        bt_alterar.setEnabled(false);
    }
    
    public void carregarClientes() {
        try {
            listaModelClientes = clienteDAO.listarTodosClientes();
            DefaultTableModel modelo = (DefaultTableModel) tb_cliente.getModel();
            modelo.setNumRows(0);           

            for (Cliente cliente : listaModelClientes) {
                modelo.addRow(new Object[]{
                    cliente.getIdCliente(),
                    cliente.getCliNome(),
                    cliente.getCliCpf(),
                    cliente.getCliTelefone()
                });            
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar clientes: " + e.getMessage());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JComboBox cbb_uf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_bairro;
    private javax.swing.JLabel lb_cep;
    private javax.swing.JLabel lb_cidade;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_endereco;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_telefone;
    private javax.swing.JLabel lb_uf;
    private javax.swing.JTable tb_cliente;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JFormattedTextField txt_cep;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JFormattedTextField txt_cpf;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}
