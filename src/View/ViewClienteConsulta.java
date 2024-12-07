package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Cliente;
import DAO.ClienteDAO;
import java.util.List;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewClienteConsulta extends javax.swing.JInternalFrame {
    ArrayList<Cliente> listaModelClientes = new ArrayList<>();
    
    String salvarAlterar;
    
    Cliente cliente;
    ClienteDAO clienteDAO;    
    
    public ViewClienteConsulta() {
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
        txt_cep = new javax.swing.JFormattedTextField();
        lb_cpf = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JFormattedTextField();
        txt_telefone = new javax.swing.JFormattedTextField();
        lb_cidade2 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        btn_buscarPorId = new javax.swing.JButton();

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
        tb_cliente.setEnabled(false);
        tb_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_cliente);

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

        lb_cidade2.setText("Filtrar por nome:");

        txt_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroActionPerformed(evt);
            }
        });
        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });

        btn_buscarPorId.setText("Buscar por código do cliente");
        btn_buscarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarPorIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
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
                        .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscarPorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_cidade2)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addComponent(lb_cidade2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarPorId))
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clienteMouseClicked
        int linha = tb_cliente.getSelectedRow();
        int codigoCliente = (int) tb_cliente.getValueAt(linha, 0);
        salvarAlterar = "alterar";
       
        cliente = new Cliente();        

        try {
            cliente = clienteDAO.BuscarClientePorId(String.valueOf(codigoCliente));
        } catch (Exception e) {
            Logger.getLogger(ViewClienteConsulta.class.getName()).log(Level.SEVERE, null, e);
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
       
    }//GEN-LAST:event_tb_clienteMouseClicked

    private void txt_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroActionPerformed

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        String filtro = txt_filtro.getText();

        if (filtro.isEmpty()) {
            carregarClientes("");
        } else {
            carregarClientes(filtro);
        }
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void btn_buscarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarPorIdActionPerformed
        limparCampos();
        String id = JOptionPane.showInputDialog(this, "Digite o código do cliente:");
        if (id == null || id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deve informar um código válido!", "Validação de dados!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!id.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "O código deve conter apenas números!", "Validação de dados!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            cliente = clienteDAO.BuscarClientePorId(id);
            if (cliente == null || cliente.getIdCliente()== 0) {
                JOptionPane.showMessageDialog(this, "Código de cliente não encontrado!", "Validação de dados!", JOptionPane.ERROR_MESSAGE);
                //limparCampos();
            } else {
                // Preenche os campos com os dados do produto encontrado
                txt_codigo.setText(String.valueOf(cliente.getIdCliente()));
                txt_nome.setText(cliente.getCliNome());
                txt_cpf.setText(cliente.getCliCpf());
                txt_endereco.setText(cliente.getCliEndereco());
                txt_bairro.setText(cliente.getCliBairro());
                txt_cidade.setText(cliente.getCliCidade());
                cbb_uf.setSelectedItem(cliente.getCliUf());
                txt_cep.setText(cliente.getCliCep());
                txt_telefone.setText(cliente.getCliTelefone());
            }
        } catch (Exception e) {
            Logger.getLogger(ViewProduto.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Erro ao buscar cliente: " + e.getMessage(), "Validação de dados!", JOptionPane.ERROR_MESSAGE);
        }

     
    }//GEN-LAST:event_btn_buscarPorIdActionPerformed

    private void desabilitaHabilitaCampos(boolean condicao) {
        txt_nome.setEnabled(condicao);
        txt_endereco.setEnabled(condicao);
        txt_bairro.setEnabled(condicao);
        txt_cidade.setEnabled(condicao);
        cbb_uf.setEnabled(condicao);
        txt_cep.setEnabled(condicao);
        txt_cpf.setEnabled(condicao);
        txt_telefone.setEnabled(condicao);
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
    
    public void carregarClientes(String filtro) {
      try {
          ArrayList<Cliente> lista;

          if (filtro.isEmpty()) {
              // Chama o método que retorna todos
              lista = clienteDAO.listarTodosClientes();
          } else {
              // Chama o método de busca com filtro
              lista = clienteDAO.buscarCliente(filtro);
          }

          DefaultTableModel modelo = (DefaultTableModel) tb_cliente.getModel();
          modelo.setNumRows(0); // Limpa a tabela

          // Preenche a tabela com os dados da lista
          for (Cliente cliente : lista) {
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
    private javax.swing.JButton btn_buscarPorId;
    private javax.swing.JComboBox cbb_uf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_bairro;
    private javax.swing.JLabel lb_cep;
    private javax.swing.JLabel lb_cidade;
    private javax.swing.JLabel lb_cidade2;
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
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}