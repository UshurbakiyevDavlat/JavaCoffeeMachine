package machine;
import javax.crypto.Mac;
import java.util.Scanner;
public class CoffeeMachine {


    public static void buy(MachinePrint machinePrint) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappiccino, back - to main menu:");
        machinePrint.setChoice(sc.next());
    }

    public static void fill(MachinePrint machinePrint) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("How many ml of water do you want to add:");
           machinePrint.setFillFirst(sc.nextInt());

            System.out.println("How many ml of milk do you want to add:");
           machinePrint.setFillSecond(sc.nextInt());

            System.out.println("How many grams of coffee beans  do you want to add:");
           machinePrint.setFillThird(sc.nextInt());

            System.out.println("How many  disposable cups of coffee do you want to add:");
           machinePrint.setFillFourth(sc.nextInt());

        } catch (Exception NoSuchElementException){
            System.out.println("404");
        }

    }





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MachinePrint machinePrint = new MachinePrint(400,540,120,9,550);
        String ch;

        for(;;) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
    try {
        ch = sc.nextLine();

        if (ch.equals("buy")) {
            buy(machinePrint);
        } else if (ch.equals("fill")) {
            fill(machinePrint);
        } else if(ch.equals("exit")){
            break;
        }

        machinePrint.printInfo(ch);
                } catch(Exception NoSuchElementException){
        System.out.println("404");
    }
        }

    }

}

