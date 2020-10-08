
package TrazoFiguras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo Guevara
 */
public class Figuras extends JPanel{// ventana
    private JFrame ventana;
    // contenedor
    private Container contenedor;
    

    public Figuras() {
        // inicializar la ventana
        ventana = new JFrame("Dibujando icono");
        // definir tamaño a ventana
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //trazo de linea
        g.setColor(Color.red);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 200, 100);
        
        g.setColor(Color.GRAY);
        g.drawLine(100, 50, 150, 20);
        g.drawLine(200, 50, 150, 20);
        
        
        //TRAZO DE RECTANGULOS
        g.setColor(Color.blue);
        g.drawRect(280, 50, 100, 50);
        g.fillRect(280, 110, 100, 50);
        
        //trazo de rectángulos redondeados (óvalos)
        g.setColor(Color.black);
        g.drawRoundRect(450, 50, 100, 50, 50, 50);
        g.fillRoundRect(450, 110, 100, 50, 20, 20);
        
        //trazo de circulos
        g.setColor(Color.yellow);
        g.drawOval(100, 200, 80, 80);
       g.fillOval(100, 290, 50, 50);
       
       //trazo de óvalos (circunferencias)
       g.setColor(Color.green);
       g.drawOval(280, 200, 80, 40);
       g.fillOval(280, 290, 40, 80);
       
       //dibujar triángulo
       g.setColor(Color.pink);
       g.drawLine(450, 300, 550, 300);
       g.drawLine(450, 300, 500, 250);
       g.drawLine(550, 300, 500, 250);
       
       //dibujo de cadenas de texto
       g.setColor(Color.black);
       g.drawString("Ejemplo de trazo de figuras básicas", 200, 400);
       
       //Trazo de arcos
       
       //figura1: solo contorno
       g.drawArc(560, 200, 90, 200, 0, 180);
       //figura 2: relleno
       g.fillArc(680, 200, 90, 200, 0, 180);
       
    }
    
    
    
}
