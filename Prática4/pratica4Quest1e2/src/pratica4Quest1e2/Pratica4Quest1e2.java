package pratica4Quest1e2;
import javax.swing.JOptionPane;
public class Pratica4Quest1e2 {
	public static void main(String[] args) {
		validarNota();
		validarSalario();
		validarSexo();
		validarIdade();

		JOptionPane.showMessageDialog(null, "Todos os dados foram informados corretamente!");
	}

	public static void validarNota() {
		while (true) {
			try {
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota (entre 0 e 10):"));
				if (nota >= 0 && nota <= 10) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Nota fora do intervalo válido. Tente novamente.");
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Formato inválido. Informe um número válido.");
			}
		}
	}

	public static void validarSalario() {
		while (true) {
			try {
				double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário (maior que zero):"));
				if (salario > 0) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Salário deve ser maior que zero. Tente novamente.");
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Formato inválido. Informe um número válido.");
			}
		}
	}

	public static void validarSexo() {
		while (true) {
			String sexo = JOptionPane.showInputDialog("Informe o sexo (m ou f):");
			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sexo deve ser 'm' ou 'f'. Tente novamente.");
			}
		}
	}

	public static void validarIdade() {
		while (true) {
			try {
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade (entre 0 e 120):"));
				if (idade >= 0 && idade <= 120) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Idade fora do intervalo válido. Tente novamente.");
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Formato inválido. Informe um número válido.");
			}
		}
	}
}
