package book;

import utils.Dimension;

public class Main {

    public static void main(String []args){

        long startTime = System.currentTimeMillis();
        ImageProxy img1 = new ImageProxy("Img1", new Dimension(25,25));
        ImageProxy img2 = new ImageProxy("Img2", new Dimension(25,16));
        ImageProxy img3 = new ImageProxy("Img3", new Dimension(15,13));
        Section section1 = new Section("Section1");
        section1.addContent(img1);
        Section section2 = new Section("Section2");
        section2.addContent(img2);
        section2.addContent(img3);
        Book book1 = new Book("Book1");
        book1.addContent(section1);
        book1.addContent(section2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        section1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        section1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");
    }
}
