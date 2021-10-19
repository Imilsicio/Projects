package Controller;

import Model.Usuario;
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
public class UsuarioController {

    public void registar(Usuario usuario) {
        Connection dataBase = new Conexao().conectarDB();
        String sql = "INSERT INTO usuario (nome, senha) VALUES (?,?)";
        try (PreparedStatement stm = dataBase.prepareStatement(sql)) {
            stm.setString(1, usuario.getNome());
          
            stm.setString(2, usuario.getSenha());
          

            stm.execute();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Usuario> dadosUsuario() {
        Connection dataBase = new Conexao().conectarDB();
        String sql = "SELECT * FROM usuario";
        ArrayList<Usuario> dados = new ArrayList();
        try {
            ResultSet result;
            try (PreparedStatement stm = dataBase.prepareStatement(sql)) {
                result = stm.executeQuery();
                while (result.next()) {
                    Usuario usuario = new Usuario(
                            result.getInt("id"),
                            result.getString("nome"),
                            result.getString("senha")
                            //result.getString("email"),
                            //result.getString("nivelDeAcesso")
                    );
                    dados.add(usuario);
                }
            }
            result.close();
            return dados;
        } catch (SQLException e) {
            e.getMessage();
            return null;
        }

    }

    public void apagarUsuario(Usuario usuario) {
        Connection dataBase = new Conexao().conectarDB();
        String sql = "DELETE FROM usuario WHERE id = ?";
        try {
            try (PreparedStatement stm = dataBase.prepareStatement(sql)) {
                stm.setInt(1, usuario.getId());
                stm.execute();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void atualizar(Usuario usuario) {
        Connection dataBase = new Conexao().conectarDB();
        if (!String.valueOf(usuario.getId()).isEmpty()) {
            String sql = "UPDATE usuario SET nome=?,email=?,senha=?,nivelDeAcesso=? WHERE usuario.id=?";
            try (PreparedStatement stm = dataBase.prepareStatement(sql)) {
                stm.setString(1, usuario.getNome());
                stm.setString(2, usuario.getEmail());
                stm.setString(3, usuario.getSenha());
                stm.setString(4, usuario.getNivelDeAcesso());
                stm.setInt(5, usuario.getId());
                stm.executeUpdate();
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    

}
