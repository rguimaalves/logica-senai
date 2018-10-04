
package exercicios;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class Ex006ParImpar {
	public static void main(String[] args) throws InterruptedException {
		
		//Preparando a aplicação para receber o input do teclado
		InputStream entradaTeclado = System.in;
		Scanner respostaUsuario = new Scanner(entradaTeclado);
		
		//Declarando as variáveis necessárias
		int numeroMaquina = 0;
		int numeroUsuario = 0;
		String escolhaUsuario = "";
		
		//Mensagem de início
		System.out.println("Bora jogar um par ou ímpar aí, meu consagrado?");
		
		// 1) Caso a resposta seja "Sim", entramos no jogo.
		String aceite = respostaUsuario.nextLine();
		if (aceite.equalsIgnoreCase("sim") || aceite.equalsIgnoreCase("ok") || aceite.equalsIgnoreCase("blz")) {
			System.out.println("Combinado! Vamos lá!");
			
			// 3) Apenas recupera e limpa o conteúdo da resposta do usuário, 
			//    pois já sabemos o que precisamos
			
			
			System.out.println("Você quer PAR ou IMPAR?");
			
			// 4) Agora nos interessa guardar a resposta em uma variável, porque precisamos saber
			//    se ele escolheu PAR ou IMPAR no decorrer do programa
			escolhaUsuario = respostaUsuario.nextLine();
			
			// 5) Verificamos se, independente de maiusculas e minusculas graças ao método "equalsIgnoreCase", o usuário
			// escolheu PAR e exibimos uma mensagem da máquina de acordo com a escolha do usuário
			if (escolhaUsuario.equalsIgnoreCase("par")) {
				System.out.println("Vou de IMPAR, então");
			} else {
				System.out.println("Vou de PAR, então");
			}
			
			System.out.println("Escolha um número de 0 a 10");
			
			// 6) Se a resposta do usuário contiver um "int", prossiga
			if (respostaUsuario.hasNextInt()) {
				
				// 8) Recuperar a resposta do usuário
				numeroUsuario = respostaUsuario.nextInt();
				
				// 9) Gerar um número aleatório de 0 até 10 para a máquina
				numeroMaquina = new Random().nextInt(10);
				
				// 10) Pausar o programa por 1 segundo (adicionar drama...)
				Thread.sleep(1000);
				
				System.out.println("Ok! Escolhi o " + numeroMaquina);
				
				int soma = numeroUsuario + numeroMaquina;
				System.out.println("Somando tudo deu " + soma);
				
				if (soma % 2 == 0 && escolhaUsuario.equalsIgnoreCase("par")) {
					System.out.println("Você venceu!");
				} else if (soma % 2 != 0 && escolhaUsuario.equalsIgnoreCase("impar")) {
					System.out.println("Você venceu!");
				} else {
					System.out.println("Venci!");
				}
			
			// 7) Agora, caso contrário, exiba a mensagem adequada
			} else {
				System.out.println("Você não sabe brincar...");
			}
		
		// 2) Caso a resposta não seja "Sim", nos despedimos
		} else {
			System.out.println("Eu nem queria jogar mesmo!");
		}
	}
}

