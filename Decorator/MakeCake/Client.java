public class Client
{
    public static void main(String[] args) {
        Cake c1 = new Banana(new Apple(new Chocholate(new Egg(new BaseCake()))));

        System.out.println(c1.cost());
        System.out.println(c1.desc());
    }
}