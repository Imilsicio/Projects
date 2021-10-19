
package Views;

import Controller.pessoaController;
import Model.Pessoa;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Monteiro
 */
public class TelaLista  extends JFrame implements ActionListener{

JLabel lblId = new JLabel("Id:");
    JLabel lblNome = new JLabel("Nome:");
    JLabel lblSexo = new JLabel("Sexo:");
    JLabel lblEstadoCivil = new JLabel("Estado Civil:");
    JLabel lblMorada = new JLabel("Morada:");
    JLabel lblNacionalidade = new JLabel("Nacionalidade:");
    JLabel lblAltura = new JLabel("Altura:");
    //JLabel lblPhoto = new JLabel("Photo:");
    JLabel lblNomeMae = new JLabel("Nome da Mae:");
    JLabel lblNomePai = new JLabel("Nome do Pai:");
    //JLabel lblDataNascimento = new JLabel("Data de Nascimento:");
    //JLabel lblStatus = new JLabel("Status:");
    //JLabel lblDataMarcacao = new JLabel("Data de Marcacao:");

    JTextField jtfId = new JTextField();
    JTextField jtfNome = new JTextField();

    JTextField jtfSexo = new JTextField();
    JTextField jtfEstadoCivil = new JTextField();
    JTextField jtfMorada = new JTextField();
    JTextField jtfNacionalidade = new JTextField();
    JTextField jtfAltura = new JTextField();
    //JTextField jtfPhoto = new JTextField();
    JTextField jtfNomeMae = new JTextField();
    JTextField jtfNomePai = new JTextField();
    JTextField jtfDataNascimento = new JTextField();
    //JTextField jtfStatus = new JTextField();
    JTextField jtfDataMarcacao = new JTextField();
    
     DefaultTableModel model = new DefaultTableModel();
    JTable tabela;

    JButton btnAtualizar = new JButton("Atualizar");
    JButton btnSubmeter = new JButton("Pesquisar");
    JButton btnPrimeiraTela = new JButton("VOltar");
   

    Font font = new Font("serif", Font.ITALIC, 45);
    boolean[] canEdit = new boolean[]{
    false, false, false, false, false, false, false, false, false, false, false, false
    };

    public TelaLista() {
        setTitle("Lista dos Marcados");
        setSize(1080, 720);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }

    public void criarGUI() {
        setLayout(null);

        lblId.setBounds(80, 350, 120, 25);
        jtfId.setBounds(105, 350, 120, 25);

        lblNome.setBounds(40, 250, 120, 25);
        jtfNome.setBounds(105, 250, 160, 25);
 
        lblSexo.setBounds(280, 250, 120, 25);
        jtfSexo.setBounds(320, 250, 160, 25);
 
        lblEstadoCivil.setBounds(530, 250, 120, 25);
        jtfEstadoCivil.setBounds(600, 250, 160, 25);

        lblMorada.setBounds(800, 250, 120, 25);
        jtfMorada.setBounds(860, 250, 160, 25);

        lblNacionalidade.setBounds(20, 300, 120, 25);
        jtfNacionalidade.setBounds(105, 300, 160, 25);

        lblAltura.setBounds(280, 300, 120, 25);
        jtfAltura.setBounds(320, 300, 160, 25);
        //lblPhoto.setBounds(20, 290, 290, 25);
        //jtfPhoto.setBounds(140, 290, 160, 25);
        lblNomeMae.setBounds(515, 300, 120, 25);
        jtfNomeMae.setBounds(600, 300, 160, 25);

        lblNomePai.setBounds(770, 300, 120, 25);
        jtfNomePai.setBounds(860, 300, 160, 25);

        // lblDataNascimento.setBounds(20, 450, 120, 25);
        jtfDataNascimento.setBounds(140, 450, 160, 25);
        //lblStatus.setBounds(20, 490, 120, 25);
        //jtfStatus.setBounds(140, 490, 160, 25);
        //lblDataMarcacao.setBounds(20, 550, 120, 25);
        jtfDataMarcacao.setBounds(140, 550, 160, 25);
        btnSubmeter.setBounds(105, 400, 160, 25);
        btnAtualizar.setBounds(300, 400, 160, 25);
        btnPrimeiraTela.setBounds(860,400,160,25);

        model.addColumn("Id");
        model.addColumn("Nome");
        model.addColumn("Sexo");
        model.addColumn("Estado Civil");
        model.addColumn("Morada");
        model.addColumn("Nacionalidade");
        model.addColumn("Data da Nascimento");
        model.addColumn("Nome da Mae");
        model.addColumn("Nome da Pai");
        model.addColumn("Data da MArcacao");
       
        tabela = new JTable(model){
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        
        
        lblNome.setToolTipText("Nome");
        lblSexo.setToolTipText("Sexo");
        btnSubmeter.setToolTipText("final");
        JScrollPane scrollpane = new JScrollPane(tabela);
        scrollpane.setBounds(20, 10, 1040, 210);

        
  
        add(btnPrimeiraTela);
        add(scrollpane);
        
        


       
        btnPrimeiraTela.addActionListener(this);
        
        dadosTabela();
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaLista().criarGUI(); 
    }
    
    public void dadosTabela() {
        DefaultTableModel model_ = (DefaultTableModel) tabela.getModel();
        model.setNumRows(0);
        Pessoa pessoas = new Pessoa();
        ArrayList<Pessoa> dados = new pessoaController().dadosPessoaa();

        if (dados.isEmpty() == false) {
            for (int i = 0; i < dados.size(); i++) {

                model_.addRow(new String[]{
                    dados.get(i).getId() + "",
                    dados.get(i).getNome() + "",
                    dados.get(i).getEstadoCivil(),
                    dados.get(i).getSexo(),
                    dados.get(i).getMorada(),
                    dados.get(i).getNacionalidade(),
                    dados.get(i).getDataNascimento(),
                    dados.get(i).getNomeMae(),
                    dados.get(i).getNomePai(),
                    dados.get(i).getDataMarcacao()
                });
            }
        }
    }
      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
    }

    @Override
    public void actionPerformed(ActionEvent u) {

   
        if (u.getSource() == btnSubmeter) {
            if (jtfId.getText().isEmpty()== true) {
                JOptionPane.showMessageDialog(null,"Preencha o campo ID!");
            }else{
                pessoaController po = new pessoaController();
                Pessoa pessoap = new Pessoa(); 
                int id = (Integer.parseInt(jtfId.getText()));
                  for(Pessoa pessoa : po.dadosPessoaa()){
                      if( id == pessoa.getId()){
                          pessoap = pessoa;
                          break;
                      }        
                  }
                  jtfNome.setText(pessoap.getNome());
                  jtfSexo.setText(pessoap.getSexo());
                  jtfEstadoCivil.setText(pessoap.getEstadoCivil());
                  jtfMorada.setText(pessoap.getMorada());
                  jtfNacionalidade.setText(pessoap.getNacionalidade());
                  jtfDataNascimento.setText(pessoap.getDataNascimento());
                  jtfNomeMae.setText(pessoap.getNomeMae());
                  jtfNomePai.setText(pessoap.getNomePai());
                  jtfDataMarcacao.setText(pessoap.getDataMarcacao());
                  
                  
                }
            }
        if(u.getSource() == btnPrimeiraTela){
            this.dispose();
            new PrimeiraTela().criarGUI();
        }
        }

    }



    

