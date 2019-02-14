public class Banana extends Fruit 
{
    public Banana(Cake c)
    {
        cake = c;
    }

    public int myCost()
    {
        return 2;
    }

    public String myDesc()
    {
        return "Banana ";
    }
}