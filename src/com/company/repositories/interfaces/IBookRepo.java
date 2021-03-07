package com.company.repositories.interfaces;

import com.company.entities.Books;

import java.util.List;

public interface IBookRepo {
    List<Books> getAllBooksList();
    Books getBookByAuthor(String author);
    Books getBookByGenre(String genre);
    boolean removeBookByPublisher(String publisher);
}
