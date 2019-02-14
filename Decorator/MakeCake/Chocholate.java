public class Chocholate extends Ingredient
{
    public Chocholate(Cake c)
    {
        cake = c;
    }

    public String myDesc()
    {
        return "Chocolate ";
    }

    public int myCost()
    {
        return 5;
    }
}