//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1
//        Student Amanat  = new Student("Amanat", 2006, 123456780l, "Kyrgyz");
//        Student Nuris  = new Student("Nuris", 2005, 1256780l, "Kytai");
//        Student Marsel  = new Student("Marsel", 2004, 1234567l, "Mangol");
//        Student Ibo  = new Student("Ibo", 2008, 23456780l, "Ozbek");
//        Student Elzar  = new Student("Elzar", 2001, 1234568780l, "Orus");
//
//        Student[] students = {Amanat, Nuris, Marsel, Ibo, Elzar};
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].toString());
//        }
//
//        Amanat.getAgeOfStudent(Amanat.dateOfBirth);


        //2
//        Person Altynai = new Person("Altynai", 55, "Dalnoboishik", 15000, "iphone 6 plus");
//        Person Beka = new Person("Beka", 19, "Kurier", 20000, "iphone 11");
//        Person Nuris = new Person("Nuris", 30, "Parikmaher", 25000, "iphone 10");
//        Person Ibo = new Person("Ibrohim", 45, "Domohozayka", 30000, "iphone 13");
//        Person Rinat = new Person("RINAT", 24, "FULLSTACK PROGRAMMIST", 1000000, "iphone 16 pro max");
//
//        Person[] persons = {Altynai, Beka, Nuris, Ibo, Rinat};
//        for (int i = 0; i < persons.length; i++) {
//            System.out.println(persons[i].toString());
//        }
//        Person getPersonInfo = new Person();
//        getPersonInfo.getInfoAboutPerson(persons);

        //3
        Reader Ainazik = new Reader("Ainazik", "MangaLib", 5, "12,05,2000", 65434565l);
        Ainazik.takeBook(6, Ainazik.fullname);
        Ainazik.returnBook(9, Ainazik.fullname);
    }
}