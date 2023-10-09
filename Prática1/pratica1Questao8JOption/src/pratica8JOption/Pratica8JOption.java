package pratica8JOption;
import javax.swing.JOptionPane;
public class Pratica8JOption {
	
	public static void main(String args[]) {
		
	    String pesoInformadoStr = JOptionPane.showInputDialog("Digite seu peso em KG: ");
		double pesoInformado = Double.parseDouble(pesoInformadoStr);
		
		double pesoGanho = (pesoInformado * 0.15) + pesoInformado;
		double pesoPerdido = pesoInformado - (pesoInformado * 0.20);
		
		JOptionPane.showMessageDialog(null,("Seu peso após ganhar 15%:" + pesoGanho));
		JOptionPane.showMessageDialog(null,("Seu peso após perder 20%:"+ pesoPerdido));
	}
}