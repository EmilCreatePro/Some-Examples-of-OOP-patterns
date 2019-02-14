public class Apple extends Fruit 
{
    public Apple(Cake c)
    {
        cake = c;
    }

    public int myCost()
    {
        return 1;
    }

    public String myDesc()
    {
        return "Apple ";
    }
}