import java.util.Scanner;

public class ContaTerminal {

    /** TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela Scanner os valores digitados no terminal
         Exibir a mensagem conta criada*/

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo(a) à página de cadastro do Luk's Bank's");
        System.out.println("Para inciarmos, por favor, digite o seu nome completo: ");
        String nomeCliente = sc.nextLine();

        System.out.printf("Obrigado pela informação, %s. ", nomeCliente);

        System.out.println("Agora, digite o número da conta: ");
        int numeroDaConta = sc.nextInt();

        System.out.println("Digite o número da Agência com o hífen para separar o dígito: ");
        String agencia = sc.next();

        System.out.println("Para válidar o cadastro, digite o valor a ser inserido no seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.print("Olá, "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo R$ " + saldo + " já está disponível para saque");

        sc.close();

    }
}
