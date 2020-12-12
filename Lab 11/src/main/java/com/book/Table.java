package com.book;

import com.interfaces.Element;
import com.interfaces.Visitor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(force = true)
@javax.persistence.Table(name = "tabel")
public class Table extends Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "table_title")
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
