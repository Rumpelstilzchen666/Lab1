package Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Жюль Верн", 'm', "JulesVerne@mail.ru");
        Author a2 = new Author("Салли Руни", 'f');
        System.out.println(a1);
        System.out.println(a2);
        a2.setEmail("SallyRooney@gmail.com");
        System.out.println(a2.getName() + "'s new email is " + a2.getEmail());
    }
}
