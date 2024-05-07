package Ventana;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("unused")
public class Formulario extends JFrame{
     //private JFrame form1;
     private JLabel Pnombre;
     private JTextField nombre;
     private JLabel Psexo;
     private JRadioButton femenino, masculino;
     private JLabel Pedad;
     private JSpinner edad;
     private JLabel PfechaSalida;
     @SuppressWarnings("rawtypes")
    private JComboBox dia,mes,anho;
     private JLabel Pdestino;
     @SuppressWarnings("rawtypes")
    private JComboBox destino;
     private JLabel Pduracion;
     private JSpinner duracion_dias;
     private JLabel PquieresTour;
     private JRadioButton siTour, siSalida, noTour;
     private JLabel Ppasatiempos;
     private JCheckBox nadar,montar,excursionar,pescar,ninguno;
     private JLabel Pcomentarios;
     private JTextArea comentarios;
     private JCheckBox Pconfirmacion;
     private JButton solicitar, cancelar;
     private JLabel logo;
     private JTabbedPane pestanhas;
     private JTextField motivo;
     @SuppressWarnings({ "rawtypes", "unchecked" })
    public Formulario(){
          /*
          form1 = new JFrame();
          form1.setResizable(false);
          form1.setSize(400, 200);
          form1.setLocationRelativeTo(null); 
          form1.setVisible(true);
          form1.setDefaultCloseOperation(EXIT_ON_CLOSE);
          */         
          super();
          super.setTitle("Mi primer formulario");
          super.setResizable(false);
          super.setSize(750, 600);
          super.setLocationRelativeTo(null);
          super.setDefaultCloseOperation(EXIT_ON_CLOSE); 
                   
          Container contenedor = super.getContentPane(); 
          contenedor.setLayout(null);
        
          
          pestanhas = new JTabbedPane();
          pestanhas.setBounds(20,10,460,300);
          JPanel p1 = new JPanel();
          p1.setLayout(null);
          JPanel p2 = new JPanel();
          p2.setLayout(null);
          pestanhas.add("Datos personales",p1);
          pestanhas.add("Datos del viaje",p2); 
          contenedor.add(pestanhas);
                   
          
          super.getContentPane().setLayout(null);
          Pnombre = new JLabel("Nombre y Apellido: ");
          Pnombre.setBounds(20, 10, 200, 30);
          Pnombre.setFont(new Font("MS PGothic", 1, 17));
          p1.add(Pnombre);
           
          nombre = new JTextField();
          nombre.setBounds(220,10,200,30);
          p1.add(nombre);

          
          super.getContentPane().setLayout(null);
          Psexo = new JLabel("Sexo: ");
          Psexo.setBounds(20, 50, 60, 30);
          Psexo.setFont(new Font("MS PGothic", 1, 17));
          p1.add(Psexo);          
          
          femenino = new JRadioButton("Femenino",true);
          femenino.setFont(new Font("MS PGothic", 1, 17));
          femenino.setBounds(65, 50, 100, 30);
          p1.add(femenino);          
          
          masculino = new JRadioButton("Masculino");
          masculino.setFont(new Font("MS PGothic", 1, 17));
          masculino.setBounds(170, 50, 100, 30);
          p1.add(masculino);  
          
          ButtonGroup bg1 = new ButtonGroup();
          bg1.add(femenino);
          bg1.add(masculino);
                    
          Pedad = new JLabel("Edad: ");
          Pedad.setBounds(320, 50, 150, 30);
          Pedad.setFont(new Font("MS PGothic", 1, 17));
          p1.add(Pedad);
          
          edad = new JSpinner();
          edad.setFont(new Font("MS PGothic", 1, 17));
          edad.setBounds(370,50, 45, 30);
          SpinnerNumberModel snm1 = new SpinnerNumberModel();
          snm1.setValue(18);
          snm1.setMinimum(18);
          snm1.setMaximum(110);
          edad.setModel(snm1);
          p1.add(edad);

          Ppasatiempos = new JLabel("Selecciona tus pasatiempos favoritos");
          Ppasatiempos.setBounds(20, 90, 500, 30);
          Ppasatiempos.setFont(new Font("MS PGothic", 1, 17));
          p1.add(Ppasatiempos);
          
          nadar = new JCheckBox("Nadar");
          nadar.setBounds(40, 120, 100, 30);
          nadar.setFont(new Font("MS PGothic", 1, 17));
          p1.add(nadar);
          
          montar = new JCheckBox("Montar a caballo");
          montar.setBounds(150, 120, 180, 30);
          montar.setFont(new Font("MS PGothic", 1, 17));
          p1.add(montar);
          
          excursionar = new JCheckBox("Excursionar");
          excursionar.setBounds(330, 120, 130, 30);
          excursionar.setFont(new Font("MS PGothic", 1, 17));
          p1.add(excursionar);
          
          pescar = new JCheckBox("Pescar");
          pescar.setBounds(40, 150, 100, 30);
          pescar.setFont(new Font("MS PGothic", 1, 17));
          p1.add(pescar);
          
          ninguno = new JCheckBox("Ninguno");
          ninguno.setBounds(150, 150, 100, 30);
          ninguno.setFont(new Font("MS PGothic", 1, 17));
          p1.add(ninguno);
          
          
          //Tab Datos del viaje
          PfechaSalida = new JLabel("Fecha de Salida: ");
          PfechaSalida.setBounds(20, 10, 200, 30);
          PfechaSalida.setFont(new Font("MS PGothic", 1, 17));
          p2.add(PfechaSalida);

          String [] lista_dia = {"1", "2", "3", "4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};          
          dia = new JComboBox(lista_dia);
          dia.setSelectedIndex(0);
          dia.setBounds(220, 10, 40, 30);
          p2.add(dia);
          
          String [] lista_mes = {"Enero", "Febrero", "Marzo", "Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
          mes = new JComboBox(lista_mes);
          mes.setSelectedIndex(0);
          mes.setBounds(270, 10, 100, 30);
          p2.add(mes);
          
          String [] lista_anho = {"2023","2024","2025"};
          anho = new JComboBox(lista_anho);
          anho.setSelectedIndex(1);
          anho.setBounds(380, 10, 70, 30);
          p2.add(anho);
          
          Pdestino = new JLabel("Destino: ");
          Pdestino.setBounds(20, 50, 200, 30);
          Pdestino.setFont(new Font("MS PGothic", 1, 17));
          p2.add(Pdestino);
          
          String [] lista_destino = {"Colombia","Venezuela","Brazil","A la Luna"};
          destino = new JComboBox(lista_destino);
          destino.setSelectedIndex(0);
          destino.setBounds(100, 50, 150, 30);
          p2.add(destino);
          
          Pduracion = new JLabel("Duración (dias): ");
          Pduracion.setBounds(280, 50, 150, 30);
          Pduracion.setFont(new Font("MS PGothic", 1, 17));
          p2.add(Pduracion);
          
          duracion_dias = new JSpinner();
          duracion_dias.setFont(new Font("MS PGothic", 1, 17));
          duracion_dias.setBounds(405,50, 45, 30);
          SpinnerNumberModel snm2 = new SpinnerNumberModel();
          snm2.setValue(1);
          snm2.setMinimum(1);
          snm2.setMaximum(31);
          duracion_dias.setModel(snm2);
          p2.add(duracion_dias);

          PquieresTour = new JLabel("¿Te quieres unir a un tour?");
          PquieresTour.setBounds(20, 90, 250, 30);
          PquieresTour.setFont(new Font("MS PGothic", 1, 17));
          p2.add(PquieresTour);
          
          siTour = new JRadioButton("Me quiero unir a un tour privado",true);
          siTour.setFont(new Font("MS PGothic", 1, 17));
          siTour.setBounds(40, 120, 350, 30);
          p2.add(siTour);
          
          siSalida = new JRadioButton("Busco ser parte de un grupo de salida",false);
          siSalida.setFont(new Font("MS PGothic", 1, 17));
          siSalida.setBounds(40, 150, 350, 30);
          p2.add(siSalida);
          
          noTour = new JRadioButton("No me interesa realizar un tour"); //por defecto es false
          noTour.setFont(new Font("MS PGothic", 1, 17));
          noTour.setBounds(40, 180, 350, 30);
          p2.add(noTour);
          
          ButtonGroup bg2 = new ButtonGroup();//Creamos un grupo de botones para que maneje la exclusividad en los botones de radio
          bg2.add(siTour);
          bg2.add(siSalida);
          bg2.add(noTour);
          
          Pcomentarios = new JLabel("Agrega aquí, tus comentarios:");
          Pcomentarios.setBounds(20, 330, 500, 30);
          Pcomentarios.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(Pcomentarios);
          
          comentarios = new JTextArea();
          comentarios.setBounds(20, 360, 710, 90);
          comentarios.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(comentarios);
          
          Pconfirmacion = new JCheckBox("Estoy de acuerdo con todos los términos");
          Pconfirmacion.setBounds(180, 470, 500, 40); //340
          Pconfirmacion.setFont(new Font("MS PGothic", 1, 20));
          Pconfirmacion.setForeground(Color.RED);
          contenedor.add(Pconfirmacion);
          
          Pconfirmacion.addItemListener(new ItemListener(){
              public void itemStateChanged(ItemEvent e){
                  //System.out.println("Cambio "+);
                  if (e.getStateChange()==1){
                      Pconfirmacion.setForeground(Color.BLUE);
                      solicitar.setEnabled(true);
                  }
                  else if (e.getStateChange()==2){
                           Pconfirmacion.setForeground(Color.RED);
                           solicitar.setEnabled(false);
                  }    
              }
          });
          
          solicitar = new JButton("Solicitar mi viaje");
          solicitar.setFont(new Font("MS PGothic", 1, 18));
          solicitar.setEnabled(false);
          solicitar.setBounds(200, 520, 200, 30);
          contenedor.add(solicitar);
          solicitar.addMouseListener(new ManejaBotones());

          cancelar = new JButton("Cancelar");
          cancelar.setFont(new Font("MS PGothic", 1, 18));
          cancelar.setEnabled(true);
          cancelar.setBounds(420, 520, 120, 30);
          contenedor.add(cancelar);  
          
          cancelar.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
                  System.out.println("Hiciste clic en Cancelar");
                  nombre.setText("");
                  femenino.setSelected(true);
                  edad.setValue(18);
                  nadar.setSelected(false);
                  montar.setSelected(false);
                  excursionar.setSelected(false);
                  pescar.setSelected(false);
                  ninguno.setSelected(false);
                  comentarios.setText("");
                  Pconfirmacion.setSelected(false);
                  //Aqui falta volver al estado inicial los compoenentes del
                  //Tab Datos del viaje
                  
              }
          });
          
