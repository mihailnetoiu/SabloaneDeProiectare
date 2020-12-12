package com.utils;

import com.book.Book;
import com.book.Section;
import com.interfaces.Command;

public class SaveCommand implements Command {
    private Section section;

    public SaveCommand(Section section) {
        this.section = section;
    }

    @Override
    public void execute() {
        Book book = DocumentManager.getDocumentManager().getBook();
        book.addContent(section);
    }
}
