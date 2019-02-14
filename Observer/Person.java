import java.util.Iterator;
import java.util.List; 
import java.util.ArrayList;

public class Person implements Observer
{
    private ArrayList<Observable> toObserve = new ArrayList<Observable>();

    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public void update(Observable updatedObservable)
    {
        Iterator<Observable> it = toObserve.iterator();

        while(it.hasNext())
        {
            Observable currObservable = it.next();//get the current Observable that is iterated

            if(updatedObservable.hashCode() == currObservable.hashCode())
            //if the current observable has the same hash code as the one that was updated
            //then this is the Observable(Subject) that changed state and we need to get 
            //the new state on this Observable
            {
                System.out.println(this.name + "!\n\tNew Article Published: " + currObservable.getInfo());
                break;
            }
        }
        
    }

    public void subscribe(Observable obs)
    {
        toObserve.add(obs);
        obs.add(this);
    }

    public void unsubscribe(Observable obs)
    {
        toObserve.remove(obs);
        obs.remove(this);
    }

}