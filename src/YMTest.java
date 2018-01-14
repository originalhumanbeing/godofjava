import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

/**
 * Created by Hyunjung on 2018. 1. 11..
 */
public class YMTest {
    String name = "String";

    public static void main(String[] args) {
        Book book1 = new Book(1, "ym", "ym's life1");
        Book book2 = new Book(21, "ym", "ym's life2");
        Book book3 = new Book(13, "ym", "ym's life3");


        int bookPageNum;
        Book[] books = new Book[]{book1, book2, book3};

        for(Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("## args ###");
        for(String arg : args) {
            System.out.println(arg);
        }

        if (args.length <= 0) {
            System.out.println("arguments를 넣어주세요.");
        }

        System.out.println(abs(-123.22));
    }
}

class Book {
    int pageNum;
    String author;
    String title;

    public Book(int pageNum, String author, String title) {
        this.pageNum = pageNum;
        this.author = author;
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

