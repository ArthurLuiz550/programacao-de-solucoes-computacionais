package pratica1Quest9JOption;
import javax.swing.JOptionPane;
public class Pratica1Quest9JOption {

	public static void main(String args[]) {
		
		String catetoOpostoStr = JOptionPane.showInputDialog("Informe o cateto oposto: ");
		double catetoOposto = Double.parseDouble(catetoOpostoStr);
		
		String catetoAdjacenteStr = JOptionPane.showInputDialog("Informe o cateto adjacente: ");
		double catetoAdjacente = Double.parseDouble(catetoAdjacenteStr);
		
	    double hipotenusa = catetoAdjacente *  catetoAdjacente + catetoOposto * catetoOposto;
	    
	    JOptionPane.showMessageDialog(null,("A hipotenusa é: " + hipotenusa));
		
	}

}
