public class tetraedro extends formaTridimensional {
  private double base;
  private double altura;
  private double profundidade;
  private String nome;

  public tetraedro(double base, double altura, double profundidade, String nome) {
      this.base = base;
      this.altura = altura;
      this.profundidade = profundidade;
      this.nome = nome;
  }

  @Override
  public double obterarea() {
      return (base * altura) / 2;
  }

  @Override
  public double obtervolume() {
      return (base * altura * profundidade) / 3;
  }

  @Override
  public String toString() {
      return nome + " (base = " + base + ", altura = " + altura + ", profundidade = " + profundidade + ")";
  }
}

