package com.book;

import com.utils.AlignStrategy;
import com.utils.Context;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy textAlignemnt;

    public Paragraph() {}

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy textAlignemnt) {
        this.textAlignemnt = textAlignemnt;
    }

    public AlignStrategy getTextAlignemnt() {
        return textAlignemnt;
    }

    @Override
    public void print() {
        if (this.textAlignemnt != null) {
            this.textAlignemnt.render(this.text, new Context());
            return;
        }
        System.out.println("Paragraph text: " + this.text);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
