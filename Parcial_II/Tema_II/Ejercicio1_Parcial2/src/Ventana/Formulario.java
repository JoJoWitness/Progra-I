package Ventana;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
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

public class Formulario extends JFrame{
     //private JFrame form1;
     private JLabel Pnombre;
     private JTextField nombre;
     private JLabel PfechaSalida;
     private JComboBox dia,mes,anho;
     private JLabel Pdestino;
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
     private JButton solicitar;
     private JLabel logo;
     private JTabbedPane pestanhas;
     private JTextField motivo;
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
          super.setResizable(false);
          super.setSize(700, 900);
          super.setLocationRelativeTo(null);
          super.setDefaultCloseOperation(EXIT_ON_CLOSE); 
                   
          Container contenedor = super.getContentPane(); 
          contenedor.setLayout(null);
         
          super.getContentPane().setLayout(null);
          Pnombre = new JLabel("Nombre y Apellido: ");
          Pnombre.setBounds(20, 50, 200, 30);
          Pnombre.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(Pnombre);
           
          nombre = new JTextField();
          nombre.setBounds(220,50,200,30);
          contenedor.add(nombre);
          
          PfechaSalida = new JLabel("Fecha de Salida: ");
          PfechaSalida.setBounds(20, 90, 200, 30);
          PfechaSalida.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(PfechaSalida);

