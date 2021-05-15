package Ejercicio1;
 
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregar extends JPanel {
	
	private JTextField tbNuevaPelicula;
	private JComboBox<Genero> cbGenero;
	private JButton btnAceptar;
	
	public PanelAgregar() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 450, 250);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(92, 16, 70, 40);
		panel.add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(92, 62, 70, 40);
		panel.add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(92, 113, 70, 40);
		panel.add(lblGenero);
		
		JLabel lbID = new JLabel("IDitem");
		lbID.setBounds(172, 11, 70, 50);
		panel.add(lbID);
		
		lbID.setText(String.valueOf(Peliculas.ProximoId()));
		
		tbNuevaPelicula = new JTextField();
		tbNuevaPelicula.setBounds(172, 72, 163, 20);
		panel.add(tbNuevaPelicula);
		tbNuevaPelicula.setColumns(10);
		
		cbGenero = new JComboBox<Genero>();
		cbGenero.setBounds(172, 123, 163, 20);
		panel.add(cbGenero); 
		
		//cbGenero.addItem("Seleccione un genero");
		cbGenero.addItem(new Genero("Terror"));
		cbGenero.addItem(new Genero("Accion"));
		cbGenero.addItem(new Genero("Suspenso"));
		cbGenero.addItem(new Genero("Romantica"));
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				
				Peliculas nuevaPelicula = new Peliculas(tbNuevaPelicula.getText(), String.valueOf(cbGenero.getSelectedItem()));				
				JOptionPane.showMessageDialog(null, nuevaPelicula.toString());				
			}
		});
		btnAceptar.setBounds(92, 184, 89, 23);
		panel.add(btnAceptar);
	}
}
