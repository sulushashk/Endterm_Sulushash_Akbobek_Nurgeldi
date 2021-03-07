package com.company.controllers;

import com.company.entities.Librarian;
import com.company.repositories.interfaces.ILibrarianRepo;

public class LibrarianContr {
    private final ILibrarianRepo repo4;

    public LibrarianContr(ILibrarianRepo repo4){
        this.repo4 = repo4;
    }
    public String getNameById(int id){
        Librarian librarian = repo4.getNameById(id);
        return (librarian == null ? "Librarian with this id is not found" : librarian.toString());
    }

    public String addLibrarian(String name, int salary){
        Librarian librarian = new Librarian(name, salary);
        boolean created= repo4.addLibrarian(librarian);

        return  (created ?  "Information about librarian is successfully added!":" addition is failed!");
    }

}
