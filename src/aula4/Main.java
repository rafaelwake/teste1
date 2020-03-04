package aula4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		String name;
		app.start();


	}
	
	Scanner scanner = new Scanner(System.in);


	private void start() {
		// TODO Auto-generated method stub
		System.out.print("Digite a idade: ");
		int idade = scanner.nextInt();
		
		if(idade > 20) {
			System.out.println("Idade maior que 20");
		} else if(idade > 12 && idade <17) {
			System.out.println("Idade maior que 12 e menor que 17");
		} else if(idade > 19 && idade <5) {
			System.out.println("Idade maior que 12 e menor que 17");
		} else {
			System.out.println("Outras combinações");
		}
		
	}


}
