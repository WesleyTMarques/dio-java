public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical mus = new ReprodutorMusical();

        mus.tocar();
        mus.pausar();
        mus.selecionarMusica("Aquarela");

        AparelhoTelefonico aptel = new AparelhoTelefonico();

        aptel.atender();
        aptel.ligar("51 9 5684-5879");
        aptel.iniciarCorreioVoz();

        NavegadorInternet nint = new NavegadorInternet();

        nint.adicionarNovaAba();
        nint.atualizarPagina();
        nint.exibirPagina("www.internacional.com.br");
    }
}