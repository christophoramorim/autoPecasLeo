
package Model;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private String ano_faixa;
    private String modelo_carro;
    private String marca;
    private String validade;
    private int quantidade;
    private double preco_compra;
    private double Preco_roi;

    public Produto() {
    }

    public Produto(int id, String nome, String descricao, String dano_faixa, String modelo_carro, String marca, String validade, int quantidade, double preco_compra, double Preco_roi) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ano_faixa = dano_faixa;
        this.modelo_carro = modelo_carro;
        this.marca = marca;
        this.validade = validade;
        this.quantidade = quantidade;
        this.preco_compra = preco_compra;
        this.Preco_roi = Preco_roi;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAno_faixa() {
        return ano_faixa;
    }

    public String getModelo_carro() {
        return modelo_carro;
    }

    public String getMarca() {
        return marca;
    }

    public String getValidade() {
        return validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco_compra() {
        return preco_compra;
    }

    public double getPreco_roi() {
        return Preco_roi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAno_faixa(String dano_faixa) {
        this.ano_faixa = dano_faixa;
    }

    public void setModelo_carro(String modelo_carro) {
        this.modelo_carro = modelo_carro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco_compra(double preco_compra) {
        this.preco_compra = preco_compra;
    }

    public void setPreco_roi(double Preco_roi) {
        this.Preco_roi = Preco_roi;
    }
    
}
