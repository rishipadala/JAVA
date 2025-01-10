package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 Create a library management system which is capable of issuing books to the students.
 Book should have info like:
 1. Book name
 2. Book Author
 3. Issued to
 4. Issued on
 User should be able to add books, return issued books, issue books
 Assume that all the users are registered with their names in the central database

 /**
 * In this program , I made 3 methods in book class : issuedbook,returnbook,displaybookinfo
 * basically the book class is all about gathering book's Info...
 */


class Book{
    public String name,Author,issuedTo,issuedOn;

    public Book(String name,String author) {
        this.Author = author;
        this.name = name;
        this.issuedTo=null;
        this.issuedOn = null;
    }

    @Override
    public String toString() {
        return " name '" + name + '\'' + ", Author name '" + Author + '\'';
    }


    //Method To issue a book
    public void issueBook(String studentName){
        if (issuedTo==null){
            this.issuedTo = studentName;
            System.out.println("Book Issued Successfully by "+ studentName);
            this.issuedOn= new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        }
        else {
            System.out.println("Book is already Issued to : "+ issuedTo + "on"+ issuedOn);
        }
    }
    // Method to return the book
    public void returnBook(){
        if (issuedTo!=null){
            System.out.println("Book is returned by "+issuedTo);
            this.issuedTo=null;
            this.issuedOn=null;
        }
        else {
            System.out.println("Book is not issued to anyone!");
        }
    }
    //Method to display the books:
    public void displayBookinfo(){
        System.out.println("Book : "+name);
        System.out.println("Author : "+Author);
        if(issuedTo!=null){
            System.out.println("Issued To : "+ issuedTo);
            System.out.println("Issued On : "+ issuedOn);
        }
        else {
            System.out.println("Status: Available");
        }
        System.out.println();
    }
}

 class MyLibrary{
    public ArrayList<Book>Books;
     //constructor for MyLibrary:
     public MyLibrary() {
         this.Books = new ArrayList<>();
     }
     //Method to add a book in Library (Here , "Books" word represent arraylist);
     public void addbook(String bookname, String bookAuthor){
         printHeader("Adding a Book in MyLibrary");
        Book newBook = new Book(bookname, bookAuthor);
        Books.add(newBook);
        System.out.println("The Book"+ newBook +" Has been added in the library!");
         System.out.println();
    }

    //Method to issue a book from the Library by giving parameters : bookName & StudentName;
    public void issuebook(String bookName,String StudentName){
        printHeader("Issuing a Book");
        for (Book book : Books ){
            if (book.name.equalsIgnoreCase(bookName)){
                book.issueBook(StudentName);
                return; //ends the method once the book is found to be issued form Books arraylist
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void returnbook(String bookName){
        printHeader("Returning a Book");
        for (Book book : Books ){
            if (book.name.equalsIgnoreCase(bookName)){
                book.returnBook();
                return; //ends the method once the book is found to be return form Books arraylist
            }
    }
        System.out.println("Book not found in the library.");
}

 public void displayAvailablebooks(){
     printHeader("All Books in Library");
        if(Books.isEmpty()){
            System.out.println("No Books in The Library");
        }
        else {
            for (Book book: Books){
                book.displayBookinfo();
            }
        }
    }

     private void printHeader(String section) { //Yeh Output sahi dikhne ke liye ,har ek method use karne se pehle woh method ko as a header print karta hai;
         System.out.println("\n--- " + section + " ---");
     }

 }

public class LibraryManagementSystem {
    public static void main(String[] args) {
        MyLibrary BOOK = new MyLibrary();

        BOOK.addbook("Welcome to JAVA","CodewithHarry");
        BOOK.addbook("Say Cheese and Die!","R.L.Stine");
        BOOK.addbook("The Psychology of Money","Morgan Housel");
        BOOK.addbook("Vagabond","Takehiko Inoue");
        BOOK.addbook("Harry Potter","J.K.Rowling");


        BOOK.displayAvailablebooks();

        //issuing a book;
        BOOK.issuebook("Welcome to JAVA","HARRY");
       // BOOK.displayAvailablebooks();

        //returning a book
        BOOK.returnbook("Welcome to JAVA");

        //BOOK.displayAvailablebooks();

        BOOK.issuebook("Vagabond","RISHI");

        BOOK.displayAvailablebooks();


    }
}

