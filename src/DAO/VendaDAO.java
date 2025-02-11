package DAO;

import Model.ItensVenda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Venda;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {
    private PreparedStatement pst;
    private String sql;

    public void Salvar(Venda venda) throws SQLException {
        int idVenda = 0;
        sql = "INSERT INTO venda VALUES (?, ?, ?, ?)";
        pst = Conexao.getInstance().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setInt(1, 0);
        pst.setInt(2, venda.getCliente().getIdCliente());
        pst.setInt(3, venda.getVendedor().getId());
        pst.setDouble(4, venda.getTotalVenda());
        pst.executeUpdate();
        ResultSet rs = pst.getGeneratedKeys();
        while (rs.next()) {
            idVenda = rs.getInt(1);
        }
        pst.close();
        // Agora salva os itens da venda
        SalvarItensVenda(venda.getItensVenda(), idVenda);
    }

    public void SalvarItensVenda(ArrayList<ItensVenda> itensVenda, int id) throws SQLException {
        for(ItensVenda itens : itensVenda) 
        {
            sql = "insert into itemvenda values (?,?,?,?,?,?)";
            pst = Conexao.getInstance().prepareStatement(sql);
            pst.setInt(1, 0);
            pst.setInt(2, id);
            pst.setInt(3, itens.getProduto().getId());
            pst.setInt(4, itens.getQuantidade());
            pst.setDouble(5, itens.getPreco());
            pst.setDouble(6, itens.getPrecototalitem());
            pst.execute();
            pst.close();
        }
    }
}
