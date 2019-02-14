public class Ham extends Ingredient
{
    public Ham(Pizza p)
    {
        this.p = p;
    }

    public String myDesc()
    {
        return "Ham ";
    }

    public int myCost()
    {
        return 5;
    }
}