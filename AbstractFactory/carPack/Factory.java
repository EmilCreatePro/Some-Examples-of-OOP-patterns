public interface Factory
{
    public Engine createEngine(String eng);
    public Body createBody(String bd);
    public Break createBreak(String br);
}