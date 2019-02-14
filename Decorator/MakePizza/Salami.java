public class Salami extends Ingredient
{
    public Salami(Pizza p)
    {
        this.p = p;
    }

    public String myDesc()
    {
        return "Salami ";
    }

    public int myCost()
    {
        return 7;
    }
}