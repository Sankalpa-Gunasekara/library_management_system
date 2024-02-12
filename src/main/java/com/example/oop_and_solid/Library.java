package com.example.oop_and_solid;

import java.util.List;
import java.util.ArrayList;

public class Library {

    private List<Book> books;
    private List<Member> members;

    public Library() {

        this.books = new ArrayList<>();

    }

    public void addBook(Book book) { // add book method

        books.add(book);

    }

    public void removeBook(String title) { // remove book method

        Book bookToRemove = new Book();

        for (Book book : books) {

            if (book.getTitle() == title) {
                bookToRemove = book;
                System.out.println();
                break;
            } else {

                System.out.println("Not available");
            }
        }

        books.remove(bookToRemove);
    }

    public void printBookList() { // print book list

        if (books.isEmpty()) {

            System.out.println("No books in library");
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

    }

    public void addMember(Member member) {

        this.members.add(member);

    }

}
