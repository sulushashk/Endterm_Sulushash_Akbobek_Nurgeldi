package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Librarian;
import com.company.repositories.interfaces.ILibrarianRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibrarianRepo implements ILibrarianRepo {
    private final IDB db;

    public LibrarianRepo(IDB db) {
        this.db=db;
    }

    @Override
    public Librarian getNameById(int id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id, name, salary FROM Librarian WHERE id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Librarian librarian = new Librarian(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("salary"));
                return librarian;
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
    public boolean addLibrarian(Librarian librarian) {
        Connection con =null;
        try{
            con = db.getConnection();
            String sql="INSERT INTO Librarian(id, name, salary) VALUES(?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, librarian.getId());
            st.setString(2, librarian.getName());
            st.setInt(3, librarian.getSalary());

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
}
