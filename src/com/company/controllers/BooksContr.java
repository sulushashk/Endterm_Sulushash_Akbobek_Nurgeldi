package com.company.controllers;

import com.company.entities.Books;
import com.company.repositories.interfaces.IBookRepo;

public class BooksContr {
    private final IBookRepo repo2;
    public BooksContr(IBookRepo repo2) {
        this.repo2=repo2;
    }
    public String getAllBooksList(){
        List<Books> books= repo2.getAllBooksList();

       return books.toString;
    }
    public String getBookByAuthor(String author){
        Books books = repo2.getBookByAuthor(author);

        return books == null ? "Books with this author was not found" : books.toString();
    }
   public getBookByGenre(String genre){

   }

}
