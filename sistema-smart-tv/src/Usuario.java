public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume:" + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Volume:" + smartTv.volume);

        smartTv.proximoCanal();
        smartTv.diminuirVolume();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume:" + smartTv.volume);

    }
}
