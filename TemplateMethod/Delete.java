class A
{
    private int fieldA;

    public A(int fieldA)
    {
        this.fieldA = fieldA;
    }

}

class B extends A
{
    public B(int nr)
    {
        super(nr);
    }

    public static void main(String[] args) {
        B obj = new B(5);

        System.out.println(obj.fieldA);//field A is not visible
    }
}