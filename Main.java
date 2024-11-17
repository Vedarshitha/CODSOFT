import java.util.*;
import java.util.Random;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int n=sc.nextInt();
        int ToGuess=random.nextInt(n)+1;
        int max=sc.nextInt();
        int attempts=0;
        int correct=0;
        System.out.println("I have choosen a number between 1 and "+n);
        System.out.println("You have "+max+" attempts to guess the number");
        while(attempts<max&&correct==0){
            int guess=sc.nextInt();
            attempts++;
            if(guess==ToGuess){
                correct=1;
                System.out.println("Congrats!! Your guess is correct.");
                break;
            }
            else if(guess>ToGuess){
                System.out.println("It's high.Try again.");
            }
            else
                System.out.println("It's low.Try again.");
            if(attempts==max){
                System.out.println("Sorry! All your attempts are completed.");
                System.out.println("The number was: "+ToGuess);
                break;
            }
        }
    }
}