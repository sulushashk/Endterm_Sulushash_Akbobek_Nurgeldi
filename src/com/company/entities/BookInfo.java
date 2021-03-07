package com.company.entities;

public class BookInfo extends Books{
    private String barcode;
    private String borrowed;
    private String dueDate;
    private String price;
    private String dateOfPurchase;
    private String publicationDate;

    public BookInfo(String barcode, String borrowed, String dueDate, String price, String dateOfPurchase, String publicationDate) {
        this.barcode = barcode;
        this.borrowed = borrowed;
        this.dueDate = dueDate;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
        this.publicationDate = publicationDate;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(String borrowed) {
        this.borrowed = borrowed;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    public boolean getSaleByDate(){
        boolean a=true;
        if((2021 - publicationYear > 10) == a){
            System.out.println(price - price* 0.2);
        }
        else{
            System.out.println(price);
        }
        return false;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "barcode='" + barcode + '\'' +
                ", price=" + price +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
