import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    // Criar a matriz de 5 linhas e 5 colunas
    double[][] matriz = new double[5][5];

    try (// Criar um Scanner para ler os elementos da matriz
    Scanner scanner = new Scanner(System.in)) {
      // Preenche a matriz com os elementos lidos da entrada padrão
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
          System.out.println("Insira o elemento [" + i + "][" + j + "] da matriz:");
          matriz[i][j] = scanner.nextDouble();
        }
      }
    }

    // Imprime a matriz original
    System.out.println("Matriz original:");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }

    // Troca a diagonal principal com a secundária
    for (int i = 0; i < 5; i++) {
      double temp = matriz[i][i];
      matriz[i][i] = matriz[i][4 - i];
      matriz[i][4 - i] = temp;
    }

    // Imprime a matriz com as diagonais trocadas
    System.out.println("Matriz com as diagonais trocadas:");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}

