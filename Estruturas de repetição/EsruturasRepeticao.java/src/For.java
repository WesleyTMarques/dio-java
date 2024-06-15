/*Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes

Laços ou repetições são representados pelas seguintes estruturas:
    - For (para)
    - While (enquanto)
    - Do While (faça enquanto)

FOR
 O comando FOR (na tradução literal para a lingua portuguesa "Para") permite que uma variavel contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comar FOR recebe como entrada uma variavel contadora, a condição e o valor de incrementação.

 ex: 
    Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos para pegar no sono:
 */



public class For {
    public static void main(String[] args) {
        // for (int carneirinho = 1; carneirinho <= 20; carneirinho++){
        //     System.out.println("Contando carneirinhos: " + carneirinho);
        // }
        
        // System.out.println("João dormiu.");

        /*Também usamos o controle de fluxo FOR par interagir sobre arrays e coleções: */

        String alunos [] = {"Wesley", "Jheniffer", "Maria", "Henrique"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no indice " + i + " é: " + alunos[i]);
        }

        /*O uso do FOR / EACH está fortemente relacionado com um cenario onde contenha um array ou coleção, e assim, a interação é baseada aos elementos da coleção. */

        String alunos2 [] = {"Wesley", "Jheniffer", "Maria", "Henrique"};

        for (String aluno : alunos2) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
