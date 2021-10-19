package Views;
/**
 *
 * @author Monteiro
 */

import Controller.UsuarioController;
import Controller.pessoaController;
import Model.Pessoa;
import Model.Usuario;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.text.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Monteiro
 */
public class TelaRegistro extends JFrame implements ActionListener,Serializable {
    
    JLabel lblNome = new JLabel("Nome:");
    JLabel lblSexo = new JLabel("Sexo:");
    JLabel lblEstadoCivil = new JLabel("Estado Civivil:");
    JLabel lblMorada = new JLabel("Morada:");
    JLabel lblNacionalidade = new JLabel("Nacionalidade:");
    JLabel lblFiliacao = new JLabel("Filiacao:");
    JLabel lblNomeMae = new JLabel("Nome da Mae:");
    JLabel lblNomePai = new JLabel("Nome do Pai:");
    JLabel lblDataNascimento = new JLabel("Data de Nascimento:");

    JFormattedTextField jtfDataNascimento = new JFormattedTextField("DD /MM / AAAA");
    
    JTextField jtfNome = new JTextField();
    
    JTextField jtfSexo = new JTextField();

    JTextField jtfMorada = new JTextField();
    JTextField jtfNacionalidade = new JTextField();
    
    JTextField jtfPhoto = new JTextField();
    JTextField jtfNomeMae = new JTextField();
    JTextField jtfNomepai = new JTextField();
//    JTextField jtfDataNascimento = new JTextField();
  
    JComboBox jcSexo = new JComboBox();
    JComboBox jcEstadCivil = new JComboBox();
    JFormattedTextField txtDataMarcacao = new JFormattedTextField();

    JButton btnSubmeter = new JButton("Registar");
    JButton btnVoltar = new JButton("Voltar");
    Font font = new Font("serif", Font.ITALIC, 45);

    public TelaRegistro() {
        setTitle("Pre-registro");
        setSize(400, 720);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void criarGUI() {
        setLayout(null);

       


        lblNome.setBounds(20, 10, 120, 25);
        jtfNome.setBounds(140, 10, 160, 25);
        
        lblSexo.setBounds(20, 50, 120, 25);
    
        
        lblEstadoCivil.setBounds(20, 90, 120, 25);        
        
        
        lblMorada.setBounds(20, 150, 120, 25);
        jtfMorada.setBounds(140, 150, 160, 25);
        
        lblNacionalidade.setBounds(20, 190, 120, 25);
        jtfNacionalidade.setBounds(140, 190, 160, 25);
        
        lblFiliacao.setBounds(80, 300, 120, 25);
        
        lblNomeMae.setBounds(20, 350, 120, 25);
        jtfNomeMae.setBounds(140, 350, 160, 25);
        
        lblNomePai.setBounds(20, 390, 120, 25);
        jtfNomepai.setBounds(140, 390, 160, 25);
        
        jcSexo.setBounds(140, 50, 160, 25);
        jcSexo.addItem("Femenino");
        jcSexo.addItem("Masculino");
        jcSexo.setEditable(false);
        jcSexo.setSelectedIndex(0);
        
        jcEstadCivil.setBounds(140, 90, 160, 25);
        jcEstadCivil.addItem("Solteiro/a");
        jcEstadCivil.addItem("Casado/a");
        jcEstadCivil.addItem("Divorciado/a");
        jcEstadCivil.addItem("Viuvo/a");
        jcEstadCivil.setEditable(false);
        jcEstadCivil.setSelectedIndex(0);
       
        
       lblDataNascimento.setBounds(20, 250, 120, 25);
       jtfDataNascimento.setBounds(140, 250, 160, 25);
       // dataMask.setBounds(140, 250, 160, 25);
                       
        
        btnSubmeter.setBounds(140, 470, 160, 25);
        btnVoltar.setBounds(140, 510, 160, 25);

        lblNome.setToolTipText("Nome");
        lblSexo.setToolTipText("Sexo");
        btnSubmeter.setToolTipText("final");

       //add(dataMask);
        
        add(lblNome);
        add(jtfNome);
        add(lblSexo);
        add(jcSexo);
        add(lblEstadoCivil);
        add(jcEstadCivil);
        add(lblMorada);
        add(jtfMorada);
        add(lblNacionalidade);
        add(jtfNacionalidade);
        
       add(lblFiliacao);
        add(lblNomeMae);
        add(jtfNomeMae);
        add(lblNomePai);
        add(jtfNomepai);
        add(lblDataNascimento);
        add(jtfDataNascimento);
        add(btnSubmeter);
        add(btnVoltar);

        btnVoltar.addActionListener(this);
        btnSubmeter.addActionListener(this);
        jtfNome.addActionListener(this);
       jtfSexo.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
   
        new TelaRegistro().criarGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
      
        if (e.getSource() == btnSubmeter) {
            if (jtfNome.getText().isEmpty() == true || 
                     jtfMorada.getText().isEmpty() == true || jtfNacionalidade.getText().isEmpty()==true  ||
                      jtfNomeMae.getText().isEmpty() || jtfNomepai.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(null, "Preencha os campos!");
            } else {
                Pessoa novoPessoa = new Pessoa(jtfNome.getText(),String.valueOf(jcSexo.getSelectedItem()), String.valueOf( jcEstadCivil.getSelectedItem()),jtfMorada.getText(),jtfNacionalidade.getText(),jtfDataNascimento.getText(),jtfNomeMae.getText(),jtfNomepai.getText(),"Desativo");
              
                pessoaController pc = new pessoaController();
               pc.registar(novoPessoa);
                                JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");

              
            }
        }
        if(e.getSource() == btnVoltar){
        this.dispose();
        new PrimeiraTela().criarGUI();
    }
    
        
    }

    

}
    

