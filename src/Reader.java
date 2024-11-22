public class Reader {
    String fullname;
    String library;
    int cardNumber;
    String dateOfBirth;
    long phoneNumber;

    public Reader(String fullname, String library, int cardNumber, String dateOfBirth, long phoneNumber) {
        this.fullname = fullname;
        this.library = library;
        this.cardNumber = cardNumber;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook (int takeBooks, String fullname){
        System.out.println(fullname + " взял(a) " + takeBooks + " книг");
    }
    public void returnBook (int returnBooks, String fullname){
        System.out.println(fullname + " вернул(a) " + returnBooks + " книг");
    }

}
