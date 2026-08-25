import java.sql.SQLOutput;

class Book {
     static int totalNoofbooks;
     String author;
     String title;
     String isbn;
     boolean isBorrowed;

     static {
         totalNoofbooks = 0;
     }
     {
         totalNoofbooks++;
     }

     Book(String isbn, String title, String author) {
         this.author = author;
         this.title = title;
         this.isbn = isbn;
     }

     Book(String isbn) {
         this(isbn, "unknown", "unknown");

     }
static int getTotalNoofbooks(){

         return totalNoofbooks;
}
void BorrowBook() {
    if (isBorrowed) {
        System.out.println("Book is Already Borrowed");
    } else {
        this.isBorrowed = true;
        System.out.println("enjoy" +this.title);
    }
}

void returntheBook(){
         if (isBorrowed){
             this.isBorrowed = false;
             System.out.println("Hope you enjoyed please leave a review ");
         }else {
             System.out.println("the Book is Already in the Libray");
         }
}

    public static void main(String[] args) {
        Book designofthings = new Book("1", "Design", "Author");
        Book mybook = new Book("2");
        System.out.println(Book.getTotalNoofbooks());
        designofthings.BorrowBook();
        mybook.BorrowBook();
        designofthings.BorrowBook();
        designofthings.returntheBook();
        designofthings.returntheBook();


     }
}