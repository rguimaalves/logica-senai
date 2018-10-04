
package exercicios;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class Ex006ParImpar {
	public static void main(String[] args) throws InterruptedException {
		
		//Preparando a aplica��o para receber o input do teclado
		InputStream entradaTeclado = System.in;
		Scanner respostaUsuario = new Scanner(entradaTeclado);
		
		//Declarando as vari�veis necess�rias
		int numeroMaquina = 0;
		int numeroUsuario = 0;
		String escolhaUsuario = "";
		
		//Mensagem de in�cio
		System.out.println("Bora jogar um par ou �mpar a�, meu consagrado?");
		
		// 1) Caso a resposta seja "Sim", entramos no jogo.
		String aceite = respostaUsuario.nextLine();
		if (aceite.equalsIgnoreCase("sim") || aceite.equalsIgnoreCase("ok") || aceite.equalsIgnoreCase("blz")) {
			System.out.println("Combinado! Vamos l�!");
			
			// 3) Apenas recupera e limpa o conte�do da resposta do usu�rio, 
			//    pois j� sabemos o que precisamos
			
			
			System.out.println("Voc� quer PAR ou IMPAR?");
			
			// 4) Agora nos interessa guardar a resposta em uma vari�vel, porque precisamos saber
			//    se ele escolheu PAR ou IMPAR no decorrer do programa
			escolhaUsuario = respostaUsuario.nextLine();
			
			// 5) Verificamos se, independente de maiusculas e minusculas gra�as ao m�todo "equalsIgnoreCase", o usu�rio
			// escolheu PAR e exibimos uma mensagem da m�quina de acordo com a escolha do usu�rio
			if (escolhaUsuario.equalsIgnoreCase("par")) {
				System.out.println("Vou de IMPAR, ent�o");
			} else {
				System.out.println("Vou de PAR, ent�o");
			}
			
			System.out.println("Escolha um n�mero de 0 a 10");
			
			// 6) Se a resposta do usu�rio contiver um "int", prossiga
			if (respostaUsuario.hasNextInt()) {
				
				// 8) Recuperar a resposta do usu�rio
				numeroUsuario = respostaUsuario.nextInt();
				
				// 9) Gerar um n�mero aleat�rio de 0 at� 10 para a m�quina
				numeroMaquina = new Random().nextInt(10);
				
				// 10) Pausar o programa por 1 segundo (adicionar drama...)
				Thread.sleep(1000);
				
				System.out.println("Ok! Escolhi o " + numeroMaquina);
				
				int soma = numeroUsuario + numeroMaquina;
				System.out.println("Somando tudo deu " + soma);
				
				if (soma % 2 == 0 && escolhaUsuario.equalsIgnoreCase("par")) {
					System.out.println("Voc� venceu!");
				} else if (soma % 2 != 0 && escolhaUsuario.equalsIgnoreCase("impar")) {
					System.out.println("Voc� venceu!");
				} else {
					System.out.println("Venci!");
				}
			
			// 7) Agora, caso contr�rio, exiba a mensagem adequada
			} else {
				System.out.println("Voc� n�o sabe brincar...");
			}
		
		// 2) Caso a resposta n�o seja "Sim", nos despedimos
		} else {
			System.out.println("Eu nem queria jogar mesmo!");
		}
	}
}

