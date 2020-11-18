public class Main {

    public static void main(String []args){

        Book book = new Book("Book");
        Author author = new Author("Author");
        book.addAuthor(author);
        Section section1 = new Section("Section 1");
        Section section2 = new Section("Section 2");
        Section section3 = new Section("Section 3");
        Section section4 = new Section("Section 4");
        book.addContent(new Paragraph("Paragraph 1"));
        book.addContent(section1);

        section1.addContent(new Paragraph("Paragraph 2"));
        section1.addContent(section2);
        section2.addContent(new Paragraph("Paragraph 2"));
        section2.addContent(section3);
        section3.addContent(new Paragraph("Paragraph 2"));
        section3.addContent(section4);
        section4.addContent(new Image("Image 1"));
        book.print();
    }
}
