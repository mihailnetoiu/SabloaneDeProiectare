package com.book;

import com.interfaces.Element;
import com.interfaces.Visitor;
import com.utils.AlignStrategy;
import com.utils.Context;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(force = true)
public class Paragraph extends Element {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    @Transient
    private AlignStrategy textAlignemnt;

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
