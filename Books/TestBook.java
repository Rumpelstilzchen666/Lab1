package Books;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("The Mysterious Island", "Jules Verne", 1875);
        Book b2 = new Book("On the Sphere and Cylinder", "Archimedes", -225);
        Book b3 = new Book("Iliad", "Homer");
        Book b4 = new Book("Voynich manuscript");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println();
        b1.yearsAgoWritten();
        b2.yearsAgoWritten();
        b3.yearsAgoWritten();
        b4.yearsAgoWritten();
    }
}
