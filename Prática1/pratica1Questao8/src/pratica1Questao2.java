package pratica1Questao2;
import java.util.Scanner;
public class Pratica1Questao2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite seu peso em Kg: ");
		
		double pesoInformado = input.nextDouble();
		double pesoGanho = (pesoInformado * 0.15) + pesoInformado;
		double pesoPerdido = pesoInformado - (pesoInformado * 0.20);
		
		System.out.println("Seu peso após ganhar 15%:" + pesoGanho);
		System.out.print("Seu peso após perder 20%:"+ pesoPerdido);
		
	}

}
