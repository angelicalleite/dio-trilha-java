import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite o número: ");
        Integer numero = ler.nextInt();
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = ler.next();
        System.out.println("Por favor, digite o nome cliente: ");
        String cliente = ler.next();
        System.out.println("Por favor, digite o saldo: ");
        Double saldo = ler.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "," +
                " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
