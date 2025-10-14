import java.util.Scanner;

class Books{
    String name;
    String author;
    int price;
    int numPages;
    Books(String name, String author, int price, int numPages){
    this.name=name;
    this.author=author;
    this.price=price;
    this.numPages=numPages;
    }

    public String toString(){

        String name,author,price,numPages;
        author = "Author name: " + this.author + "\n";
        price = "Price: " + this.price + "\n";
        numPages = "Number of pages: " + this.numPages + "\n";
        return name + author + price + numPages;
    }
}

public class demoBooks{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n ; String name; String author; int price; int numPages;
        System.out.println("enter the no of books");
        n=s.nextInt();
        book b[]=new Books();

        for(int i=0; i<n; i++){
            System.out.println("Enter the name of the book:");
            name= s.nextLine();
            System.out.println("Enter the author:");
            author= s.nextLine();
            System.out.println("Enter the price:");
            price = s.nextInt();
            System.out.println("Enter the no. pages");
            numPages = s.nextInt();
            b[i]=new books(name,author, price, numPages,);

        }
        for (int i=0, i<n
        System.out.println();

    }

}
