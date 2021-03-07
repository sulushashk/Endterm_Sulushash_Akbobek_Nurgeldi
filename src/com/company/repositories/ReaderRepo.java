package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Librarian;
import com.company.entities.Reader;
import com.company.repositories.interfaces.IReaderRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReaderRepo implements IReaderRepo {
    private final IDB db;
    public ReaderRepo(IDB db) {
        this.db= db;
    }

    @Override
    public boolean getBonus() {
        return getBonus();
    }

    @Override
    public Reader getDateOfMembershipById(int id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT dateOfMembership Reader WHERE id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Reader reader = new Reader(rs.getInt("id"),
                        rs.getString("dateOfMembership"),
                        rs.getInt("totalBooksCheckedOut"));
                return reader;
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
