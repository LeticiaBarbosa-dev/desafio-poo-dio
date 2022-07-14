package dio.digitalinnovationone.dominio;

public class Main {
    public static void main(String[] args) {
        Banco digioOneBank = new Banco("DigioOneBank");
        Banco dioBank = new Banco("DioBank");

        System.out.println("======REGISTRO DE CONTAS ANTES DA CRIAÇÃO DOS CLIENTES======");
        System.out.println("DigioOneBank");
        digioOneBank.listarContas();
        System.out.println("==============================");
        System.out.println("DioBank");
        dioBank.listarContas();
        System.out.println("==============================");


        Cliente leticia = new Cliente("Letícia Barbosa", "785.652.311-00", "88 7856-2033", "Rua da Paz, 1568, Centro");
        Cliente pedro = new Cliente("Pedro Santos", "456.542.981-78", "88 8766-5043", "Rua dos Anjos, 1423, Centro");

        Conta leticiaDigioOne = digioOneBank.criarContaPoupanca(leticia);
        Conta pedroDioBank = dioBank.criarContaCorrente(pedro);

        System.out.println("======REGISTRO CONTAS DEPOIS DA CRIAÇÃO DOS CLIENTES======");
        System.out.println("DigioOneBank");
        digioOneBank.listarContas();
        System.out.println("==============================");
        System.out.println("DioBank");
        dioBank.listarContas();
        System.out.println("==============================");

        leticiaDigioOne.depositar(1000.00);
        pedroDioBank.depositar(5000.00);

        System.out.println("======EXTRATO DAS CONTAS DEPOIS DO DEPÓSITO======");
        leticiaDigioOne.extrato();
        pedroDioBank.extrato();

        leticiaDigioOne.sacar(500.00);
        pedroDioBank.sacar(3000.00);

        System.out.println("======EXTRATO DAS CONTAS DEPOIS DO SAQUE======");
        leticiaDigioOne.extrato();
        pedroDioBank.extrato();
    }
}
