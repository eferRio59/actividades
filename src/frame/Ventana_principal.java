package frame;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;



public class Ventana_principal extends JFrame implements ActionListener{
	
	private JMenuBar menu;
	private JMenu cambiar_color;
	private JMenuItem blanco;
	private JMenuItem celeste;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private JTextField campo_usuario;
	private JTextField campo_contraseņa;
	private JLabel usuario;
	private JLabel contraseņa;
	private JButton ingresar;


	
	public Ventana_principal(String contraseņa, String usuario) {
		setLayout(null);
		setTitle("Ventana 1");
		getContentPane().setBackground(Color.BLACK);
		
		
		//JButton a = new JButton("Consultas");
		//JButton b = new JButton("Opciones");
		//JButton c = new JButton("Ayuda");
		
		//JToolBar barra = new JToolBar("barra");
		this.menu = new JMenuBar();
		setJMenuBar(menu);
		
		this.cambiar_color = new JMenu("Colores");
		this.blanco = new JMenuItem("Blanco");
		this.celeste = new JMenuItem("Celeste");
		//barra.add(a);
		//barra.add(b);
		//barra.add(c);
		menu.add(cambiar_color);
		cambiar_color.add(blanco);
		cambiar_color.add(celeste);
		
		
		
		campo_usuario = new JTextField();
		campo_usuario.setBounds(20, 615, 100, 20);
		campo_usuario.setBackground(Color.white);
		
		campo_contraseņa = new JTextField();
		campo_contraseņa.setBounds(20, 675, 100, 20);
		campo_contraseņa.setBackground(Color.WHITE);

		
		this.usuario = new JLabel ("Usuario");
		this.usuario.setBounds(45, 600, 50, 15);
		this.usuario.setForeground(Color.orange);
		
		
		this.contraseņa = new JLabel("Contraseņa");
		this.contraseņa.setBounds(35, 660, 80, 15);
		this.contraseņa.setForeground(Color.ORANGE);
		
		this.ingresar = new JButton("INGRESAR");
		this.ingresar.setBounds(125, 640, 110, 50);
		this.ingresar.setBackground(Color.WHITE);
		
		add(this.menu);
		add(this.usuario);
		add(this.contraseņa);
		add(this.campo_usuario);
		add(this.campo_contraseņa);
		add(this.ingresar);
		
		ingresar.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
//-----------------------------
//EVENTOSSSSS-------------
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == blanco) {
			this.setBackground(Color.WHITE);
		}
		if(e.getSource() == celeste) {
			this.setBackground(Color.MAGENTA);
		}
		// TODO Auto-generated method stub
		
		if( e.getSource() == this.ingresar ) {
			if(campo_usuario.equals("usuario") || campo_contraseņa.equals("contraseņa")) {
				this.campo_usuario.setVisible(false);
				this.campo_contraseņa.setVisible(false);
				this.contraseņa.setVisible(false);
				this.usuario.setVisible(false);
			}else JOptionPane.showMessageDialog(null, "Contraseņa incorrecta","INFORMACION",JOptionPane.WARNING_MESSAGE);
			
		}
	}
}
