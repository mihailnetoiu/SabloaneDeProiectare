public class Main {

    public static void main(String []args){

        Book book = new Book("Book");
        Author author = new Author("Author");

        book.addAuthor(author);
        int indexChapterOne = book.createChapter("Chapter 1");
        Chapter chapter = book.getChapter(indexChapterOne);
        int indexSubChapterOne = chapter.createSubChapter("SubChapter 1.1");

        SubChapter subChapter = chapter.getSubChapter(indexSubChapterOne);
        subChapter.createElement(new Paragraph("Paragraph 1"));
        subChapter.createElement(new Paragraph("Paragraph 2"));
        subChapter.createElement(new Paragraph("Paragraph 3"));
        subChapter.createElement(new Image("Image 1"));
        subChapter.createElement(new Paragraph("Paragraph 4"));
        subChapter.createElement(new Table("Table 1"));
        subChapter.createElement(new Paragraph("Paragraph 5"));

        subChapter.print();
    }
}
