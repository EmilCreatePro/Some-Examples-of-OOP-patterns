public abstract class SandwichTemplate
{
    private boolean firstIngredient = false;

    final public void makeSandwich()
    {
        putBread();
        System.out.println();

        if(wantMeat()) //this is the hook
        {
            putMeat();
            if(firstIngredient == true);
                System.out.println();

            firstIngredient = true;
        }

        if(wantVeggies()) //this is the hook
        {
            putVeggies();
            if(firstIngredient == true);
                System.out.println();

            firstIngredient = true;
        }

        if(wantCondiments()) //this is the hook
        {
            putCondiments();
            if(firstIngredient == true);
                System.out.println();

            firstIngredient = true;
        }

        giveSandwich();
    }

    public abstract void putMeat();

    public abstract void putVeggies();

    public abstract void putCondiments();
    
    private void putBread()
    {
        System.out.print("Bread was put.");
    }

    private void giveSandwich()
    {
        System.out.println("Hand sandwich to customer.");
    }

    private boolean wantMeat()
    {
        return true;
    }

    private boolean wantVeggies()
    {
        return true;
    }

    private boolean wantCondiments()
    {
        return true;
    }
}