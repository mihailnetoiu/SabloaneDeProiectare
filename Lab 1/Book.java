import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<String> paragraphs;
    private List<String> images;
    private List<String> tables;

    public Book(String title) {
        this.paragraphs = new ArrayList<>();
        this.images = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.title = title;
    }

    public void createNewParagraph(String paragraph) {
        this.paragraphs.add(paragraph);
    }

    public void createNewImage(String image) {
        this.images.add(image);
    }

    public void createNewTable(String table) {
        this.tables.add(table);
    }

    public void print() {
        System.out.println("Book{" +
                "title='" + title + '\'' +
                ", paragraphs=" + paragraphs +
                ", images=" + images +
                ", tables=" + tables +
                '}');
    }
}
