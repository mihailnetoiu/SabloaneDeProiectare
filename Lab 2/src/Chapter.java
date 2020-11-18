import java.util.ArrayList;

public class Chapter {

    private String chapterName;
    private ArrayList<SubChapter> subChapters = new ArrayList<SubChapter>();

    public Chapter(String chapter) {
        this.chapterName = chapter;

    }

    public void setChapterName(String chapterName){
        this.chapterName = chapterName;

    }

    public String getChapterName(){
        return this.chapterName;

    }

    public SubChapter getSubChapter(int subChapterIndex){

        return this.subChapters.get(subChapterIndex);
    }

    public int createSubChapter(String title){

        this.subChapters.add(new SubChapter(title));
        return this.subChapters.size() - 1;
    }

}
