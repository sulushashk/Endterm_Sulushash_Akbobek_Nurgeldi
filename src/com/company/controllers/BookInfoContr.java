package com.company.controllers;

import com.company.entities.BookInfo;
import com.company.repositories.interfaces.IBookInfoRepo;

public class BookInfoContr {
    private final IBookInfoRepo repo1;
    public BookInfoContr(IBookInfoRepo repo1){
        this.repo1 = repo1;
     }
        public String addBookInfo(String barcode, int price, String dateOfPurchase, int publicationYear){
            BookInfo bookInfo = new BookInfo(barcode,price, dateOfPurchase, publicationYear);
            boolean created= repo1.addBookInfo(bookInfo);

            return  (created ?  "Information about book is successfully added!":" addition was failed!");
    }
    public String getBookInfoByPrice(int price1,int price2){
            BookInfo bookInfo = repo1.getBookInfoByPrice(price1, price2);
            return (bookInfo == null ? "Information about book was not found" : bookInfo.toString());
        }
    public String removeByBarcode(String barcode) {
        boolean removed = repo1.removeByBarcode(barcode);

        return ( removed ? "Information about book was removed" : "It has trouble");
    }

    public String getSaleByDate(int year1, int year2){
        BookInfo gotten = repo1.getSaleByDate(year1,year2);
        return ( gotten==null ? "Sale was appointed" : "Sale is not valid");
    }
}
