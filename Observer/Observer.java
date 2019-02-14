public interface Observer
{
    public void update(Observable updatedObservable);
    /*
        in case this observer is interested in multiple Observables(Subjects) 
        then display the new state only for that observer
    */

    public void subscribe(Observable obs);

    public void unsubscribe(Observable obs);
}