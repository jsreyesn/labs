import java.awt.*;
import java.applet.*;
 
public class ipj02j extends Applet {
 
    public void paint(Graphics g) {
        // Primero borro el fondo en negro
        g.setColor( Color.black );
        g.fillRect( 0, 0, 639, 479 );
        // Y ahora dibujo las figuras del ejemplo
        g.setColor( Color.white );
        g.drawLine( 20, 10,  310, 175 );
        g.setColor( Color.yellow );
        g.drawLine( 639, 0,    0, 479);
        g.setColor( Color.blue );
        g.fillRect( 30, 30, 270, 170 );
        g.setColor( Color.cyan );
        g.drawOval( 270, 100, 100, 200 );
    }
 
}