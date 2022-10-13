
public class ContaBanco {
	
	
	//---atributo
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public void estadoAtual(){
		
		System.out.println("===============================================");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status " + this.getStatus());

	}


	//METODOS E PROCEDIMENTOS
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {this.setSaldo(50); 
		} else if  (t == "CP") {this.setSaldo(150);}
		System.out.println("CONTA ABERTA COM SUCESSO");
	}


	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("CONTA COM DINHEIRO");
		} else if (this.getSaldo() < 0 ) {
			System.out.println("CONTA EM DEVENDO DINHEIRO");
		} else {this.setStatus(false);
		System.out.println("CONTA FECHADA COM SUCESSO");
		}
	}
	public float depositar(float v) {

		
		if (getStatus()){
			//this.saldo = (this.saldo + v); aqui mexe direto na variavel
			this.setSaldo(this.getSaldo() + v);//aqui não pois ultiliza get e set
			System.out.println("Deposito realizado na conta de " + this.getDono());
		} else {
			System.out.println("IMPOSSIVEL DEPOSITAR EM CONTA FECHADA");
		}
		return v;
	}
	public float sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v );
				System.out.println("Saldo realizado na conta de " + this.getDono());
			} else {
				System.out.println("SALDO INSUFICIENTE");
			}
		} else {
			System.out.println("IMPOSSIVEL SACAR");
		}
		return v;
	}
	public void pagarMensal() {
		  int v = 0;
		  if (this.getTipo() == "CC") {
			  v = 12;
		  } else if (this.getTipo() == "CP"){
			  v = 20;
		  }
		  if (this.getStatus()) {
			  this.setSaldo(this.getSaldo() - v ); 
				System.out.println("Mensalidade paga com sucesso pelo " + this.getDono());  
			  } else {
			  System.out.println("IMPOSSIVEL PAGAR UMA CONTA FECHADA");
		  }
	}
	
	//MÉTODOS ESPECIAIS
	public void ContaBanco( float saldo, boolean status ) {
		saldo = 0;
		status = false;
	}
	

	

	public ContaBanco(){//metodo construtor
		this.saldo = 0;
		this.status = false;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
