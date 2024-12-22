package w3resources;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);


        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();

        System.out.println();
        System.out.println("Hello\n" + fname + " " + lname);

        //
    }
}