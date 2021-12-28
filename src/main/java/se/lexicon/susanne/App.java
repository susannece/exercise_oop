package se.lexicon.susanne;

import se.lexicon.susanne.Customer;
import se.lexicon.susanne.BankAccount;
import se.lexicon.susanne.Car;

import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
/*        Customer susanne = new Customer("Susanne", "Cederholm", "info@susanne.se");
        BankAccount nr1 = new BankAccount(1,500, susanne);

        nr1.deposit(400);
        System.out.println("Customer " + susanne.getFirstName() + ": "+ nr1.getBalance());

        nr1.withdraw(300);
        System.out.println("Customer " + susanne.getFirstName() + ": "+ nr1.getBalance());

        Car car1 = new Car(75,2020, "Saab", "red", 1500);
        car1.drive();

        Scanner input = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Height: ");
        rectangle1.setHeight(input.nextDouble());
        System.out.println("Width: ");
        rectangle1.setWidth(input.nextDouble());
        System.out.println("Area: " + rectangle1.getArea());
*/
        Author[] authors = new Author[0];
        Author author1 = new Author("Dan Andersson");
        Book book1 = new Book("Hemlängtan", author1, 2019);
        authors = Arrays.copyOf(authors, authors.length + 1);
        authors[authors.length-1] = author1;

        Author author2 = new Author("Kerstin Ekman");
        Book book2 = new Book("Löpa varg", author2, 2021);
        authors = Arrays.copyOf(authors, authors.length + 1);
        authors[authors.length-1] = author2;

 //       System.out.println("Wich author? ");
 //       String name = input.findInLine();
        printBooksByAuthor(authors, "Dan Andersson");

    }

    public static void printBooksByAuthor(Author[] authors, String name){
        for (int i = 0; i < authors.length; i++) {
            Author.class.getName();
           // if(authors[i] == name)
             //   System.out.println("Book: " + Author.class.printBooks(author));
        }

    }
}
