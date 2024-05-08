import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Por favor, informe o número da Conta: (1021)");
            int numero = sc.nextInt();
            
            System.out.println("Por favor, digite o número da Agência; (067-8)");
            String agencia = sc.next();

            sc.nextLine();

            System.out.println("Informe seu nome: ");
            String nomeCliente = sc.nextLine();
            
            
            System.out.println("Por favor, informe o saldo: ");
            double saldo = sc.nextDouble();
            
            System.out.println();
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    
    }
}