          Image fondo = new ImageIcon(getClass().getResource("../Imagenes/fondo.jpg")).getImage(); //Creamos un objeto de la clase ImageIcon con la ruta en la que se encuentra la imagen fondo en el proyecto   
          logo = new JLabel();
          logo.setBounds(490, 30, 240, 280);
          logo.setIcon(new ImageIcon(fondo.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH))); 
          //Con este método redimensionamos la imagen, los 2 primeros datos es el tamaño y el último como se redimensionará, en este caso este no reduce tanto la calidad
          contenedor.add(logo); //Añadimos la etiqueta al panel
                    
          
          super.setVisible(true); //Se coloca visible el Jframe que tenemos por herencia
     } 
     
     
     //Clase interna privada
     class ManejaBotones implements MouseListener{

         public void mouseClicked(MouseEvent e) {
            System.out.println("Hiciste clic en Solicitar mi viaje");
            String pasatiempos="";
            System.out.println("Nombre: "+nombre.getText());
            if (femenino.isSelected())
                System.out.println("Sexo: Femenino");
            else System.out.println("Sexo: Masculino");
            System.out.println("Edad :"+edad.getValue());
            
            if (nadar.isSelected())
                pasatiempos+="nadar ";
            if (montar.isSelected())
                pasatiempos+="montar ";
            if (excursionar.isSelected())
                pasatiempos+="excursionar ";
            if (pescar.isSelected())
                pasatiempos+="pescar ";
            if (ninguno.isSelected())
                pasatiempos+="Ninguno ";
            
            System.out.println("Pasatiempos: "+pasatiempos);

                  //Aqui falta imprimir los valores de los demas componentes          
            
        }

        public void mousePressed(MouseEvent e) {}

        public void mouseReleased(MouseEvent e) {}

        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}
     
     }

}
