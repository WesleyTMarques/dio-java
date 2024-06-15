/* ESTRUTURA EXCEPCIONAIS
 EXCEÇÕES
 Ao executar o código java, diferentes erros podem acontecer: erros de codificação feito pelo programador, erros devido a entrada errada ou imprevistos.

 Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançará uma EXCEÇÃO(jogará um erro).

 De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente, Já exceções é um fluxo inesperado da nossa aplicação, exemplo: Querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão de banco com usuario ou senha invalida. Todos estes cenários e os demais não são errors, mas sim fluxos não previstos pela aplicação.

 É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o que denominamos de TRATAMENTO DE EXCEÇÕES.

 MÃO NA MASSA
 Vamos trazer o cenário que estudamos na aula sobre Terminal e Argumentos onde via terminal informamos alguns dados pessoais.
 */

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é  " + altura + "cm ");
        } 
        catch(InputMismatchException e){
            System.out.println("Os campos de idade e altura devem ser numéricos e altura deve ser com ponto para separar");
        }
    }

    /*Aparentemente é um programa simples, mas vamos listar alguns possiveis exeções que podem acontecer.
        - Não informar o nome e sobrenome
        - O valor da idade ter um caractere não numérico
        - O valor da altura ter uma vírgula ou inves de ser um ponto (conforme padrão americano)
     */
}