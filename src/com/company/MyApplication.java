package com.company;

import com.company.controllers.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final BookInfoContr contr1;
    private final BooksContr contr2;
    private final LibraryContr contr3;
    private final LibrarianContr contr4;
    private final ReaderContr contr5;
    private final Scanner scanner;

    public MyApplication(BookInfoContr contr1, BooksContr contr2, LibraryContr contr3, LibrarianContr contr4, ReaderContr contr5) {
        this.contr1 = contr1;
        this.contr2 = contr2;
        this.contr3 = contr3;
        this.contr4 = contr4;
        this.contr5 = contr5;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option: (1-5)");
            System.out.println("1. BookInfo's methods");
            System.out.println("2. Book's methods");
            System.out.println("3. Librarian's methods");
            System.out.println("4. Library's methods ");
            System.out.println("5. Reader's methods");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.println("Enter the option: (1-5)");
                int option = scanner.nextInt();
                if (option == 1) {
                    BookInfoMethods();
                } else if (option == 2) {
                    BookMethods();
                } else if (option == 3) {
                    LibrarianMethods();
                } else if (option == 4) {
                    LibraryMethods();
                } else if (option == 5) {
                    ReaderMethods();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("***************************************");
        }
    }

    public void BookInfoMethods() {
        while (true) {
            System.out.println();
            System.out.println("BookInfo Methods");
            System.out.println("Select option: (1-4)");
            System.out.println("1. Add information a book");
            System.out.println("2. Get information about a book by price range");
            System.out.println("3. Remove a book by barcode");
            System.out.println("4. Get sale to book by date");
            System.out.println("0. Cancel");
            System.out.println();

            try {
                System.out.println("Enter the option: (1-4)");
                int option = scanner.nextInt();
                if (option == 1) {
                    addBookInfoMenu();
                } else if (option == 2) {
                    getBookInfoByPriceMenu();
                } else if (option == 3) {
                    removeByBarcodeMenu();
                } else if (option == 4) {
                    getSaleByDateMenu();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("***************************************");
        }
    }

    public void BookMethods() {
        while (true) {
            System.out.println();
            System.out.println("Book Methods");
            System.out.println("Select option: (1-3)");
            System.out.println("1. Get all list of books");
            System.out.println("2. Get a book by genre");
            System.out.println("3. Remove book by publisher");
            System.out.println("0. Cancel");
            System.out.println();
        try {
            System.out.println("Enter the option: (1-4)");
            int option = scanner.nextInt();
            if (option == 1) {
                getAllBooksListMenu();
            } else if (option == 2) {
                getBookByAuthorMenu();
            } else if (option == 3) {
                getBookByGenreMenu();
            } else if (option == 3) {
                removeBookByPublisherMenu();
            } else {
                break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be integer");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("***************************************");
    }
}
    public void LibrarianMethods() {
        while (true) {
            System.out.println();
            System.out.println("Librarian Methods");
            System.out.println("Select option: (1-4)");
            System.out.println("1. Get name of librarian by id");
            System.out.println("2. Add librarian");
            System.out.println("0. Cancel");
            System.out.println();

            try {
                System.out.println("Enter the option: (1-4)");
                int option = scanner.nextInt();
                if (option == 1) {
                    getNameByIdMenu();
                } else if (option == 2) {
                    addLibrarianMenu();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("***************************************");
        }
    }

    public void LibraryMethods() {
        while (true) {
            System.out.println();
            System.out.println("Library Methods");
            System.out.println("Select option: (1-2)");
            System.out.println("1. Get library by location");
            System.out.println("2. Get address of library by name");
            System.out.println("0. Cancel");
            System.out.println();
            try {
                System.out.println("Enter the option: (1-2)");
                int option = scanner.nextInt();
                if (option == 1) {
                    getLibraryByLocationMenu();
                } else if (option == 2) {
                    getAddressByNameMenu();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("***************************************");
        }
    }
    public void ReaderMethods(){
        while (true){
            System.out.println();
            System.out.println("Reader Methods");
            System.out.println("Select option: (1-2)");
            System.out.println("1. Get bonus");
            System.out.println("2. Get date of membership by reader's id");
            System.out.println("0. Cancel");
            System.out.println();
        try{
            System.out.println("Enter the option: (1-2)");
            int option = scanner.nextInt();
            if (option == 1) {
                getBonusMenu();
            } else if (option == 2) {
                getDateOfMembershipByIdMenu();
            }  else {
                break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be integer");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("***************************************");
    }
    }

    public void addBookInfoMenu(){
        System.out.println("Please enter barcode:");
        String barcode = scanner.next();
        System.out.println("Please enter price:");
        int price = scanner.nextInt();
        System.out.println("Please enter dateOfPurchase:");
        String dateOfPurchase = scanner.next();
        System.out.println("Please enter publicationYear:");
        int publicationYear = scanner.nextInt();
        String response = contr1.addBookInfo(barcode,price,dateOfPurchase,publicationYear);
        System.out.println(response);
    }
    public void getBookInfoByPriceMenu(){
        System.out.println("Please enter first price:");
        int price1 = scanner.nextInt();
        System.out.println("Please enter second price:");
        int price2= scanner.nextInt();
        String response = contr1.getBookInfoByPrice(price1,price2);
        System.out.println(response);
    }
    public void removeByBarcodeMenu(){
        System.out.println("Please enter barcode of book:");
        String barcode = scanner.next();
        String response =contr1.removeByBarcode(barcode);
        System.out.println(response);
    }
    public void getSaleByDateMenu(){
        System.out.println("Please enter date of publication year:");
        int year1 = scanner.nextInt();
        System.out.println("Please enter date of current year:");
        int year2 = scanner.nextInt();
        String response =contr1.getSaleByDate(year1,year2);
        System.out.println(response);
    }
    public void getAllBooksListMenu(){
        String response = contr2.getAllBooksList();
        System.out.println(response);
    }
    public void getBookByAuthorMenu(){
        System.out.println("Please enter name of author:");
        String author = scanner.next();
        String response = contr2.getBookByAuthor(author);
        System.out.println(response);
    }
    public void getBookByGenreMenu(){
        System.out.println("Please enter genre of book:");
        String genre = scanner.next();
        String response = contr2.getBookByGenre(genre);
        System.out.println(response);
    }
    public void removeBookByPublisherMenu(){
        System.out.println("Please enter publisher of book:");
        String publisher = scanner.next();
        String response = contr2.removeBookByPublisher(publisher);
        System.out.println(response);
    }
    public void getNameByIdMenu(){
        System.out.println("Please enter id of librarian:");
        int id = scanner.nextInt();
        String response = contr4.getNameById(id);
        System.out.println(response);
    }
    public void addLibrarianMenu(){
        System.out.println("Please enter name of librarian:");
        String name = scanner.next();
        System.out.println("Enter salary of librarian:");
        int salary = scanner.nextInt();
        String response= contr4.addLibrarian(name, salary);
        System.out.println(response);
    }
    public void getLibraryByLocationMenu(){
        System.out.println("Please enter location of library:");
        String location = scanner.next();
        String response = contr3.getLibraryByLocation(location);
        System.out.println(response);
    }
    public void getAddressByNameMenu(){
        System.out.println("Please enter name of library:");
        String name = scanner.next();
        String response= contr3.getAddressByName(name);
        System.out.println(response);
    }
    public void getBonusMenu(){
        String response =contr5.getBonus();
        System.out.println(response);
    }
    public void getDateOfMembershipByIdMenu(){
        System.out.println("Please enter id of reader:");
        int id= scanner.nextInt();
        String response =contr5.getDateOfMembershipById(id);
        System.out.println(response);
    }
}
