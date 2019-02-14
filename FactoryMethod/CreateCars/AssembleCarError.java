public class AssembleCarError extends Exception
{
    public AssembleCarError()
    {
        super("\nCouldn't build such a car because:");
    }
}