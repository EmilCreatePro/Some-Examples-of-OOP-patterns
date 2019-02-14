public class Client
{
    public static void main(String[] args) {

        //**********Create new Observables(Subjects) ************/
        Observable nyt = new NYTimes();
        Observable nytSports = new NYTimes();
        //*****************************************************/

        //***********Create new Observers***********************/
        Observer p1 = new Person("Andrei");
        Observer p2 = new Person("Gabriel");
        Observer p3 = new Person("Sorin");
        Observer p4 = new Person("Emil");
        Observer p5 = new Person("Bunta");
        //*****************************************************/

        //Make Some observers subscribe to simple new york times
        p1.subscribe(nyt);
        p2.subscribe(nyt);
        p5.subscribe(nyt);
        
        //make some observers to subscribe to sports section of new york times
        p1.subscribe(nytSports);
        p3.subscribe(nytSports);
        p4.subscribe(nytSports);
        
        //******************Create Articles ******************************************************/
        Article art1 = new Article("Trump Fails!", "Barbara Gordon");
        Article art2 = new Article("Economy Doomed", "Henry Cavaliere");
        Article art3 = new Article("Tesla to replace gas cars!", "Joe Rogan");
        Article art4 = new Article("Federer Does not give up!", "Castiel Demeter");
        Article art6 = new Article("Ronaldo wins its third golden Globe!", "Garcia Marquez");
        //************************************************************************************/


        ((NYTimes)nyt).addArticle(art1);//add Article to normal ny times-> know all observers of this Observable(Subject) will be notified

        System.out.println("\n\n");

        ((NYTimes)nytSports).addArticle(art4);//add Article -to sports section of ny times > know all observers of this Observable(Subject) will be notified

        p1.unsubscribe(nytSports);//if we unsubscribe at run time then the next time a new article is published p1 won't be notified
        p3.unsubscribe(nytSports);//if we unsubscribe at run time then the next time a new article is published p3 won't be notified
        p2.subscribe(nytSports);//if we subscribe at runtime then p2 will now be informed when a new article is pusblished

        System.out.println("\n\n");

        ((NYTimes)nytSports).addArticle(art6);//add Article -> know all observers of this Observable(Subject) will be notified

        System.out.println("\n\n");

        ((NYTimes)nyt).printArticles();
        ((NYTimes)nytSports).printArticles();

        System.out.println("\n\n");
    }
}