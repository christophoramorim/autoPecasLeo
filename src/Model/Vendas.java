/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author rodri
 */
public class Vendas {
    private int idVenda;
    private int PrdCodigo;
    private String PrdNome;
    private int CliCodigo;
    private String Clinome;
    private int PrdQuant;
    private double VenPreco;
    private double VenDesc;
    private int    Numvenda;
    private String Pesquisa;
    
    
    
    public Vendas() {
    }
    
    public Vendas(int idVenda, int PrdCodigo, String PrdNome, int CliCodigo, String Clinome, int PrdQuant, double VenPreco, double VenDesc, int Numvenda, String Pesquisa) {
        
        this.idVenda = idVenda;
        this.PrdCodigo = PrdCodigo;
        this.PrdNome = PrdNome;
        this.CliCodigo = CliCodigo;
        this.Clinome = Clinome;
        this. PrdQuant = PrdQuant;
        this.VenPreco = VenPreco;
        this.VenDesc = VenDesc;
        this.Numvenda = Numvenda;
        this.Pesquisa = Pesquisa;
    }
    
    public int getVenda() {
        return idVenda;
    }
    
    public void setVendacod (int idvenda) {
        this.idVenda = idvenda;
    }
    
    public String getPrdNome () {
        return PrdNome;
    }
    
    public void setPrdNome(String Prdnome) {
        this.PrdNome = Prdnome;
    }
    
    public String getCliNome () {
        return Clinome;
    }
    
    public void setCliNome(String Cli_nome) {
        this.Clinome = Cli_nome;
    }
    
    public int getVenquantidade () {
        return PrdQuant;
    }
    
    public void setVenquantidade(int PrdQuantidade) {
        this.PrdQuant = PrdQuantidade;
    }
    
    public double getVenPreco () {
        return VenPreco;
    }
    
    public void setVenPreco(double VenPreco) {
        this.VenPreco = VenPreco;
    }
    
    public double getVenDesc () {
        return VenDesc;
    }
    
    public void setVenDesc(double VenDesc) {
        this.VenDesc = VenDesc;
    }
    
    
    
    public int getNumvenda () {
        return Numvenda;
    }
    
    public void setNumvenda(int Numvenda) {
        this.Numvenda = Numvenda;
    }
    
    
    public int getPrdCodigo () {
        return PrdCodigo;
    }
    
    public void setPrdCodigo(int PrdCodigo) {
        this.PrdCodigo = PrdCodigo;
    }
    
 
    public int getCliCodigo () {
        return CliCodigo;
    }
    
    public void setCliCodigo(int CliCodigo) {
        this.CliCodigo = CliCodigo;
    }
    
    public String getPesquisa () {
        return Pesquisa;
    }
    
    public void setPesquisa(String Pesquisa) {
        this.Pesquisa = Pesquisa;
    }
    
    
    
    
    
}
