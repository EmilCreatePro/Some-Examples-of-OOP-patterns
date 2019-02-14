public class Client
{
    private static Shape sh;
    private static Export ex;

    private static void createShapeExport(Shape s, Export e)
    {
        sh = s;
        ex = e;
    }
    public static void main(String[] args) {

        createShapeExport(new Circle(0, 0, 10), new JSONExport());

        System.out.println(sh.convert(ex));

        createShapeExport(new Triangle(1, 2, 3), new JSONExport());

        System.out.println(sh.convert(ex));
    }
}