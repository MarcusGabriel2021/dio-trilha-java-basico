public abstract class Conta implements InterfaceConta{
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    protected static int AGENCIA_PADRAO = 1;
    public int getAgencia() { return agencia;}
    public void setAgencia(int agencia) { this.agencia = agencia;}
    public int getNumero() { return numero;}
    public void setNumero(int numero) { this.numero = numero;}
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    @Override
    public void sacar(double valor) { this.saldo -= valor; }
    @Override
    public void depositar(double valor) { this.saldo += valor; }
    @Override
    public void transferir(double valor, InterfaceConta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }
    public void extrato(){
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Numero: " + this.getNumero());
        System.out.println("Saldo: " + this.getSaldo());
    }
}
