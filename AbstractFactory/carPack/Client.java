public class Client
{
    public static void main(String[] args) {
        Robot r = new Robot(new CityParkFactory());

        Car car1 = r.assembelCar("TSI12", "Combi", "NormalBreak");

        System.out.println(car1);

        r.setFactory(new SportCarFactory());

        Car car2 = r.assembelCar("TSI18", "Sport", "HaltBreak");

        System.out.println(car2);

        r.setFactory(new FerrariFactory());

        Car ferrari = r.assembelCar("", "", "");

        System.out.println(ferrari);
    }
}