package com.example.oop_and_solid;

public class Book {

    private String author;
    private String title;
    private String genre;
    private boolean availabilty;

    public Book(){
        
    }


    public Book(String author, String title, String genre) {

        this.author = author;
        this.title = title;
        this.genre = genre;
        this.availabilty = true;

    }

    public boolean isAvailable() {
        return availabilty;
    }

    public String getTitle() {

        return this.title;
    }

    public void borrow() {

        if (availabilty == false) {

            System.out.println("Already borrowed or not available");
        } else {
            this.availabilty = false;
            System.out.println("you borrowed " + this.title + " successfully");
        }
    }

    public void returnBook() {

        if (availabilty == true) {

            System.out.println("Already available");
        } else {
            this.availabilty = true;
            System.out.println("you returned " + this.title + " successfully");

        }
    }
}
