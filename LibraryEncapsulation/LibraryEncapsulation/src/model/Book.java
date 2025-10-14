package model;

public class Book {
    private String title;
    private String author;
    private int availableCopies;


    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        //I put this for the condition on the setter.
        if(availableCopies <0){
            System.out.println("You only allows positive values");
            availableCopies = 0;
        }else{
            this.availableCopies = availableCopies;
        }
    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public int getAvailableCopies() {
        return availableCopies;
    }


    public void setAvailableCopies(int availableCopies) {
        if(availableCopies <0){
            System.out.println("You only allows positive values");
            availableCopies = 0;
        }else{
            this.availableCopies = availableCopies;
        }
        
    }

    public int borrowCopy(int availableCopies){
        if(availableCopies >0){
            availableCopies --;
        }else{
            this.availableCopies = availableCopies;
            System.out.println("You can't decreases");
        }
        return availableCopies;
    }

    public int returnCopy(int availableCopies){
        return availableCopies ++;
    } 
    
}
