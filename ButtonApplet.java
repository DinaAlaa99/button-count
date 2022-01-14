import java.applet.*;
import java.awt.*;
import java.awt.event.*;


/** Create an applet that has two buttons one to 
increment the counter value and one to decrement this value */

public class ButtonApplet extends Applet{
	
	int x=0;
	Button b1;
	Button b2;
	
	public void init(){
		b1= new Button ("Increment");
		b2= new Button ("Decrement");
		
		b1.addActionListener((ActionEvent ex)->{
			x++;
			repaint();
		});
		b2.addActionListener((ActionEvent ex)->{
			x--;
			repaint();
		});
	    add(b1);
		add(b2);
	}
	public void paint (Graphics g){
		g.drawString("Count is:"+x,50,200);
	}
}