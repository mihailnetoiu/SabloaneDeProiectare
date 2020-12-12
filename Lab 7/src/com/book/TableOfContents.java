package com.book;

public class TableOfContents implements Element {

    public void print() {
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
