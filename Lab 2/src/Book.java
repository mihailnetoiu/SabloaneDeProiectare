import java.lang.reflect.Array;
import java.util.ArrayList;

public class Book {

    private String title;
    private TableOfContents tableOfContents;
    private ArrayList<Author> authors = new ArrayList<Author>();
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();

    public Book() {

    }

    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public ArrayList<Author> getAuthors(){

        return this.authors;
    }

    public void addAuthor(Author author){
        this.authors.add(author) ;

    }

    public int createChapter(String chapter){

        this.chapters.add(new Chapter(chapter));
        return this.chapters.size() - 1;
    }

    public Chapter getChapter(int index){
        return this.chapters.get(index);
    }

    public void setTableOfContents(TableOfContents tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public TableOfContents getTableOfContents(){

        return this.tableOfContents;
    }
}
