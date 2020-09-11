package Dogs;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Sharic");
        Dog d3 = new Dog("Bobik", 3);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        d2.setAge(5);
        d3.setName("Rex");
        System.out.println();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println();

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
