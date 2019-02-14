abstract class A
{
    protected int x = 10;
    abstract public int getX();
}

abstract class B extends A
{

}

class C extends B
{
    public int getX()
    {
        return x;
    }
}

class Main 
{
    public static void main(String[] args) {

        A o = new C();
        System.out.println(o.getX());//x is visible in class C because C is subtype of B which is subtype of A
    }
}