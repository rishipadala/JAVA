package com.company;
// You have to implement a library using Java Class "Library"
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books

class Library{
    String [] books;
    int no_of_books;
    Library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book + " has been Added Successfully!");
    }
    void showAvailableBooks(){
        System.out.println("Available Books are: ");
        for(String book:this.books){
           if (book == null){
               continue;
           }
            System.out.println("* "+book);
        }
    }

    void issueBook(String book){
        for(int i = 0; i<this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println("The Book "+ book +" Has Been Issued");
                this.books[i]=null;
                return;
            }
            System.out.println("The Book does not exist in Library");
        }
    }

    void returnBook(String book){
        addBook(book);
        System.out.println("The Book " + book + " Has Been Returned.");
    }

}

public class OnlineLibrary_EX_04 {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Ikigai");
        centralLibrary.addBook("JAVA");
        centralLibrary.addBook("Psychology of Money");
        centralLibrary.addBook("Say Cheese and Die!");

        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("JAVA");
        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("JAVA");
        centralLibrary.showAvailableBooks();

    }
}
