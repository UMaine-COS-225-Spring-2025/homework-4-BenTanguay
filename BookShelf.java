import java.util.ArrayList;

public class BookShelf {
    public char firstLetter;
    public ArrayList<Book> shelf = new ArrayList<Book>(8);
    
    public BookShelf(){
    }

    public void setFirstLetter(char firstLetter){
        this.firstLetter = firstLetter;
    }

    public char getFirstLetter(){
        return firstLetter;
    }

    public void setShelf(ArrayList<Book> shelf){
        this.shelf = shelf;
    }

    public ArrayList<Book> getShelf(){
        return shelf;
    }

    public void addBook(Book book){
        if(book.title.charAt(0) == firstLetter){
            shelf.add(book);
        }
    }

    public void removeBook(Book book){
        shelf.remove(book);
    }

    @Override
    public String toString(){
        String books = "";
        if(shelf.size() == 0){
            return "empty";
        } else {
            for(int i=0;i<shelf.size();i++){
                books += shelf.get(i).title + " ";
            }
            return books;
        }
    }

}
