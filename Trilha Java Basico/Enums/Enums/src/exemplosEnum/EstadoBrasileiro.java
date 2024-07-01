/* Enum é um tipo especial de classe onde os objetos são previamente criados,
 * imutáveis e disponíveis por toda aplicação.
 * 
 * Usamos Enum quando o nosso modelo de negócio contém objeto de mes contexto que
 * já existem de pré-estabelecida com a certeza de não haver tanta alterações de
 * valores.
 * 
 * Ex.:
 * Grau de Escolaridade: Anlfabeto, Fundamental, Médio, Superior.
 * Estado Civil: Solteiro, Casado, Divorciado, Viúvo.
 * Estados Brasileiros: São Paulo. Rio de Janeiro Rio Grande do Sul, Maranhão.
 * 
 * NÃO CONFUNDA UMA LISTA DE CONSTANTES COM UM ENUM.
 * 
 * Enquanto que uma constante é uma variável de tipo com valor imutável, um enum
 * é um conjunto de objetos já pré-definidos na aplicação.
 * 
 * Como um enum é um conjunto de objetos, logo, estes objetos podem conter
 * atributos e métodos.
 * 
 * Criando o enum EstadoBrasileiro para ser usado em toda aplicação
 * 
 * */

package exemplosEnum;


public enum EstadoBrasileiro{
	SAO_PAULO ("SP","São Paulo", 1),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 2),
	RIO_GRANDE_SUL ("RS", "Rio Grande do Sul", 3),
	MARANHAO ("MA", "Maranhão", 4),
	SANTA_CATARINA ("SC", "Santa Catarina", 5)
	;
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	
	public int getIbge() {
		return ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}