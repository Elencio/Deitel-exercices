public class Building implements CarbonFootprint{
    // atributos da classe Building
    private int numFloors;
    private double squareFootage;
    private String location;
  
    // construtor da classe Building
    public Building(int numFloors, double squareFootage, String location) {
      this.numFloors = numFloors;
      this.squareFootage = squareFootage;
      this.location = location;
    }
  
    // métodos da classe Building
    public int getNumFloors() {
      return numFloors;
    }
  
    public double getSquareFootage() {
      return squareFootage;
    }
  
    public String getLocation() {
      return location;
    }

    @Override
    public double getCarbonFootprint() {
      double carbonFootprint = numFloors * squareFootage * 0.01;
      return carbonFootprint;
    }
  }

