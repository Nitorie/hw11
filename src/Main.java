import java.util.List;

public class Main {
    public static void main(String[] args) {
        task2();
        Library library = new Library();
        library.addBook(new Book("Book1", "author1", 1997));
        library.addBook(new Book("Book2", "author2", 1960));
        library.addBook(new Book("Book3", "author2", 1925));

        List<Book> booksByAuthor = library.searchByAuthor("author2");
        System.out.println("Books by author2");
        for (Book book : booksByAuthor) {
            System.out.println(book.getName() + " (" + book.getPublicationYear() + ")");
        }

        int totalBooks = Library.countBooks(library);
        System.out.println("Total books in the library: " + totalBooks);
        System.out.println("---------------------------------");
    }
    public static void task2() {
        Bank bank = new Bank();


        bank.createAccount("123456", 1000);
        bank.createAccount("987654", 2000);


        BankAccount account1 = bank.findAccount("123456");
        BankAccount account2 = bank.findAccount("987654");


        System.out.println("Balance of account 123456: " + account1.getBalance());
        System.out.println("Balance of account 987654: " + account2.getBalance());


        account1.transfer(account2, 500);


        System.out.println("New balance of account 123456: " + account1.getBalance());
        System.out.println("New balance of account 987654: " + account2.getBalance());


        account1.blockAccount();


        account1.withdraw(200);


        account1.unblockAccount();


        account1.withdraw(200);
    }
    }