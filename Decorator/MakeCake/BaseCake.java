public class BaseCake implements Cake
{
    @Override
    public String desc()
    {
        return "Flour ";
    }

    @Override
    public int cost()
    {
        return 3;
    }

}