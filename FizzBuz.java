
package fizzbuz;

/**
 *
 * @author Nerys Jimenez
 * FizzBuz.java prints numbers 1...100
 * For multiples of 3, print "Fizz" instead of the number
 * For multiples of 5, print "Buzz" instead of the number
 * For multiples of 3 and 5, print "FizzBuzz" instead of the number
 */
public class FizzBuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                if(i % 3 == 0)
                
                    System.out.println("Fizz");
                
                else if(i % 5 == 0)
                
                    System.out.println("Buzz");
                
                else
                    System.out.println(i);
            }
            
        }
    }
    
}
