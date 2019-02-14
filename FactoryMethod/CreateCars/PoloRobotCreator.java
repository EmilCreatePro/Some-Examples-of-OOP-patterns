public class PoloRobotCreator extends Robot
{
    public Car assembleCar()
    {
        return new Car(new TSI12(), new Combi(), new NormalBreak());
    }
}