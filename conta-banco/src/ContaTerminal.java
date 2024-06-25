import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int conta = 0;
        String agencia = "";
        String cliente = "";
        double saldo = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        conta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        cliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!");

        scanner.close();
    }
}
