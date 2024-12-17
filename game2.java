
import java.util.Random;
import java.util.Scanner;

public class game2 {
    public static void main(String[] args) {
        
        int num;
        int guess;
        int nguesses=1;

        Random random = new Random();
         guess = random.nextInt(100);
         

do {Scanner scan = new Scanner(System.in);
    System.out.println("Guess any number between 1 to 100: ");
    num = scan.nextInt();

    if (guess<num){
    System.out.println("Lower number please...");
}
else if (guess>num){
    System.out.println("Higher number please...");
}
else {
    System.out.format("You have guessed the number in %d attempts..\n", nguesses);

}nguesses++;
    
} while(num!=guess);

System.out.format("The number was  %d", guess);
        

    }
}


    

