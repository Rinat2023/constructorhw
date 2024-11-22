import java.time.LocalDate;
import java.time.Period;

public class Student {
    String name;
    int dateOfBirth;
    long phoneNumber;
    String nationality;

    public Student (){

    }
    public Student (String name, int dateOfBirth, long phoneNumber, String nationality){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    public void getAgeOfStudent (int yearOfBirthOfStudent){
        LocalDate yearOfBirth = LocalDate.ofYearDay(yearOfBirthOfStudent, 1);
        Period period = Period.between(yearOfBirth, LocalDate.now());
        System.out.println(period);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
