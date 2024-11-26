package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Usuario;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LoginDAO {
    PreparedStatement pst;
    String sql;
    
    public Usuario buscaLogin(String login, String senha) throws SQLException {
        sql = "SELECT * FROM usuario WHERE login COLLATE utf8_bin=? AND senha COLLATE utf8_bin=?";
        Usuario usuario = null;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, login);
        pst.setString(2, senha);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next())
        {            
            usuario = new Usuario (
                    rs.getInt("id"), 
                    rs.getString("nome"), 
                    rs.getString("cpf"), 
                    rs.getString("cargo"),
                    rs.getString("login"),
                    rs.getString("senha")
            );
        }
        pst.close();
        return usuario;
    }
}
