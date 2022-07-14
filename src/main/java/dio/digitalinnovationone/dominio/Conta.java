package dio.digitalinnovationone.dominio;

public class Conta {
    private Cliente titular;
    private String agencia;
    private String numero;
    private double saldo;

    public Conta(Cliente titular, String agencia, String numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }
    public String getAgencia() {
        return agencia;
    }
    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Saldo: " + getSaldo());
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saldo: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void extrato() {
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Conta: " + agencia + " " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("=====================");
    }
}
