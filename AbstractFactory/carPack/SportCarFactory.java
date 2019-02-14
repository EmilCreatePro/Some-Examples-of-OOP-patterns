public class SportCarFactory implements Factory
{
    public Engine createEngine(String eng)
    {
        switch(eng)
        {
            case "Diesel": return new Diesel();
            case "TSI18": return new TSI18();
            default: return null;
        }
    }
    
    public Body createBody(String bd)
    {
        switch(bd)
        {
            case "Sport": return new Sport();
            default: return null;
        }
    }

    public Break createBreak(String br)
    {
        switch(br)
        {
            case "HaltBreak": return new HaltBreak();
            default: return null;
        }
    }
}