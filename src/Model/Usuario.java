package Model;

public class Usuario {
    private int idUsuario;
    private String usuNome;
    private String usuCpf;
    private String usuCargo;
    private String usuLogin;
    private String usuSenha;

    public Usuario() {
    }

    public Usuario(int idUsuario, String usuNome, String usuCpf, String usuCargo, String usuLogin, String usuSenha) {
        this.idUsuario = idUsuario;
        this.usuNome = usuNome;
        this.usuCpf = usuCpf;
        this.usuCargo = usuCargo;
        this.usuLogin = usuLogin;
        this.usuSenha = usuSenha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsuCpf() {
        return usuCpf;
    }

    public void setUsuCpf(String usuCpf) {
        this.usuCpf = usuCpf;
    }

    public String getUsuCargo() {
        return usuCargo;
    }

    public void setUsuCargo(String usuCargo) {
        this.usuCargo = usuCargo;
    }

    public String getUsuLogin() {
        return usuLogin;
    }

    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }
    
    
}
