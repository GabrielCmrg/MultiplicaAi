import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Qual tabela você gostaria de ver?");
        Scanner scan = new Scanner(System.in);
        int baseNumber = scan.nextInt();
        scan.close();
        System.out.println("Tabela de multiplicação de " + baseNumber);
        for (int i = 1; i <= 10; i++) {
            int multiplication = baseNumber * i;
            System.out.println(baseNumber + " X " + i + " = " + multiplication);
        }
    }
}
