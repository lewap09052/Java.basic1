import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz wartosc x");
        int x = scanner.nextInt();
        if (x<3) {
            System.out.println("x jest mniejsze od 3");
        }else {
            System.out.println("x jest wieksze od 3");
        }

    }
}