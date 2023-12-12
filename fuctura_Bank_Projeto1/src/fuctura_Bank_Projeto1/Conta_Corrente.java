package fuctura_Bank_Projeto1;
import java.util.Scanner;
public class Conta_Corrente extends Contas {
		Scanner entrada = new Scanner(System.in);
		public Conta_Corrente(int numConta, String nomeTitular, double saldoDisponivel) {
		super(numConta, nomeTitular, saldoDisponivel);
	}
		@Override
		public void exibirDados() {
			System.out.println("Nome do titular da conta-corrente: " + Abrir_Conta.getNomeTitular());
			System.out.println("CPF do titular da conta-corrente: " + Abrir_Conta.getCpf());
		    System.out.println("Número da conta-corrente: " + getNumConta()+"-01."); //Importante observar que o dígito da conta é o tipo da conta correspondente.	
		    //Sobrescrita do método adicionando os dados correspondentes a conta-corrente. Os 3 métodos aqui são publicos estáticos, é preciso que sejam assim.
		}

		@Override
		public void exibirSaldo() {
			 System.out.println("Saldo disponível em sua Conta-Corrente: R$" + getSaldoDisponivel());			
		}

		@Override
		public void depositar() {
			System.out.println("Digite o valor que deseja depositar em sua Conta-Corrente.:");
			double valor=entrada.nextDouble();			
				setSaldoDisponivel(getSaldoDisponivel() + valor);
				System.out.println("Depósito realizado com sucesso!");					
		}
		//Os métodos abaixo definem os saques e depósitos na conta-corrente do usuário.
		public void Sacar() {
			System.out.println("Digite o valor que deseja sacar:");
			double valor=entrada.nextDouble();
			if(valor >0 && valor<=getSaldoDisponivel()) {
				setSaldoDisponivel(getSaldoDisponivel()-valor);
				System.out.println("Saque realizado com sucesso.");
			}else {
				System.out.println("Seu saldo é insuficiente.");
			}
		}
		//Conforme requisito do projeto, ao implementar o método abaixo Conta_Poupanca destino servem como parâmetros para a adição do valor na CP 
		// que foi retirado da CC.
		public void Aplicar(Conta_Poupanca destino) {
			System.out.println("Digite o valor que deseja aplicar na Conta-Poupança:");
			double valor=entrada.nextDouble();
			if(valor>0 && valor<=this.getSaldoDisponivel()) {
				this.setSaldoDisponivel(getSaldoDisponivel()-valor);
				destino.setSaldoDisponivel(valor+destino.getSaldoDisponivel());
				setSaldoDisponivel(getSaldoDisponivel());
				System.out.println("R$"+valor+" foi aplicado com sucesso em sua conta-poupança!");
			}else {
				System.out.println("O valor digitado é maior do que o seu saldo em conta, impossível realizar operação.");
			}
		}	
}