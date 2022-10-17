import java.util.Scanner;
public class CtoFJava {
        public static void main(String[] args)
        {
            double c = 0;
            double f = 0;
            String trash = "";
            Scanner in = new Scanner(System.in);
            {
                System.out.print("Enter your temperature in Celcius");
                if(in.hasNextDouble())
                {
                    c = in.nextDouble();
                    in.nextLine();
                    while (c <= 15);
                    f = (9.0/5.0 * c ) + 32;
                    System.out.println( "Fahrenheit:" + f + "Celcius:" + c);
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("/n You said your temp was " + trash);
                    System.out.println("Run the program again and enter a valid amount");
                    System.exit(0);
                }
            }
}
}
