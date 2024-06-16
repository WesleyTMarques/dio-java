import java.util.Scanner;
import java.util.Locale;

public class Contador extends Exception {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();

		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = scanner.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}

    public static class ParametrosInvalidosException extends Exception {}


	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
		
        } else{
            int contagem = parametroDois - parametroUm;

            //realizar o for para imprimir os números com base na variável contagem

            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o numero " + i);
            }
	    }
    }
}