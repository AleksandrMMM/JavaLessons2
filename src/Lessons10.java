public class Lessons10 {
    public static void main(String[] args) {
        Book book1 = new Book(Types.ROMAN,"War and Piace", "Lev Tolstoy");
        System.out.println(book1.getBookTypes() + " " + book1.getName() + " " + book1.getAuthor());

    }
}

