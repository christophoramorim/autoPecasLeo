package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Produto;
import DAO.ProdutoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewVendaa extends javax.swing.JInternalFrame {
    ArrayList<Produto> listaModelProdutos = new ArrayList<>();
    String salvarAlterar;
    Produto produto; 
    ProdutoDAO produtoDAO; 
    
    public ViewVendaa() {
        produtoDAO = new ProdutoDAO();
        initComponents();
        this.setVisible(true);
        
        //this.carregarProdutos();
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
        dialog_cliente = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_cliente = new javax.swing.JTable();
        lb_cidade2 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        dialog_produto = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_produto = new javax.swing.JTable();
        lb_cidade3 = new javax.swing.JLabel();
        txt_filtro2 = new javax.swing.JTextField();
        btn_buscar2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_idCLiente = new javax.swing.JTextField();
        txt_vendedor = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_descricao = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_idProduto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_qte = new javax.swing.JTextField();
        txt_precoUnit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_precoTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_venda = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        dialog_cliente.setMinimumSize(new java.awt.Dimension(600, 700));

        tb_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        jScrollPane2.setViewportView(tb_cliente);

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

        btn_buscar.setText("Selecionar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                    .addComponent(lb_cidade2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_cidade2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialog_clienteLayout = new javax.swing.GroupLayout(dialog_cliente.getContentPane());
        dialog_cliente.getContentPane().setLayout(dialog_clienteLayout);
        dialog_clienteLayout.setHorizontalGroup(
            dialog_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialog_clienteLayout.setVerticalGroup(
            dialog_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        dialog_produto.setMinimumSize(new java.awt.Dimension(600, 700));

        tb_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Marca", "Validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produto.setEnabled(false);
        tb_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_produtoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_produto);

        lb_cidade3.setText("Filtrar por nome:");

        txt_filtro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtro2ActionPerformed(evt);
            }
        });
        txt_filtro2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtro2KeyReleased(evt);
            }
        });

        btn_buscar2.setText("Selecionar");
        btn_buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_filtro2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                    .addComponent(lb_cidade3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_cidade3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtro2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialog_produtoLayout = new javax.swing.GroupLayout(dialog_produto.getContentPane());
        dialog_produto.getContentPane().setLayout(dialog_produtoLayout);
        dialog_produtoLayout.setHorizontalGroup(
            dialog_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialog_produtoLayout.setVerticalGroup(
            dialog_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Vendedor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel3.setText("ID");

        txt_idCLiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idCLienteActionPerformed(evt);
            }
        });

        txt_vendedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Nome");

        txt_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_clienteActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");

        txt_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descricaoActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Produto");

        jLabel6.setText("ID");

        txt_idProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idProdutoActionPerformed(evt);
            }
        });

        jLabel7.setText("Descrição");

        jLabel8.setText("Qtde");

        txt_qte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qteActionPerformed(evt);
            }
        });

        txt_precoUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precoUnitActionPerformed(evt);
            }
        });

        jLabel9.setText("Preço Unit");

        jLabel10.setText("Preço Total");

        txt_precoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precoTotalActionPerformed(evt);
            }
        });

        tb_venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Preço Unit", "Preço Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_vendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_venda);

        jButton3.setText("Finalizar Venda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_idCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(251, 251, 251)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_precoTotal))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                            .addComponent(txt_cliente))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(jButton2))))
                                .addGap(67, 67, 67))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_qte, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_precoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                        .addGap(67, 67, 67))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_idCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_qte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_precoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_precoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idCLienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idCLienteActionPerformed

    private void txt_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_clienteActionPerformed

    private void txt_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descricaoActionPerformed

    private void txt_idProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idProdutoActionPerformed

    private void txt_qteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_qteActionPerformed

    private void txt_precoUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precoUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precoUnitActionPerformed

    private void txt_precoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precoTotalActionPerformed

    private void tb_vendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_vendaMouseClicked

    }//GEN-LAST:event_tb_vendaMouseClicked

    private void tb_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clienteMouseClicked

    }//GEN-LAST:event_tb_clienteMouseClicked

    private void txt_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroActionPerformed

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased

    }//GEN-LAST:event_txt_filtroKeyReleased

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tb_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_produtoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_produtoMouseClicked

    private void txt_filtro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtro2ActionPerformed

    private void txt_filtro2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtro2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtro2KeyReleased

    private void btn_buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscar2ActionPerformed

    
    
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
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscar2;
    private javax.swing.JDialog dialog_cliente;
    private javax.swing.JDialog dialog_produto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lb_cidade2;
    private javax.swing.JLabel lb_cidade3;
    private javax.swing.JTable tb_cliente;
    private javax.swing.JTable tb_produto;
    private javax.swing.JTable tb_venda;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_descricao;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_filtro2;
    private javax.swing.JTextField txt_idCLiente;
    private javax.swing.JTextField txt_idProduto;
    private javax.swing.JTextField txt_precoTotal;
    private javax.swing.JTextField txt_precoUnit;
    private javax.swing.JTextField txt_qte;
    private javax.swing.JComboBox txt_vendedor;
    // End of variables declaration//GEN-END:variables
}
