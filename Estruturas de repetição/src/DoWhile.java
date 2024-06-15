/*DO WHILE
 O laço DO / WHILE (na tradução literal é "faça ... enquanto"), assim como o laço while, considera que enquanto uma determinada condição for valida o bloco de codigo será executado. Entretanto, DO / WHILE testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida no primeiro teste, o bloco será executado pelo menos uma vez.

 ex:

 João resolveu ligar para o seu amigos dizendo que hoje se entupiu de comer doces:

 */

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{ 
            System.out.println("Telefone tocando...");
        } while(tocando());

        System.out.println("Alô!!!");
    }

private static boolean tocando(){
    boolean atendeu = new Random().nextInt(3) == 1; // numero aleatório de 1 a 3 e quando for igual a 1 para.
    System.out.println("Atendeu? " + atendeu);
    //negando o ato de continuar tocando
    return ! atendeu;
}
}
