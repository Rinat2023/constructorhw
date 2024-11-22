public class Person {
    String name;
    int age;
    String work;
    int salary;
    String phone;

    public Person() {

    }

    public Person(String name, int age, String work, int salary, String phone) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
    }

    public void getInfoAboutPerson(Person[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].salary > max) {
                max = arr[i].salary;
            }
        }
        int min = max;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].salary < min) {
                min = arr[i].salary;
            }
        }
        System.out.println("max" + max);
        System.out.println("min" + min);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                ", salary=" + salary +
                "руб, phone='" + phone + '\'' +
                '}';
    }
}
