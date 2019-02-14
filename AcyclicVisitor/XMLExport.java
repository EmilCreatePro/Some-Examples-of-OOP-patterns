public class XMLExport implements CircleExport
{
    public String export(Circle c)
    {
        String tmp = "";
        
        tmp += "<circle>";
        tmp += "\n\t<radius>"+ c.getRadius() + "</radius>";
        tmp += "\n\t<center>";
        tmp += "\n\t\t<point>";
        tmp += "\n\t\t\t<x>"+c.getX() +"</x>";
        tmp += "\n\t\t\t<y>"+ c.getY() + "</y>";
        tmp += "\n\t\t</point>";
        tmp += "\n\t</center>";
        tmp += "\n</circle>";

        return tmp;
    }
}