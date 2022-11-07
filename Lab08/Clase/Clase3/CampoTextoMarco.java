package Lab08.Clase.Clase3;

// Archivo "CampoTextoMarco.java"
// Los componentes JTextField y JPasswordField.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel; // muestra texto e imágenes
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CampoTextoMarco extends JFrame {
    //----------------------- Variables JTextField --------------------------------
    private final JTextField campoTexto1; // campo de texto con tamaño fijo
    private final JTextField campoTexto2; // campo de texto con texto
    private final JTextField campoTexto3; // campo de texto con texto y tamaño
    private final JPasswordField campoContrasenia; // campo de contraseña con texto
    //----------------------- Variable JLabel ------------------------------------
    private JLabel etiqueta1; // etiqueta al lado del campo1
    private JLabel etiqueta2; // etiqueta al lado del campo2
    private JLabel etiqueta3; // etiqueta al lado del campo3
    private JLabel etiqueta4; // etiqueta al lado del campo4 o el campo de contraseña
    // El constructor de CampoTextoMarco agrega objetos JTextField a JFrame y tambien de JLabel

    public CampoTextoMarco() {
        super("Prueba de JTextField y JPasswordField");
        setLayout(new FlowLayout());

        //añadir la etiqueta llamada CAMPO-1 al lado del campo de texto vacio
        etiqueta1 = new JLabel();
        etiqueta1.setText("Ingrese un nombre:");
        etiqueta1.setToolTipText("Esta es Etiqueta-1");
        add(etiqueta1);

        // construye campo de texto con 10 columnas
        campoTexto1 = new JTextField(10);
        add(campoTexto1); // agrega campoTexto1 a JFrame
 
        //añadir la etiqueta llamada CAMPO-2 al lado del campo de texto lleno
        etiqueta2 = new JLabel();
        etiqueta2.setText("llene el campo:");
        etiqueta2.setToolTipText("Esta es Etiqueta-2");
        add(etiqueta2);

        // construye campo de texto con texto predeterminado
        campoTexto2 = new JTextField("Escriba el texto aqui");
        add(campoTexto2); // agrega campoTexto2 a JFrame

        //añadir la etiqueta llamada CAMPO-3 al lado del campo de texto no editable
        etiqueta3 = new JLabel();
        etiqueta3.setText("Campo no editable:");
        etiqueta3.setToolTipText("Esta es Etiqueta-3");
        add(etiqueta3);

        // construye campo de texto con texto predeterminado y 21 columnas
        campoTexto3 = new JTextField("Campo de texto no editable");
        campoTexto3.setEditable(false); // deshabilita la edición
        add(campoTexto3); // agrega campoTexto3 a JFrame

        //añadir la etiqueta llamada CAMPO-3 al lado del campo de texto contraseña
        etiqueta4 = new JLabel();
        etiqueta4.setText("Contraseña:");
        etiqueta4.setToolTipText("Esta es Etiqueta-4");
        add(etiqueta4);

        // construye campo de contraseña con texto predeterminado
        campoContrasenia = new JPasswordField("Texto oculto");
        add(campoContrasenia); // agrega campoContrasenia a JFrame
        // registra los manejadores de eventos
        
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);

        ManejadorClicRaton manejador1 =new ManejadorClicRaton();
        etiqueta1.addMouseListener(manejador1);
        etiqueta2.addMouseListener(manejador1);
        etiqueta3.addMouseListener(manejador1);
        etiqueta4.addMouseListener(manejador1);
        
    }

    // clase interna privada para el manejo de eventos
    private class ManejadorCampoTexto implements ActionListener{
        // procesa los eventos de campo de texto
        @Override
        public void actionPerformed(ActionEvent evento) {
            String cadena = "";
            // el usuario oprimió Intro en el objeto JTextField campoTexto1
            if (evento.getSource() == campoTexto1)
                cadena = String.format("campoTexto1: %s", evento.getActionCommand());

            // el usuario oprimió Intro en el objeto JTextField campoTexto2
            else if (evento.getSource() == campoTexto2)
                cadena = String.format("campoTexto2: %s", evento.getActionCommand());

            // el usuario oprimió Intro en el objeto JTextField campoTexto3
            else if (evento.getSource() == campoTexto3)
                cadena = String.format("campoTexto3: %s", evento.getActionCommand());

            // el usuario oprimió Intro en el objeto JTextField campoContrasenia
            else if (evento.getSource() == campoContrasenia)
                cadena = String.format("campoContrasenia: %s",evento.getActionCommand());
                
            // muestra el contenido del objeto JTextField
            JOptionPane.showMessageDialog(null, cadena);
        }
    } // fin de la clase privada interna ManejadorCampoTexto

    // clase interna para manejar los eventos del ratón
    private class ManejadorClicRaton extends MouseAdapter{
        // maneja evento de clic del ratón y determina cuál botón se oprimió
        @Override
        public void mouseClicked(MouseEvent evento){
            String cadena1 = "";
            // el usuario oprimió Intro en el objeto JLabel etiqueta1
            if (evento.getSource() == etiqueta1)
                cadena1 = String.format(etiqueta1.getText());

            // el usuario oprimió Intro en el objeto JLabel etiqueta1
            else if (evento.getSource() == etiqueta2)
                cadena1 = String.format(etiqueta2.getText());
            
            // el usuario oprimió Intro en el objeto JLabel etiqueta1
            else if (evento.getSource() == etiqueta3)
                cadena1 = String.format(etiqueta3.getText());
            
            // el usuario oprimió Intro en el objeto JLabel etiqueta1
            else if (evento.getSource() == etiqueta4)
                cadena1 = String.format(etiqueta4.getText());

            // muestra el contenido del objeto JLabel
            JOptionPane.showMessageDialog(null, cadena1);
        } 
    } // fin de la clase ManejadorClicRaton
} // fin de la clase CampoTextoMarco

