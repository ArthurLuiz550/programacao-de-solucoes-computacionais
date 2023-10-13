package repeticaop3q2;

import javax.swing.JOptionPane;

public class DoWhileP3Q2Dialog {

    public static void main(String[] args) {
        String entrada;

        do {

            entrada = JOptionPane.showInputDialog("Digite a matrícula do aluno (ou um número negativo para sair): ");
            double matricula = Double.parseDouble(entrada);

            entrada = JOptionPane.showInputDialog("Digite a primeira nota do aluno:");
            double nota1 = Double.parseDouble(entrada);

            entrada = JOptionPane.showInputDialog("Digite a segunda nota do aluno: ");
            double nota2 = Double.parseDouble(entrada);

            entrada = JOptionPane.showInputDialog("Digite a terceira nota do aluno: ");
            double nota3 = Double.parseDouble(entrada);

            double nota = nota1 + nota2 + nota3;

            if (nota >= 70) {
                JOptionPane.showMessageDialog(null,"Aluno aprovado. Nota final: " + nota);
            } else if (nota >= 60) {
                JOptionPane.showMessageDialog(null,"Aluno em recuperação. Nota final: " + nota);
            } else {
                JOptionPane.showMessageDialog(null,"Aluno reprovado. Nota final: " + nota);
            }
            int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (resp == JOptionPane.YES_OPTION)
                entrada = "sim";
            else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
                entrada = "não";
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));


        }
    }
