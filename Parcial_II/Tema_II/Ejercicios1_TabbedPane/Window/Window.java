package Parcial_II.Tema_II.Ejercicios1_TabbedPane.Window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;

import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

public class Window extends JFrame{

  JLabel label_NombreApellido,label_FechaDeSalid, label_FechaDeSalida, label_Destino;
  JTextField textField_NombreApellido;
  @SuppressWarnings("rawtypes")
  JComboBox comboBox_dia, comboBox_meses, comboBox_annos, comboBox_destinos;
  JTextArea textarea;
  JRadioButton radio_genero1, radio_genero2, radio_opcion1, radio_opcion2, radio_opcion3;
  JSpinner jSpinner_edad, jSpinner_dias;
  JCheckBox swim, horse, hiking, fishing, none;


  public Container panel;
  JPanel p1, p2;

  public Window() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocation(0,0);
    setLocationRelativeTo(null);
    this.setResizable(false);

    this.setSize(1200, 900);

    mainPanel();
    setVisible(true);
    
  }    

  public void mainPanel() {
    panel = super.getContentPane();
    panel.setLayout(null);
    panel.setBackground(new Color(233, 233, 237));
    

    addTabbedPane();
    personalInfo();
    travelInfo();
    textAreaUserInfo();
    termsConditions();
    adImage();
  }

  public void personalInfo(){

    label_NombreApellido = new JLabel("Nombre y Apellido:");
    label_NombreApellido.setBounds(25, 25, 200, 30);
    label_NombreApellido.setFont(new Font("Helvetica",1, 16));
    p1.add(label_NombreApellido);

    textField_NombreApellido = new JTextField();
    textField_NombreApellido.setBounds(225, 25, 300, 30);
    p1.add(textField_NombreApellido);

    JLabel label_sexo = new JLabel("Sexo:");
    label_sexo.setBounds(25, 75, 75, 30);
    label_sexo.setFont(new Font("Helvetica",1, 16));
    p1.add(label_sexo);

    radio_genero1 = new JRadioButton("M",true);
    radio_genero1.setBounds(100, 75, 50, 30);
    radio_genero1.setBackground(new Color(233, 233, 237));
    radio_genero1.setFont(new Font("Helvetica",1, 16));
    p1.add(radio_genero1); 

    radio_genero2 = new JRadioButton("F");
    radio_genero2.setBounds(150, 75, 50, 30);
    radio_genero2.setBackground(new Color(233, 233, 237));
    radio_genero2.setFont(new Font("Helvetica",1, 16));
    p1.add(radio_genero2); 

    JLabel label_edad = new JLabel("Edad:");
    label_edad.setBounds(250, 75, 75, 30);
    label_edad.setFont(new Font("Helvetica",1, 16));
    p1.add(label_edad);

    jSpinner_edad = new JSpinner();
    jSpinner_edad.setFont(new Font("Helvetica",1, 16));
    jSpinner_edad.setBounds(325, 75, 50, 30);
    SpinnerNumberModel spinner = new SpinnerNumberModel();
    spinner.setValue(1);
    spinner.setMinimum(1);
    spinner.setMaximum(99);
    jSpinner_edad.setModel(spinner);
    p1.add(jSpinner_edad);

    ButtonGroup radio_ButtonGroup = new ButtonGroup();
    radio_ButtonGroup.add(radio_genero1);
    radio_ButtonGroup.add(radio_genero2);

    JLabel label_hobbies = new JLabel("Selecciona tus pasatiempos favoritos");
    label_hobbies.setBounds(25, 125, 350, 30);
    label_hobbies.setFont(new Font("Helvetica",1, 16));
    p1.add(label_hobbies); 

    swim = new JCheckBox("Nadar");
    swim.setBounds(25, 175, 125, 30);
    swim.setBackground(new Color(233, 233, 237));
    swim.setFont(new Font("Helvetica",1, 16));
    p1.add(swim);
    
    horse = new JCheckBox("Montar a caballo");
    horse.setBounds(150, 175, 200, 30);
    horse.setBackground(new Color(233, 233, 237));
    horse.setFont(new Font("Helvetica",1, 16));
    p1.add(horse);

    hiking = new JCheckBox("Excursionar");
    hiking.setBounds(350, 175, 150, 30);
    hiking.setBackground(new Color(233, 233, 237));
    hiking.setFont(new Font("Helvetica",1, 16));
    p1.add(hiking);

    fishing = new JCheckBox("Pescar");
    fishing.setBounds(25, 200, 125, 30);
    fishing.setBackground(new Color(233, 233, 237));
    fishing.setFont(new Font("Helvetica",1, 16));
    p1.add(fishing);

    none = new JCheckBox("Ninguno");
    none.setBounds(150, 200, 150, 30);
    none.setBackground(new Color(233, 233, 237));
    none.setFont(new Font("Helvetica",1, 16));
    p1.add(none);

  }
  
  public void travelInfo(){
    label_FechaDeSalida = new JLabel("Fecha de Salida:");
    label_FechaDeSalida.setBounds(25, 25, 150, 30);
    label_FechaDeSalida.setFont(new Font("Helvetica",1, 16));
    p2.add(label_FechaDeSalida);

    String  dias[] = {"1", "2", "3", "4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String meses[] = {"Enero", "Febrero", "Marzo", "Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    String annos[] = {"2024", "2025", "2026"};      

    comboBox_dia = new JComboBox<>(dias);
    comboBox_meses = new JComboBox<>(meses);
    comboBox_annos = new JComboBox<>(annos);

    comboBox_dia.setSelectedIndex(0);
    comboBox_dia.setBounds(200, 25, 50, 30);
    p2.add(comboBox_dia);
    comboBox_meses.setSelectedIndex(0);
    comboBox_meses.setBounds(275, 25, 100, 30);
    p2.add(comboBox_annos);
    comboBox_annos.setSelectedIndex(0);
    comboBox_annos.setBounds(400, 25, 75, 30);
    p2.add(comboBox_meses);

    label_Destino = new JLabel("Destino:");
    label_Destino.setBounds(25, 75, 100, 30);
    label_Destino.setFont(new Font("Helvetica",1, 16));
    p2.add(label_Destino);

    String destinos[]= {"Colombia", "Venezuela", "USA"};
    comboBox_destinos = new JComboBox<>(destinos);
    comboBox_destinos.setSelectedIndex(0);
    comboBox_destinos.setBounds(150, 75, 100, 30);
    p2.add(comboBox_destinos);

    label_Destino = new JLabel("Duracion (Dias)");
    label_Destino.setBounds(275, 75, 150, 30);
    label_Destino.setFont(new Font("Helvetica",1, 16));
    p2.add(label_Destino);

    jSpinner_dias = new JSpinner();
    jSpinner_dias.setFont(new Font("Helvetica",1, 16));
    jSpinner_dias.setBounds(425, 75, 50, 30);
    SpinnerNumberModel spinner = new SpinnerNumberModel();
    spinner.setValue(1);
    spinner.setMinimum(1);
    spinner.setMaximum(31);
    jSpinner_dias.setModel(spinner);
    p2.add(jSpinner_dias);

    JLabel label_Tours = new JLabel("¿Te quieres unir a un tour?");
    label_Tours.setBounds(25, 125, 300, 30);
    label_Tours.setFont(new Font("Helvetica",1, 16));
    p2.add(label_Tours); 

    radio_opcion1 = new JRadioButton("Me quiero unir a un tour privado",true);
    radio_opcion1.setBounds(50, 150, 400, 30);
    radio_opcion1.setBackground(new Color(233, 233, 237));
    radio_opcion1.setFont(new Font("Helvetica",1, 16));
    p2.add(radio_opcion1); 

    radio_opcion2 = new JRadioButton("Busco ser parte de un grupo de salida",false);
    radio_opcion2.setBounds(50, 175, 400, 30);
    radio_opcion2.setBackground(new Color(233, 233, 237));
    radio_opcion2.setFont(new Font("Helvetica",1, 16));
    p2.add(radio_opcion2); 

    radio_opcion3 = new JRadioButton("No me interesa realizar un tour");
    radio_opcion3.setBounds(50, 200, 400, 30);
    radio_opcion3.setBackground(new Color(233, 233, 237));
    radio_opcion3.setFont(new Font("Helvetica",1, 16));
    p2.add(radio_opcion3); 

    ButtonGroup radio_ButtonGroup = new ButtonGroup();
    radio_ButtonGroup.add(radio_opcion1);
    radio_ButtonGroup.add(radio_opcion2);
    radio_ButtonGroup.add(radio_opcion3);


  }
  
  public void textAreaUserInfo(){
    JLabel label_text = new JLabel("Agrega aquí, tus comentarios:");
    label_text.setBounds(100, 425, 350, 30);
    label_text.setFont(new Font("Helvetica",1, 16));
    panel.add(label_text); 

    textarea = new JTextArea();
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

    JButton btn = new JButton("Solicitar mi viaje");
    btn.setFont(new Font("Helvetica",1, 18));
    btn.setEnabled(false);
    btn.setBounds(100, 700, 350, 30);
    panel.add(btn);
    btn.addMouseListener(new SubmitButton());

    JButton cancel = new JButton("Cancelar");
    cancel.setFont(new Font("MS PGothic", 1, 18));
    cancel.setEnabled(true);
    cancel.setBounds(500, 700, 150, 30);
    panel.add(cancel);  

    label_tc.addItemListener(new ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent e) {
        if(e.getStateChange() == 1){
         label_tc.setForeground(new Color(31, 180, 255));
         btn.setEnabled(true);
        }
        else if(e.getStateChange() == 2){
          label_tc.setForeground(new Color(166, 115, 231));
          btn.setEnabled(false);
        }
      }
    
    });

    cancel.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
          System.out.println("Hiciste clic en Cancelar");
          textField_NombreApellido.setText("");
          radio_genero1.setSelected(true);
          jSpinner_edad.setValue(18);
          swim.setSelected(false);
          horse.setSelected(false);
          hiking.setSelected(false);
          fishing.setSelected(false);
          none.setSelected(false);
          textarea.setText("");
          btn.setSelected(false);
          comboBox_annos.setSelectedIndex(0);
          comboBox_destinos.setSelectedIndex(0);
          comboBox_dia.setSelectedIndex(0);
          comboBox_meses.setSelectedIndex(0);
          jSpinner_dias.setValue(1);
          radio_opcion1.setSelected(true);
        }});

  }



  public void adImage(){
    Image bg = new ImageIcon(getClass().getResource("../Image/James_Sowerby_-_Crimson_carnation_clove_pink_Dianthus_caryophyllus_-_(MeisterDrucke-1430646).jpg")).getImage(); //Creamos un objeto de la clase ImageIcon con la ruta en la que se encuentra la imagen fondo en el proyecto   
    JLabel adv = new JLabel();
    adv.setBounds(675, 50, 375, 375);
    adv.setIcon(new ImageIcon(bg.getScaledInstance(adv.getWidth(), adv.getHeight(), Image.SCALE_SMOOTH))); 
    panel.add(adv);
  }

  public void addTabbedPane(){
    JTabbedPane tabbedPane = new JTabbedPane();
    tabbedPane.setBounds(100, 50,550,400);
    tabbedPane.setBackground(new Color(233, 233, 237));
    p1 = new JPanel();
    p1.setLayout(null);
    p2 = new JPanel();
    p2.setLayout(null);
    tabbedPane.add("Datos personales",p1);
    tabbedPane.add("Datos del viaje",p2); 
    panel.add(tabbedPane);
    
  }

   class SubmitButton implements MouseListener{

        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            System.out.println("Hiciste clic en Solicitar mi viaje");
            String pasatiempos="";
            System.out.println("Nombre: "+textField_NombreApellido.getText());
            if (radio_genero2.isSelected())
                System.out.println("Sexo: Femenino");
            else System.out.println("Sexo: Masculino");
            System.out.println("Edad :"+jSpinner_dias.getValue());
            
            if (swim.isSelected())
                pasatiempos+="nadar ";
            if (horse.isSelected())
                pasatiempos+="montar ";
            if (hiking.isSelected())
                pasatiempos+="excursionar ";
            if (fishing.isSelected())
                pasatiempos+="pescar ";
            if (none.isSelected())
                pasatiempos+="Ninguno ";
            
            System.out.println("Pasatiempos: "+pasatiempos);

            System.out.println("Destino: " + comboBox_destinos.getSelectedItem());
            System.out.println("Fecha de salida: " + comboBox_dia.getSelectedItem() + "/" + comboBox_meses.getSelectedItem() + "/" + comboBox_annos.getSelectedItem() );
          
            
                  //Aqui falta imprimir los valores de los demas componentes          
            
        }
        
        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {}
        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {}
        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {}
        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {}

       
}
}
