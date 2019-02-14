public class Circle implements Shape
{
    private int x, y, radius;

    public Circle(int x, int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX()
    {
        return x;
    }

    
    public int getY()
    {
        return y;
    }

    
    public int getRadius()
    {
        return radius;
    }

    public String convert(Export e)
    {
        if(e instanceof CircleExport)
            return ((CircleExport)e).export(this);

        return "Type of converter does not exist for this!";
    }
}