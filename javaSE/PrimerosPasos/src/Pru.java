import java.awt.*;
import java.applet.*;

//<applet width="200" height="200" code="Pru"></applet>

public class Pru extends Applet {
	
	public void paint(Graphics g) {
		int suma, resta, producto, division;
		suma = 2 + 3;
		resta = 2 - 3;
		producto = 2 * 3;
		division = 2 / 3;
		g.drawString("2 + 3 = "+suma, 100, 20);
		g.drawString("2 - 3 = "+resta, 100, 70);
		g.drawString("2 * 3 = "+producto, 100, 130);
		g.drawString("2 / 3 = "+division, 100, 180);
	}

}
