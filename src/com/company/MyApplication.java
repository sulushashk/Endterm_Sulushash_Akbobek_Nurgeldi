package com.company;

import com.company.controllers.*;
import com.company.entities.BookInfo;

import java.util.Scanner;

public class MyApplication {
    private final BookInfoContr contr1;
    private final BooksContr contr2 ;
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

    public void start(){
        while (true){
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option: (1-8)");
            System.out.println("1. Add information about a book");
            System.out.println("2. Get information about a book by price");
            System.out.println("3. Remove a book by barcode");
            System.out.println("4. Get sale to book by date");
            System.out.println("5. Add employee");
            System.out.println("6. Remove employee by level");
            System.out.println("7. Get all Managers");
            System.out.println("8. Get Manager by name");
            System.out.println("0. Exit");
            System.out.println();
            try{
                System.out.println("Enter the option: (1-8)");
                int option = scanner.nextInt();
                if(option==1){

                }
                else if(option==2){

                }
                else if(option==3){

                }
                else if(option==4){

                }
                else if(option==5){

                }
                else if(option==6){

                }
                else if(option==7){
                    getAllManagersMenu();
                }
                else if(option==8){
                    getManagerByNameMenu();
                }
                else {
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Input must be integer");
                scanner.nextLine();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("***************************************");
        }
    }
}
