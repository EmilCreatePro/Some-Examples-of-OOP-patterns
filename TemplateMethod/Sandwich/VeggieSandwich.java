public class VeggieSandwich extends SandwichTemplate
{
    private String[] veggies = {"Onions", "Garlic", "Salad", "Tomatoes"};
    private String[] condiments = {"Pepper", "Salt", "Vinegar"};

    @Override
    public void putMeat()
    {
        //we overwrite it with no-op beacuase we don't need meat!
    }

    @Override
    public void putVeggies()
    {
        
        String prod = "Veggies Added: ";
        for(String el:veggies)
        {
            prod = prod + " " + el;
        }

        System.out.print(prod);
    }

    @Override
    public void putCondiments()
    {
        String prod = "Condiments Added: ";
        for(String el:condiments)
        {
            prod = prod + " " + el;
        }

        System.out.println(prod);
    }

    @Override
    public boolean wantMeat()
    {
        return false;
    }
}