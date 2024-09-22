import java.util.Scanner;

public static void main() {
    ContaTerminal conta = new ContaTerminal(); //
    Scanner sc = new Scanner(System.in); // Inicializando o Scanner para sc
    String caracter;
    int number;



    System.out.print("Digite sua agencia: ");
    caracter = sc.nextLine();
    conta.agencia = caracter;

    System.out.print("Digite seu nome: ");
    caracter = sc.nextLine();
    conta.nomeCliente = caracter;

    System.out.print("Digite numero da conta: ");
    number = sc.nextInt();
    conta.numero = number;

    System.out.print("Digite seu saldo: ");
    number = sc.nextInt();
    conta.saldo = number;





    //apos a leitura irá imprimir as informações da conta - minha versao
    System.out.println("========================================");
    System.out.println("Numero da Conta: " + conta.numero);
    System.out.println("Agencia: " + conta.agencia);
    System.out.println("Nome: " + conta.nomeCliente);
    System.out.println("Saldo: " + conta.saldo);
    System.out.println("========================================");



    //apos a leitura irá imprimir as informações da conta - versao para o teste
    System.out.println("========================================");
    System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ conta.agencia +" conta " + conta.numero + " tem o seguinte saldo R$" + conta.saldo + " já está disponível para saque");
    System.out.println("========================================");



}
