import java.util.*;
public class OddsAndEvens {
    public static void main(String args[]) {
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What's your name? ");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String user = console.nextLine();
        boolean even_pick = user.equalsIgnoreCase("E");
        if (user.equalsIgnoreCase("E")) {
            System.out.println(name + " picked evens. The computer will be odds!");
        }

        else if (user.equalsIgnoreCase("O")){
            System.out.println(name + " picked odds. The computer will be evens!");
        }
        System.out.println("-----------------------------------------------");
        System.out.println("How many \"fingers\" do you put out? ");
        int num = console.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays "+ computer+ " \"fingers\"");
        System.out.println("----------------");
        int sum = num + computer;
        boolean oddOrEven = sum % 2 == 0;
            if ( oddOrEven == true){
            System.out.println(num + " + " + computer+ " = " + sum + " is..... even." );
                if (even_pick == true) {
                    System.out.println("That means "+ name + " wins!");
                }
                else{
                    System.out.println("The computer wins!");
                }

            }
         else{
            System.out.println(num + " + " + computer+ " = " + sum + " is..... odd." );
            }
        System.out.println("------------------------------------------");
    }


}