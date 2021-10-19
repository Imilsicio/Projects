
package Model;

/**
 *
 * @author Monteiro
 */
public class Pessoa {
    private int id;
    private String nome;
    private String sexo;
    private String estadoCivil;
    private String morada;
    private String nacionalidade;
    private double altura;
    //private String photo;
    private String nomeMae;
    private String nomePai;
    private String dataNascimento;
  private String Status;
    private String dataMarcacao;

    public Pessoa(String text, String text0, String text1, String text2, String text3, double parseDouble, String text4, String text5, String text6, String text7) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

   /*public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }*/

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    

    public String getDataMarcacao() {
        return dataMarcacao;
    }

    public void setDataMarcacao(String dataMarcacao) {
        this.dataMarcacao = dataMarcacao;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    

    public Pessoa() {
    }

    public Pessoa(int id) {
        this.id = id;
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(int id, String nome, String sexo, String estadoCivil, String morada, String nacionalidade,double altura, String nomeMae, String nomePai) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.morada = morada;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        
    }
/*
    public Pessoa(String nome, String sexo, String estadoCivil, String morada, String nacionalidade, double altura, String nomeMae, String nomePai,String datanascimento, String Status,String dataMarcacao) {
        this.nome = nome;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.morada = morada;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.dataNascimento = dataNascimento;
        this.Status = Status;
        this.dataMarcacao = dataMarcacao;
        
    }*/
    public Pessoa(String nome, String sexo, String estadoCivil, String morada, String nacionalidade,String dataNascimento, String nomeMae, String nomePai, String Status) {
        this.nome = nome;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.morada = morada;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.nomeMae = nomeMae; 
        this.nomePai = nomePai;
        this.Status = Status;
    }

    public Pessoa(int id, String nome, String sexo, String estadoCivil, String morada, String nacionalidade, double altura, String nomeMae, String nomePai, String dataNascimento, String Status, String dataMarcacao) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.morada = morada;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.dataNascimento = dataNascimento;
        this.Status = Status;
        this.dataMarcacao = dataMarcacao;
    }

    public Pessoa(int id, String nome, String sexo, String estadoCivil, String morada, String nacionalidade, double altura, String nomeMae, String nomePai, String dataNascimento, String dataMarcacao) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.morada = morada;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.dataNascimento = dataNascimento;
        this.dataMarcacao = dataMarcacao;
    }





   
}
