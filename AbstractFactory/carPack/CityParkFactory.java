
public class CityParkFactory implements Factory
{
    public Engine createEngine(String eng)
    {
        switch(eng)
        {
            case "TSI12": return new TSI12();
            case "TSI18": return new TSI18();
            default: return null;
        }
    }
    
    public Body createBody(String bd)
    {
        switch(bd)
        {
            case "Combi": return new Combi();
            case "Sport": return new Sport();
            default: return null;
        }
    }

    public Break createBreak(String br)
    {
        switch(br)
        {
            case "NormalBreak": return new NormalBreak();
            default: return null;
        }
    }
}