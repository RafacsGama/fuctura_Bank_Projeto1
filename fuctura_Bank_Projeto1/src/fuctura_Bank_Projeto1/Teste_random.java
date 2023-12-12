package fuctura_Bank_Projeto1;
import java.util.Random;

public class Teste_random {

	public static void main(String[] args) {
		 Random random = new Random();
	        int numeroAleatorio = random.nextInt(9000) + 1000;
	        System.out.println("Número aleatório de 4 dígitos: " + numeroAleatorio);
	}

}