import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        String name, author, price, numPages;
        name = "Book name: " + this.name + "\n";
        author = "Author name: " + this.author + "\n";
        price = "Price: " + this.price + "\n";
        numPages = "Number of pages: " + this.numPages + "\n";
        return name + author + price + numPages;
    }
}

public class demoBooks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        String name;
        String author;
        int price;
        int numPages;
        System.out.println("Enter the number of books:");
        n = s.nextInt();
        s.nextLine();
        Books b[] = new Books[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the book:");
            name = s.nextLine();
            System.out.println("Enter the author:");
            author = s.nextLine();
            System.out.println("Enter the price:");
            price = s.nextInt();
            System.out.println("Enter the number of pages:");
            numPages = s.nextInt();
            s.nextLine();
            b[i] = new Books(name, author, price, numPages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(b[i].toString());
        }
    }
}
