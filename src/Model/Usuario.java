package Model;

public class Usuario {
    private int Id;
    private String Nome;
    private String Cpf;
    private String Cargo;
    private String Login;
    private String Senha;

    public Usuario() {
    }

    public Usuario(int Id, String Nome, String Cpf, String Cargo, String Login, String Senha) {
        this.Id = Id;
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Cargo = Cargo;
        this.Login = Login;
        this.Senha = Senha;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

   
}
