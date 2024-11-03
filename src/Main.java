import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//     System.out.println("hello world");
//     Scanner scanner = new Scanner(System.in);
//     String input =scanner.nextLine();
//     System.out.println(input);
//     int num;
//     double doublenum;
//     num = 2;
//     byte b =-2;
//     short s =222;
//     long l =1922222l;
//     float f= 1.1F;
//     double d=1.1;
//     char c = 'c';
// final var t=1.91;
//     boolean b = true;
//     System.out.println(33!=5);
//     System.out.println(33>99);
//     System.out.println(33<32);
//     System.out.println(33<32);

//     int num = 5;
//     int anotherNum = 7;

//     if (num > anotherNum) {
//         System.out.println("its less");
//     } else if (1==1) {
//         System.out.println(true);
//
//     } else  {
//         System.out.println("its not");
//
//     }

//         System.out.println(num > anotherNum ? "its less" : "its not");


        ArrayList<String> cars = new ArrayList<>();

        cars.add("tesla");
        cars.add("tesla");
        cars.add(0, "toyota");
        System.out.println(cars.get(0));
        System.out.println(cars.size());
        System.out.println(cars);
        System.out.println(cars.reversed());
        System.out.println(cars.isEmpty());



    }
}
