package com.book;

public interface Visitor {
    void visit(TableOfContents content);

    void visit(Book book);

    void visit(Section section);

    void visit(Paragraph paragraph);

    void visit(Image image);

    void visit(ImageProxy proxy);

    void visit(Table table);
}
