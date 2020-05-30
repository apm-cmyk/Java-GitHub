package entities;


public class Cliente {
	
	//atributos da classe
	
	private String name;
	private double depositoInicial;
	private Integer numConta;
	private double deposito;
	private double saque;
	private double saldo;
	private String YN;
	
	//construtor da classe cliente 
	public Cliente(String name, double depositoInicial, Integer numConta) {
		super();
		this.name = name;
		this.depositoInicial = depositoInicial;
		this.numConta = numConta;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}


	public Integer getNumConta() {
		return numConta;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	// Metodos da classe
	
	//Metodo cadastrar nova conta no banco
	public void cadastroConta() {
		System.out.printf("Número da conta: %d%n", numConta);
		System.out.println("Nome do cliente: " +name);
		
		YN = "X";
		while(YN == "X") {
		System.out.println("Tem depósito inicial(y/n)"+ YN);
		YN.toUpperCase();
		
		
		if (YN == "Y") {
			System.out.println("Valor inicial deposito"+ depositoInicial);
			saldo = depositoInicial;
		}
		if (YN == "N"){
			depositoInicial = 0;
			saldo = 0;
		}else{
			System.out.println("Valor inválido!");
			YN = "X";
		}
		
		}
		
		System.out.printf("Conta criada com sucesso! %n Número conta:" +numConta+ "%nNome do cliente: " +name+ "%nDeposito Incial: "+depositoInicial);
	}
	
	//Metodo deposito
	

	
	//Metodo saque
	


}
