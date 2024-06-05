import java.util.Scanner;
/**
 * Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas.
 * A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        // Váriável que receberá o valor Depósito - PS POderia ter unido saque e depósito, porém deixei assim
        double aDepositar = 0;
        // Váriável que receberá o valor Saque - PS POderia ter unido saque e depósito, porém deixei assim
        double aSacar = 0.0;
        boolean continuar = true;
        System.out.println("Olá Sr. Cliente, Bem vindos ao nosso Banco.\nSelecione a opção desejada informando o npumero.");

        /**
         * Utilizando um switch, o programa realizará a operação escolhida pelo usuário.
         * */
        while (continuar) {
            System.out.println("1 - Depositar.\n" +
                    "2 - Sacar.\n" +
                    "3 - Consultar Saldo.\n" +
                    "0 - Encerrar.");
            System.out.println("=== INFORME A OPERAÇÃO DESEJADA ===");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO Criar função para fazer o tratamento dessas operações de cada case
                    System.out.println("Informe o valor a depositar: R$ ");
                    aDepositar = scanner.nextDouble();
                    if (aDepositar > 0){
                        saldo= saldo + aDepositar;
                        System.out.println("Saldo atual: "+String.format("%.1f",saldo));
                    }else {
                        System.out.println("Não foi possivel prosseguir com o Depósito.\n Verifique os valores informados.");
                    }
                    break;
                case 2:
                    // TODO Criar função para fazer o tratamento dessas operações de cada case
                    System.out.println("Informe o valor desejado para saque: ");
                    aSacar = scanner.nextDouble();
                    if (saldo >= aSacar){
                        saldo = saldo - aSacar;
                        System.out.println("Saldo atual: "+String.format("%.1f",saldo));
                    }else {
                        System.out.println("Saldo insufuciente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: "+String.format("%.1f",saldo));
                    break;
                case 0:
                    System.out.println("Obrigado por usar o Santander\nPrograma encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}