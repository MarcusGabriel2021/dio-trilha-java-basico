public class ContaCorrente extends Conta{
    private static int SEQUENCIAL = 1;
    public ContaCorrente(String nomeCliente){
        super.setAgencia(Conta.AGENCIA_PADRAO);
        super.setNumero(SEQUENCIAL++);
        super.setCliente(new Cliente(nomeCliente));
    }
    @Override
    public void extrato() {
        System.out.println("--- CC ---");
        super.extrato();
    }
}
