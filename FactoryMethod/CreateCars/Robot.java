public class Robot
{
    public Car assembleCar(String eng, String breaks, String body) throws AssembleCarError
    {
        try {

            Engine myEng = createEng(eng);
            Break myBr = createBreak(breaks);
            Body myBd = createBody(body);

            //System.out.println("\nCar created succesfully with components:" + myEng.component() + myBr.breakType() + myBd.bodyType());

            return new Car(myEng, myBd, myBr);
        }
        catch (EngineError e)
        {
            System.out.println("\nError! No " + eng + " engine exists!\n");

            throw new AssembleCarError();

            //return null;
        }
        catch (BreakError e)
        {
            System.out.println("\nError! No " + breaks + " breaks exists!\n");
            throw new AssembleCarError();
            //return null;
        }
        catch (BodyError e)
        {
            System.out.println("\nError! No "+ body +" Body exists!\n");
            throw new AssembleCarError();
            //return null;
        } 
        catch (Exception e) {
            return null;
            //TODO: handle exception
        }
    }

    private Engine createEng(String eng) throws EngineError
    {
        switch(eng)
        {
            case "TSI12": 
                {
                    return new TSI12();
                    
                }
            case "TSI18": 
            {
                return new TSI18();
               
            }
            case "Diesel": 
            {
                return new Diesel();
                
            }
            default: throw new EngineError();
        }
    }

    private Break createBreak(String str) throws BreakError
    {
        switch(str)
        {
            case "NormalBreak": 
                {
                    return new NormalBreak();
                   
                }
            case "HaltBreak": 
            {
                return new HaltBreak();
                
            }
            default: throw new BreakError();
        }
    }

    private Body createBody(String str) throws BodyError
    {
        switch(str)
        {
            case "Combi": 
                {
                    return new Combi();
                    
                }
            case "Sport": 
            {
                return new Sport();
                
            }
            default: throw new BodyError();
        }
    }
}