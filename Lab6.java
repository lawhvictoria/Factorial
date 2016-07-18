import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println("The factor(s) of " + num + " are: ");
        
        FactorGenerator fac = new FactorGenerator(num);
        
        while (fac.hasMoreFactors()){
	    System.out.println(fac.nextFactor());
	}
    }
    
}
