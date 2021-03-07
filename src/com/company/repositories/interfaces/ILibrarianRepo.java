package com.company.repositories.interfaces;

import com.company.entities.Librarian;

public interface ILibrarianRepo {
    Librarian getNameById(int id);
    boolean addLibrarian(Librarian librarian);
}
