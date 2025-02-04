
package Model;

import java.util.List;

public class Venda {
    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<ItensVenda> itensVenda;
    private float totalVenda;

    public Venda() {
    }

    public Venda(int id, Cliente cliente, Vendedor vendedor, List<ItensVenda> itensVenda, float totalVenda) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itensVenda = itensVenda;
        this.totalVenda = totalVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<ItensVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItensVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public float getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }
    
    
}
