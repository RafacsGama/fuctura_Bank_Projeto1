// Classe criada para que o usuário possa registrar seus dados e salvá-los nas classes Conta_Corrente e Conta_Poupança.
// Na classe principal os métodos Abertura, InsereCPF e ContaNum devem obrigatoriamente serem invocadas, sobretudo a ContaNum,
// pois só assim será gerado um número de 4 dígitos aleatórios para ambas as contas.
package fuctura_Bank_Projeto1;
import java.util.Random;
import java.util.Scanner;
public class Abrir_Conta extends Contas{
	Scanner entrada = new Scanner(System.in);
	public Abrir_Conta(int numConta, String nomeTitular, double saldoDisponivel) {
		super(numConta, nomeTitular, saldoDisponivel);
		// TODO Auto-generated constructor stub
	}
	public void Abertura(Conta_Corrente destCC, Conta_Poupanca destCP) {
		System.out.println("Digite o seu nome:");
		String nome=entrada.nextLine();		
		this.setNomeTitular(nome);
		System.out.println("Boas vindas "+getNomeTitular());
	}
	public void InsereCPF(Conta_Corrente destCC, Conta_Poupanca destCP) {
		System.out.println("Digite o seu CPF com os pontos e o hífen:");
		String CPF=entrada.nextLine();		
		this.setCpf(CPF);
	}
	public void ContaNum(Conta_Corrente destCC, Conta_Poupanca destCP) {		
		Random random = new Random();
		int numConta=random.nextInt(9000) + 1000;		
		this.setNumConta(numConta);
	}
	//Os métodos abaixo são presentes, mas não devem ser invocados na classe principal, posto que não implementam nenhuma operação. 
	//São métodos sobrescritos da classe Contas e nesta classe Abrir_Conta não executam nada.
	@Override
	public void exibirDados() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void exibirSaldo() {
		// TODO Auto-generated method stub		
	}
	@Override
	public void depositar() {
		// TODO Auto-generated method stub		
	}
}