import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "Luís Miguel";
        double saldo = 456.48;

        System.out.println("Digite o número da agência: ");
        String agence = scanner.nextLine();

        System.out.println("Digite o número do usuário: ");
        int number = scanner.nextInt();

        System.out.println("\n-----------------------------------");
        System.out.print("Olá "+name+" obrigado por criar uma conta em nosso banco,\n sua agência é ");
        System.out.println(agence + " conta "+number+" e seu saldo de "+saldo+" ja está disponível para saque.");
        System.out.println("-----------------------------------");

        scanner.close();
    }
}
