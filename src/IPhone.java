public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    static String ligar;
    static String musica;
    static String url;

    public static String getMusica() {
        return musica;
    }

    public static void setMusica(String musica) {
        IPhone.musica = musica;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        IPhone.url = url;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + IPhone.musica);
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo ligação: " + IPhone.ligar);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página internet: " + IPhone.url);
    }
}