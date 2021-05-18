package Ejercicio1;

import javax.swing.JPanel;

import java.util.Collections;
import java.util.Comparator;

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
		// Le seteo dentro del panel el default list model
		this.dlModel = dlModel;
		// Lo ordeno alfabéticamente mediante método privado
		sortList();
		//Lo seteo sobre el default list model del panel.
		listar.setModel(this.dlModel);
	}
	
	public void sortList(){
	    Peliculas temp;
	    // Seteo el array con el tamaño del objeto de las peliculas.
		Peliculas[] ob = new Peliculas[dlModel.getSize()];
		//Lo recorro y le agrego todos los objetos películas.
	    for(int i = 0 ; i <dlModel.getSize(); i++ )
	        ob[i] = dlModel.getElementAt(i);
	    //Me traigo cuantos tiene para el for.
	    int n=ob.length;
	    for(int i=0;i<n;i++)
	        for(int j=0;j<n-i-1;j++)
	        {
	        	// Aplico lógica compare To, si es mayor, lo baja para aplicar el orden ascendente.
	            if(ob[j].compareTo(ob[j+1]) > 0)
	            {
	             temp=ob[j];
	             ob[j]=ob[j+1];
	             ob[j+1]=temp;
	            }

	          }
	    // Limpio la lista original.
	    dlModel.removeAllElements();
	    // Le agrego los elementos peliculas ordenados.
	    for(int i=0;i<n;i++) {
	    	dlModel.addElement((Peliculas) ob[i]);
	    }
	    System.out.println("Ordenados!");

	}
}
