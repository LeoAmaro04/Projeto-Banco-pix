import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String nome = "Leonardo Amaro de Lima";
        String tipoConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;


        System.out.println("**********************************");
        System.out.println("Dados inicias do cliente:");
        System.out.println("\nNome do cliente:     " + nome);
        System.out.println("Tipo conta:          " + tipoConta);
        System.out.println("Saldo inicial:       R$ " + saldo);
        System.out.println("**********************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Tranferir valor 
                3 - Receber valor
                4 - Sair                     
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é: R$ " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para realizar a transferencia!");
                } else {
                    saldo -= valor;
                }

            } else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
            } else if (opcao != 4){
                System.out.println("\nOpção Invalida!\n\n");
            }
        }
    }
}