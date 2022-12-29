public class quadrado extends formabidimensional {
  
    private double lado;
    private String nome;

    public quadrado(double lado, String nome) {
        this.lado = lado;
        this.nome = nome;
    }

    @Override
    public double obterarea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return nome + " (lado = " + lado + ")";
    }
}


