package entities;

import java.util.Date;

public class Book {

    private long id;

    private String title;

    private String author;

    private int pages;

    private Date date;

    public Book(long id, String title, String author, int pages, Date date) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
