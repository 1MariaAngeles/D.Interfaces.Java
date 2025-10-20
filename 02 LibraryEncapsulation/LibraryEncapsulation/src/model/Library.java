package model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList <Book> books= new ArrayList<>();

    public Library(){
        books.add(new Book("El Quijote", "Miguel de Cervantes", 3));
        books.add(new Book("Cien años de soledad", "Gabriel García Márquez", 5));
        books.add(new Book("1984", "George Orwell", 4));
    }
    
    public void showAllBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    //I don't know if you want the numbers of avalaibleCopies or the books saved
    public int countBooks(){
        return books.size();
    }
}