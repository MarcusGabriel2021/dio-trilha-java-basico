public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente("João");
        Conta contaPoupanca = new ContaPoupanca("João");

        contaCorrente.depositar(1000);
        contaCorrente.transferir(200, contaPoupanca);

        contaCorrente.extrato();
        contaPoupanca.extrato();

    }
}
