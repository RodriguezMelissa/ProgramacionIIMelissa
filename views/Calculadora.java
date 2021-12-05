package views;
//import views.Menu;
import java.awt.*;
import java.awt.event.*;
public class Calculadora extends Wframe{
	

public Calculadora(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	@Override
	public void initComponents() {
		setSize(500,300); 
		setBackground(Color.PINK);
		setVisible(true);
		setLayout(null);
	}

{	
	Label n1 = new Label("Número 1"); 
	n1.setBounds(20, 50, 100, 32);
	add(n1);   
	
	
	TextField numero1= new TextField();
	numero1.setBounds(122, 50, 250, 32);
	add(numero1);
	
	Label n2 = new Label("Número 2"); 
	n2.setBounds(20,84,100,32);
	add(n2); 
	
	TextField numero2= new TextField();
	numero2.setBounds(122,84,250,32);
	add(numero2);
	
	Label respuesta = new Label("Respuesta"); 
	respuesta.setBounds(20, 118, 100, 32);
	add(respuesta); 
	
	TextField Respuesta= new TextField();
	Respuesta.setBounds(122, 118, 250, 32);
	add(Respuesta);
    
	Button eliminar = new Button("Erase");
	eliminar.setBounds(20, 175, 100, 32);
	
	eliminar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		numero1.setText("");
		numero2.setText("");
			
			Respuesta.setText("");
	}
	
	});
	add(eliminar);
	
	
	Button suma = new Button("Sumar +"); 
	suma.setBounds(380, 50,100, 24);
	suma.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			float n1, n2, respuesta;
			n1 = Float.parseFloat(numero1.getText());
			n2 = Float.parseFloat(numero2.getText());
			respuesta= n1+n2;
			
			Respuesta.setText("" + respuesta);
		
		}
	
	});
	add(suma); 
	
	Button resta = new Button("Restar"); 
	resta.setBounds(380, 75, 100, 24); 
	resta.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			float n1, n2, respuesta;
			n1 = Float.parseFloat(numero1.getText());
			n2 = Float.parseFloat(numero2.getText());
			respuesta= n1-n2;
			
			Respuesta.setText("" + respuesta);
			
		}
	
	});
	add(resta); 
	
	Button division = new Button("Dividir"); 
	division.setBounds(380, 100, 100, 24); 
	division.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			float n1, n2, respuesta;
			n1 = Float.parseFloat(numero1.getText());
			n2 = Float.parseFloat(numero2.getText());
			respuesta= n1/n2;
			
			Respuesta.setText("" + respuesta);
		
		}
	
	});
	add(division); 
	
	Button multiplicacion = new Button("Multiplicar");
	multiplicacion.setBounds(380, 125,100,24); // 
	multiplicacion.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			
			float n1, n2, respuesta;
			n1 = Float.parseFloat(numero1.getText());
			n2 = Float.parseFloat(numero2.getText());
			respuesta= n1*n2;
			
			Respuesta.setText("" + respuesta);
	
		}
	
	});
	add(multiplicacion); 
	
	setSize(100,100);
	setLocationRelativeTo(null);
	// x, y
	setTitle("Calculadora");
	setLayout(null); 
	setBackground(Color.WHITE); 
	setVisible(true);
	addWindowListener(new WindowAdapter() {
		
	}); 
}

}



	

	



	

		