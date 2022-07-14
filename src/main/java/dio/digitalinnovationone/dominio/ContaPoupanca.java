package dio.digitalinnovationone.dominio;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente titular, String agencia, String numero) {
        super(titular, agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        if(valor <= super.getSaldo()) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void extrato() {
        System.out.println("Titular: " + super.getTitular().getNome());
        System.out.println("Conta: " + super.getAgencia() + " " + super.getNumero());
        System.out.println("Saldo: " + super.getSaldo());
        System.out.println("=====================");
    }
}
