public class Article
{
    private String name, author;

    public Article(String name,String author)
    {
        this.name = name;
        this.author = author;
    }

    public String toString()//for simplicity sake return only the name and author of article
    {
        return "Article: " + this.name + " written by: " + this.author;
    }
}