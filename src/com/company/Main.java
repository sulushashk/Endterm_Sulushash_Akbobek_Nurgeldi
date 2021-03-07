package com.company;

import com.company.controllers.*;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.*;
import com.company.repositories.interfaces.*;

public class Main {

    public static void main(String[] args) {
        IDB db = new PostgresDB();
        IBookInfoRepo repo1 = new BookInfoRepo(db) {
            IBookRepo repo2 = new BookRepositories(db);
            ILibraryRepo repo3 = new LibraryRepo(db);
            ILibrarianRepo repo4 = new LibrarianRepo(db);
            IReaderRepo repo5 = new ReaderRepo(db);
            BookInfoContr contr1 = new BookInfoContr(repo1);
            BooksContr contr2 = new BooksContr(repo2);
            LibraryContr contr3 = new LibraryContr(repo3);
            LibrarianContr contr4 = new LibrarianContr(repo4);
            ReaderContr contr5 = new ReaderContr(repo5);
            MyApplication app = new MyApplication(contr1, contr2, contr3, contr4, contr5);
            app.start();
        }
    }
}
