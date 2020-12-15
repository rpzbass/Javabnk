package entities;

public class Conta {

	private int _conta;
	private String _titular;
	private double _valor;
	

	// Method Constructor
	public Conta() {

		this._valor = 0;
		this._conta = 0;
	}

	// Access Method
	public int getConta() {

		return this._conta;

	}

	// Methods Rules Software
	public void setConta(int conta) {

		if (this._conta == 0) {

			this._conta = conta;
		}

	}

	public String getTitular() {

		return this._titular;
	}

	public void setTitular(String titular) {

		this._titular = titular;

	}
	
	
	
	public void AddMoney(double money) {

		this._valor += money;

	}

	public void RemMoney(double money) {

		if(this._valor >= money) {
		
		this._valor -= ((money)+5);
		}else {
			
			System.out.println("--------------------- \n" 
							  + "Insufficient funds !!!\n"
					          + "----------------------\n");
		}
		
	}

	public double balanceView() {

		return this._valor;
	}

	public void mainShow() {
		
		System.out.println("--------------------------------------------------\n"
						+ "|	            BANK JAVA	                  | \n"
						+ "|                                                 | \n"
						+ "---------------------------------------------------\n");
		
	}
	

	public String toString() {
		
		return "Account data \n"
			   + "Account : "
			   + this.getConta()
			   + ", Holder: "
			   + this.getTitular()       
			   +      " , Balance: $"
			   + String.format("%.2f",this.balanceView());
			   
	}






}
