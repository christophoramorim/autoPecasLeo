package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Produto;
import DAO.ProdutoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewProduto extends javax.swing.JInternalFrame {
    ArrayList<Produto> listaModelProdutos = new ArrayList<>();
    String salvarAlterar;
    Produto produto; 
    ProdutoDAO produtoDAO; 
    
    public ViewProduto() {
        produtoDAO = new ProdutoDAO();
        initComponents();
        this.setVisible(true);
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
        this.carregarProdutos();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        lb_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        lb_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lb_endereco = new javax.swing.JLabel();
        txt_Modelo = new javax.swing.JTextField();
        txt_Marca = new javax.swing.JTextField();
        lb_bairro = new javax.swing.JLabel();
        lb_cidade = new javax.swing.JLabel();
        txt_Validade = new javax.swing.JTextField();
        lb_uf = new javax.swing.JLabel();
        lb_cep = new javax.swing.JLabel();
        lb_telefone = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produto = new javax.swing.JTable();
        bt_salvar = new javax.swing.JButton();
        lb_cpf = new javax.swing.JLabel();
        txt_Ano = new javax.swing.JFormattedTextField();
        txt_Qtd = new javax.swing.JTextField();
        txt_PrecoCompra = new javax.swing.JTextField();
        txt_Roi = new javax.swing.JComboBox();
        lb_cidade1 = new javax.swing.JLabel();
        txt_Descricao = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();
        btn_Novo = new javax.swing.JButton();
        btn_Alterar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        txt_precoVenda = new javax.swing.JTextField();
        lb_cep1 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        lb_cidade2 = new javax.swing.JLabel();
        btn_buscarPorId = new javax.swing.JButton();

        setClosable(true);

        lb_codigo.setText("Codigo:");

        txt_codigo.setEnabled(false);

        lb_nome.setText("Nome:");

        txt_nome.setEnabled(false);
        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        lb_endereco.setText("Modelo:");

        txt_Modelo.setEnabled(false);

        txt_Marca.setEnabled(false);

        lb_bairro.setText("Marca:");

        lb_cidade.setText("Validade:");

        txt_Validade.setEnabled(false);

        lb_uf.setText("Qtd:");

        lb_cep.setText("Preço de Compra:");

        lb_telefone.setText("Roi:");

        tb_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do Produto", "Marca", "Validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_produtoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_produto);

        bt_salvar.setText("Salvar");
        bt_salvar.setEnabled(false);
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });

        lb_cpf.setText("Ano:");

        txt_Ano.setEnabled(false);

        txt_Qtd.setEnabled(false);

        txt_PrecoCompra.setEnabled(false);

        txt_Roi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "150%", "100%", "75%" }));
        txt_Roi.setEnabled(false);
        txt_Roi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RoiActionPerformed(evt);
            }
        });

        lb_cidade1.setText("Descrição");

        txt_Descricao.setEnabled(false);

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.setEnabled(false);
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Novo.setText("Novo");
        btn_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NovoActionPerformed(evt);
            }
        });

        btn_Alterar.setText("Alterar");
        btn_Alterar.setEnabled(false);
        btn_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarActionPerformed(evt);
            }
        });

        btn_Excluir.setText("Excluir");
        btn_Excluir.setEnabled(false);
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        txt_precoVenda.setEnabled(false);

        lb_cep1.setText("Preço de Venda:");

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

        lb_cidade2.setText("Filtrar por nome:");

        btn_buscarPorId.setText("Buscar por código do produto");
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_cep)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_PrecoCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_cep1)
                            .addComponent(txt_precoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_cpf)
                            .addComponent(txt_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Validade, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_cidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_uf)
                            .addComponent(txt_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_telefone)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_Roi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Descricao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_codigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_nome)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txt_nome)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_endereco, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Marca)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_bairro)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn_Cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_salvar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscarPorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_cidade1)
                                    .addComponent(lb_cidade2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_codigo)
                    .addComponent(lb_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_endereco)
                            .addComponent(lb_bairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_uf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_cpf)
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_cidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Validade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_telefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Roi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(lb_cep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_PrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_cep1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_precoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cidade1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(txt_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lb_cidade2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarPorId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salvar)
                    .addComponent(btn_Cancelar)
                    .addComponent(btn_Novo)
                    .addComponent(btn_Alterar)
                    .addComponent(btn_Excluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        //Verifica se os campos obrigatorios estão preenchidos
        if(txt_nome.getText().isEmpty() || txt_Marca.getText().isEmpty() || txt_Qtd.getText().isEmpty() || txt_PrecoCompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            txt_nome.requestFocus();
        }
        else
        {
            //Pegando todos os dados dos botões
            produto = new Produto();
            
            int id = 0;
            if (txt_codigo.getText() != null && !txt_codigo.getText().trim().isEmpty()) {
                try {
                    id = Integer.parseInt(txt_codigo.getText().trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "O campo de código deve ser numérico.");
                }
            }
            
            produto.setId(id);
            produto.setNome(this.txt_nome.getText());
            produto.setDescricao(this.txt_Descricao.getText());
            produto.setAno_faixa(this.txt_Ano.getText());
            produto.setModelo_carro(this.txt_Modelo.getText());
            produto.setMarca(this.txt_Marca.getText());
            produto.setQuantidade(Integer.parseInt(this.txt_Qtd.getText()));
            produto.setValidade(this.txt_Validade.getText());
            double precoCompra = Double.parseDouble(this.txt_PrecoCompra.getText());
            produto.setPreco_compra(precoCompra);
            String roiData =  this.txt_Roi.getSelectedItem().toString();
            
            if(roiData.equals("150%"))
            {
                produto.setPreco_venda((precoCompra*1.5)+precoCompra);
            }else if (roiData.equals("100%"))
            {
                produto.setPreco_venda(precoCompra+precoCompra);
            }else if (roiData.equals("75%"))
            {
                produto.setPreco_venda((precoCompra*0.75)+precoCompra);
            }

            //identificando qual operação que irá realizar no banco de dados
            if (salvarAlterar.equals("salvar")) {
                try {
                    produtoDAO.Salvar(produto);
                }catch(SQLException e){
                    Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, e);
                    JOptionPane.showMessageDialog(null, "ERRO: " + e);
                }

                JOptionPane.showMessageDialog(null, "Gravado com sucesso");
                carregarProdutos();
                this.limparCampos();
                this.desabilitaHabilitaCampos(false);
                preparaSalvarCancelar();
                
            } else {
                try {
                    produtoDAO.Editar(produto);
                }catch(SQLException e){
                   Logger.getLogger(ViewProduto.class.getName()).log(Level.SEVERE, null, e);
                   JOptionPane.showMessageDialog(null, "ERRO: " + e);
                }
                JOptionPane.showMessageDialog(null, "Alterado com sucesso");
                carregarProdutos();
                this.limparCampos();
                this.desabilitaHabilitaCampos(false);
                preparaSalvarCancelar();
            }
        }
    }//GEN-LAST:event_bt_salvarActionPerformed

    private void tb_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_produtoMouseClicked
        int linha = tb_produto.getSelectedRow();
        int id = (int) tb_produto.getValueAt(linha, 0);
        salvarAlterar = "alterar";
       
        produto = new Produto();        

        try {
            produto = produtoDAO.BuscarProdutoPorId(String.valueOf(id));
        } catch (Exception e) {
            Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, e);
        }

        // Preenche os campos com os dados do produto
        txt_codigo.setText(String.valueOf(produto.getId()));
        txt_nome.setText(produto.getNome());
        txt_Descricao.setText(produto.getDescricao());
        txt_Ano.setText(produto.getAno_faixa());
        txt_Modelo.setText(produto.getModelo_carro());
        txt_Marca.setText(produto.getMarca());
        txt_Qtd.setText(String.valueOf(produto.getQuantidade()));
        txt_Validade.setText(produto.getValidade());
        txt_PrecoCompra.setText(String.valueOf(produto.getPreco_compra()));
        txt_precoVenda.setText(String.valueOf(produto.getPreco_venda()));
        txt_Roi.setSelectedItem(produto.getQuantidade());
        preparaSelecaoTabela();
    }//GEN-LAST:event_tb_produtoMouseClicked

    private void txt_RoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RoiActionPerformed

    }//GEN-LAST:event_txt_RoiActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        this.desabilitaHabilitaCampos(false);
        preparaSalvarCancelar();
        this.limparCampos();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovoActionPerformed
        this.desabilitaHabilitaCampos(true);
        this.limparCampos();
        preparaNovo();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_btn_NovoActionPerformed

    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
        this.desabilitaHabilitaCampos(true);
        preparaAlterar();
    }//GEN-LAST:event_btn_AlterarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        int linha = tb_produto.getSelectedRow();
        int id = (int) tb_produto.getValueAt(linha, 0);
        
        if(txt_codigo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Selecione um produto");
        }
        else
        {
            produto = new Produto();
            produto.setId(Integer.parseInt(txt_codigo.getText()));
            int confirm = JOptionPane.showConfirmDialog(null, "Deseja excluir: " + txt_nome.getText());
            if (confirm == 0)
            {
               try {
                produtoDAO.Deletar(produto);
            } catch (SQLException e) {
                Logger.getLogger(ViewProduto.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "Validação de dados!", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
            limparCampos();
            carregarProdutos();
            this.desabilitaHabilitaCampos(false);
            preparaExcluir();
            }            
        }
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        String filtro = txt_filtro.getText();      
        
        if (filtro.isEmpty()) {
            carregarProdutos("");
        } else {
            carregarProdutos(filtro);
        }
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void txt_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroActionPerformed

    private void btn_buscarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarPorIdActionPerformed
        limparCampos();
        String id = JOptionPane.showInputDialog(this, "Digite o código do produto:");
        if (id == null || id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deve informar um código válido!", "Validação de dados!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (!id.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "O código deve conter apenas números!", "Validação de dados!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            produto = produtoDAO.BuscarProdutoPorId(id);
            if (produto == null || produto.getId() == 0) {
                JOptionPane.showMessageDialog(this, "Código de produto não encontrado!", "Validação de dados!", JOptionPane.ERROR_MESSAGE);
            } else {
                // Preenche os campos com os dados do produto encontrado
                txt_codigo.setText(String.valueOf(produto.getId()));
                txt_nome.setText(produto.getNome());
                txt_Descricao.setText(produto.getDescricao());
                txt_Ano.setText(produto.getAno_faixa());
                txt_Modelo.setText(produto.getModelo_carro());
                txt_Marca.setText(produto.getMarca());
                txt_Qtd.setText(String.valueOf(produto.getQuantidade()));
                txt_Validade.setText(produto.getValidade());
                txt_PrecoCompra.setText(String.valueOf(produto.getPreco_compra()));
                txt_precoVenda.setText(String.valueOf(produto.getPreco_venda()));
                txt_Roi.setSelectedItem(produto.getQuantidade());
            }
        } catch (Exception e) {
            Logger.getLogger(ViewProduto.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Erro ao buscar produto: " + e.getMessage(), "Validação de dados!", JOptionPane.ERROR_MESSAGE);
        }

        preparaSelecaoTabela(); 
    }//GEN-LAST:event_btn_buscarPorIdActionPerformed


    private void limparCampos() {
        txt_codigo.setText("");
        txt_nome.setText("");
        txt_Descricao.setText("");
        txt_Ano.setText("");
        txt_Modelo.setText("");
        txt_Marca.setText("");
        txt_Qtd.setText("");
        txt_PrecoCompra.setText("");
        txt_precoVenda.setText("");
        txt_Validade.setText("");
    }
    
    private void desabilitaHabilitaCampos(boolean condicao) {
        txt_nome.setEnabled(condicao);
        txt_nome.setEnabled(condicao);
        txt_Descricao.setEnabled(condicao);
        txt_Ano.setEnabled(condicao);
        txt_Modelo.setEnabled(condicao);
        txt_Marca.setEnabled(condicao);
        txt_Qtd.setEnabled(condicao);
        txt_Validade.setEnabled(condicao);
        txt_PrecoCompra.setEnabled(condicao);
        //txt_precoVenda.setEnabled(condicao);
        txt_Roi.setEnabled(condicao);
        bt_salvar.setEnabled(condicao);
        btn_Excluir.setEnabled(condicao);
        btn_Alterar.setEnabled(condicao);
        btn_Cancelar.setEnabled(condicao);
    }
    
    public void preparaNovo(){
        btn_Novo.setEnabled(false);
        bt_salvar.setEnabled(true);
        btn_Cancelar.setEnabled(true);
        btn_Excluir.setEnabled(false);
        btn_Alterar.setEnabled(false);
        tb_produto.setEnabled(false);
        tb_produto.clearSelection();
    }
    
    public void preparaSalvarCancelar(){
        btn_Novo.setEnabled(true);
        bt_salvar.setEnabled(false);
        btn_Cancelar.setEnabled(false);
        tb_produto.setEnabled(true);
    }
    
    public void preparaSelecaoTabela(){
        btn_Novo.setEnabled(true);
        btn_Excluir.setEnabled(true);
        btn_Alterar.setEnabled(true);
    }
    
     public void preparaAlterar(){
        btn_Novo.setEnabled(false);
        btn_Excluir.setEnabled(false);
        btn_Alterar.setEnabled(false);
        bt_salvar.setEnabled(true);
        btn_Cancelar.setEnabled(true);
        tb_produto.setEnabled(false);
        tb_produto.clearSelection();
    }
     
     public void preparaExcluir(){
        btn_Excluir.setEnabled(false);
        btn_Alterar.setEnabled(false);
    }
    
    public void carregarProdutos() {
        try {
            listaModelProdutos = produtoDAO.listarTodosProdutos();
            DefaultTableModel modelo = (DefaultTableModel) tb_produto.getModel();
            modelo.setNumRows(0);           

            for (Produto produto : listaModelProdutos) {
                modelo.addRow(new Object[]{
                    produto.getId(),
                    produto.getNome(),
                    produto.getMarca(),
                    produto.getValidade(),
                    produto.getAno_faixa(),
                    produto.getModelo_carro(),
                    produto.getQuantidade(),
                    produto.getPreco_compra(),
                    produto.getPreco_venda()
                });            
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar produtos: " + e.getMessage());
        }
    }
    
    public void carregarProdutos(String filtro) {
    try {
        ArrayList<Produto> listaProdutos;

        if (filtro.isEmpty()) {
            // Chama o método que retorna todos os produtos
            listaProdutos = produtoDAO.listarTodosProdutos();
        } else {
            // Chama o método de busca com filtro
            listaProdutos = produtoDAO.buscarProduto(filtro);
        }

        DefaultTableModel modelo = (DefaultTableModel) tb_produto.getModel();
        modelo.setNumRows(0); // Limpa a tabela

        // Preenche a tabela com os dados da lista
        for (Produto produto : listaProdutos) {
            modelo.addRow(new Object[]{
                produto.getId(),
                produto.getNome(),
                produto.getMarca(),
                produto.getValidade(),
                produto.getAno_faixa(),
                produto.getModelo_carro(),
                produto.getQuantidade(),
                produto.getPreco_compra(),
                produto.getPreco_venda()
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar produtos: " + e.getMessage());
    }
}

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JButton btn_buscarPorId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lb_bairro;
    private javax.swing.JLabel lb_cep;
    private javax.swing.JLabel lb_cep1;
    private javax.swing.JLabel lb_cidade;
    private javax.swing.JLabel lb_cidade1;
    private javax.swing.JLabel lb_cidade2;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_endereco;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_telefone;
    private javax.swing.JLabel lb_uf;
    private javax.swing.JTable tb_produto;
    private javax.swing.JFormattedTextField txt_Ano;
    private javax.swing.JTextField txt_Descricao;
    private javax.swing.JTextField txt_Marca;
    private javax.swing.JTextField txt_Modelo;
    private javax.swing.JTextField txt_PrecoCompra;
    private javax.swing.JTextField txt_Qtd;
    private javax.swing.JComboBox txt_Roi;
    private javax.swing.JTextField txt_Validade;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_precoVenda;
    // End of variables declaration//GEN-END:variables
}
