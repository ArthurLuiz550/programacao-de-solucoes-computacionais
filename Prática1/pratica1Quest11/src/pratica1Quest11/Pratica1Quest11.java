package pratica1Quest11;
import java.util.Scanner;
public class Pratica1Quest11 {

	public static void main(String[] args) {
		int n;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n = input.nextInt();
		for(int i = 1; i <= 10; i++)
		System.out.println(n + " x " + i + " = " + (n * i));
		
	}

}
