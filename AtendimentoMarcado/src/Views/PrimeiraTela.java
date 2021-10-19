/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.pessoaController;
import Model.Pessoa;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Monteiro
 */
public class PrimeiraTela extends JFrame implements ActionListener,Serializable {
    
    JLabel lblNome = new JLabel("Escolha uma Opcao:");
  
    
    JButton btnVer = new JButton("Ver Lista");
    JButton btnMarcar = new JButton("Pre-registro");
    JButton btnAdmin = new JButton("Admin");
    Font font = new Font("serif", Font.ITALIC, 45);
    

    

    public PrimeiraTela() {
        setTitle("Bem Vindo");
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void criarGUI() {
        setLayout(null);

       


        lblNome.setBounds(150, 100, 120, 25);
        btnMarcar.setBounds(120, 120, 160, 25);      
        btnVer.setBounds(120, 150, 160, 25);
        btnAdmin.setBounds(120, 180, 160, 25);
       

        lblNome.setToolTipText("Nome");
        
        btnAdmin.setToolTipText("final");

       
        add(lblNome);
        add(btnMarcar);
        add(btnVer);
        add(btnAdmin);

        btnAdmin.addActionListener(this);
        btnMarcar.addActionListener(this);
        btnVer.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PrimeiraTela().criarGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
      
        if (e.getSource() == btnAdmin) {
              this.dispose();
            new Login().criarGUI();

}
                if (e.getSource() == btnMarcar) {
              this.dispose();
            new TelaRegistro().criarGUI();

}
           if (e.getSource() == btnVer) {
              this.dispose();
            new TelaLista().criarGUI();

}
          
    


    
    }}
