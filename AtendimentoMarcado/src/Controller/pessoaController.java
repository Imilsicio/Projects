package Controller;

import Model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Monteiro
 */
public class pessoaController {

    public void registar(Pessoa pessoa) {
        {
            Connection dataBase = new Conexao().conectarDB();
            String sql = "INSERT INTO pessoa( nome, estadoCivil, sexo, morada, nacionalidade,dataNascimento,altura, nomeMae, nomePai,status) VALUES (?,?,?,?,?,?,?,?,?,?)";
            try (PreparedStatement stm = dataBase.prepareStatement(sql)) {
                stm.setString(1, pessoa.getNome());
                stm.setString(2, pessoa.getEstadoCivil());
                stm.setString(3, pessoa.getSexo());
                stm.setString(4, pessoa.getMorada());
                stm.setString(5, pessoa.getNacionalidade());
                stm.setString(6, pessoa.getDataNascimento());
                stm.setDouble(7, pessoa.getAltura());
                //stm.setString(7, pessoa.getPhoto());
                stm.setString(8, pessoa.getNomeMae());
                stm.setString(9, pessoa.getNomePai());
                
                stm.setString(10, pessoa.getStatus());
                //stm.setString(12, pessoa.getDataMarcacao());

                stm.execute();
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public ArrayList<Pessoa> dadosPessoaa() {
        Connection dataBase = new Conexao().conectarDB();
        String sql = "SELECT * FROM pessoa  WHERE status='activo'";
        ArrayList<Pessoa> dados = new ArrayList();
        
        try {
            ResultSet result;
            try (PreparedStatement stm = dataBase.prepareStatement(sql)) {
                result = stm.executeQuery();
                while (result.next()) {
                    Pessoa pessoa = new Pessoa(
                            result.getInt("id"),
                            result.getString("nome"),
                            result.getString("sexo"),
                            result.getString("estadocivil"),
                            result.getString("morada"),
                            result.getString("nacionalidade"),
                            result.getDouble("altura"),
                            result.getString("dataNascimento"),
                            
                            result.getString("nomemae"),
                            result.getString("nomepai"),
                            result.getString("dataMarcacao")
                    );
                    dados.add(pessoa);
                }
            }
            result.close();
            return dados;
        } catch (SQLException e) {
            e.getMessage();
            return null;
        }

    }

    public ArrayList<Pessoa> dadosPessoa() {
        Connection dataBase = new Conexao().conectarDB();
        String sql = "SELECT * FROM pessoa ";
        ArrayList<Pessoa> dados = new ArrayList();
        
        try {
            ResultSet result;
            try (PreparedStatement stm = dataBase.prepareStatement(sql)) {
                result = stm.executeQuery();
                while (result.next()) {
                    Pessoa pessoa = new Pessoa(
                            result.getInt("id"),
                            result.getString("nome"),
                            result.getString("sexo"),
                            result.getString("estadocivil"),
                            result.getString("morada"),
                            result.getString("nacionalidade"),
                            result.getDouble("altura"),
                            result.getString("nomemae"),
                            result.getString("nomepai"),
                            result.getString("dataNascimento"),
                            result.getString("status"),
                            result.getString("dataMarcacao")
                    );
                    dados.add(pessoa);
                }
            }
            result.close();
            return dados;
        } catch (SQLException e) {
            e.getMessage();
            return null;
        }

    }
    /*  public Pessoa pesquisaPessoa(int id) {
        Connection dataBase = new Conexao().conectarDB();
        String sql = "SELECT * FROM pessoa WHERE id=?";
        Pessoa pessoa = null;
        try {
      
            ResultSet result;
            try (PreparedStatement stm = dataBase.prepareStatement(sql)) {
                stm.setInt(1,7);
                result = stm.executeQuery();
                   while (r) {
               
                pessoa = new Pessoa(
                        result.getInt("id"),
                        result.getString("nome"),
                        result.getString("Sexo"),
                        result.getString("Estadocivil"),
                        result.getString("Morada"),
                        result.getString("Nacionalidade"),
                        result.getString("Nomedamae"),
                        result.getString("Nomedopai")
                );

                   }
            }
            result.close();
            return pessoa;
        } catch (SQLException e) {
           e.printStackTrace();
            return null;
        }

    }*/
    public static void main(String[] args) {

    }

    public void apagarPessoa(Pessoa pessoa) {
        Connection dataBase = new Conexao().conectarDB();
        String sql = "DELETE FROM pessoa WHERE id = ?";
        try {
            try (PreparedStatement stm = dataBase.prepareStatement(sql)) {
                stm.setInt(1, pessoa.getId());
                
                stm.execute();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void atualizar(Pessoa pessoa) {
        Connection dataBase = new Conexao().conectarDB();
        if (!String.valueOf(pessoa.getId()).isEmpty()) {
            String sql = "UPDATE pessoa SET nome=?,estadoCivil=?,sexo=?,morada=?,nacionalidade=?,altura=?,nomeMae=?,nomePai=?,DataNascimento=?, status=?,dataMarcacao=? WHERE pessoa.id=?";
            try (PreparedStatement stm = dataBase.prepareStatement(sql)) {
                stm.setString(1, pessoa.getNome());
                stm.setString(2, pessoa.getEstadoCivil());
                stm.setString(3, pessoa.getSexo());
                stm.setString(4, pessoa.getMorada());
                stm.setString(5, pessoa.getNacionalidade());
                stm.setDouble(6, pessoa.getAltura());
                //stm.setString(7, pessoa.getPhoto());
                stm.setString(7, pessoa.getNomeMae());
                stm.setString(8, pessoa.getNomePai());
               stm.setString(9, pessoa.getDataNascimento());
                stm.setString(10, pessoa.getStatus());
                stm.setString(11, pessoa.getDataMarcacao());
                stm.setInt(12, pessoa.getId());
                stm.executeUpdate();
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
