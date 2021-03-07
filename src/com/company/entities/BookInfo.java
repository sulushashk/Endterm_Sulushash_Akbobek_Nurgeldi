package com.company.entities;

public class BookInfo extends Books{
    private String barcode;
    private int price;
    private String dateOfPurchase;
    private int publicationYear;

    public BookInfo(String barcode, int price, String dateOfPurchase, int publicationYear) {
        this.barcode = barcode;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
        this.publicationYear=publicationYear;
    }

    public BookInfo(int id, String dateOfMembership, int totalBooksCheckedOut) {
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
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
