package wellCome;

import sun.nio.ch.sctp.SctpChannelImpl;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("enter your name: ");
        Scanner scanner = new Scanner(System.in);
     String name = scanner.nextLine();
        System.out.println("your name is :" + name);

    }


}
