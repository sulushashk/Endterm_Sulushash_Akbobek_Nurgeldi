package com.company.controllers;

import com.company.entities.Books;
import com.company.repositories.interfaces.IBookRepo;

import java.util.List;

public class BooksContr {
    private final IBookRepo repo2;
    public BooksContr(IBookRepo repo2) {
        this.repo2=repo2;
    }
    public String getAllBooksList(){
        List<Books> booksList = repo2.getAllBooksList();
        return  booksList.toString();
    }
    public String getBookByAuthor(String author){
        Books books = repo2.getBookByAuthor(author);

        return books == null ? "Books with this author was not found" : books.toString();
    }
   public String getBookByGenre(String genre){
       Books books = repo2.getBookByGenre(genre);

       return books == null ? "Books with this genre was not found" : books.toString();
   }
    public String removeBookByPublisher(String publisher) {
        boolean removed = repo2.removeBookByPublisher(publisher);

        return ( removed ? "Book was removed by publisher" : "It has trouble");
    }


}
