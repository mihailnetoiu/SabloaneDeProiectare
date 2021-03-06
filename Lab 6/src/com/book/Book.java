package com.book;

import java.util.ArrayList;
import java.util.List;

public class Book implements Element {

    private String title;
    private TableOfContents tableOfContents;
    private final ArrayList<Author> authors;
    private final ArrayList<Element> elements;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);

    }

    public ArrayList<Author> getAuthors() {
        return this.authors;
    }

    public void addContent(Element element) {
        this.elements.add(element);
    }

    public ArrayList<Element> getContents() {
        return this.elements;
    }

    public TableOfContents getTableOfContent() {
        return tableOfContents;
    }

    public void setTableOfContents(TableOfContents tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public void print() {
        System.out.println("Book name: " + this.title);
        System.out.println("Authors names:");

        for (Author author : authors) {
            author.print();
        }

        System.out.println("Book's contents:");

        for (Element element : elements) {
            element.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
