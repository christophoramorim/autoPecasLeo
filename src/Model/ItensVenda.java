
package Model;


public class ItensVenda {
    private int id;
    private Produto produto;
    private int quantidade;
    private double preco;
    private double precototalitem;

    public ItensVenda() {
    }

    public ItensVenda(int id, Produto produto, int quantidade, double preco, double precototalitem) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precototalitem = precototalitem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecototalitem() {
        return precototalitem;
    }

    public void setPrecototalitem(double precototalitem) {
        this.precototalitem = precototalitem;
    }
    
    
}
