import java.util.Calendar; 

public class HealthProfile {
  private String firstName;
  private String lastName;
  private String gender;
  private int birthMonth;
  private int birthDay;
  private int birthYear;
  private double height;
  private double weight;

  // Constructor to initialize all variables
  public HealthProfile(String firstName, String lastName, String gender, int birthMonth, int birthDay, int birthYear, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.birthMonth = birthMonth;
    this.birthDay = birthDay;
    this.birthYear = birthYear;
    this.height = height;
    this.weight = weight;
  }

  // Getters and setters for all variables
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getBirthMonth() {
    return birthMonth;
  }

  public void setBirthMonth(int birthMonth) {
    this.birthMonth = birthMonth;
  }

  public int getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(int birthDay) {
    this.birthDay = birthDay;
  }

  public int getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // Method to calculate age in years
  public int getAge() {
    Calendar now = Calendar.getInstance();
    int currentYear = now.get(Calendar.YEAR);
    int currentMonth = now.get(Calendar.MONTH) + 1; // Calendar months start at 0
    int currentDay = now.get(Calendar.DAY_OF_MONTH);
    int age = currentYear - birthYear;
    if (birthMonth > currentMonth || (birthMonth == currentMonth && birthDay > currentDay)) {
      age--;
    }
    return age;
  }

  // Method to calculate maximum heart rate
  public int getMaxHeartRate() {
    int age = getAge();
    return 220 - age;
  }

  // Method to calculate target heart rate range
  // Method to calculate target heart rate range
  public String getTargetHeartRateRange() {
    int maxHeartRate = getMaxHeartRate();
    int lowerEnd = (int) (maxHeartRate * 0.5);
    int upperEnd = (int) (maxHeartRate * 0.85);
    return lowerEnd + "-" + upperEnd + " bpm";
  }
    // Method to calculate body mass index (BMI)
    public double getBMI() {
      double bmi = weight / (height * height) * 703;
      return bmi;
    }
  
    // Method to return a BMI category based on the BMI value
    public String getBMICategory() {
      double bmi = getBMI();
      if (bmi < 18.5) {
        return "Underweight";
      } else if (bmi < 25) {
        return "Normal weight";
      } else if (bmi < 30) {
        return "Overweight";
      } else {
        return "Obesity";
      }
    }
  @Override
  public String toString() {
    return "Name: " + firstName + " " + lastName + "\n" +
           "Gender: " + gender + "\n" +
           "Birthday: " + birthMonth + "/" + birthDay + "/" + birthYear + "\n" +
           "Height: " + height + " inches\n" +
           "Weight: " + weight + " pounds\n" +
           "Age: " + getAge() + " years\n" +
           "BMI: " + getBMI() + " (" + getBMICategory() + ")\n" +
           "Maximum heart rate: " + getMaxHeartRate() + " bpm\n" +
           "Target heart rate range: " + getTargetHeartRateRange();
  }


}