package fuctura_Bank_Projeto1;
import java.util.Scanner;
public class Principal_PRJ {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Conta_Corrente cc = new Conta_Corrente(0, null, 0);
		Conta_Poupanca cp = new Conta_Poupanca(0, null, 0);
		Abrir_Conta ac = new Abrir_Conta(0, null, 0);
		int option;
		int opcao;
		do {
			System.out.println(
					  "------------------------------------------"
					+ "\n|-------Saudações do Fuctura Bank.-------|"
					+ "\n|-----O seu banco digital do futuro!-----|"
					+ "\n|-------Escolha uma das operações:-------|"
					+ "\n|----------------------------------------|"
					+ "\n|       Operação 1 - Criar Conta         |"
					+ "\n|    Operação 2 - Logar em sua conta     |"
					+ "\n|          Operação 3 - Sair             |"
					+ "\n------------------------------------------");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
				ac.Abertura(cc, cp);//Configuração do nome do usuário.
				ac.InsereCPF(cc, cp);//Configura o CPF.
				ac.ContaNum(cc, cp);//Cria um número aleatório da conta do usuário.
				System.out.println(
						  "----------------------------------------"
						+ "\n|------Conta criada com sucesso!-------|"
						+ "\n|---Parabéns e bem-vindo ao futuro!----|"
						+ "\n|--Faça seu primeiro depósito e comece-|"
						+ "\n|-------a aproveitar o mundo que-------|"
						+ "\n|-------------está por vir-------------|"
						+ "\n----------------------------------------");
				cc.depositar();
					do {			
						System.out.println(
								  		  "----------------------------------------"
										+ "\n|----Este é o seu menu de operações.---|"
										+ "\n|   Digite o número correspondente à   |"
										+ "\n|           operação desejada.         |"
										+ "\n|---1. Exibir perfil Conta-Corrente.---|"
										+ "\n|---2. Exibir perfil Conta-Poupança.---|"
										+ "\n|---3. Mostrar saldo Conta-Corrente.---|"
										+ "\n|---4. Mostrar Saldo Conta-Poupança.---|"
										+ "\n|----5. Depositar na Conta-Corrente.---|"
										+ "\n|----------6. Sacar valores.-----------|"
										+ "\n|---------7. Aplicar valores.----------|"
										+ "\n|---------8. Resgatar valores.---------|"
										+ "\n|---------------9. Sair.---------------|"
										+ "\n----------------------------------------");
						option=entrada.nextInt();
						switch(option) {
						case 1:
							cc.exibirDados();
							break;
						case 2:
							cp.exibirDados();
							break;
						case 3:
							cc.exibirSaldo();
							break;
						case 4:
							cp.exibirSaldo();
							break;
						case 5:
							cc.depositar();
							break;
						case 6:
							cc.Sacar();
							break;
						case 7:
							cc.Aplicar(cp);
							break;
						case 8:
							cp.Resgatar(cc);
							break;
						case 9:
							System.out.println("Nos veremos em breve...");
							break;
							default:
								System.out.println("Digite uma opção válida.");
							break;
						}
					}while(option!=9);
			break;
		case 2:
			do {			
				System.out.println(
						  		  "----------------------------------------"
								+ "\n|----Este é o seu menu de operações.---|"
								+ "\n|   Digite o número correspondente à   |"
								+ "\n|           operação desejada.         |"
								+ "\n|---1. Exibir perfil Conta-Corrente.---|"
								+ "\n|---2. Exibir perfil Conta-Poupança.---|"
								+ "\n|---3. Mostrar saldo Conta-Corrente.---|"
								+ "\n|---4. Mostrar Saldo Conta-Poupança.---|"
								+ "\n|----5. Depositar na Conta-Corrente.---|"
								+ "\n|----------6. Sacar valores.-----------|"
								+ "\n|---------7. Aplicar valores.----------|"
								+ "\n|---------8. Resgatar valores.---------|"
								+ "\n|---------------9. Sair.---------------|"
								+ "\n----------------------------------------");
				option=entrada.nextInt();
				switch(option) {
				case 1:
					cc.exibirDados();
					break;
				case 2:
					cp.exibirDados();
					break;
				case 3:
					cc.exibirSaldo();
					break;
				case 4:
					cp.exibirSaldo();
					break;
				case 5:
					cc.depositar();
					break;
				case 6:
					cc.Sacar();
					break;
				case 7:
					cc.Aplicar(cp);
					break;
				case 8:
					cp.Resgatar(cc);
					break;
				case 9:
					System.out.println("Nos veremos em breve...");
					break;
					default:
						System.out.println("Digite uma opção válida.");
					break;
				}
			}while(option!=9);
	break;
		case 3:
			System.out.println("Agradecemos sua visita, volte sempre.");
			break;
			default:
				System.out.println("Insira um valor válido.");			
			}			
		}while(opcao!=3);				
	}
}