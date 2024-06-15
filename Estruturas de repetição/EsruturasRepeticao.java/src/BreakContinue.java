/*Break e continue
 Break significa quebrar, parar, frear, interromper. E é isso que se faz quando Java encontra esse comando pela frente. Continue, como o nome já diz, ele 'continua' o laço. O comando BREAK interrompe o laço, já o CONTINUE interrompe somente a iteração atual.
*/

public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if (numero == 3) {
                break; // apresenta no print 1 e 2
                //continue;  apresenta no print 1, 2, 4 e 5
            }

            System.out.println(numero);
        }
    }    
}
