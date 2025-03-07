public class Book{
    public String title;
    public String genre;

    public void Book(String title, String genre){
        this.title = title;
        this.genre = genre;
    }

    public String toString(){
        return title;
    }
}