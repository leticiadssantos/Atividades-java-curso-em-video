package edu.cursoemvideo.aula07;

	
	public class Lutador{
		
		// ATRIBUTOS
		private String nome;
		private String nacionalide;
		private int idade;
		private float altura;
		private float peso;
		private String categoria;
		private int vitorias, derrotas, empates;
		
		
		
		// MÉTODOS PÚBLICOS
		
		public void apresentar() {
			System.out.println("========================================================");
			System.out.println("CHEGOU A HORA!  Apresentamos o lutador " + this.getNome());
			System.out.println("Diretamente de " + this.getNacionalide());
			System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura());
			System.out.println("Pesando " + this.getPeso() + "Kg");
			System.out.println(this.getVitorias() + " vitórias");
			System.out.println(this.getDerrotas() + " Derrotas");
			System.out.println(this.getEmpates() + " Empates");
			
		}
		public void status() {
			System.out.println(this.getNome() + " é um peso " + this.getCategoria());
			System.out.println("Ganhou! " + this.getVitorias() + " vezes ");
			System.out.println("Perdeu! " + this.getDerrotas() + " vezes ");
			System.out.println("Empatou " + this.getEmpates() + "vezes ");
			
		}
		public void ganharLuta() {
			this.setVitorias(this.getVitorias() + 1);
			
		}
		public void perderLuta () {
			this.setDerrotas(this.getDerrotas() + 1);
			
		}
		public void empaterLuta() {
			this.setEmpates(this.getEmpates() + 1);
			
		}
		
		
		
		
		
		// MÉTODOS ESPECIAIS
		
		public Lutador(String no, String nacionalide, int idade, float altura, float peso, String categoria, int vitorias,
				int derrotas, int empates) {
			super();
			this.nome = no;
			this.nacionalide = nacionalide;
			this.idade = idade;
			this.altura = altura;
			this.peso = peso;
			this.categoria = categoria;
			this.vitorias = vitorias;
			this.derrotas = derrotas;
			this.empates = empates;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNacionalide() {
			return nacionalide;
		}
		public void setNacionalide(String nacionalide) {
			this.nacionalide = nacionalide;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public float getAltura() {
			return altura;
		}
		public void setAltura(float altura) {
			this.altura = altura;
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso(float peso) {
			this.setCategoria();
		}
		public String getCategoria() {
			return categoria;
		}
		private void setCategoria() {
			if (this.peso < 52.2) {
				this.categoria = "invalido";
				
			} else if (this.peso <= 70.3) {
				this.categoria = "leve";
			} else if (this.peso <= 83.9) {
				this.categoria = "médio";
			} else if (this.peso <= 120.2) {
				this.categoria = "pesado";
			} else {
				this.categoria = "invalido";
			}
		}
		
		
		public int getVitorias() {
			return vitorias;
		}
		public void setVitorias(int vitorias) {
			this.vitorias = vitorias;
		}
		public int getDerrotas() {
			return derrotas;
		}
		public void setDerrotas(int derrotas) {
			this.derrotas = derrotas;
		}
		public int getEmpates() {
			return empates;
		}
		public void setEmpates(int empates) {
			this.empates = empates;
		}

	}
