package Dogs;

public class Dog {
    private String name;
    private int age = 0;

    public Dog(){
        name = "Dog";
    }
    public Dog(String n) {
        name = n;
    }
    public Dog(String n, int a){
        name = n;
        age = a;
    }

    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }
    public void setName(String n) { name = n; }
    public String getName() {
        return name;
    }

    public String toString(){
        return name + ": age = " + age;
    }
    public void intoHumanAge(){
        System.out.println(name + "'s age in human years is " + age*7 + " years");
    }
}