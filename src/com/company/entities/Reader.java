package com.company.entities;

public class Reader extends BookInfo{
    private int id;
    private String dateOfMembership;
    private int totalBooksCheckedOut;

    public Reader(int id, String dateOfMembership, int totalBooksCheckedOut) {
        super(id, dateOfMembership, totalBooksCheckedOut);
        this.id = id;
        this.dateOfMembership = dateOfMembership;
        this.totalBooksCheckedOut = totalBooksCheckedOut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(String dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public int getTotalBooksCheckedOut() {
        return totalBooksCheckedOut;
    }

    public void setTotalBooksCheckedOut(int totalBooksCheckedOut) {
        this.totalBooksCheckedOut = totalBooksCheckedOut;
    }

    public boolean getBonus() {
    if((totalBooksCheckedOut >10)==true){
        System.out.println(getPrice()-getPrice()* 0.2);
        return true;
    }
    else{
        return false;
    }
    }


    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", dateOfMembership='" + dateOfMembership + '\'' +
                ", totalBooksCheckedOut=" + totalBooksCheckedOut +
                '}';
    }
}
