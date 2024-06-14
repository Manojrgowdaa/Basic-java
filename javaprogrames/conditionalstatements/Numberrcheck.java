import java.util.Scanner;


public class Numberrcheck {
    public static void main(String[] args) {
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    number=sc.nextInt();
        if(number >= 10) {
            System.out.println("The number is greater than 10.");
        }
        else{
            System.out.println("the number is less than 10");
        }
    }
}
