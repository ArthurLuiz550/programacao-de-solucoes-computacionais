package repeticaop3q3;

import javax.swing.JOptionPane;

public class DoWhileP3Q3Dialog {
    public static void main(String[] args) {

        String entrada;

        int canal2 = 0, canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
        int totalPessoas = 0;

        JOptionPane.showMessageDialog(null, "Pesquisa de Audiência de TV");
        JOptionPane.showInputDialog("Informe o número do canal e o total de pessoas assistindo (digite 0 para encerrar):");
        int canal = 0;
        do {
            entrada = JOptionPane.showInputDialog("Número do canal (2, 4, 5, 7, 12): ");
            double canal1 = Double.parseDouble(entrada);

            if (canal1 != 0) {
                entrada = JOptionPane.showInputDialog("Número de pessoas assistindo: ");
                double numPessoas = Double.parseDouble(entrada);

                switch (canal) {
                    case 2:
                        canal2 += numPessoas;
                        break;
                    case 4:
                        canal4 += numPessoas;
                        break;
                    case 5:
                        canal5 += numPessoas;
                        break;
                    case 7:
                        canal7 += numPessoas;
                        break;
                    case 12:
                        canal12 += numPessoas;
                        break;

                    default:
                        JOptionPane.showInputDialog("Canal inválido. Informe um dos canais válidos.");
                }
                totalPessoas += numPessoas;
            }
            JOptionPane.showMessageDialog(null, "Percentual de Audiência:");
            if (totalPessoas > 0) {
                JOptionPane.showMessageDialog(null, ("Canal 2: " + ((double) canal2 / totalPessoas * 100) + "%"));
                JOptionPane.showMessageDialog(null, ("Canal 4: " + ((double) canal4 / totalPessoas * 100) + "%"));
                JOptionPane.showMessageDialog(null, ("Canal 5: " + ((double) canal5 / totalPessoas * 100) + "%"));
                JOptionPane.showMessageDialog(null, ("Canal 7: " + ((double) canal7 / totalPessoas * 100) + "%"));
                JOptionPane.showMessageDialog(null, ("Canal 12: " + ((double) canal12 / totalPessoas * 100) + "%"));
            } else {
                JOptionPane.showMessageDialog(null, ("Nenhum dado foi inserido."));
            }
            int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (resp == JOptionPane.YES_OPTION)
                entrada = "sim";
            else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
                entrada = "não";
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
    }
}
