public abstract class Ingredient implements Cake
{
    protected Cake cake;

    public int cost()
    {
        return cake.cost() + myCost();
    }

    public String desc()
    {
        return cake.desc() + myDesc();
    }

    public abstract int myCost();

    public abstract String myDesc();
}