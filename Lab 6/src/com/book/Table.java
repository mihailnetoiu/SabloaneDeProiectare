package com.book;

public class Table implements Element {
    private String title;

    public Table(String name) {
        this.title = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Table title: " + this.title);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
