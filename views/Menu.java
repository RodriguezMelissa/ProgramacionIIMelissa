package views;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import mis.event.FormInterface; 

public class Menu extends Frame  implements FormInterface{
	private static final long serialVersionUID = 1L;
	private Button blue, green, fucsia, white_blue, calcular;
	private Frame instance;
	public Menu(){
		initComponents();
		Frame instance = this;
	}
	@Override
	public void initComponents() {
		 setLayout(null);
		
		blue= new Button("BLUE");blue.setBounds(100,50,300,100);add(blue); 
		green=new Button("GREEN");green.setBounds(100,160,300,100);add(green); 
		fucsia=new Button("FUCSIA");fucsia.setBounds(100,270,300,100);add(fucsia);
		white_blue=new Button("WHITE & BLUE");white_blue.setBounds(100,380,300,100);add(white_blue); 
		calcular=new Button("CALCULOS");calcular.setBounds(100,490,300,100);add(calcular);
		setBackground(Color.CYAN);
		setSize(500,600);
		this.setResizable(false);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		blue.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				 BlueV b = new BlueV(instance);
				b.showForm();
			}
		});
		
		green.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				 GreenV g = new GreenV(instance);
					g.showForm();
			}
		});
		
		
		fucsia.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				 FucsiaV f = new FucsiaV(instance);
				f.showForm();
			}
		});
		

		white_blue.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				 WhiteBlueV wb = new WhiteBlueV(instance);
				wb.showForm();
			}
		});
		
		calcular.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				 Calculadora c = new Calculadora(instance);
				c.showForm();
			
			}
		});
	}

	
		
	

	@Override
	public void clear() {
		
		
	}

	@Override
	public void showForm() {
		
		setVisible(true);
		setLocationRelativeTo(null);
		toFront();
	}
}
