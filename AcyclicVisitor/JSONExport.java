public class JSONExport implements CircleExport, TriangleExport
{
    public String export(Circle c)
    {
        String tmp = "";

        tmp += "{\n\ttype: CIRCLE\n\tradius:"+ c.getRadius() + "\n\tcenter{x:"+ c.getX()+"; y: " + c.getY() + "}\n}";
        

        return tmp;
    }

    public String export(Triangle t)
    {
        String tmp = "";

        tmp += "{\n\ttype: TRIANGLE\n\tpoints:\n\t\t{x:"+ t.getX() + ", y:"+ t.getX()+"; z: " + t.getZ() + "}\n}";
        

        return tmp;
    }
}