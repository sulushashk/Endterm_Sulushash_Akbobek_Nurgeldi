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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "barcode='" + barcode + '\'' +
                ", borrowed='" + borrowed + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", price='" + price + '\'' +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
