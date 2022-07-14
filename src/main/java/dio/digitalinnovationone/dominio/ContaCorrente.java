package dio.digitalinnovationone.dominio;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(Cliente titular, String agencia, String numero) {
        super(titular, agencia, numero);
        chequeEspecial = 1500.00;
    }

    @Override
    public void depositar(double valor) {
        if(this.chequeEspecial == 1500.00){
            super.depositar(valor);
        } else {
            super.depositar(valor - (1500.00 - this.chequeEspecial));
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= super.getSaldo()){
            super.sacar(valor);
        } else if (valor <= super.getSaldo() + chequeEspecial) {
            chequeEspecial = valor - super.getSaldo();
            super.setSaldo(0.0);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void extrato() {
        System.out.println("Titular: " + super.getTitular().getNome());
        System.out.println("Conta: " + super.getAgencia() + " " + super.getNumero());
        System.out.println("Saldo: " + super.getSaldo());
        System.out.println("Cheque Especial: " + chequeEspecial);
        System.out.println("=====================");
    }
}
