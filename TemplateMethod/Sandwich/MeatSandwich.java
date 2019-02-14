public class MeatSandwich extends SandwichTemplate
{
    private String[] meat = {"Salami", "Chicken", "Pork"};
    private String[] condiments = {"Pepper", "Salt"};

    @Override
    public void putMeat()
    {
        String prod = "Meat Added: ";
        for(String el:meat)
        {
            prod = prod + " " + el;
        }

        System.out.print(prod);
    }

    @Override
    public void putVeggies()
    {
        //we overwrite it with no-op beacuase we don't need veggies with put meat!
    }

    @Override
    public void putCondiments()
    {
        String prod = "Condiments Added: ";
        for(String el:condiments)
        {
            prod = prod + " " + el;
        }

        System.out.print(prod);
    }

    @Override
    public boolean wantVeggies()
    {
        return false;
    }
}