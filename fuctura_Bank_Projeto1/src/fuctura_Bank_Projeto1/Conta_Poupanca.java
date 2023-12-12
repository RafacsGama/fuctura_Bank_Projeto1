package fuctura_Bank_Projeto1;
import java.util.Scanner;
public class Conta_Poupanca extends Contas {
	Scanner entrada = new Scanner(System.in);
	public Conta_Poupanca(int numConta, String nomeTitular, double saldoDisponivel) {
		super(numConta, nomeTitular, saldoDisponivel);
	}	

	@Override
	public void exibirDados() {
		System.out.println("Nome do titular da conta-poupança: " + Abrir_Conta.getNomeTitular());
		System.out.println("CPF do titular da conta-poupança: " + Abrir_Conta.getCpf());
	    System.out.println("Número da conta-poupança: " +getNumConta()+"-02.");//Importante observar que o dígito da conta é o tipo da conta correspondente. 			
	}

	@Override
	public void exibirSaldo() {
		 System.out.println("Saldo disponível em sua Conta-Poupança: R$" + getSaldoDisponivel());		
	}

	@Override
	public void depositar() {
		// TODO Auto-generated method stub		
	}	
	//Conta_Corrente destino são os parâmetros de destino para, nesse caso, o resgate de valores.
	public void Resgatar(Conta_Corrente destino) {
		System.out.println("Digite o valor que deseja resgatar.");
		double valor=entrada.nextDouble();
		if(valor>0 && valor<=this.getSaldoDisponivel()) {
			this.setSaldoDisponivel(getSaldoDisponivel()-valor);
			destino.setSaldoDisponivel(valor+destino.getSaldoDisponivel());
			System.out.println("R$"+valor+" foi resgatado com sucesso para a sua Conta-Corrente!");
		}else {
			System.out.println("O valor digitado é maior do que o seu saldo em conta, impossível realizar operação.");
		}
	}
}