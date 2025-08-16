import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void displayAllBooks(boolean showPublisher){
        if(showPublisher){
            for(Book book : books){
                book.displayInfo(showPublisher);
            }
        }
        else {
            for(Book book : books){
                book.displayInfo();
            }
        }
    }
    public void searchByAuthor(String author){
        for(Book book:books){
            author=author.toLowerCase();
            if(author==book.getAuthor().toLowerCase()){
                book.displayInfo(true);
            }
        }
    }
    public void removeBookById(int bookId){
        for(Book book:books){
            if(book.getBookId()==bookId){
                books.remove(book);
            }
            else System.out.println("Ko tim thay bookid");
        }
    }
}