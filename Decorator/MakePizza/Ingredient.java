public abstract class Ingredient implements Pizza
{
    protected Pizza p;

    public int cost()
    {
        return p.cost() + myCost();
    }

    public String desc()
    {
        return p.desc() + myDesc();
    }

    abstract public int myCost();
    abstract public String myDesc();
}