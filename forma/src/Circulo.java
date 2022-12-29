public class Circulo extends formabidimensional {
  private double raio;
  private String nome;

  public Circulo(double raio, String nome) {
      this.raio = raio;
      this.nome = nome;
  }

  @Override
  public double obterarea() {
      return Math.PI * raio * raio;
  }

  @Override
  public double obtervolume() {
      // um círculo não tem volume, então retornamos 0
      return 0;
  }

  @Override
  public String toString() {
      return nome + " (raio = " + raio + ")";
  }
}
