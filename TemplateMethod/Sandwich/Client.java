public class Client
{
    public static void main(String[] args) {
        SandwichTemplate cust1 = new MeatSandwich();

        cust1.makeSandwich();

        SandwichTemplate cust2 = new VeggieSandwich();

        System.out.println();

        cust2.makeSandwich();
        
    }
}