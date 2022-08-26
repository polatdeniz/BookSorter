import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        TreeSet <Book> bookForName = new TreeSet <>();

        Book b1 = new Book("Nutuk", "Ataturk", 1197, 1927);
        Book b2 = new Book("Harry Potter and the Philosopher's Stone",  "Rowling", 223 , 1997);
        Book b3 = new Book("The Raven", "Edgar Allan Poe", 40, 1845);
        Book b4 = new Book("Animal Farm", "George Orwell", 112, 1945);
        Book b5 = new Book("The Lord of the Rings", "Tolkien", 1178, 1954);

        bookForName.add(b1);
        bookForName.add(b2);
        bookForName.add(b3);
        bookForName.add(b4);
        bookForName.add(b5);

        // Sorted by name. (A --> Z)
        System.out.println("By name: ");

        for (Book b : bookForName)
        {
            System.out.println(b.getName());
            System.out.println();
        }
        System.out.println("---------------");

        

        TreeSet <Book> bookForPage = new TreeSet<>
        (new Comparator<Book>() 
            {
                @Override
                public int compare(Book o1, Book o2)
                {
                    return (o1.getNumPages() - o2.getNumPages());
                }
            }
        );

        Book b11 = new Book("Nutuk", "Ataturk", 1197, 1927);
        Book b12 = new Book("Harry Potter and the Philosopher's Stone",  "Rowling", 223 , 1997);
        Book b13 = new Book("The Raven", "Edgar Allan Poe", 40, 1845);
        Book b14 = new Book("Animal Farm", "George Orwell", 112, 1945);
        Book b15 = new Book("The Lord of the Rings", "Tolkien", 1178, 1954);

        bookForPage.add(b11);
        bookForPage.add(b12);
        bookForPage.add(b13);
        bookForPage.add(b14);
        bookForPage.add(b15);

        // Sorted by page number.
        System.out.println("By page: ");
        for (Book b : bookForPage)
        {
            System.out.println(b.getName());
            System.out.println();
        }
        System.out.println("---------------");
    }
}