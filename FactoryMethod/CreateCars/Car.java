public class Car
{
    private Engine eng;
    private Body bd;
    private Break br;

    public Car(Engine eng, Body bd, Break br)
    {
        this.bd = bd;
        this.br = br;
        this.eng = eng;
    }

    public String toString()
    {
        return "Components: " + eng.component() + bd.bodyType() + br.breakType();
    }
}