/*WHILE
 Olaço WHILE (na tradução literal, quer dizer "enquanto") determina que enquanto uma condação for valida, o bloco de código será executado. O laço WHILE testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

 João recebeu R$50,00 de mesada e foi em uma loja de doces gastar todo seu dinheiro, logo, enquanto o valor dos doces não igualar a R$50,00 ele foi adicionando itens no carrinho:
 */


  import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void main(String[] args) throws Exception {
        double mesada = 50.00;

        while (mesada > 0 ) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Jão gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
