package FIleOnClass;

class BOok2 {
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static int totalBooks;

    static {
        totalBooks = 0;
    }{
        totalBooks++;
    }

    BOok2(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    BOok2(String isbn){
        this(isbn,"Unknown","Unkown");
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy book " +this.title);
        }
    }
    void returnBook(){
        if (isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed book");
        }else{
            System.out.println("ALredy in library");
        }
    }

    public static void main(String[] args) {
        BOok2 design = new BOok2("1","dvsd","vsdvwf");
        BOok2 practical = new BOok2("2","vsvs","hkbff");

        System.out.println(BOok2.getTotalBooks());
        design.borrowBook();;
        practical.returnBook();
        design.returnBook();
        design.returnBook();

    }
}
