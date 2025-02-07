package GraficasVentanasJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class Ventana extends JFrame {
    //ATRIBUTOS
    public JPanel panel; //Crea JPanel

    public Ventana(){
        this.setSize(500,500); //Set: Establecer - Size: Tamaño
        //setBounds(100,200,1280,720); //Engloba a setsize & setlocation
        //setLocation(100,200); //Establece posicion inicial ventana
        setTitle("Ardi_MI"); //Establecer titulo
        setLocationRelativeTo(null); //Establecer Ubicacion Ventana Centro
        //this.getContentPane().setBackground(Color.GRAY); //Establece el color de la ventana
        setMinimumSize(new Dimension(200, 200)); //Establece el tamaño minimo


        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE); //Clic en la X - Cierra Ventana & Programa
    }

    //METODOS PARA INICIALIZAR LOS COMPONENTES
    private  void iniciarComponentes(){
        //DEFINE LOS METODOS
        //colocarEtiquetas();
        //colocarBotones();
        //colocarRadioBotones();
        //colocarCajasDeTexto();
        //areasDeTexto();
        //colocarListasDesplegables();
    }

    //METODOS DE PANELES
    private void colocarPaneles(){
        this.panel = new JPanel();  // Asigna el panel de la clase en lugar de crear uno local
        //panel.setBackground(Color.green); //Establecemos color del panel
        panel.setLayout(null); //Desactiva el diseño
        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }

    //METODOS DE LAS ETIQUETAS
    private void colocarEtiquetas(){
        //Etiqueta 1 - etiqueta tipo texto
        JLabel etiqueta = new JLabel("Mundial 2018", SwingConstants.CENTER); //Creamos una etiqueta, definimos centrado
        //etiqueta.setText("Hola"); //Establecemos el texto de la etiqueta
        etiqueta.setBounds(85,10,300,80); //Engloba a setsize & setlocation
        etiqueta.setForeground(Color.BLACK); //Establece color de la letra
        //etiqueta.setOpaque(true); //Establecemos pinta el fondo de la etiqueta
        //etiqueta.setBackground(Color.WHITE); //Establece color del fondo de la etiqueta
        etiqueta.setFont(new Font("cooper black",0, 30)); //Establecemos la fuente del texto
        panel.add(etiqueta); //Agregamos la etiqueta al panel

        //Etiqueta 2 - etiqueta tipo imagen
        ImageIcon imagen = new ImageIcon("BalonFutbol.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(10,80,458,458); //Posicion, ancho y alto
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH))); //Cambia tamaño imagen
        panel.add(etiqueta2); //Agrega al Panel
    }

    //METODOS DE LOS BOTONES
    private void colocarBotones(){
        //BOTON 1 - Boton de texto
        JButton boton1 = new JButton(); //Se Crea El Boton
        boton1.setText("Click");//Establecer texto boton
        boton1.setBounds(100, 100, 100, 40); //Posicion y Tamaño
        boton1.setEnabled(true);//Para habilitar o deshabilitar las funciones del boton
        boton1.setMnemonic('a'); //Establecemos alt + letra
        boton1.setForeground(Color.BLUE); //Color letra
        boton1.setFont(new Font("arial",Font.BOLD,20)); //Establece fuente letra del boton
        panel.add(boton1); //Agrega boton al panel

        //BOTON 2 - Boton de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100,200,100,40);
        //boton2.setBackground(Color.BLUE); //Establece color de fondo boton
        ImageIcon balonFutbol = new ImageIcon("BalonFutbol.png");
        boton2.setIcon(new ImageIcon(balonFutbol.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(boton2);
    }

    //METODOS DE LOS RADIO BOTONES
    private void colocarRadioBotones(){
        //CREA RADIO BOTON 1
        JRadioButton radioButton1 = new JRadioButton("Opcion 1", true);
        radioButton1.setBounds(50,100,100,50);

        panel.add(radioButton1);

        //CREA RADIO BOTON 2
        JRadioButton radioButton2 = new JRadioButton("Opcion 2", false);
        radioButton2.setBounds(50,150,100,50);

        panel.add(radioButton2);

        //CREA RADIO BOTON 3
        JRadioButton radioButton3 = new JRadioButton("Opcion 3", false);
        radioButton3.setBounds(50,200,100,50);

        panel.add(radioButton3);

        //GRUPO DE RADIO BOTONES
        /*Permite marcar solo una opcion*/
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioButton1);
        grupoRadioBotones.add(radioButton2);
        grupoRadioBotones.add(radioButton3);
    }

    //METODOS DE CAJAS DE TEXTO
    private void colocarCajasDeTexto(){
        JTextField cajaTexto = new JTextField(); //Permite crear una caja de texto de una sola linea
        cajaTexto.setBounds(50,50,100,30);
        cajaTexto.setText("Hola...");
        System.out.println("Texto en la caja: " + cajaTexto.getText());//Texto que haye en la caja
        panel.add(cajaTexto);
    }

    //METODOS DE AREAS DE TEXTO
    private void areasDeTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,300,200);
        areaTexto.setText("Escriba el texto aqui....");
        areaTexto.append("Escribe por aqui..."); //Añade mas texto al area de texto
        areaTexto.setEditable(true);//Permite editar el contenido del area de texto

        System.out.println("El texto es: " + areaTexto.getText()); //Obtiene el texto dentro el area
        panel.add(areaTexto);

    }

    //METODOS DE LISTAS DESPLEGABLES
    private void colocarListasDesplegables(){
        String [] paises = {"Mexico", "Peru", "Colombia", "Ecuador"}; //Arreglo String
        JComboBox listaDesplegable = new JComboBox(paises); //Se crea lista desplegable
        listaDesplegable.setBounds(20,20,100,30);
        listaDesplegable.addItem("Argentina");//Permite Agregar mas  objetos
        listaDesplegable.setSelectedItem("Colombia");//Escoger o seleccionar el primer objeto visto

        panel.add(listaDesplegable);

    }

    /*EVENTOS: HACER QUE EL PROGRAMA FUNCIONE, QUE COBRE VIDA*/
    //Agregando Eventode tipo ActionListener
    //ActionListener oyenteDeAccion = new ActionListener() {

        //@Override
        //public void actionPerformed(ActionEvent e) {
         //saludo.seText("Hola"+cajaTexto.getText());

      //}
    //};

    //boton.addActionListener(oyenteDeAccion);

}
