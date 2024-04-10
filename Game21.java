import java.util.*;
public class Game21 {
    public static void main (String[]args){
    int num1 = (int)(11*Math.random()+1);
    int num2 = (int)(11*Math.random()+1);
    int sum1 = num1 + num2;
    System.out.println("You have a " + num1 +" and " + num2 + " for a total of " + sum1);
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 1 if you want another card or any other numcer for no card: ");
    int num3 = input.nextInt();
    input.close();
    
    if(num3 == 1){
        int num4 = (int)(11*Math.random()+1);
        int sum2 = sum1 + num4;
        System.out.println("You got a " + num4 + " for a total of " + sum2 );

    }
    else{
        int num5 = (int)(11*Math.random()+1);
        int num6 = (int)(11*Math.random()+1);
        int num7 = (int)(11*Math.random()+1);

    }
    }
}
