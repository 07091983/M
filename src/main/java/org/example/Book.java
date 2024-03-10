package org.example;
public class Book {
    MainComponent contents;

    public Book(MainComponent contents) {
        this.contents = contents;
    }
    public void printContents() {
        contents.print();
    }
}
