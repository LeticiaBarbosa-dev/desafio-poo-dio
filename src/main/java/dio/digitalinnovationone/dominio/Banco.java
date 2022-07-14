package dio.digitalinnovationone.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Banco {
    private String nome;
    private String agencia;

    private String numero;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.agencia = String.valueOf(new Random().nextInt(150 - 1) + 1);
        this.numero = String.valueOf(new Random().nextInt());
        this.contas = new ArrayList<Conta>();
    }

    public String getNome() {
        return nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Conta criarContaPoupanca(Cliente titular) {
        Conta contaPoupanca = new ContaPoupanca(titular, agencia, numero);
        contas.add(contaPoupanca);
        return contaPoupanca;
    }

    public Conta criarContaCorrente(Cliente titular) {
        Conta contaCorrente = new ContaPoupanca(titular, agencia, numero);
        contas.add(contaCorrente);
        return contaCorrente;
    }

    public void listarContas() {
        if(contas != null && !contas.isEmpty()) {
            for (Conta c: contas) {
                if(c instanceof ContaPoupanca) {
                    System.out.println("Tipo da Conta: Conta Poupanca");
                } else if(c instanceof ContaCorrente) {
                    System.out.println("Tipo da Conta: Conta Corrente");
                }
                System.out.println("Titular: "+c.getTitular().getNome());
                System.out.println("Conta: "+c.getAgencia()+" "+ c.getNumero());
                System.out.println("=====================");
            }
        } else {
            System.out.println("Sem registros");
        }
    }
}
