
package Model;

public class Produto {
    private int Prdcodigo;
    private String Prdnome;
    private String Prddescricao;
    private String Prdano_faixa;
    private String Prdmodelo_carro;
    private String Prdmarca;
    private String Prdvalidade;
    private int Prdquantidade;
    private double Prdpreco_compra;
    private double PrdPreco_roi;

    public Produto() {
    }

    public Produto(int Prdcodigo, String Prdnome, String Prddescricao, String Prdano_faixa, String Prdmodelo_carro, String Prdmarca, String Prdvalidade, int Prdquantidade, double Prdpreco_compra, double PrdPreco_roi) {
        this.Prdcodigo = Prdcodigo;
        this.Prdnome = Prdnome;
        this.Prddescricao = Prddescricao;
        this.Prdano_faixa = Prdano_faixa;
        this.Prdmodelo_carro = Prdmodelo_carro;
        this.Prdmarca = Prdmarca;
        this.Prdvalidade = Prdvalidade;
        this.Prdquantidade = Prdquantidade;
        this.Prdpreco_compra = Prdpreco_compra;
        this.PrdPreco_roi = PrdPreco_roi;
    }

    public int getPrdcodigo() {
        return Prdcodigo;
    }

    public void setPrdcodigo(int Prdcodigo) {
        this.Prdcodigo = Prdcodigo;
    }

    public String getPrdnome() {
        return Prdnome;
    }

    public void setPrdnome(String Prdnome) {
        this.Prdnome = Prdnome;
    }

    public String getPrddescricao() {
        return Prddescricao;
    }

    public void setPrddescricao(String Prddescricao) {
        this.Prddescricao = Prddescricao;
    }

    public String getPrdano_faixa() {
        return Prdano_faixa;
    }

    public void setPrdano_faixa(String Prdano_faixa) {
        this.Prdano_faixa = Prdano_faixa;
    }

    public String getPrdmodelo_carro() {
        return Prdmodelo_carro;
    }

    public void setPrdmodelo_carro(String Prdmodelo_carro) {
        this.Prdmodelo_carro = Prdmodelo_carro;
    }

    public String getPrdmarca() {
        return Prdmarca;
    }

    public void setPrdmarca(String Prdmarca) {
        this.Prdmarca = Prdmarca;
    }

    public String getPrdvalidade() {
        return Prdvalidade;
    }

    public void setPrdvalidade(String Prdvalidade) {
        this.Prdvalidade = Prdvalidade;
    }

    public int getPrdquantidade() {
        return Prdquantidade;
    }

    public void setPrdquantidade(int Prdquantidade) {
        this.Prdquantidade = Prdquantidade;
    }

    public double getPrdpreco_compra() {
        return Prdpreco_compra;
    }

    public void setPrdpreco_compra(double Prdpreco_compra) {
        this.Prdpreco_compra = Prdpreco_compra;
    }

    public double getPrdPreco_roi() {
        return PrdPreco_roi;
    }

    public void setPrdPreco_roi(double PrdPreco_roi) {
        this.PrdPreco_roi = PrdPreco_roi;
    }
}
