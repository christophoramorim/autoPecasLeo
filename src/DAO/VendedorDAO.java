package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Vendedor;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VendedorDAO {
    PreparedStatement pst;
    String sql;
    
    public void Salvar(Vendedor vendedor) throws SQLException 
    {    
        sql = "insert into vendedor values(?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, vendedor.getNome());
        pst.setString(3, vendedor.getCpf());
        pst.execute();
        pst.close();
    }
    
    public ArrayList<Vendedor> listarTodos() throws SQLException {
        ArrayList<Vendedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM vendedor";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Vendedor data = new Vendedor(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("cpf")
            );
            lista.add(data);
        }
        pst.close();
        return lista;
    }

    
    public Vendedor BuscarVendedorPorId(String id) throws SQLException 
    {
        sql = "select * from vendedor where id = " + id;
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        Vendedor data = null;
        while (rs.next())
        {
            data = new Vendedor(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("cpf")
            );
        }
        pst.close();
        return data;
    }
    
    public ArrayList<Vendedor> buscarVendedor(String pesquisa) throws SQLException {
        ArrayList<Vendedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM vendedor WHERE nome LIKE ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        // Configurar parâmetro da consulta
        pst.setString(1, "%" + pesquisa + "%");
        //pst.setString(1, pesquisa + "%");
        
        ResultSet rs = pst.executeQuery();
        //Vendedor data = null;
        while (rs.next())
        {                  
             Vendedor data = new Vendedor();
                data.setId(rs.getInt("id"));
                data.setNome(rs.getString("nome"));
                data.setCpf(rs.getString("cpf"));
                
                lista.add(data);
        }
         pst.close();
         return lista;
    }
    
    public void Deletar(Vendedor vendedor) throws SQLException 
    {
        sql = "delete from vendedor where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, vendedor.getId());
        pst.execute();
        pst.close();
    }
    
    public void Editar(Vendedor vendedor) throws SQLException 
    {
        sql = "update vendedor set nome=?, cpf=? where id=?";
        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, vendedor.getNome());
        pst.setString(2, vendedor.getCpf());
        pst.setInt(3, vendedor.getId());
        pst.execute();
        pst.close();
    }
}
