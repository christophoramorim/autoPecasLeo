package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Usuario;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDAO {
    PreparedStatement pst;
    String sql;
    
    public void Salvar(Usuario user) throws SQLException {        
        sql = "insert into usuario values(?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, user.getNome());
        pst.setString(3, user.getCpf());
        pst.setString(4, user.getCargo());
        pst.setString(5, user.getLogin());
        pst.setString(6, user.getSenha());
        pst.execute();
        pst.close();
    }
    
    public ArrayList<Usuario> listarTodosUsuarios() throws SQLException {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Usuario user = new Usuario(
                    rs.getInt("id"), 
                    rs.getString("nome"), 
                    rs.getString("cpf"), 
                    rs.getString("cargo"),
                    rs.getString("login"),
                    rs.getString("senha")                    
            );
            listaUsuarios.add(user);
        }
        pst.close();
        return listaUsuarios;
    }
    
    public Usuario BuscarUsuarioPorId(String id) throws SQLException  {
        sql = "select * from usuario where id = " + id;
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        Usuario user = null;
        while (rs.next())
        {            
            user = new Usuario (
                    rs.getInt("id"), 
                    rs.getString("nome"), 
                    rs.getString("cpf"), 
                    rs.getString("cargo"),
                    rs.getString("login"),
                    rs.getString("senha")
            );
        }
        pst.close();
        return user;
    }
    
    public void Deletar(Usuario user) throws SQLException {
        sql = "delete from usuario where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, user.getId());
        pst.execute();
        pst.close();
    }
    
    public void Editar(Usuario user) throws SQLException {
        sql = "update usuario set nome=?, cpf=?, cargo=?, login=?,"
            + " senha=? where id=?";
        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, user.getNome());
        pst.setString(2, user.getCpf());
        pst.setString(3, user.getCargo());
        pst.setString(4, user.getLogin());
        pst.setString(5, user.getSenha());
        pst.setInt(6, user.getId());
        pst.execute();
        pst.close();
    }
}
