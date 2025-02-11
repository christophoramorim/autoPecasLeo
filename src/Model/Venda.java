
package Model;

import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItensVenda> itensVenda;
    private double totalVenda;

    public Venda() {
        this.itensVenda = new ArrayList<>();
    }

    public Venda(int id, Cliente cliente, Vendedor vendedor, ArrayList<ItensVenda> itensVenda, double totalVenda) {
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

    public ArrayList<ItensVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ArrayList<ItensVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }
    
    
}
