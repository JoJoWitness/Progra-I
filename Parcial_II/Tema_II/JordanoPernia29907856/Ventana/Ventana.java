package Parcial_II.Tema_II.JordanoPernia29907856.Ventana;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class Ventana extends JFrame implements ActionListener, ItemListener{

  public Container contenedor;
  JPanel pestanna1, pestanna2, pestanna3;
  JComboBox jComboBox_modelo, jComboBox_marca;
  JList listaRespuesto, listaRepuestosSeleccionados;
  int total = 0;
  JLabel label_monto;
  DefaultListModel repuestosSeleccionados;
  JTextField textField_dia, textField_mes, textField_anno, textField_nombreYapellido, textField_direccion, textField_placa;
  JComboBox comboBox_Municipio;
  JTextArea textarea1, textarea2;

  Border bordeAzulado = BorderFactory.createLineBorder(new Color(99, 200, 209));

  public Ventana() {
    super();
    super.setTitle("Parcial II - Pratica - Jordano Pernia 29 907 856");
    super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    super.setResizable(false);
    super.setSize(900, 900);
    super.setLocationRelativeTo(null);
    

    contenedorPrincipal();
    setVisible(true);
    
  }

  void contenedorPrincipal() {
    contenedor = super.getContentPane();
    contenedor.setLayout(null);
    contenedor.setBackground(new Color(233, 233, 237));
    
    cargarElementos();
  }

  void cargarElementos(){
    contenedorFecha();
    contenedorTabbedPane();
    guardarBoton();
  }

  void contenedorFecha() {
    JPanel fechaContenedor = new JPanel();
    fechaContenedor.setLocation(550, 20);
    fechaContenedor.setLayout(null);
    fechaContenedor.setSize(225, 110);
    fechaContenedor.setBorder(bordeAzulado);
    fechaContenedor.setBackground(new Color(214, 241, 255));
    contenedor.add(fechaContenedor, BorderLayout.NORTH);
 
    JLabel label_fecha = new JLabel("Fecha");
    label_fecha.setSize(60, 30);
    label_fecha.setLocation(85, 0);
    label_fecha.setFont(new Font("Arial",1, 16));
    fechaContenedor.add(label_fecha);

    JPanel diaContenedor = new JPanel();
    diaContenedor.setLocation(0, 30);
    diaContenedor.setLayout(null);
    diaContenedor.setSize(75, 80);
    diaContenedor.setBorder(bordeAzulado);
    diaContenedor.setBackground(new Color(214, 241, 255));
    fechaContenedor.add(diaContenedor);

    JLabel label_dia = new JLabel("Dia");
    label_dia.setSize(25, 40);
    label_dia.setLocation(25, 5);
    label_dia.setFont(new Font("Arial",1, 14));
    diaContenedor.add(label_dia);

    textField_dia = new JTextField();
    textField_dia.setBounds(10, 40, 55, 30);
    diaContenedor.add(textField_dia);

    JPanel mesContenedor = new JPanel();
    mesContenedor.setLocation(75, 30);
    mesContenedor.setLayout(null);
    mesContenedor.setSize(75, 80);
    mesContenedor.setBorder(bordeAzulado);
    mesContenedor.setBackground(new Color(214, 241, 255));
    fechaContenedor.add(mesContenedor);

    JLabel label_mes = new JLabel("Mes");
    label_mes.setSize(35, 40);
    label_mes.setLocation(22, 5);
    label_mes.setFont(new Font("Arial",1, 14));
    mesContenedor.add(label_mes);

    textField_mes = new JTextField();
    textField_mes.setBounds(10, 40, 55, 30);
    mesContenedor.add(textField_mes);

    JPanel annoContenedor = new JPanel();
    annoContenedor.setLocation(150, 30);
    annoContenedor.setLayout(null);
    annoContenedor.setSize(75, 80);
    annoContenedor.setBorder(bordeAzulado);
    annoContenedor.setBackground(new Color(214, 241, 255));
    fechaContenedor.add(annoContenedor);

    JLabel label_anno = new JLabel("Año");
    label_anno.setSize(35, 40);
    label_anno.setLocation(22, 5);
    label_anno.setFont(new Font("Arial",1, 14));
    annoContenedor.add(label_anno);

    textField_anno = new JTextField();
    textField_anno.setBounds(10, 40, 55, 30);
    annoContenedor.add(textField_anno);

  }

  void contenedorTabbedPane(){
    JTabbedPane tabbedPane = new JTabbedPane();
    tabbedPane.setBounds(50,150,750,550);
    tabbedPane.setForeground(new Color(242, 87, 87));
    tabbedPane.setFont(new Font("Arial",1, 16));
    tabbedPane.setBackground(new Color(233, 233, 237));
    pestanna1 = new JPanel();
    pestanna1.setLayout(null);
    pestanna1.setBackground(new Color(233, 233, 237));
    pestanna2 = new JPanel();
    pestanna2.setLayout(null);
    pestanna2.setBackground(new Color(233, 233, 237));
    pestanna3 = new JPanel();
    pestanna3.setLayout(null);
    pestanna3.setBackground(new Color(233, 233, 237));
    tabbedPane.add("Datos del cliente",pestanna1);
    tabbedPane.add("Datos del auto",pestanna2); 
    tabbedPane.add("Reparacion", pestanna3);
    contenedor.add(tabbedPane);

    pestanna1();
    pestanna2();
    pestanna3();
  }

  void pestanna1(){
    String municipios[] = {"Andres Bello", "Antonio Romulo Costa", "Ayacucho", "Bolivar", "Cardenas", "Cordoba", "Fernadez Feo", "Francisco de Miranda", "Garcia de Hevia", "Guasimos", "Independencia", "Jauregui", "Jose Maria Vargas", "Junin", "Libertad", "Libertador","Lobatera", "Michelena", "Panamericano", "Pedro Maria Ureña", "Rafael Urdaneta", "Samuel Dario Maldonado", "San Cristobal", "San Judas Tadeo", "Seboruco", "Simon Rodriguez", "Sucre", "Torbes", "Uribante"};
    Arrays.sort(municipios);
    int sanCristobalIndex = 0;
    for(int i = 0; i < municipios.length; i++){
      if(municipios[i] == "San Cristobal"){
        sanCristobalIndex = i;
      }
    }

    JLabel label_nombreYapellido = new JLabel("Nombre y Apellido:");
    label_nombreYapellido.setSize(200, 40);
    label_nombreYapellido.setLocation(50, 20);
    label_nombreYapellido.setFont(new Font("Arial",1, 18));
    pestanna1.add(label_nombreYapellido);

    textField_nombreYapellido = new JTextField();
    textField_nombreYapellido.setBounds(275, 25, 425, 30);
    pestanna1.add(textField_nombreYapellido);

    JLabel label_direcion = new JLabel("Direccion:");
    label_direcion.setSize(200, 40);
    label_direcion.setLocation(50, 60);
    label_direcion.setFont(new Font("Arial",1, 18));
    pestanna1.add(label_direcion);

    textField_direccion = new JTextField();
    textField_direccion.setBounds(275, 65, 425, 30);
    pestanna1.add(textField_direccion);

    JLabel label_municipio = new JLabel("Municipio:");
    label_municipio.setSize(200, 40);
    label_municipio.setLocation(50,100);
    label_municipio.setFont(new Font("Arial",1, 18));
    pestanna1.add(label_municipio);

    comboBox_Municipio = new JComboBox<>(municipios);
    comboBox_Municipio.setBounds(275, 105, 425, 30);
    comboBox_Municipio.setFont(new Font("Arial",1, 16));
    comboBox_Municipio.setSelectedIndex(sanCristobalIndex);
    pestanna1.add(comboBox_Municipio);

    JLabel label_mensaje = new JLabel("Observaciones del cliente:");
    label_mensaje.setBounds(50, 160, 350, 30);
    label_mensaje.setFont(new Font("Arial",1, 18));
    pestanna1.add(label_mensaje); 

    textarea1 = new JTextArea();
    textarea1.setBounds(50, 195, 650, 200);
    textarea1.setBorder(bordeAzulado);
    textarea1.setFont(new Font("Arial",1, 16));
    pestanna1.add(textarea1);
  }

  void pestanna2(){
    String marca[] = {"Seleccione una marca", "Toyota", "Fiat"};
    
    String modelosVacio[] = {"Seleccione una marca primero"};
   

    JLabel label_marca = new JLabel("Marca:");
    label_marca.setSize(200, 40);
    label_marca.setLocation(50, 20);
    label_marca.setFont(new Font("Arial",1, 18));
    pestanna2.add(label_marca);

    jComboBox_marca = new JComboBox<>(marca);
    jComboBox_marca.setBounds(275, 25, 425, 30);
    jComboBox_marca.setFont(new Font("Arial",1, 16));
    jComboBox_marca.setSelectedIndex(0);
    pestanna2.add(jComboBox_marca);

    jComboBox_marca.addActionListener(this);

    JLabel label_modelo = new JLabel("Modelo:");
    label_modelo.setSize(200, 40);
    label_modelo.setLocation(50, 60);
    label_modelo.setFont(new Font("Arial",1, 18));
    pestanna2.add(label_modelo);

    jComboBox_modelo = new JComboBox<>(modelosVacio);
    jComboBox_modelo.setBounds(275, 65, 425, 30);
    jComboBox_modelo.setFont(new Font("Arial",1, 16));
    jComboBox_modelo.setSelectedIndex(0);
    pestanna2.add(jComboBox_modelo);


    JLabel label_placa = new JLabel("Placa:");
    label_placa.setSize(200, 40);
    label_placa.setLocation(50,100);
    label_placa.setFont(new Font("Arial",1, 18));
    pestanna2.add(label_placa);

    textField_placa = new JTextField();
    textField_placa.setBounds(275, 105, 425, 30);
    textField_placa.setFont(new Font("Arial",1, 16));
    pestanna2.add(textField_placa);

    JLabel label_mensaje = new JLabel("Observaciones del taller:");
    label_mensaje.setBounds(50, 160, 350, 30);
    label_mensaje.setFont(new Font("Arial",1, 18));
    pestanna2.add(label_mensaje); 

    textarea2 = new JTextArea();
    textarea2.setBounds(50, 195, 650, 200);
    textarea2.setBorder(bordeAzulado);
    textarea2.setFont(new Font("Arial",1, 16));
    pestanna2.add(textarea2);

  }

  void pestanna3(){
    String respuestos[]= { "Parachoque DEL - 120", "Parachoque TRA - 120", "Techo - 100", "Puerta DEL IZQ - 80", "Puerta DEL DER - 80",
                            "Capo - 60","Retrovisor DER - 40","Retrovisor IZQ - 40", "Parabrisa - 60", "Llantas - 100"};
  
    JLabel label_repuestos = new JLabel("Seleccione la pieza:");
    label_repuestos.setSize(200, 40);
    label_repuestos.setLocation(30, 20);
    label_repuestos.setFont(new Font("Arial",1, 18));
    pestanna3.add(label_repuestos);

    listaRespuesto = new JList(respuestos);
    listaRespuesto.setBounds(30, 70, 225, 220);
    listaRespuesto.setFont(new Font("Arial",1, 16));
    listaRespuesto.setLayoutOrientation(JList.VERTICAL);
    pestanna3.add(listaRespuesto);

    
    JButton button_agregar = new JButton("Agregar >>");
    button_agregar.setFont(new Font("Arial",1, 18));
    button_agregar.setBounds(285, 190, 175, 30);
    pestanna3.add(button_agregar);
    button_agregar.addMouseListener(new AgregarBoton());


    JLabel label_seleccionados = new JLabel("Piezas reparadas:");
    label_seleccionados.setSize(200, 40);
    label_seleccionados.setLocation(485, 20);
    label_seleccionados.setFont(new Font("Arial",1, 18));
    pestanna3.add(label_seleccionados);
    
    repuestosSeleccionados = new DefaultListModel<>();
    listaRepuestosSeleccionados = new JList(repuestosSeleccionados);
    listaRepuestosSeleccionados.setBounds(485, 70, 225, 220);
    listaRepuestosSeleccionados.setFont(new Font("Arial",1, 16));
    pestanna3.add(listaRepuestosSeleccionados);

    Image imagen = new ImageIcon(getClass().getResource("../Imagen/imagen.png")).getImage(); //Creamos un objeto de la clase ImageIcon con la ruta en la que se encuentra la imagen fondo en el proyecto   
    JLabel placeHolder = new JLabel();
    placeHolder.setBounds(30, 325, 300, 150);
    placeHolder.setIcon(new ImageIcon(imagen.getScaledInstance(placeHolder.getWidth(), placeHolder.getHeight(), Image.SCALE_SMOOTH))); 
    pestanna3.add(placeHolder);

    JLabel label_montoTxt = new JLabel("Monto de la reparacion");
    label_montoTxt.setSize(250, 30);
    label_montoTxt.setLocation(425, 380);
    label_montoTxt.setFont(new Font("Arial",1, 18));
    pestanna3.add(label_montoTxt);

    label_monto = new JLabel(String.valueOf(total));
    label_monto.setSize(100, 30);
    label_monto.setLocation(475, 415);
    label_monto.setFont(new Font("Arial",1, 22));
    pestanna3.add(label_monto);
  }

  void guardarBoton(){
    JButton button_guardar = new JButton("Guardar");
    button_guardar.setFont(new Font("Arial",1, 18));
    button_guardar.setSize(175, 30);
    button_guardar.setLocation(50, 725);
    contenedor.add(button_guardar);
    button_guardar.addMouseListener(new GuardarBoton());
  } 

  @Override
  public void actionPerformed(ActionEvent e) {
    String modelosToyota[] = {"Corolla", "Yaris", "Tacoma"};
    String modelosFiat[] = {"Uno", "Siena", "Palio", "Cronos"};
    String modelosVacio[] = {"Seleccione una marca primero"};
    
    String modelo = (String)jComboBox_marca.getSelectedItem();
    if(modelo == "Fiat"){
      jComboBox_modelo.setModel(new DefaultComboBoxModel<>(modelosFiat));
    }
    else if(modelo == "Toyota"){
      jComboBox_modelo.setModel(new DefaultComboBoxModel<>(modelosToyota));
    }
    else{
      jComboBox_modelo.setModel(new DefaultComboBoxModel<>(modelosVacio));
    }
  }


  class AgregarBoton implements MouseListener{
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
       String repuesto = (String)listaRespuesto.getSelectedValue();
       repuestosSeleccionados.addElement(repuesto);

      String strValor[] = repuesto.split(" - ");
      int valor = Integer.parseInt(strValor[1]);

      total += valor;

      label_monto.setText(String.valueOf(total));

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

  class GuardarBoton implements MouseListener{
    public void mouseClicked(java.awt.event.MouseEvent e) {
      
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("-------------------------Datos de la reparacion------------------------");
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("");
      System.out.println("Fecha: " + textField_dia.getText() + "/" + textField_mes.getText() + "/" + textField_anno.getText());
      System.out.println("");
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("---------------------------Datos del Cliente---------------------------");
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("Nombre y apellido: " + textField_nombreYapellido.getText());
      System.out.println("Direccion: " + textField_direccion.getText());
      System.out.println("Municipio: " + comboBox_Municipio.getSelectedItem());
      System.out.println("Observaciones del cliente: " + textarea1.getText());
      System.out.println("");
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("-----------------------------Datos del Auto----------------------------");
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("Marca: " + jComboBox_marca.getSelectedItem());
      System.out.println("Modelo: " + jComboBox_modelo.getSelectedItem());
      System.out.println("Placa: " + textField_placa.getText());
      System.out.println("Observaciones del Taller: " + textarea2.getText());
      System.out.println("");
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("-------------------------------Reparacion------------------------------");
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("Piezas Reparadas: " + listaRepuestosSeleccionados.getModel());
      System.out.println("Monto total: " + total);
      


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
