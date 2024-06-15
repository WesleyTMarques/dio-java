/* HIERARQUIA DAS EXCEÇÕES
 A linguagem Java dispões de uma variedade de classes que representam exceções, e estas classes são organizadas em uma hierarquia denominadas CHECKED AND UNCHECKED EXCEPTIONS ou Exceções Checadas e Não Checadas.

 O que determina uma exceção ser classificada com CHECADA ou NÃO CHECADA? É o risco dela ser disparada logo você precisar tratá-la, Ex:

 Vamos imanginar que precisamos realizar de duas maneiras a conversão de uma String para um número, porém o texto conta Alfanuméricos:
 */

import java.text.NumberFormat;
import java.text.ParseException;

public class HierarquiaExcecoes {
    public static void main(String[] args) {
        //Number valor = Double.valueOf("a1.75"); ou
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    
    /*EXCEÇÕES CUSTOMIZADAS
     Nós podemos criaar nossas próprias exceções baseadas em regras de negócio e assim melhor direcionar quem for utilizar os recursos desenvolvidos no projeto, exemplo:
        - Imagina que como regra de negócio, para formatar um cep necessita sempre ter 8 digitios, caso contrario lançará uma exceção que denomiamos de CepInvalidoException.
        -Primeiro criamos nossa exceção:
     */

     


    }
}
