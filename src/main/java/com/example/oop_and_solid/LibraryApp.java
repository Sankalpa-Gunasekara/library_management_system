package com.example.oop_and_solid;

public class LibraryApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Library Management System ");
        Library lib1 = new Library();

        Member member_01 = new Member("Maddy");
        Member member_02 = new Member("Sankalpa");

        Book book1 = new Book("Tom", "test", "null");
        Book book2 = new Book("Sam", "test_2", "null");

        System.out.println(member_01.getMemberId()+" = "+member_01.getMemberName());
        System.out.println(member_02.getMemberId()+" = "+member_02.getMemberName());

        lib1.addBook(book1);
        lib1.addBook(book2);

        lib1.printBookList();
        lib1.removeBook("test");
        lib1.printBookList();

    }

}
