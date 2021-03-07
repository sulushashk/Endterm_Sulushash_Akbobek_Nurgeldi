package com.company.controllers;

import com.company.entities.Librarian;
import com.company.entities.Library;
import com.company.repositories.interfaces.ILibraryRepo;

public class LibraryContr {
    private final ILibraryRepo repo3;

    public LibraryContr(ILibraryRepo repo3) {
        this.repo3 = repo3;
    }
    public String getLibraryByLocation(String location){
        Library library = repo3.getLibraryByLocation(location);
        return (library == null ? "Library with this location is not found" : library.toString());
    }
    public String getAddressByName(String address){
        Library library = repo3.getAddressByName(address);
        return (library == null ? "Library with this name is not found" : library.toString());
    }

}
