package com.company.entities;

public class Books {
    private int ISBN;
    private String title;
    private String genre;
    private String publisher;
    private String lang;
    private int numberOfPage;
    private String author;
    public Books(int ISBN, String title,String genre, String publisher, String lang, int numberOfPage, String author) {
        setISBN(ISBN);
        setTitle(title);
        setGenre(genre);
        setPublisher(publisher);
        setLang(lang);
        setNumberOfPage(numberOfPage);
        setAuthor(author);
    }

    public Books() {
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Books{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", lang='" + lang + '\'' +
                ", numberOfPage=" + numberOfPage +
                ", author='" + author + '\'' +
                '}';
    }
}
