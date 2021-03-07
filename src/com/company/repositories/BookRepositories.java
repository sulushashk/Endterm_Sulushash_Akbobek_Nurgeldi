package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Books;
import com.company.repositories.interfaces.IBookRepo;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class BookRepositories implements IBookRepo {
    private final IDB db;
    public BookRepositories(IDB db){
        this.db= db;
    }

    @Override
    public List<Books> getAllBooksList() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = ("SELECT ISBN, title, genre, publisher, lang, numberOfPage, author FROM Books");
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List <Books> booksList = new LinkedList<>();
            while (rs.next()){
                Books books = new Books(rs.getInt("ISBN"),
                        rs.getString("title"),
                        rs.getString("genre"),
                        rs.getString("publisher"),
                        rs.getString("lang"),
                        rs.getInt("numberOfPage"),
                        rs.getString("author"));
                booksList.add(books);
            }
            return booksList;
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
        return null;
    }

    @Override
    public Books getBookByAuthor(String author) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT ISBN, title, genre, publisher, lang, numberOfPage, author FROM Books WHERE author=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, author);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Books books = new Books(rs.getInt("ISBN"),
                        rs.getString("title"),
                        rs.getString("genre"),
                        rs.getString("publisher"),
                        rs.getString("lang"),
                        rs.getInt("numberOfPage"),
                        rs.getString("author"));
                return books;
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
    public Books getBookByGenre(String genre) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT title FROM Books WHERE genre=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, genre);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Books books = new Books(rs.getInt("ISBN"),
                        rs.getString("title"),
                        rs.getString("genre"),
                        rs.getString("publisher"),
                        rs.getString("lang"),
                        rs.getInt("numberOfPage"),
                        rs.getString("author"));
                return books;
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
    public boolean removeBookByPublisher(String publisher) {
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement st = con.prepareStatement("DELETE FROM Books WHERE publisher = ?");
            st.setString(1, publisher);
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
}
