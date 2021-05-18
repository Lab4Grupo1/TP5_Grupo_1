package Ejercicio1;
 
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.soap.Text;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregar extends JPanel {
	
	private JTextField tbNuevaPelicula;
	private JComboBox<Genero> cbGenero;
	private JButton btnAceptar;
	private DefaultListModel<Peliculas> dlModel;
	
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
		 
		cbGenero.addItem(new Genero("Seleccione un genero"));
		cbGenero.addItem(new Genero("Terror"));
		cbGenero.addItem(new Genero("Accion"));
		cbGenero.addItem(new Genero("Suspenso"));
		cbGenero.addItem(new Genero("Romantica"));
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {  
				
				String limpiar = tbNuevaPelicula.getText();	
				limpiar = limpiar.trim();
				
				if(limpiar.length()==0 && String.valueOf(cbGenero.getSelectedItem()) == "Seleccione un genero") {
					JOptionPane.showMessageDialog(null, "Error Ingrese un nombre y seleccione un genero");	
				}
				else if(limpiar.length()==0) {
					JOptionPane.showMessageDialog(null, "Error Ingrese un nombre");	
				}
				else if(String.valueOf(cbGenero.getSelectedItem()) == "Seleccione un genero") {
					JOptionPane.showMessageDialog(null, "Error seleccione un genero");	
				}
				else {
					Peliculas peli= new Peliculas();
					peli.setId(Integer.parseInt(String.valueOf(Peliculas.ProximoId())));
					peli.setNombre(limpiar);
					peli.setGenero((Genero)cbGenero.getSelectedItem());
					//Agrego a la lista la película
					dlModel.addElement(peli);
					
					Peliculas nuevaPelicula = new Peliculas(limpiar, (Genero)cbGenero.getSelectedItem());
					// Muestro por pantalla el valor agregado
					JOptionPane.showMessageDialog(null, nuevaPelicula.toString());			
					
					// Le asigno el próximo ID por pantalla y limpio el JTextField y le asigno el index del combo en 0 para que quede
					// limpia la pantalla.
					lbID.setText(String.valueOf(Peliculas.ProximoId()));
					tbNuevaPelicula.setText("");
					cbGenero.setSelectedIndex(0);
					
				}
				
			}
		});
		btnAceptar.setBounds(92, 184, 89, 23);
		panel.add(btnAceptar);
	}
	
	public void setDlModel(DefaultListModel<Peliculas> dlModel) {
		this.dlModel = dlModel;
	}
}
