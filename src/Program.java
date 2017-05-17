import java.util.Scanner;

/**
 * Created by Валентина on 17.05.2017.
 */
public class Program {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number: ");
        int number = scanner.nextInt();
        if(number%2 == 0){
             System.out.println("Your number is even!");
         } else {
             System.out.println("Number is odd");
         }
        
    }
}
