package com.company.controllers;

import com.company.entities.Reader;
import com.company.repositories.interfaces.IReaderRepo;

public class ReaderContr {
    private final IReaderRepo repo5;

    public ReaderContr(IReaderRepo repo5) {
        this.repo5 = repo5;
    }
    public String getBonus(){
        boolean gotten =repo5.getBonus();
        return gotten ? "Bonus for librarian was added" : "Librarian can not get bonus";
    }
    public String getDateOfMembershipById(int id){
        Reader reader = repo5.getDateOfMembershipById(id);
         return reader==null ? "Reader's date of membership by this id "
    }
}
