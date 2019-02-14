import java.util.List; 
import java.util.ArrayList;
import java.util.Iterator; 

public class NYTimes implements Observable
{
    private ArrayList<Observer> subscribers;//list of subscribers(observers)
    private ArrayList<Article> articles;//list of the articles this publisher(observant/subject) might have

    public NYTimes()
    {
        subscribers = new ArrayList<Observer>();
        articles = new ArrayList<Article>();
        //initialize the lists(initially the capacity is 10)
    }

    public void addArticle(Article art)
    {
        articles.add(art);
        alertSubscribers();
        //if an Article has been added then alert the Subscribers
    }

    public void removeArticle(Article art)
    {
        articles.remove(art);
    }

    public void printArticles()
    {
        System.out.println(articles);
    }

    public void add(Observer obs)
    {
        subscribers.add(obs);//add the new observer to the list of subscribers
    }

    public void remove(Observer obs)
    {
        subscribers.remove(obs);//remove the new observer to the list of subscribers
    }

    public String getInfo()
    {
        //for the sake of simplicity the observer only needs to new what is the new article added
        //update() is only called when alertSubscribers() is called and that happens only when a new article is introduced
        //therefore we can take the last element from the list of articlles because we know is the newest
        String tmp = articles.get(articles.size() - 1).toString();
        return tmp;
    }

    public void alertSubscribers()
    {
        Iterator<Observer> it = subscribers.iterator();

        //call on each of the subscribers the update function and give as parameter the instance of this object
        //to let the observer(subscriber know) which of its subjects changed
        while(it.hasNext())
        {
            it.next().update(this);
        }
    }

}