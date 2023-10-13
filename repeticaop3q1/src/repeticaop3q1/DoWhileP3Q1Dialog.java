package repeticaop3q1;

import javax.swing.JOptionPane;

public class DoWhileP3Q1Dialog {

    public static void main(String[] args) {

        String entrada;

        do {

            int contadorAprovados = 0;
            int contadorReprovados = 0;
            double maiorNota = Double.MIN_VALUE;
            double menorNota = Double.MAX_VALUE;
            double somaNotas = 0;
            int totalAlunos = 0;

            entrada = JOptionPane.showInputDialog("Digite a nota final (ou uma nota negativa para encerrar): ");
            double nota = Double.parseDouble(entrada);

            entrada = JOptionPane.showInputDialog("Digite o tota de faltas do aluno: ");
            double faltas = Double.parseDouble(entrada);

            if (nota >= 90) {
                contadorAprovados++;
            } else if (nota < 70 || faltas >= 20) {
                contadorReprovados++;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }


            somaNotas += nota;
            totalAlunos++;

            entrada = JOptionPane.showInputDialog("Digite a nota final(ou uma nota negativa para encerrar): ");
            double nota2 = Double.parseDouble(entrada);

            if (totalAlunos > 0) {
                double mediaNotas = somaNotas / totalAlunos;
                JOptionPane.showMessageDialog(null,"Alunos com nota maior ou igual a 90: " + contadorAprovados);
                JOptionPane.showMessageDialog(null,"Alunos reprovados por nota ou falta: " + contadorReprovados);
                JOptionPane.showMessageDialog(null,"Maior nota: \" + maiorNota");

                JOptionPane.showMessageDialog(null,"Média de notas da turma: \" + mediaNotas");
            } else {
                JOptionPane.showMessageDialog(null,"Nenhum aluno foi registrado");

            }
            int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (resp == JOptionPane.YES_OPTION)
                entrada = "sim";
            else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
                entrada = "não";
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
    }
}