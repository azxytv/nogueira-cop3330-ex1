package ex01;
import java.util.Scanner;

public class SayingHello {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    System.out.print("What is your name?");
    String name = in.nextLine();

    String out = "Hello, " + name + " , nice to meet you!";

    System.out.println(out);
}
}
