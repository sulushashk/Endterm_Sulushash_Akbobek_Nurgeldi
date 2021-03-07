package com.company.repositories.interfaces;

import com.company.entities.BookInfo;

public interface IBookInfoRepo{
    boolean addBookInfo(BookInfo bookInfo);
    BookInfo getBookInfoByPrice(int price1, int price2);
    boolean removeByBarcode(String barcode);
    boolean getSaleByDate();
}
