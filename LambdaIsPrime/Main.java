interface Lambda
{
    //public int testNr(int nr);
    public long factorial(int nr);
}

public abstract class Main implements Lambda
{
    public static void main(String[] args) {
        
        /*
        Lambda isPrime = (nr) ->
            {
                for(int i = 2; i < nr/2; i++)
                    if(nr % i == 0) return 0;
                return 1;
            };
        */
        Lambda fact = nr ->
        {
            long val = 1;
            for(int i = 1; i <= nr; i++)
                val *= i;

            return val;
        };

        System.out.println(fact.factorial(20));

    }
}