package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDAO {
    PreparedStatement pst;
    String sql;
    
    public void Salvar(Cliente client) throws SQLException 
    {    
        sql = "insert into cliente values(?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, client.getCliNome());
        pst.setString(3, client.getCliCpf());
        pst.setString(4, client.getCliEndereco());
        pst.setString(5, client.getCliBairro());
        pst.setString(6, client.getCliCidade());
        pst.setString(7, client.getCliUf());
        pst.setString(8, client.getCliCep());
        pst.setString(9, client.getCliTelefone());
        pst.execute();
        pst.close();
    }
    
    public ArrayList<Cliente> listarTodosClientes() throws SQLException {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Cliente cli = new Cliente(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("cpf"),
                rs.getString("endereco"),
                rs.getString("bairro"),
                rs.getString("cidade"),
                rs.getString("uf"),
                rs.getString("cep"),
                rs.getString("telefone")
            );
            listaClientes.add(cli);
        }
        pst.close();
        return listaClientes;
    }

    
    public Cliente BuscarClientePorId(String id) throws SQLException 
    {
        sql = "select * from cliente where id = " + id;
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        Cliente cli = null;
        while (rs.next())
        {
            cli = new Cliente (
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("cpf"),
                rs.getString("endereco"),
                rs.getString("bairro"),
                rs.getString("cidade"),
                rs.getString("uf"),
                rs.getString("cep"),
                rs.getString("telefone")
            );
        }
        pst.close();
        return cli;
    }
    
    public void Deletar(Cliente client) throws SQLException 
    {
        sql = "delete from cliente where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, client.getIdCliente());
        pst.execute();
        pst.close();
    }
    
    public void Editar(Cliente client) throws SQLException 
    {
        sql = "update cliente set nome=?, cpf=?, endereco=?, bairro=?,"
            + " cidade=?, uf=?, cep=?, telefone=? where id=?";
        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, client.getCliNome());
        pst.setString(2, client.getCliCpf());
        pst.setString(3, client.getCliEndereco());
        pst.setString(4, client.getCliBairro());
        pst.setString(5, client.getCliCidade());
        pst.setString(6, client.getCliUf());
        pst.setString(7, client.getCliCep());
        pst.setString(8, client.getCliTelefone());
        pst.setInt(9, client.getIdCliente());
        pst.execute();
        pst.close();
    }
}
