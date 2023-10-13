package repeticaop3q4;

import javax.swing.JOptionPane;

public class DoWhileP3Q4Dialog {

    public static void main(String[] args) {

        String entrada;

        do {
            double somaSalarios = 0;
            int somaFilhos = 0;
            int contador = 0;

            entrada = JOptionPane.showInputDialog("Pesquisa da Prefeitura - Digite o salário (ou um valor negativo para encerrar):");
            double salario = Double.parseDouble(entrada);

            entrada = JOptionPane.showInputDialog("Digite o número de filhos: ");
            double filhos = Double.parseDouble(entrada);

            somaSalarios += salario;
            somaFilhos += filhos;
            contador++;

            entrada = JOptionPane.showInputDialog("Digite o salário (ou um valor negativo para encerrar): );");
            double salario2 = Double.parseDouble(entrada);

            if (contador > 0) {
                double mediaSalarios = somaSalarios / contador;
                double mediaFilhos = (double) somaFilhos / contador;

                JOptionPane.showMessageDialog(null, "Média Salarial da População: " + mediaSalarios);
                JOptionPane.showMessageDialog(null, "Média do Número de Filhos: " + mediaFilhos);

            } else {
                JOptionPane.showMessageDialog(null, "Nenhum dado foi inserido.");
            }
            int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (resp == JOptionPane.YES_OPTION)
                entrada = "sim";
            else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
                entrada = "não";
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
    }
}