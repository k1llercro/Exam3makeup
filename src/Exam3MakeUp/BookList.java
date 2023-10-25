package Exam3MakeUp;
import java.io.*;
import java.util.*;

class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished;
    }
}


public class BookList {
    static List<Book> book = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("C:\\Users\\salim\\Desktop\\IntelliJ\\ITEC215001\\src\\Exam3MakeUp\\Nobel.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Collections.sort(book, Comparator.comparingInt(Book::getYearPublished));

        for (Book book : book) {
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYearPublished());
        }

        try (FileWriter fw = new FileWriter("C:\\Users\\salim\\Desktop\\IntelliJ\\ITEC215001\\src\\Exam3MakeUp\\output.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);{

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}