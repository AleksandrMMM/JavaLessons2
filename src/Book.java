public class Book {
   private Types bookTypes;
   private String name;
   private String author;


    public Book(Types bookTypes, String name, String author) {
        this.bookTypes = bookTypes;
        this.name = name;
        this.author = author;
    }

    public Types getBookTypes(){
        return bookTypes;

    }
    public void setbookTypes(Types bookTypes){
        this.bookTypes = bookTypes;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
