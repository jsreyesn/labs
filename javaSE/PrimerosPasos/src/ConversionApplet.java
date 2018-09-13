import java.awt.*;
import java.applet.*;

public class ConversionApplet extends Applet{
	
	public void paint (Graphics g) {
		
		int celsius = 30;
		double fahrenheit = 30 * 1.8 + 32;
		
		g.drawString("Centigrados = "+celsius+" Fahrenheit = "+fahrenheit, 0, 100);
		
	}	

}
