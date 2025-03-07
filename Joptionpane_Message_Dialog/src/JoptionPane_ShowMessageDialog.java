import javax.swing.*;

public class JoptionPane_ShowMessageDialog {
    /*Componente: Es el componente principal al cual pertenece el JOPTIONPANE
    * Puede ser un frame, un componente dentro del Frame o nulo
    *
    * Mensaje: Mensaje que se muestra dentro del JOPTIONPANE
    *
    *Titulo: Titulo que lleva le mensaje
    * */

    public static void main(String[] args) {

        /*Ejemplos de JoptionPane*/
        JOptionPane.showMessageDialog(null, "Buenos Dias, encontramos un error","Error Mensaje", JOptionPane.ERROR_MESSAGE);

        /*Ejemplos de JoptionPane*/
        JOptionPane.showMessageDialog(null, "Buenos Dias, Tenemos una informacion importante para ti","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);

        /*Ejemplos de JoptionPane*/
        JOptionPane.showMessageDialog(null, "Buenos Dias, Tenemos que hacer unas preguntas ¿Quieres responder?", "Mensaje Preguntas", JOptionPane.QUESTION_MESSAGE);

        /*Ejemplos de JoptionPane*/
        JOptionPane.showMessageDialog(null, "Buenos Dias, Encontramos una abvertencia, ¡Ten cuidado!", "Mensaje de Aviso", JOptionPane.WARNING_MESSAGE);

        /*Ejemplos de JoptionPane*/
        JOptionPane.showMessageDialog(null, "Bienvenido Homero Simpson", "Club De Los Magios", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/Homero.jpg"));
    }
}
