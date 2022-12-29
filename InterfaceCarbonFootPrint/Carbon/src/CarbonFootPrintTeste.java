import java.util.ArrayList;

public class CarbonFootPrintTeste {
    public static void main(String[] args) throws Exception {
    
    // crie alguns objetos das classes Building, Car e Bicycle
    Building building1 = new Building(10, 10000, "New York");
    Building building2 = new Building(5, 5000, "Chicago");
    Car car1 = new Car(4, "gasoline", 25.0);
    Car car2 = new Car(5, "electric", 50.0);
    Bicycle bicycle1 = new Bicycle(6, "aluminum", true);
    Bicycle bicycle2 = new Bicycle(7, "steel", false);

    // coloque as referências para os objetos em um ArrayList<CarbonFootprint>
    ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<>();
    carbonFootprints.add(building1);
    carbonFootprints.add(building2);
    carbonFootprints.add(car1);
    carbonFootprints.add(car2);
    carbonFootprints.add(bicycle1);
    carbonFootprints.add(bicycle2);

    // itere pelo ArrayList, invocando polimorficamente o método getCarbonFootprint de cada objeto
    for (CarbonFootprint carbonFootprint : carbonFootprints) {
      // imprima as informações de identificação e a pegada de carbono do objeto
      System.out.println("Type: " + carbonFootprint.getClass().getSimpleName());
      System.out.println("Carbon footprint: " + carbonFootprint.getCarbonFootprint());
      System.out.println();
    }
  }
}
  
