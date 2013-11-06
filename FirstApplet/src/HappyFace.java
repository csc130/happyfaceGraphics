import javax.swing.JApplet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Graphics2D;

public class HappyFace extends JApplet {
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D)g;
		String hello = "HELLO Class!";
		Font font = new Font("Aharoni",Font.BOLD,20);
		g.setFont(font);
		g.drawString(hello, 200,200);
		g2D.drawString(hello, 300,300);
		g.drawOval(400, 400, 100, 100);
		g2D.drawOval(500, 500, 100, 100);
		g.setColor(Color.PINK);
		g.draw3DRect(0,0, 100, 100, false);
		g.fill3DRect(200, 200, 100, 100, true);
		g2D.draw3DRect(100,100, 100, 100, false);
		g2D.fill3DRect(300, 300, 100, 100, true);
		
	}
}
