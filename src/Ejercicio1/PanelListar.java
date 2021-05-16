package Ejercicio1;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class PanelListar extends JPanel {
	
	
	private	JList <Peliculas> listar;
	private DefaultListModel<Peliculas> dlModel;
	
	public PanelListar() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblPanelListar = new JLabel("Peliculas");
		lblPanelListar.setBounds(10, 125, 55, 14);
		panel.add(lblPanelListar);
		
		listar = new JList<Peliculas>();
		listar.setBounds(96, 11, 223, 197);
		
		panel.add(listar);
	}


	public void setDlModel(DefaultListModel<Peliculas> dlModel) {
		this.dlModel = dlModel;
		listar.setModel(dlModel);
	}
}
