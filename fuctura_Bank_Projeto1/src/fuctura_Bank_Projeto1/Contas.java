//Como requisito do projeto a classe Contas é abstrata, define o comportamento e os métodos que devem constar nas classes filhas.
// Na classe Contas são implementados conceitos de classe abstrata, metodos construtores, abstratos e estáticos.
package fuctura_Bank_Projeto1;

public abstract class Contas {	
	private static int numConta;
	private static String nomeTitular;
	private static String cpf;
	private double saldoDisponivel;
	
	public Contas(Integer numConta,String nomeTitular,double saldoDisponivel) {
		Contas.nomeTitular=nomeTitular;
		Contas.numConta=numConta;
		this.saldoDisponivel=saldoDisponivel;
	}
	public static int getNumConta() {
		return numConta;
	}
	//O método static é definido para que a classe Abrir_conta possa definir os valores de numero de conta..
	public void setNumConta(int numConta) {
		Contas.numConta = numConta;
	}
	public static String getNomeTitular() {
		return nomeTitular;
	}
	//O método static é definido para que a classe Abrir_conta possa definir os valores do nome do titular.
	public void setNomeTitular(String nomeTitular) {
		Contas.nomeTitular = nomeTitular;
	}
	public static String getCpf() {
		return cpf;
	}
	//O mesmo acontece com o CPF do usuário.
	public void setCpf(String cpf) {
		Contas.cpf = cpf;
	}	
	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}
	public void setSaldoDisponivel(double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}				
	public abstract void exibirDados();
	public abstract void exibirSaldo();
	public abstract void depositar(); // estes 3 métodos abstratos devem ser instanciados nas classes filhas definindo o que elas fazem.
}