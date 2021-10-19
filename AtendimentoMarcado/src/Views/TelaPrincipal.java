package Views;

import Controller.pessoaController;
import Model.Pessoa;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Monteiro
 */
public class TelaPrincipal extends JFrame implements ActionListener{

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
    JLabel lblDataNascimento = new JLabel("Data de Nascimento:");
    //JLabel lblStatus = new JLabel("Status:");
    JLabel lblDataMarcacao = new JLabel("Data de Marcacao:");

    JTextField jtfId = new JTextField();
    JTextField jtfNome = new JTextField();

    JTextField jtfSexo = new JTextField();
    JTextField jtfEstadoCivil = new JTextField();
    JTextField jtfMorada = new JTextField();
    JTextField jtfNacionalidade = new JTextField();
     JFormattedTextField jtfDataMarcacao = new JFormattedTextField("DD / MM / AAAA");
    JTextField jtfAltura = new JTextField();

    JTextField jtfNomeMae = new JTextField();
    JTextField jtfNomePai = new JTextField();
     JFormattedTextField jtfDataNascimento = new JFormattedTextField("DD / MM / AAAA");
   
    JComboBox jcStatus = new JComboBox();
    JComboBox jcSexo = new JComboBox();
    JComboBox jcEstadCivil = new JComboBox();
    

    
     DefaultTableModel model = new DefaultTableModel();
    JTable tabela;
    
    
    JButton btnAdmin = new JButton("Usuario");
    JButton btnAtualizar = new JButton("Atualizar");
    JButton btnSubmeter = new JButton("Pesquisar");
    JButton btnPrimeiraTela = new JButton("Voltar");
    JButton btnApagar = new JButton("Apagar");
    Font font = new Font("serif", Font.ITALIC, 45);
    boolean[] canEdit = new boolean[]{
    false, false, false, false, false, false, false, false, false, false, false, false
    };
   

    public TelaPrincipal() {
        setTitle("Admin");
        setSize(1080, 720);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }

