import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Main {

    public static void main(String[] args) {

        //Singleton
        SingletonLazy sl = SingletonLazy.getInstance();
        SingletonEager se = SingletonEager.getInstance();
        SingletonLazyHolder slh = SingletonLazyHolder.getInstance();

//        System.out.println(sl);
//        System.out.println(se);
//        System.out.println(slh);

        //Strategy
//        Robo rb = new Robo();
//        ComportamentoNormal normal = new ComportamentoNormal();
//        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();

//        rb.setComportamento(normal);
//        rb.mover();

//        rb.setComportamento(defensivo);
//        rb.mover();
        //Facade
        Facade facede = new Facade();
        facede.migrarCliente("João", "23456-123");

    }

}
