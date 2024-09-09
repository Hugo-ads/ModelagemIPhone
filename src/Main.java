public class Main {
    public static void main(String[] args) {

        IPhone IPhone = new IPhone();
       
        System.out.println("");
        System.out.println("TELEFONE");
        IPhone.atender();
        IPhone.iniciarCorreioVoz();
        IPhone.ligar(null);

        System.out.println("");
        System.out.println("IPOD");
        IPhone.tocar();
        IPhone.pausar();
        IPhone.selecionarMusica(null);

        System.out.println("");
        System.out.println("SAFARI");
        IPhone.adicionarNovaAba();
        IPhone.atualizarPagina();
        IPhone.exibirPagina(null);
    }
}