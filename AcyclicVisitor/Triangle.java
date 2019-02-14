public class Triangle implements Shape
{
    private int x, y,z;

    public Triangle(int a, int b, int c)
    {
        x = a;
        y = b;
        z = c;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getZ()
    {
        return z;
    }

    public String convert(Export e)
    {
        if(e instanceof TriangleExport)
            return ((TriangleExport)e).export(this);

        return "No such export for this shape!";
    }
}