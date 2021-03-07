package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.BookInfo;
import com.company.repositories.interfaces.IBookInfoRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookInfoRepo implements IBookInfoRepo {
    private final IDB db;
    public BookInfoRepo(IDB db){
        this.db= db;
    }

    @Override
    public boolean addBookInfo(BookInfo bookinfo) {
        Connection con =null;
        try{
            con = db.getConnection();
            String sql="INSERT INTO BookInfo(barcode, price, dateOfPurchase,publicationYear) Values(?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, bookinfo.getBarcode());
            st.setInt(2, bookinfo.getPrice());
            st.setString(3, bookinfo.getDateOfPurchase());
            st.setInt(4, bookinfo.getPublicationYear());

            int rowsInserted = st.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }


    @Override
    public BookInfo getBookInfoByPrice(int price1, int price2) {
        Connection con = null;
        try {
            con = db.getConnection();
            var sql = "SELECT barcode, price, dateOfPurchase,publicationYear FROM BookInfo Where price BETWEEN '" + price1+ "'AND'" + price2 + "'" ;
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                BookInfo bookInfo = new BookInfo(rs.getString("barcode"),
                        rs.getInt("price"),
                        rs.getString("dateOfPurchase"),
                        rs.getInt("publicationYear"));
                return bookInfo;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public boolean removeByBarcode(String barcode) {
        Connection con = null;
        try {
            con = db.getConnection();
            var sql = "SELECT barcode, price, dateOfPurchase,publicationYear FROM BookInfo WHERE barcode=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, barcode);
            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        return false;
    }

    @Override
    public boolean getSaleByDate() {
        return false;
    }
}
