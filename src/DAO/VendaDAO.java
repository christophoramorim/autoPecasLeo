package DAO;

import Model.ItensVenda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Venda;
import Model.Cliente;
import Model.Vendedor;
import Model.Produto;
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
    
    public Venda BuscarVendaPorId(String id) throws SQLException {
        String sql = "SELECT v.*, c.nome, c.cpf, c.endereco, c.bairro, c.cidade, c.uf, c.cep, c.telefone, "
                   + "vd.Nome AS vendedorNome, vd.Cpf AS vendedorCpf "
                   + "FROM venda v "
                   + "JOIN cliente c ON v.id_cliente = c.id "
                   + "JOIN vendedor vd ON v.id_vendedor = vd.Id "
                   + "WHERE v.id = ?";

        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, id);
        ResultSet rs = pst.executeQuery();

        Venda venda = null;

        if (rs.next()) {
            // Criar Cliente
            Cliente cliente = new Cliente(
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

            // Criar Vendedor
            Vendedor vendedor = new Vendedor(
                rs.getInt("id_vendedor"),
                rs.getString("vendedorNome"),
                rs.getString("vendedorCpf")
            );

            // Criar Venda
            venda = new Venda(
                rs.getInt("id"),
                cliente,
                vendedor,
                new ArrayList<>(), // ItensVenda será carregado depois
                rs.getDouble("totalVenda")
            );
        }

        pst.close();

        if (venda != null) {
            // Carregar ItensVenda da venda
            venda.setItensVenda(buscarItensVendaPorIdVenda(venda.getId()));
        }

        return venda;
    }

    
    public ArrayList<ItensVenda> buscarItensVendaPorIdVenda(int idVenda) throws SQLException {
        ArrayList<ItensVenda> itensVenda = new ArrayList<>();
        String sql = "SELECT iv.*, p.id AS produtoId, p.nome AS produtoNome, p.marca, p.modelo_carro, p.preco_venda, p.preco_compra, p.descricao "
                   + "FROM itemvenda iv "
                   + "JOIN produto p ON iv.id_produto = p.id "
                   + "WHERE iv.id_venda = ?";

        try (PreparedStatement pst = Conexao.getInstance().prepareStatement(sql)) {
            pst.setInt(1, idVenda);
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    Produto produto = new Produto(
                        rs.getInt("produtoId"),
                        rs.getString("produtoNome"),
                        rs.getString("descricao"), // descricao
                        null, // ano_faixa
                        rs.getString("modelo_carro"),
                        rs.getString("marca"),
                        null, // validade
                        0,    // quantidade
                        rs.getDouble("preco_compra"),  // preco_compra
                        rs.getDouble("preco_venda") // preco_venda
                    );

                    ItensVenda item = new ItensVenda(
                        rs.getInt("id"),
                        produto,
                        rs.getInt("quantidade"),
                        rs.getDouble("precoitem"),
                        rs.getDouble("totalitem")
                    );
                    itensVenda.add(item);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return itensVenda;
    }
}
