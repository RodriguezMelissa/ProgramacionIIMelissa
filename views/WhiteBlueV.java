package views;
import java.awt.*;
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;

import views.Menu;
public class WhiteBlueV extends Wframe{
	public WhiteBlueV(Frame parentFrame){
		super(parentFrame);
		initComponents();
	}
	
	@Override
	public void initComponents() {
		
		Panel mancha = new Panel();
		mancha.setBackground(Color.BLUE);
		//mancha.setVisible(true); 
		add(mancha);
		
		Panel mancha2 = new Panel();
		mancha2.setBackground(Color.WHITE);
		//mancha.setVisible(true); 
		add(mancha2);
		
		
		setVisible(true); 
		setSize(400,400); 
		setBackground(Color.WHITE); 
		setLocationRelativeTo(null);
		setTitle("White And Blue");
		setLayout(new GridLayout());
		addWindowListener(new WindowAdapter() {
			
			
		}); 
	}

}
