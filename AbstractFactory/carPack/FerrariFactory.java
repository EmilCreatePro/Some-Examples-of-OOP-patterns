
public class FerrariFactory implements Factory
{
    public Engine createEngine(String en)
    {
        return new Diesel();
    }
    
    public Body createBody(String bd)
    {
       return new Sport();
    }

    public Break createBreak(String br)
    {
        return new HaltBreak();
    }
}