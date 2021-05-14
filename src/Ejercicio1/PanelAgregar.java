package Ejercicio1;
 
import javax.swing.JPanel;
import javax.swing.JLabel;

public class PanelAgregar extends JPanel {
  
	public PanelAgregar() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		
		JLabel lblPanelAgregar = new JLabel("Panel agregar");
		panel.add(lblPanelAgregar);

	}

}
