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
        pst.setString(2, produto.getPrdnome());
        pst.setString(3, produto.getPrddescricao());
        pst.setString(4, produto.getPrdano_faixa());
        pst.setString(5, produto.getPrdmodelo_carro());
        pst.setString(6, produto.getPrdmarca());
        pst.setString(7, produto.getPrdvalidade());
        pst.setInt(8, produto.getPrdquantidade());
        pst.setDouble(9, produto.getPrdpreco_compra());
        pst.setDouble(10, produto.getPrdPreco_roi());
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
                rs.getInt("Prdcodigo"),
                rs.getString("Prdnome"),
                rs.getString("Prddescricao"),
                rs.getString("Prdano_faixa"),
                rs.getString("Prdmodelo_carro"),
                rs.getString("Prdmarca"),
                rs.getString("Prdvalidade"),
                rs.getInt("Prdquantidade"),
                rs.getDouble("Prdpreco_compra"),
                rs.getDouble("PrdPreco_roi")
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
                rs.getInt("Prdcodigo"),
                rs.getString("Prdnome"),
                rs.getString("Prddescricao"),
                rs.getString("Prdano_faixa"),
                rs.getString("Prdmodelo_carro"),
                rs.getString("Prdmarca"),
                rs.getString("Prdvalidade"),
                rs.getInt("Prdquantidade"),
                rs.getDouble("Prdpreco_compra"),
                rs.getDouble("PrdPreco_roi")
            );
        }
        pst.close();
        return pro;
    }
    
    public void Deletar(Produto produto) throws SQLException 
    {
        sql = "delete from produto where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, produto.getPrdcodigo());
        pst.execute();
        pst.close();
    }
    
    public void Editar(Produto produto) throws SQLException 
    {
        sql = "update produto set nome=?, descricao=?, ano_faixa=?, modelo_carro=?,"
            + " marca=?, validade=?, quantidade=?, preco_compra=? preco_roi=? where id=?";
        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, produto.getPrdnome());
        pst.setString(2, produto.getPrddescricao());
        pst.setString(3, produto.getPrdano_faixa());
        pst.setString(4, produto.getPrdmodelo_carro());
        pst.setString(5, produto.getPrdmarca());
        pst.setString(6, produto.getPrdvalidade());
        pst.setInt(7, produto.getPrdquantidade());
        pst.setDouble(8, produto.getPrdpreco_compra());
        pst.setDouble(9, produto.getPrdPreco_roi());
        pst.setInt(10, produto.getPrdcodigo());
        pst.execute();
        pst.close();
    }
}
