public class triangulo extends formaTridimensional {
  private double base;
  private double altura;
  private String nome;

  public triangulo(double base, double altura, String nome) {
      this.base = base;
      this.altura = altura;
      this.nome=nome;
  }

  @Override
  public double obterarea() {
      return 2 * Math.PI * base * (base + altura);
  }

  @Override
  public double obtervolume() {
      return Math.PI *  base * base * altura;
  }

  @Override
  public String toString() {
         return nome + " (base = " + base + ", altura = " + altura + ")";
  }
}

