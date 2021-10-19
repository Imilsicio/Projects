package Views;

import Controller.UsuarioController;
import Model.Usuario;

/**
 *
 * @author Monteiro
 */
public class TestaUsuario {
    public static void main (String[]args){
        
        Usuario u = new Usuario(1,"Maria","Khawir@mdi","1234","admin");
        UsuarioController uc = new UsuarioController();
        
        //uc.registar(u);
        //uc.atualizar(u);
        //ArrayList<Usuario> usuarios =  uc.dadosUsuario();
        //for (Usuario usuario : usuarios) {
          //  System.out.println(usuario.getNome());
    uc.apagarUsuario(u);
    }}
    

