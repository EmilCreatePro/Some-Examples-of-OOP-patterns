public class Robot
{
    private Factory factory;

    public Robot(Factory fact)
    {
        factory = fact;
    }

    public void setFactory(Factory fact)
    {
        factory = fact;
    }

    public Car assembelCar(String eng, String body, String br)
    {
        Engine engine = factory.createEngine(eng);
        Body bd = factory.createBody(body);
        Break newBreak = factory.createBreak(br);

        return new Car(engine, bd, newBreak);
    }
}