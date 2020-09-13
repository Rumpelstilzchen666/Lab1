package Books;
import java.util.Calendar;

public class Book {
    private String title;
    private String author;
    private int yearOfWriting;

    public Book(String title){
        this.title = title;
        this.author = "Unknown";
        this.yearOfWriting = 0;
    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.yearOfWriting = 0;
    }
    public Book(String title, int yearOfWriting){
        this.title = title;
        this.author = "Unknown";
        this.yearOfWriting = yearOfWriting;
    }
    public Book(String title, String author, int yearOfWriting){
        this.title = title;
        this.author = author;
        this.yearOfWriting = yearOfWriting;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYearOfWriting() { return yearOfWriting; }

    public void yearsAgoWritten() {
        System.out.print('\"' + title + '\"' + " was written ");
        if(yearOfWriting != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new java.util.Date());
            System.out.println(calendar.get(Calendar.YEAR) - yearOfWriting +
                    " years ago.");
        }
        else
            System.out.println("no one knows when.");
    }

    public String toString() {
        return '\"' + title + '\"' +
                (author != "Unknown" || yearOfWriting != 0 ?
                        " was written" : "\0") +
                (author != "Unknown" ? " by " + author : "\0") +
                (yearOfWriting != 0 ? " in " + (yearOfWriting > 0 ?
                        yearOfWriting : -yearOfWriting + " BC") : "\0") + '.';
    }
}