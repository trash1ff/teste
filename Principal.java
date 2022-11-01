import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Conta c1 = new Conta(1,"Poupança","Jailson",2000);
		Conta c2 = new Conta(2,"Poupança","Jair",2000);
		Conta c3 = new Conta(3,"Poupança","Lula",2000);
		
		Scanner entradax = new Scanner(System.in);
		System.out.println("Escolha a Conta: (1) , (2) ou (3) !");
		int numerox = entradax.nextInt();
		switch(numerox){
		case 1:
			System.out.println(c1.getDescricao());
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Escolha a opção: Saque(1) ou Deposito(2) !");
			int numero = entrada.nextInt();
			switch(numero){
				case 1:
			       System.out.println("Opção Escolhida: Saque !");
			       
			       System.out.println("Digite o valor do Saque: ");
			       c1.saque = scan.nextDouble();
			       
			       if(c1.saque > c1.saldo){
			    	   System.out.println("Você não tem Dinheiro o Suficiente!");
			    	   
			       }
			       
			       if(c1.saque <= c1.saldo){
			       c1.getSaque();
			       System.out.println("Olá " + c1.nome + " voçê fez um saque de: " +c1.saque+ " Resta em sua conta: " +c1.saldo + " R$.");
			       }
			       break;
			       
			       
			       
			     case 2:
			       System.out.println("Opção Escolhida: Deposito !");
			       
			       System.out.println("Digite o valor do Deposito: ");
			       c1.deposito = scan.nextDouble();
			       
			       if(c1.deposito <= 0) {
			    	   System.out.println("O deposito não pode ser menor ou igual a 0 R$");
			    	   
			       }
			       
			       if(c1.deposito > 0){
			       c1.getDeposito();
			       System.out.println("Olá " + c1.nome + " voçê fez um Deposito de: " +c1.deposito+ " Possui em sua conta: " +c1.saldo + " R$.");
			       }
			       break;
			       
			     default:
			         System.out.println("Opção Invalida ! Escolha a opção: Saque(1) ou Deposito(2) !");
			         
			         
			}
			break;
			
			case 2:
				System.out.println(c2.getDescricao());
				
				Scanner entradaxx = new Scanner(System.in);
				System.out.println("Escolha a opção: Saque(1) ou Deposito(2) !");
				int numeroxx = entradaxx.nextInt();
				switch(numeroxx){
					case 1:
				       System.out.println("Opção Escolhida: Saque !");
				       
				       System.out.println("Digite o valor do Saque: ");
				       c2.saque = scan.nextDouble();
				       
				       if(c2.saque > c2.saldo){
				    	   System.out.println("Você não tem Dinheiro o Suficiente!");
				    	   
				       }
				       
				       if(c2.saque <= c2.saldo){
				       c2.getSaque();
				       System.out.println("Olá " + c2.nome + " voçê fez um saque de: " +c2.saque+ " Resta em sua conta: " +c2.saldo + " R$.");
				       }
				       break;
				       
				       
				       
				     case 2:
				       System.out.println("Opção Escolhida: Deposito !");
				       
				       System.out.println("Digite o valor do Deposito: ");
				       c2.deposito = scan.nextDouble();
				       
				       if(c2.deposito <= 0) {
				    	   System.out.println("O deposito não pode ser menor ou igual a 0 R$");
				    	   
				       }
				       
				       if(c2.deposito > 0){
				       c2.getDeposito();
				       System.out.println("Olá " + c2.nome + " voçê fez um Deposito de: " +c2.deposito+ " Possui em sua conta: " +c2.saldo + " R$.");
				       }
				       break;
				       
				     default:
				         System.out.println("Opção Invalida ! Escolha a opção: Saque(1) ou Deposito(2) !");
				         
				         
				}
				break;
				
				case 3:
					System.out.println(c3.getDescricao());
					
					Scanner entradaxxx = new Scanner(System.in);
					System.out.println("Escolha a opção: Saque(1) ou Deposito(2) !");
					int numeroxxx = entradaxxx.nextInt();
					switch(numeroxxx){
						case 1:
					       System.out.println("Opção Escolhida: Saque !");
					       
					       System.out.println("Digite o valor do Saque: ");
					       c3.saque = scan.nextDouble();
					       
					       if(c3.saque > c3.saldo){
					    	   System.out.println("Você não tem Dinheiro o Suficiente!");
					    	   
					       }
					       
					       if(c3.saque <= c3.saldo){
					       c3.getSaque();
					       System.out.println("Olá " + c3.nome + " voçê fez um saque de: " +c3.saque+ " Resta em sua conta: " +c3.saldo + " R$.");
					       }
					       break;
					       
					       
					       
					     case 2:
					       System.out.println("Opção Escolhida: Deposito !");
					       
					       System.out.println("Digite o valor do Deposito: ");
					       c3.deposito = scan.nextDouble();
					       
					       if(c3.deposito <= 0) {
					    	   System.out.println("O deposito não pode ser menor ou igual a 0 R$");
					    	   
					       }
					       
					       if(c3.deposito > 0){
					       c3.getDeposito();
					       System.out.println("Olá " + c3.nome + " voçê fez um Deposito de: " +c3.deposito+ " Possui em sua conta: " +c3.saldo + " R$.");
					       }
					       break;
					       
					     default:
					         System.out.println("Opção Invalida ! Escolha a opção: Saque(1) ou Deposito(2) !");
					         
					         
					}
					break;
			
		}
		
		
		
			
	}
	
}

