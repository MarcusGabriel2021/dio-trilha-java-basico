public interface InterfaceConta {
    public void sacar(double valor);
    public void depositar(double valor);
    public void transferir(double valor, InterfaceConta destino);
}
