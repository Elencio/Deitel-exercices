import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
    
    try (// Criar um Scanner para ler os dados de entrada
    Scanner scanner = new Scanner(System.in)) {
        // Criar uma matriz com 36 linhas e 4 colunas
        double[][] notas = new double[36][4];

        // Lê as notas dos alunos
        for (int i = 0; i < 36; i++) {
          System.out.println("Insira as notas do aluno " + (i + 1));
          for (int j = 0; j < 3; j++) {
            notas[i][j] = scanner.nextDouble();
          }
        }

        // Calcula a média de cada aluno e adiciona no quarto elemento da linha
        for (int i = 0; i < 36; i++) {
          double media = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;
          notas[i][3] = media;
        }

        // Calcula a média da turma em cada prova
        double[] mediaTurma = new double[3];
        for (int j = 0; j < 3; j++) {
          double soma = 0;
          for (int i = 0; i < 36; i++) {
            soma += notas[i][j];
          }
          mediaTurma[j] = soma / 36;
        }

        // Imprime as médias da turma em cada prova
        System.out.println("Média da turma na prova 1: " + mediaTurma[0]);
        System.out.println("Média da turma na prova 2: " + mediaTurma[1]);
        System.out.println("Média da turma na prova 3: " + mediaTurma[2]);

        // Imprime as médias dos alunos
        for (int i = 0; i < 36; i++) {
          System.out.println("Média do aluno " + (i + 1) + ": " + notas[i][3]);
        }
    }
  }
}

    

