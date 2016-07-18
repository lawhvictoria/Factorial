import java.util.Arrays;

/**
 *
 * @author Victoria
 */
public class FactorGenerator {
    
    private int numberToFactor;
    
    public FactorGenerator(int numberToFactor)
    {
        this.numberToFactor = numberToFactor;
    }
    
    public int getNumberToFactor()
    {
        return numberToFactor;
    }
    
    public int nextFactor()
    {   
        
        for(int num = 2; num <= numberToFactor; num++)
        {
           if (numberToFactor % num == 0)
            {
		numberToFactor = numberToFactor/num;
                return num;
            }
        }
       return 0;
    }
        
    public boolean hasMoreFactors()
    {
        for(int n = 2; n <= numberToFactor; n++)
        {
           if (numberToFactor % n == 0)
            {
                return true;
            }
        }
        return false;
    }

}
