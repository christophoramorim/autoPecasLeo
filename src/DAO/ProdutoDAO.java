package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutoDAO {
    PreparedStatement pst;
    String sql;
    
    public void Salvar(Produto produto) throws SQLException 
    {    
        sql = "insert into produto values(?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, produto.getNome());
        pst.setString(3, produto.getDescricao());
        pst.setString(4, produto.getAno_faixa());
        pst.setString(5, produto.getModelo_carro());
        pst.setString(6, produto.getMarca());
        pst.setString(7, produto.getValidade());
        pst.setInt(8, produto.getQuantidade());
        pst.setDouble(9, produto.getPreco_compra());
        pst.setDouble(10, produto.getPreco_venda());
        pst.execute();
        pst.close();
    }
    
    public ArrayList<Produto> listarTodosProdutos() throws SQLException {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        String sql = "SELECT * FROM produto";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Produto pro = new Produto(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("descricao"),
                rs.getString("ano_faixa"),
                rs.getString("modelo_carro"),
                rs.getString("marca"),
                rs.getString("validade"),
                rs.getInt("quantidade"),
                rs.getDouble("preco_compra"),
                rs.getDouble("preco_venda")
            );
            listaProdutos.add(pro);
        }
        pst.close();
        return listaProdutos;
    }

    
    public Produto BuscarProdutoPorId(String id) throws SQLException 
    {
        sql = "select * from produto where id = " + id;
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        Produto pro = null;
        while (rs.next())
        {
            pro = new Produto(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("descricao"),
                rs.getString("ano_faixa"),
                rs.getString("modelo_carro"),
                rs.getString("marca"),
                rs.getString("validade"),
                rs.getInt("quantidade"),
                rs.getDouble("preco_compra"),
                rs.getDouble("preco_venda")
            );
        }
        pst.close();
        return pro;
    }
    
    public ArrayList<Produto> buscarProduto(String pesquisa) throws SQLException {
        ArrayList<Produto> produtos = new ArrayList<>();
        String sql = "SELECT id, nome, marca, validade FROM produto WHERE nome LIKE ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        // Configurar parâmetro da consulta
        pst.setString(1, "%" + pesquisa + "%");
        //pst.setString(1, pesquisa + "%");
        
        ResultSet rs = pst.executeQuery();
        //Produto pro = null;
        while (rs.next())
        {                  
             Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setMarca(rs.getString("marca"));
                produto.setValidade(rs.getString("validade"));
                //produto.setAno_faixa(rs.getString("ano_faixa"));
                //produto.setModelo_carro(rs.getString("modelo_carro"));
                //produto.setQuantidade(rs.getInt("quantidade"));
                //produto.setPreco_compra(rs.getDouble("preco_compra"));
                //produto.setPreco_venda(rs.getDouble("preco_venda"));

                produtos.add(produto);
        }
         pst.close();
         return produtos;
    }
    
    public void Deletar(Produto produto) throws SQLException 
    {
        sql = "delete from produto where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, produto.getId());
        pst.execute();
        pst.close();
    }
    
    public void Editar(Produto produto) throws SQLException 
    {
        sql = "update produto set nome=?, descricao=?, ano_faixa=?, modelo_carro=?,"
            + " marca=?, validade=?, quantidade=?, preco_compra=?, preco_venda=? where id=?";
        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, produto.getNome());
        pst.setString(2, produto.getDescricao());
        pst.setString(3, produto.getAno_faixa());
        pst.setString(4, produto.getModelo_carro());
        pst.setString(5, produto.getMarca());
        pst.setString(6, produto.getValidade());
        pst.setInt(7, produto.getQuantidade());
        pst.setDouble(8, produto.getPreco_compra());
        pst.setDouble(9, produto.getPreco_venda());
        pst.setInt(10, produto.getId());
        pst.execute();
        pst.close();
    }
}
