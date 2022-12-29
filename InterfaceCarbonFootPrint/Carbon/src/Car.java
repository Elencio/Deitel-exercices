public class Car implements CarbonFootprint {
     // atributos da classe Car
    private int numSeats;
    private String fuelType;
    private double milesPerGallon;
  
    // construtor da classe Car
    public Car(int numSeats, String fuelType, double milesPerGallon) {
      this.numSeats = numSeats;
      this.fuelType = fuelType;
      this.milesPerGallon = milesPerGallon;
    }
  
    // métodos da classe Car
    public int getNumSeats() {
      return numSeats;
    }
  
    public String getFuelType() {
      return fuelType;
    }
  
    public double getMilesPerGallon() {
      return milesPerGallon;
    }

    @Override
    public double getCarbonFootprint() {
      double carbonFootprint = milesPerGallon / 10.0; // valor hipotético
      return carbonFootprint;
    }
  }
