public class ContaPoupanca extends Conta{
    private static int SEQUENCIAL = 1;
    public ContaPoupanca(String nomeCliente){
        super.setAgencia(Conta.AGENCIA_PADRAO);
        super.setNumero(SEQUENCIAL++);
        super.setCliente(new Cliente(nomeCliente));
    }
    @Override
    public void extrato() {
        System.out.println("--- CP ---");
        super.extrato();
    }
}
