public class Client
{
    public static void main(String[] args) {
        Pizza pizza = new Salami(new Ham(new SimplePizza()));

        System.out.println(pizza.cost());
        System.out.println(pizza.desc());
    }
}