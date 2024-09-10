public class Main {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {

        IPhone IPhone = new IPhone();

        IPhone.ligar = "(11)5555-1234";
        System.out.println("");
        System.out.println("TELEFONE");
        IPhone.atender();
        IPhone.iniciarCorreioVoz();
        IPhone.ligar("");
        
        IPhone.musica = "Metallica - One";
        System.out.println("");
        System.out.println("IPOD");
        IPhone.tocar();
        IPhone.pausar();
        IPhone.selecionarMusica("");

        IPhone.url = "www.google.com.br";
        System.out.println("");
        System.out.println("SAFARI");
        IPhone.adicionarNovaAba();
        IPhone.atualizarPagina();
        IPhone.exibirPagina("");
    }
}