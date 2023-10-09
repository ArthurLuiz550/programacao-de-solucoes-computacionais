package pratica1Quest9;
import java.util.Scanner;
public class Pratica1Questao9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double hipotenusa, catetoOposto, catetoAdjacente;
		
		System.out.print("Digite o valor do cateto oposto: ");
		catetoOposto = input.nextDouble();
		
		System.out.print("Digite o valor do cateto adjacente: ");
		catetoAdjacente = input.nextDouble();
		
		hipotenusa = catetoOposto * catetoOposto + catetoAdjacente * catetoAdjacente;
		
		System.out.print(hipotenusa);
			
	}

}
