import com.book.*;
import com.utils.BookStatistics;
import com.utils.ContentVisitorPrinter;

public class Main {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.addElement(p1);

        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.addElement(p2);

        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.addElement(p3);

        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.addElement(p4);
        cap1.addElement(new ImageProxy("Image 1"));
        cap1.addElement(new Image("Image 2"));
        cap1.addElement(new Paragraph("Paragraph 5"));
        cap1.addElement(new Table("Table 1"));

        ContentVisitorPrinter printer = new ContentVisitorPrinter();
        BookStatistics bookStatistics = new BookStatistics();

        cap1.accept(printer);
        cap1.accept(bookStatistics);
        bookStatistics.printCounter();
    }
}
