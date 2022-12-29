import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    // Criar um vetor com 15 posições
    double[] vetor = new double[15];

    // usar o try para fechar o Scanner
    try (// Criar um Scanner para ler os elementos do vetor
    Scanner scanner = new Scanner(System.in)) {
      // Preenche o vetor com os elementos lidos da entrada padrão
      for (int i = 0; i < 15; i++) {
        System.out.println("Insira o elemento " + (i + 1) + " do vetor:");
        vetor[i] = scanner.nextDouble();
      }
    }

    // Criar a matriz de 3 linhas e 5 colunas
    double[][] matriz = new double[3][5];

    // Preenche a matriz com os elementos do vetor
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        matriz[i][j] = vetor[i * 5 + j];
      }
    }

    // Imprime a matriz
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}
