import com.book.*;
import com.utils.*;

public class Main {
    public static void main(String[] args) throws Exception {
        OpenCommand openCommand = new OpenCommand("MyBook");
        openCommand.execute();

        Section section = new Section("Capitolul 1");
        section.addElement(new Paragraph("Paragraph 1"));
        section.addElement(new Paragraph("Paragraph 2"));
        section.addElement(new ImageProxy("Image 1"));
        section.addElement(new Image("Image 2"));
        section.addElement(new Paragraph("Paragraph 3"));
        section.addElement(new Table("Table 1"));

        SaveCommand saveCommand = new SaveCommand(section);
        saveCommand.execute();

        StatisticsCommand statisticsCommand = new StatisticsCommand();
        statisticsCommand.execute();
    }
}
