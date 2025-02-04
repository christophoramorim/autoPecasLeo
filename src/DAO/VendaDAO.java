package DAO;

import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VendaDAO {
    PreparedStatement pst;
    String sql;
    
    public ArrayList<Cliente> buscarCliente(String pesquisa) throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE nome LIKE ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        // Configurar parâmetro da consulta
        pst.setString(1, "%" + pesquisa + "%");
        //pst.setString(1, pesquisa + "%");
        
        ResultSet rs = pst.executeQuery();
        //Cliente cli = null;
        while (rs.next())
        {                  
             Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("id"));
                cliente.setCliNome(rs.getString("nome"));
                cliente.setCliCpf(rs.getString("cpf"));
                cliente.setCliTelefone(rs.getString("telefone"));
                cliente.setCliEndereco(rs.getString("endereco"));
                cliente.setCliBairro(rs.getString("bairro"));
                cliente.setCliCep(rs.getString("cep"));
                cliente.setCliCidade(rs.getString("cidade"));
                cliente.setCliUf(rs.getString("uf"));

                clientes.add(cliente);
        }
         pst.close();
         return clientes;
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
    
}
