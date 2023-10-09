package pratica1Quest10JOption;
import javax.swing.JOptionPane;
public class Pratica1Quest10JOption {

	public static void main(String[] args) {
		
		String raioStr = JOptionPane.showInputDialog("Informe o raio: ");
		double raio = Double.parseDouble(raioStr);

		double comprimentoDaEsfera = 2 * 3.14 * raio;
		
		double areaDaEsfera = 3.14 * (raio * raio);
		
		double volumeDaEsfera = 0.75 * 3.14 * (raio * raio * raio);
		
		JOptionPane.showMessageDialog(null,("O comprimento da esfera é: " +  comprimentoDaEsfera ));
		JOptionPane.showMessageDialog(null,("A área da esfera é: " + areaDaEsfera));
		JOptionPane.showMessageDialog(null,("O volume da esfera é: " + volumeDaEsfera));
	}

}
