package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Librarian;
import com.company.entities.Library;
import com.company.repositories.interfaces.ILibraryRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryRepo implements ILibraryRepo {
    private final IDB db;
    public LibraryRepo(IDB db){
        this.db= db;
    }


    @Override
    public Library getLibraryByLocation(String location) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT name, location, address FROM Library WHERE location=?";
            PreparedStatement st = con.prepareStatement(sql);

           st.setString(1, location);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Library library= new Library(rs.getString("name"),
                        rs.getString("location"),
                        rs.getString("address"));
                return library;
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
    public Library getAddressByName(String address) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT address FROM Library WHERE address=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, address);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Library library= new Library(rs.getString("name"),
                        rs.getString("location"),
                        rs.getString("address"));
                return library;
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
}
