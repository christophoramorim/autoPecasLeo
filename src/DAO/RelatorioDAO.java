package DAO;

import Model.Cliente;
import Model.Venda;
import Model.Vendedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RelatorioDAO {
    private PreparedStatement pst;
    private String sql;
    VendaDAO vendaDAO;
    
    
    public List<Venda> buscarTodasVendasRel() throws SQLException {
        vendaDAO = new VendaDAO();
        List<Venda> vendas = new ArrayList<>();
        String sqlVendas = "SELECT v.*, c.nome, c.cpf, vd.Nome AS vendedorNome "
                         + "FROM venda v "
                         + "JOIN cliente c ON v.id_cliente = c.id "
                         + "JOIN vendedor vd ON v.id_vendedor = vd.Id";

        try (PreparedStatement pstVendas = Conexao.getInstance().prepareStatement(sqlVendas);
             ResultSet rsVendas = pstVendas.executeQuery()) {

            while (rsVendas.next()) {
                Cliente cliente = new Cliente(
                    rsVendas.getInt("id_cliente"),
                    rsVendas.getString("nome"),
                    rsVendas.getString("cpf"),
                    null, null, null, null, null, null // Outros campos do cliente podem ser nulos se não forem necessários
                );

                Vendedor vendedor = new Vendedor(
                    rsVendas.getInt("id_vendedor"),
                    rsVendas.getString("vendedorNome"),
                    null // CPF do vendedor pode ser omitido se não for necessário
                );

                Venda venda = new Venda(
                    rsVendas.getInt("id"),
                    cliente,
                    vendedor,
                    new ArrayList<>(), // ItensVenda será carregado depois
                    rsVendas.getDouble("totalVenda")
                );

                // Carregar os itens da venda
                venda.setItensVenda(vendaDAO.buscarItensVendaPorIdVenda(venda.getId()));
                vendas.add(venda);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }

        return vendas;
    }
}
