public class Bicycle implements CarbonFootprint {
  // atributos da classe Bicycle
    private int numGears;
    private String frameMaterial;
    private boolean hasKickstand;
  
    // construtor da classe Bicycle
    public Bicycle(int numGears, String frameMaterial, boolean hasKickstand) {
      this.numGears = numGears;
      this.frameMaterial = frameMaterial;
      this.hasKickstand = hasKickstand;
    }
  
    // métodos da classe Bicycle
    public int getNumGears() {
      return numGears;
    }
  
    public String getFrameMaterial() {
      return frameMaterial;
    }
  
    public boolean hasKickstand() {
      return hasKickstand;
    }

    @Override
    public double getCarbonFootprint() {
      return 0.0;
    }
  }
