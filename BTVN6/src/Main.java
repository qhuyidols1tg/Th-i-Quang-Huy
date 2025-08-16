import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Library library = new Library();

        Publisher publisher1 = new Publisher("HarperCollins", "USA");
        Publisher publisher2 = new Publisher("Penguin Books", "UK");


        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, publisher1);
        Book book2 = new Book("1984", "George Orwell", 8.99, publisher2);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 12.99);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Scanner sc = new Scanner(System.in);
        System.out.println("----Bang lua chon chức năng------");
        System.out.println("1. Add Book");
        System.out.println("2. In tất cả sách ra màn hình");
        System.out.println("3. Tìm kiếm sách theo tác giả");
        System.out.println("4. xóa sách theo id");
        System.out.println("5. Thoát chương trình");
        System.out.println("Nhap su lua chon cua ban");
        int choice=sc.nextInt();
        switch(choice){
            case 1:{
                System.out.println("Nhap so lượng sach can them vao thu vien ");
                int n = sc.nextInt();
                sc.nextLine();
                for(int i = 0; i < n; i++){
                    System.out.println("Nhap  tiltel sach ");
                    String titel = sc.nextLine();
                    System.out.println("Nhap author sacsh");
                    String author = sc.nextLine();
                    System.out.println("Nhap price sach");
                    double price = sc.nextDouble();
                    System.out.println("Nhap 1 neu co nha xuat ban 0 neu ko ");
                    int check=sc.nextInt();
                    sc.nextLine();
                    if(check==1){
                        System.out.println("Nhap ten nha xuat ban ");
                        String name = sc.nextLine();
                        System.out.println("Nhap dia tri xuat ban");
                        String address = sc.nextLine();
                        Publisher publisher = new Publisher(name,address);
                        Book book = new Book(titel,author,price,publisher);
                        library.addBook(book);
                    }
                    else{
                        Book book = new Book(titel,author,price);
                        library.addBook(book);

                    }
                    break;
                }
            }
            case 2:{
                System.out.println("Chon in ra nha xuat ban hoac khong ");
                System.out.println("Nhap -- 1 ==(NEU CO)---2===(KHONG)");
                int check = sc.nextInt();
                boolean showBublisher;
                sc.nextLine();
                if(check==1){
                    showBublisher = true;
                }
                else {
                    showBublisher = false;
                }
                library.displayAllBooks(showBublisher);
                break;

            }
            case 3:{
                System.out.println("Nhap ten tac gia can tim ");
                String name=sc.nextLine();
                library.searchByAuthor(name);
                break;
            }
            case 4:{
                System.out.println("Nhap mã sách cần xóa");
                int i=sc.nextInt();
                library.removeBookById(i);
                break;
            }
            case 5:{
                break;
            }
        }

    }




}