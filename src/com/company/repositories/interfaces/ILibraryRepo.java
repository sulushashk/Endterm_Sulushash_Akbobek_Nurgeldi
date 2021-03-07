package com.company.repositories.interfaces;

import com.company.entities.Library;

public interface ILibraryRepo {
    Library getLibraryByLocation(String location);
    Library getAddressByName(String name);
}

