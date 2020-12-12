package com.utils;

import com.interfaces.Command;
import com.book.Book;

public class StatisticsCommand implements Command {
    @Override
    public void execute() {
        Book book = DocumentManager.getDocumentManager().getBook();
        BookStatistics bookStatistics = new BookStatistics();
        ContentVisitorPrinter printContentVisitor = new ContentVisitorPrinter();
        book.accept(bookStatistics);
        bookStatistics.printCounter();
        book.accept(printContentVisitor);
    }
}