    public void criarGUI() {
        setLayout(null);

        lblId.setBounds(80, 350, 120, 25);
        jtfId.setBounds(105, 350, 160, 25);

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
        
        jcStatus.setBounds(320, 350, 160, 25);
        jcStatus.addItem("Activo");
        jcStatus.addItem("Desactivo");
        jcStatus.setEditable(false);
        jcStatus.setSelectedIndex(0);
        
        jcSexo.setBounds(320, 250, 160, 25);
        jcSexo.addItem("Femenino");
        jcSexo.addItem("Masculino");
        jcSexo.setEditable(false);
        jcSexo.setSelectedIndex(0);
        
        jcEstadCivil.setBounds(600, 250, 160, 25);
        jcEstadCivil.addItem("Solteiro/a");
        jcEstadCivil.addItem("Casado/a");
        jcEstadCivil.addItem("Divorciado/a");
        jcEstadCivil.addItem("Viuvo/a");
        jcEstadCivil.setEditable(false);
        jcEstadCivil.setSelectedIndex(0);

         lblDataNascimento.setBounds(480, 350, 120, 25);
        jtfDataNascimento.setBounds(600, 350, 160, 25);
        //lblStatus.setBounds(20, 490, 120, 25);
        //jtfStatus.setBounds(140, 490, 160, 25);
        lblDataMarcacao.setBounds(20, 400, 120, 25);
        jtfDataMarcacao.setBounds(130, 400, 160, 25);
        btnSubmeter.setBounds(105, 500, 160, 25);
        btnAtualizar.setBounds(300, 500, 160, 25);
        btnPrimeiraTela.setBounds(860,500,160,25);
        btnApagar.setBounds(500,500,160,25);
        btnAdmin.setBounds(680,500,160,25);
   
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
        model.addColumn("Status");
       
        tabela = new JTable(model){
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        
        
        lblNome.setToolTipText("Nome");
        lblSexo.setToolTipText("Sexo");
        btnSubmeter.setToolTipText("Submeter");
        JScrollPane scrollpane = new JScrollPane(tabela);
        scrollpane.setBounds(20, 10, 1040, 210);

        add(btnAdmin);
        add(lblId);
        add(jtfId);
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
        add(lblAltura);
        add(jtfAltura);
        //add(lblPhoto);
        //add(jtfPhoto);
        add(lblNomeMae);
        add(jtfNomeMae);
        add(lblNomePai);
        add(jtfNomePai);
        add(lblDataNascimento);
        add(jtfDataNascimento);
        //add(lblStatus);
        //add(jtfStatus);
        add(lblDataMarcacao);
        add(jtfDataMarcacao);
        add(btnSubmeter);
        add(btnAtualizar);
        add(btnPrimeiraTela);
        add(btnApagar);
        add(scrollpane);
        add(jcStatus);
        
        

        btnAtualizar.addActionListener(this);
        btnSubmeter.addActionListener(this);
        jtfNome.addActionListener(this);
        jtfSexo.addActionListener(this);
        btnPrimeiraTela.addActionListener(this);
        btnApagar.addActionListener(this);
        btnAdmin.addActionListener(this);
        
        dadosTabela();
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaPrincipal().criarGUI(); 
    }
    
    public void dadosTabela() {
        DefaultTableModel model_ = (DefaultTableModel) tabela.getModel();
        model.setNumRows(0);
        Pessoa pessoas = new Pessoa();
        ArrayList<Pessoa> dados = new pessoaController().dadosPessoa();

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
                    dados.get(i).getDataMarcacao(),
                    dados.get(i).getStatus()
                });
            }
        }
    }
      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
    }

    @Override
    public void actionPerformed(ActionEvent u) {

        if (u.getSource() == btnAtualizar) {
            if (jtfId.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Preencha os campos!");
            } else {
                
                    int id =(Integer.parseInt(jtfId.getText()));
                Pessoa atuPessoa = new Pessoa(id,jtfNome.getText(),String.valueOf(jcEstadCivil.getSelectedItem()), String.valueOf(jcSexo.getSelectedItem()), jtfMorada.getText(), jtfNacionalidade.getText(), Double.parseDouble(jtfAltura.getText()), jtfNomeMae.getText(), jtfNomePai.getText(),jtfDataNascimento.getText(), String.valueOf( jcStatus.getSelectedItem()),jtfDataMarcacao.getText());
                pessoaController po = new pessoaController();
                
                po.atualizar(atuPessoa);
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

            }
        }
        if (u.getSource() == btnSubmeter) {
            if (jtfId.getText().isEmpty()== true) {
                JOptionPane.showMessageDialog(null,"Preencha o campo ID!");
            }else{
                pessoaController po = new pessoaController();
                Pessoa pessoap = new Pessoa(); 
                int id = (Integer.parseInt(jtfId.getText()));
                  for(Pessoa pessoa : po.dadosPessoa()){
                      if( id == pessoa.getId()){
                          pessoap = pessoa;
                          break;
                      }        
                  }
                  jtfNome.setText(pessoap.getNome());
                  jcSexo.setSelectedItem(pessoap.getSexo());
                  jcEstadCivil.setSelectedItem(pessoap.getEstadoCivil());
                  jtfMorada.setText(pessoap.getMorada());
                  jtfNacionalidade.setText(pessoap.getNacionalidade());
                  jtfNomeMae.setText(pessoap.getNomeMae());
                  jtfNomePai.setText(pessoap.getNomePai());
                  jtfDataMarcacao.setText(pessoap.getDataMarcacao());
                  jcStatus.setSelectedItem(pessoap.getStatus());
                  jtfDataNascimento.setText(pessoap.getDataNascimento());
                  jtfAltura.setText(String.valueOf(pessoap.getAltura())); 
                  
                }
            }
        if(u.getSource() == btnPrimeiraTela){
            this.dispose();
            new PrimeiraTela().criarGUI();
        }
        
 if (u.getSource() == btnApagar) {
            if (jtfId.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Preencha os campos!");
            } else {
                
                    int id =(Integer.parseInt(jtfId.getText()));
                Pessoa atuPessoa = new Pessoa(id,jtfNome.getText(),String.valueOf(jcEstadCivil.getSelectedItem()), String.valueOf(jcSexo.getSelectedItem()), jtfMorada.getText(), jtfNacionalidade.getText(), Double.parseDouble(jtfAltura.getText()), jtfNomeMae.getText(), jtfNomePai.getText(),jtfDataNascimento.getText(), String.valueOf( jcStatus.getSelectedItem()),jtfDataMarcacao.getText());
                pessoaController po = new pessoaController();
                
                po.apagarPessoa(atuPessoa);
                JOptionPane.showMessageDialog(null, "Eliminado com sucesso!");

            }
            
        }
 if(u.getSource()== btnAdmin){
     this.dispose();
     new TelaAdmin().criarGUI();
 }
    }}