          String [] lista_dia = {"1", "2", "3", "4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};          
          dia = new JComboBox(lista_dia);
          dia.setSelectedIndex(0);
          dia.setBounds(220, 90, 40, 30);
          contenedor.add(dia);
          
          String [] lista_mes = {"Enero", "Febrero", "Marzo", "Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
          mes = new JComboBox(lista_mes);
          mes.setSelectedIndex(0);
          mes.setBounds(270, 90, 100, 30);
          contenedor.add(mes);
          
          String [] lista_anho = {"2023","2024","2025"};
          anho = new JComboBox(lista_anho);
          anho.setSelectedIndex(1);
          anho.setBounds(380, 90, 70, 30);
          contenedor.add(anho);
          
          Pdestino = new JLabel("Destino: ");
          Pdestino.setBounds(20, 130, 200, 30);
          Pdestino.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(Pdestino);
          
          String [] lista_destino = {"Colombia","Venezuela","Brazil","A la Luna"};
          destino = new JComboBox(lista_destino);
          destino.setSelectedIndex(0);
          destino.setBounds(100, 130, 150, 30);
          contenedor.add(destino);
          
          Pduracion = new JLabel("Duración (dias): ");
          Pduracion.setBounds(280, 130, 150, 30);
          Pduracion.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(Pduracion);
          
          duracion_dias = new JSpinner();
          duracion_dias.setFont(new Font("MS PGothic", 1, 17));
          duracion_dias.setBounds(405,130, 45, 30);
          SpinnerNumberModel snm1 = new SpinnerNumberModel();
          snm1.setValue(1);
          snm1.setMinimum(1);
          snm1.setMaximum(31);
          duracion_dias.setModel(snm1);
          contenedor.add(duracion_dias);

          PquieresTour = new JLabel("¿Te quieres unir a un tour?");
          PquieresTour.setBounds(20, 170, 250, 30);
          PquieresTour.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(PquieresTour);
          
          siTour = new JRadioButton("Me quiero unir a un tour privado",true);
          siTour.setFont(new Font("MS PGothic", 1, 17));
          siTour.setBounds(40, 200, 350, 30);
          contenedor.add(siTour);
          
          siSalida = new JRadioButton("Busco ser parte de un grupo de salida",false);
          siSalida.setFont(new Font("MS PGothic", 1, 17));
          siSalida.setBounds(40, 230, 350, 30);
          contenedor.add(siSalida);
          
          noTour = new JRadioButton("No me interesa realizar un tour"); //por defecto es false
          noTour.setFont(new Font("MS PGothic", 1, 17));
          noTour.setBounds(40, 260, 350, 30);
          contenedor.add(noTour);
          
          ButtonGroup bg1 = new ButtonGroup();//Creamos un grupo de botones para que maneje la exclusividad en los botones de radio
          bg1.add(siTour);
          bg1.add(siSalida);
          bg1.add(noTour);
          
          
          Ppasatiempos = new JLabel("Selecciona tus pasatiempos favoritos");
          Ppasatiempos.setBounds(20, 300, 500, 30);
          Ppasatiempos.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(Ppasatiempos);
          
          nadar = new JCheckBox("Nadar");
          nadar.setBounds(40, 330, 100, 30);
          nadar.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(nadar);
          
          montar = new JCheckBox("Montar a caballo");
          montar.setBounds(150, 330, 180, 30);
          montar.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(montar);
          
          excursionar = new JCheckBox("Excursionar");
          excursionar.setBounds(330, 330, 130, 30);
          excursionar.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(excursionar);
          
          pescar = new JCheckBox("Pescar");
          pescar.setBounds(40, 360, 100, 30);
          pescar.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(pescar);
          
          ninguno = new JCheckBox("Ninguno");
          ninguno.setBounds(150, 360, 100, 30);
          ninguno.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(ninguno);
          
          Pcomentarios = new JLabel("Agrega aquí, tus comentarios:");
          Pcomentarios.setBounds(20, 400, 500, 30);
          Pcomentarios.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(Pcomentarios);
          
          comentarios = new JTextArea();
          comentarios.setBounds(20, 430, 650, 90);
          comentarios.setFont(new Font("MS PGothic", 1, 17));
          contenedor.add(comentarios);
          
          Pconfirmacion = new JCheckBox("Estoy de acuerdo con todos los términos");
          Pconfirmacion.setBounds(120, 540, 500, 40);
          Pconfirmacion.setFont(new Font("MS PGothic", 1, 20));
          Pconfirmacion.setForeground(Color.RED);
          contenedor.add(Pconfirmacion);
          
          solicitar = new JButton("Solicitar mi viaje");
          solicitar.setFont(new Font("MS PGothic", 1, 18));
          solicitar.setEnabled(false);
          solicitar.setBounds(220, 600, 200, 30);
          contenedor.add(solicitar);

          Image fondo = new ImageIcon(getClass().getResource("../Imagenes/fondo.jpg")).getImage(); //Creamos un objeto de la clase ImageIcon con la ruta en la que se encuentra la imagen fondo en el proyecto   
          logo = new JLabel();
          logo.setBounds(470, 60, 200, 200);
          logo.setIcon(new ImageIcon(fondo.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH))); 
          //Con este método redimensionamos la imagen, los 2 primeros datos es el tamaño y el último como se redimensionará, en este caso este no reduce tanto la calidad
          contenedor.add(logo); //Añadimos la etiqueta al panel
          
          //Como agregar Pestañas
          pestanhas = new JTabbedPane();
          pestanhas.setBounds(20,650,450,100);
          JPanel p1 = new JPanel();
          p1.setLayout(null);
          JPanel p2 = new JPanel();
          p2.setLayout(null);
          pestanhas.add("Datos personales",p1);
          pestanhas.add("Datos del viaje",p2); 
          contenedor.add(pestanhas);
          JLabel PedirEdad = new JLabel("Edad: "); //Creamos una etiqueta con un texto
          PedirEdad.setBounds(0, 0, 70, 20); //Le damos posición dentro del panel y tamaño a la etiqueta
          PedirEdad.setFont(new Font("MS PGothic", 1, 17)); //Cambiamos la fuente y el tamaño
          PedirEdad.setForeground(Color.blue); //Le cambiamos el color al texto
          p1.add(PedirEdad); //Lo añadimos al panel
          JSpinner edad = new JSpinner(); //Creamos un spinner para agregar la edad
          edad.setBounds(70, 0, 40, 20);
          SpinnerNumberModel snm2 = new SpinnerNumberModel(); //Creamos el modelo para configurar el spinner
          snm2.setValue(18);
          snm2.setMaximum(110);
          snm2.setMinimum(18);
          snm2.setStepSize(1);
          edad.setModel(snm2);
          p1.add(edad); 
          JLabel Pmotivo = new JLabel("Motivo del viaje: "); //Creamos una etiqueta con un texto
          Pmotivo.setBounds(0, 0, 140, 20); //Le damos posición dentro del panel y tamaño a la etiqueta
          Pmotivo.setFont(new Font("MS PGothic", 1, 17)); //Cambiamos la fuente y el tamaño
          Pmotivo.setForeground(Color.green); //Le cambiamos el color al texto
          p2.add(Pmotivo); //Lo añadimos al panel
          motivo = new JTextField();
          motivo.setBounds(140,0,200,30);
          p2.add(motivo);             
          
          
          
          super.setVisible(true); //Se coloca visible el Jframe que tenemos por herencia
     } 


}
