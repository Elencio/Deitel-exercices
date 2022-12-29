public class esfera extends formaTridimensional {
  private double raio;
  private String nome;

  public esfera(double raio, String nome) {
      this.raio = raio;
      this.nome=nome;
  }

  @Override
  public double obterarea() {
      return 4 * Math.PI * raio * raio;
  }

  @Override
  public double obtervolume() {
      return (4.0 / 3.0) * Math.PI * raio * raio * raio;
  }

  @Override
  public String toString() {
      return nome + " (raio = " + raio + ")";
  }
}

