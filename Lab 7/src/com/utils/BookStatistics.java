package com.utils;

import com.book.*;

public class BookStatistics implements Visitor {
    private int countParagraph;
    private int countImage;
    private int countTables;

    @Override
    public void visit(Section section) {
        for (Element e : section.getElements()) {
            castVisitor(e);
        }
    }

    @Override
    public void visit(Paragraph paragraph) {
        countParagraph++;
    }

    @Override
    public void visit(ImageProxy proxy) {
        countImage++;
    }

    @Override
    public void visit(Image image) {
        countImage++;
    }

    @Override
    public void visit(Book book) {
        for (Element e : book.getContents()) {
            castVisitor(e);
        }
    }

    @Override
    public void visit(Table table) {
        countTables++;
    }

    @Override
    public void visit(TableOfContents content) {
        countTables++;
    }

    public void printCounter() {
        System.out.println("Num of tables: " + countTables);
        System.out.println("Num of paragraphs: " + countParagraph);
        System.out.println("Num of images: " + countImage);
    }

    private void castVisitor(Element e) {
        if (e instanceof Paragraph) {
            visit((Paragraph) e);
        } else if (e instanceof ImageProxy) {
            visit((ImageProxy) e);
        } else if (e instanceof Image) {
            visit((Image) e);
        } else if (e instanceof TableOfContents) {
            visit((TableOfContents) e);
        } else if (e instanceof Section) {
            visit((Section) e);
        } else if (e instanceof Table) {
            visit((Table) e);
        }
    }
}
