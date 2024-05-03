import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        //atributos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da agencia!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite qual agencia!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente!");

        String primeiroNome = scanner.next();
        String segundoNome = scanner.next();

        System.out.println("Por favor, digite o saldo da conta!");
        float saldo = scanner.nextFloat();

        scanner.close();

        String nomeCliente = primeiroNome + " " + segundoNome;

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " +
                numero + " e seu saldo " + saldo +
                " já está disponível para saque");

    }
}