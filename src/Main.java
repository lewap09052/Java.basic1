import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz wartosc x");
        int x = scanner.nextInt();
        System.out.println("Wprowadz wartosc y");
        int y = scanner.nextInt();
        int z = x+y;
        System.out.println( " Wynik dodawania to:"+z);
    }
}