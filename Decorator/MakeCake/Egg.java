public class Egg extends Ingredient
{
    public Egg(Cake c)
    {
        cake = c;
    }

    public String myDesc()
    {
        return "Egg ";
    }

    public int myCost()
    {
        return 1;
    }
}