public class Table implements Element{

    private String title;

    public Table(){

    }

    public Table(String title){
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void print(){
        System.out.println("Table title: " + this.title);

    }
}
