package Ejercicio1;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class PanelListar extends JPanel {
 
	public PanelListar() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		
		JLabel lblPanelListar = new JLabel("Panel Listar");
		panel.add(lblPanelListar);

	}

}
