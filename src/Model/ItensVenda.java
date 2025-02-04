
package Model;


public class ItensVenda {
    private int id;
    private Produto produto;
    private float quantidade;
    private float preco;
    private float precototalitem;

    public ItensVenda() {
    }

    public ItensVenda(int id, Produto produto, float quantidade, float preco, float precototalitem) {
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

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPrecototalitem() {
        return precototalitem;
    }

    public void setPrecototalitem(float precototalitem) {
        this.precototalitem = precototalitem;
    }
    
    
}
