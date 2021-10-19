package Model;

/**
 *
 * @author Monteiro
 */
public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String nivelDeAcesso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario() {
    }

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public Usuario(String nome, String email, String senha, String nivelDeAcesso) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public Usuario(int id, String nome, String email, String senha, String nivelDeAcesso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

}
