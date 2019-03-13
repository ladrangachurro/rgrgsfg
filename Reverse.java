
/**
 * Write a description of class Reverse here.
 *
 * @author Quinn Agnew
 * @version (a version number or a date)
 */
public class Reverse
{
    public static final String SECRET_PASSWORD = "LADICKYBALL"; 
    static String obfuscate(String input) {
        
        return input.replace('D', 'M').replace('A', 'R');
    }
    public static void main(String [] args)
    {
        if (args.length != 1)
        {
            System.out.println("Wrong");
            return;
        }
        if (args[0].equals(obfuscate(SECRET_PASSWORD)))
        {
            System.out.println("You Win");
        } else {
            System.out.println("Wrong");
        }
    }
}
