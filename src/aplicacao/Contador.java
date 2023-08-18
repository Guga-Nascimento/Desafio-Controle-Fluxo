package aplicacao;

import java.util.Scanner;

import excecao.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		try {			
			contar(parametroUm,parametroDois);			
		}catch(ParametrosInvalidosException exception) {			
			System.out.println( "O segundo parâmetro deve ser maior que o primeiro");
		}			
		sc.close();

	}	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		
		if(parametroUm >= parametroDois) {			
			throw new ParametrosInvalidosException();			
		}else {			
			int contagem = parametroDois - parametroUm;
			for(int i = 1; i<contagem; i++) {
				System.out.print(i + ", ");
			}
			System.out.print(contagem);						
		}
	}

}
