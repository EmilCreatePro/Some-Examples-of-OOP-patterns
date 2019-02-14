public class Client
{
    public static void main(String[] args) {
        Robot r = new Robot();

        try {
            Car car = r.assembleCar("Diesel", "HaltBreak", "Sport");
            System.out.println(car);
        } 
        catch(AssembleCarError e)
        {
            System.out.println("\nCould not build car!\n");
            // + e.getMessage());
        }
        catch (Exception e) {
            //TODO: handle exception
        }

        Robot r2 = new PoloRobotCreator();

        Car car2 = ((PoloRobotCreator)r2).assembleCar();

        System.out.println(car2);

    }
}