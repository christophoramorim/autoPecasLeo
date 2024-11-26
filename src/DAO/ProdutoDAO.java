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
        pst.setDouble(10, produto.getPreco_roi());
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
                rs.getDouble("Preco_roi")
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
                rs.getDouble("Preco_roi")
            );
        }
        pst.close();
        return pro;
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
            + " marca=?, validade=?, quantidade=?, preco_compra=? preco_roi=? where id=?";
        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, produto.getNome());
        pst.setString(2, produto.getDescricao());
        pst.setString(3, produto.getAno_faixa());
        pst.setString(4, produto.getModelo_carro());
        pst.setString(5, produto.getMarca());
        pst.setString(6, produto.getValidade());
        pst.setInt(7, produto.getQuantidade());
        pst.setDouble(8, produto.getPreco_compra());
        pst.setDouble(9, produto.getPreco_roi());
        pst.setInt(10, produto.getId());
        pst.execute();
        pst.close();
    }
}
