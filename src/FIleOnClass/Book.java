package FIleOnClass;

class Book {
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static int totalNoOfBooks;

    static {
        totalNoOfBooks = 0;
    }
    {  //object init
        totalNoOfBooks++;
    }

    Book(String isbn,String title,String author){
        this.isbn = isbn;
        this.title = title;
        this.author= author;
    }
    Book(String isbn){
        this(isbn,"Unknown"," Unknown");
    }

    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    void borrowBook(){
       if (isBorrowed){
           System.out.println("Book is alredy borrowed");
       }else{
           this.isBorrowed = true;
           System.out.println("Enjoy the book "+this.title);
       }
    }

    void returnBook(){
        if (isBorrowed){
            this.isBorrowed = false;
            System.out.println("HOpe you enjoyed, Please leave a review");
        }else{
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1","Desing","author");
        Book mybook = new Book("1");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        mybook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();

    }
}
