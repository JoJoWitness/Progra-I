package Parcial_II.Tema_II.Ejercicios1_PorMi.Window;

import java.awt.*;
import javax.swing.*;

public class Window extends JFrame{

  JLabel label_NombreApellido,label_FechaDeSalid, label_FechaDeSalida, label_Destino;
  JTextField textField_NombreApellido;
  @SuppressWarnings("rawtypes")
  JComboBox comboBox_dia, comboBox_meses, comboBox_annos, comboBox_destinos;

  public Container panel;

  public Window() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocation(0,0);
    setLocationRelativeTo(null);
    this.setResizable(false);

    this.setSize(1200, 1000);

    mainPanel();
    setVisible(true);
    
  }


         

  public void mainPanel() {
    panel = super.getContentPane();
    panel.setLayout(null);
    panel.setBackground(new Color(233, 233, 237));
    

    leftContainer();
    tourUserInfo();
    hobbiesUserInfo();
    textAreaUserInfo();
    termsConditions();
    requestButton();
    adImage();
  }

  public void leftContainer() {

    generalUserInfo();
  }

  public void generalUserInfo(){
    label_NombreApellido = new JLabel("Nombre y Apellido:");
    label_NombreApellido.setBounds(100, 50, 200, 30);
    label_NombreApellido.setFont(new Font("Helvetica",1, 16));
    panel.add(label_NombreApellido);

    textField_NombreApellido = new JTextField();
    textField_NombreApellido.setBounds(300, 50, 325, 30);
    panel.add(textField_NombreApellido);

    label_FechaDeSalida = new JLabel("Fecha de Salida:");
    label_FechaDeSalida.setBounds(100, 100, 200, 30);
    label_FechaDeSalida.setFont(new Font("Helvetica",1, 16));
    panel.add(label_FechaDeSalida);

    String  dias[] = {"1", "2", "3", "4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String meses[] = {"Enero", "Febrero", "Marzo", "Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    String annos[] = {"2024", "2025", "2026"};      

    comboBox_dia = new JComboBox<>(dias);
    comboBox_meses = new JComboBox<>(meses);
    comboBox_annos = new JComboBox<>(annos);

    comboBox_dia.setSelectedIndex(0);
    comboBox_dia.setBounds(300, 100, 50, 30);
    panel.add(comboBox_dia);
    comboBox_meses.setSelectedIndex(0);
    comboBox_meses.setBounds(400, 100, 100, 30);
    panel.add(comboBox_annos);
    comboBox_annos.setSelectedIndex(0);
    comboBox_annos.setBounds(550, 100, 75, 30);
    panel.add(comboBox_meses);

    label_Destino = new JLabel("Destino");
    label_Destino.setBounds(100, 150, 200, 30);
    label_Destino.setFont(new Font("Helvetica",1, 16));
    panel.add(label_Destino);

    String destinos[]= {"Colombia", "Venezuela", "USA"};
    comboBox_destinos = new JComboBox<>(destinos);
    comboBox_destinos.setSelectedIndex(0);
    comboBox_destinos.setBounds(300, 150, 100, 30);
    panel.add(comboBox_destinos);

    label_Destino = new JLabel("Duracion (Dias)");
    label_Destino.setBounds(425, 150, 150, 30);
    label_Destino.setFont(new Font("Helvetica",1, 16));
    panel.add(label_Destino);

    JSpinner jSpinner_dias = new JSpinner();
    jSpinner_dias.setFont(new Font("Helvetica",1, 16));
    jSpinner_dias.setBounds(575, 150, 50, 30);
    SpinnerNumberModel spinner = new SpinnerNumberModel();
    spinner.setValue(1);
    spinner.setMinimum(1);
    spinner.setMaximum(31);
    jSpinner_dias.setModel(spinner);
    panel.add(jSpinner_dias);
  }

  public void tourUserInfo(){
    JLabel label_Tours = new JLabel("¿Te quieres unir a un tour?");
    label_Tours.setBounds(100, 200, 300, 30);
    label_Tours.setFont(new Font("Helvetica",1, 16));
    panel.add(label_Tours); 

    JRadioButton radio_opcion1 = new JRadioButton("Me quiero unir a un tour privado",true);
    radio_opcion1.setBounds(125, 225, 400, 30);
    radio_opcion1.setBackground(new Color(233, 233, 237));
    radio_opcion1.setFont(new Font("Helvetica",1, 16));
    panel.add(radio_opcion1); 

    JRadioButton radio_opcion2 = new JRadioButton("Busco ser parte de un grupo de salida",false);
    radio_opcion2.setBounds(125, 250, 400, 30);
    radio_opcion2.setBackground(new Color(233, 233, 237));
    radio_opcion2.setFont(new Font("Helvetica",1, 16));
    panel.add(radio_opcion2); 

    JRadioButton radio_opcion3 = new JRadioButton("No me interesa realizar un tour");
    radio_opcion3.setBounds(125, 275, 400, 30);
    radio_opcion3.setBackground(new Color(233, 233, 237));
    radio_opcion3.setFont(new Font("Helvetica",1, 16));
    panel.add(radio_opcion3); 

    ButtonGroup radio_ButtonGroup = new ButtonGroup();
    radio_ButtonGroup.add(radio_opcion1);
    radio_ButtonGroup.add(radio_opcion2);
    radio_ButtonGroup.add(radio_opcion3);

  }

  public void hobbiesUserInfo(){
    JLabel label_hobbies = new JLabel("Selecciona tus pasatiempos favoritos");
    label_hobbies.setBounds(100, 325, 350, 30);
    label_hobbies.setFont(new Font("Helvetica",1, 16));
    panel.add(label_hobbies); 

    JCheckBox swim = new JCheckBox("Nadar");
    swim.setBounds(125, 350, 125, 30);
    swim.setBackground(new Color(233, 233, 237));
    swim.setFont(new Font("Helvetica",1, 16));
    panel.add(swim);
    
    JCheckBox horse = new JCheckBox("Montar a caballo");
    horse.setBounds(250, 350, 200, 30);
    horse.setBackground(new Color(233, 233, 237));
    horse.setFont(new Font("Helvetica",1, 16));
    panel.add(horse);

    JCheckBox hiking = new JCheckBox("Excursionar");
    hiking.setBounds(450, 350, 150, 30);
    hiking.setBackground(new Color(233, 233, 237));
    hiking.setFont(new Font("Helvetica",1, 16));
    panel.add(hiking);

    JCheckBox fishing = new JCheckBox("Pescar");
    fishing.setBounds(125, 375, 125, 30);
    fishing.setBackground(new Color(233, 233, 237));
    fishing.setFont(new Font("Helvetica",1, 16));
    panel.add(fishing);

    JCheckBox none = new JCheckBox("Ninguno");
    none.setBounds(250, 375, 150, 30);
    none.setBackground(new Color(233, 233, 237));
    none.setFont(new Font("Helvetica",1, 16));
    panel.add(none);
  
  
  }
  
  public void textAreaUserInfo(){
    JLabel label_text = new JLabel("Agrega aquí, tus comentarios:");
    label_text.setBounds(100, 425, 350, 30);
    label_text.setFont(new Font("Helvetica",1, 16));
    panel.add(label_text); 

    JTextArea textarea = new JTextArea();
    textarea.setBounds(100, 475, 950, 150);
    textarea.setFont(new Font("Helvetica",1, 16));
    panel.add(textarea);

  }

  public void termsConditions(){
    JCheckBox label_tc = new JCheckBox("Estoy de acuerdo con todos los términos");
    label_tc.setBounds(100, 650, 500, 30);
    label_tc.setFont(new Font("Helvetica",1, 20));
    label_tc.setForeground(new Color(166, 115, 231));
    panel.add(label_tc); 
  }

  public void requestButton(){
      JButton btn = new JButton("Solicitar mi viaje");
      btn.setFont(new Font("Helvetica",1, 18));
      btn.setEnabled(false);
      btn.setBounds(100, 700, 350, 30);
      panel.add(btn);
  }

  public void adImage(){
    Image bg = new ImageIcon(getClass().getResource("../Image/James_Sowerby_-_Crimson_carnation_clove_pink_Dianthus_caryophyllus_-_(MeisterDrucke-1430646).jpg")).getImage(); //Creamos un objeto de la clase ImageIcon con la ruta en la que se encuentra la imagen fondo en el proyecto   
    JLabel adv = new JLabel();
    adv.setBounds(675, 50, 375, 375);
    adv.setIcon(new ImageIcon(bg.getScaledInstance(adv.getWidth(), adv.getHeight(), Image.SCALE_SMOOTH))); 
    panel.add(adv);
  }
}
