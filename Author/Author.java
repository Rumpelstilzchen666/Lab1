package Author;

public class Author {
    String name;
    private char gender;
    private String email;

    public Author(String name, char gender) {
        this.name = name;
        this.email = "No email";
        setGender(gender);
    }
    public Author(String name, char gender, String email) {
        this.name = name;
        this.email = email;
        setGender(gender);
    }

    private void setGender(char gender){
        if(gender == 'M' || gender == 'm' || gender == '0')
            this.gender = 'm';
        else if(gender == 'F' || gender == 'f' || gender == '1')
            this.gender = 'f';
        else
            this.gender = 'u';
    }

    public String getName() { return name; }
    public char getGender() { return gender; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String toString() { return name + " (" + (gender == 'm' ? "Male" : (gender == 'f' ? "Female" : "Unknown")) + ") at " + email; }
}
