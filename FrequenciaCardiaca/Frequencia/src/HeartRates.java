import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
 
  private String firstName;
  private String lastName;
  private int birthMonth;
  private int birthDay;
  private int birthYear;

  public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthMonth = birthMonth;
    this.birthDay = birthDay;
    this.birthYear = birthYear;
  }

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

  public int getAgeInYears() {
    LocalDate today = LocalDate.now();
    LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
    Period age = Period.between(birthDate, today);
    return age.getYears();
  }

  public int getMaximumHeartRate() {
    return 220 - getAgeInYears();
  }

  public int getTargetHeartRate() {
    return (int) (getMaximumHeartRate() * 0.5);
  }

  @Override
  public String toString() {
    return "Nome: " + firstName + " " + lastName + "\n" +
           "Data de nascimento: " + birthDay + "/" + birthMonth + "/" + birthYear + "\n" +
           "Idade em anos: " + getAgeInYears() + "\n" +
           "Frequência cardíaca máxima: " + getMaximumHeartRate() + "\n" +
           "Frequência cardíaca-alvo: " + getTargetHeartRate();
  }
}


