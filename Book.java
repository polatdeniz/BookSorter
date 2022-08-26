public class Book implements Comparable <Book>
{
    private String name;
    private String author;
    private int numPages;
    private int date;

    public Book(String name, String author, int numPages, int date)
    {
        this.name = name;
        this.author = author;
        this.numPages = numPages;
        this.date = date;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public int getNumPages()
    {
        return numPages;
    }
    public void setNumPages(int numPages)
    {
        this.numPages = numPages;
    }
    public int getDate()
    {
        return date;
    }
    public void setDate(int date)
    {
        this.date = date;
    }
    //for prevent the warnings
    @Override
    public int compareTo(Book book)
    {
        return getName().compareTo(book.getName());
    }
}