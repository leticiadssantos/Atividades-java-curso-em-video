package edu.cursoemvideo.aula06;

	public class ControleRemoto implements Controlador {
		//ATRIBUTOS
		private int volume;
		private boolean ligado;
		private boolean tocando;
		
		
		//MÉTODOS ESPECIAIS
		public ControleRemoto() {
			this.volume = 50;
			this.ligado = true;
			this.tocando = false;
		}

		private int getVolume() {
			return volume;
		}

		private void setVolume(int volume) {
			this.volume = volume;
		}

	private boolean getLigado() {
			return ligado;
		}

	private void setLigado(boolean ligado) {
			this.ligado = ligado;
		}

		private boolean getTocando() {
			return tocando;
		}

	private void setTocando(boolean tocando) {
			this.tocando = tocando;
		}
		
		
	//METODOS ABSTRATOS
		@Override // significa sobreescrever o que ja foi escrito. 
		public void ligar() {
			
			this.setLigado(true);
			
		}

		@Override
		public void desligar() {
		
			this.setLigado(false);
			
		}
																																																									
		@Override
		public void abrirMenu() {
			
			System.out.println("------------menu---------------");
			System.out.println("Está ligado? " + this.getLigado());
			System.out.println("Está tocando? " + this.getTocando());
			System.out.println("Volume: " + this.getVolume());
			for (int i = 0; i <= this.getVolume(); i+=10 ) {
				System.out.println("[]");
			}
			
			
			
		}

		@Override
		public void fecharMenu() {
			System.out.println("Fechando Menu...");
			
		}

		@Override
		public void maisVolume() {
			
			if (this.getLigado()) {
				this.setVolume(this.getVolume() + 5);
			} else {
				System.out.println("Impossível ligar volume.");
			}
			
		}

		@Override
		public void menosVolume() {
			if (this.getLigado()) {
				this.setVolume(this.getVolume() - 5);
			} else {
				System.out.println("Impossível ligar volume.");
			}
			
		}

		@Override
		public void ligarMudo() {
			if (this.getLigado() && this.getVolume() > 0)	{
				this.setVolume(0);
			} else {
				System.out.println("Impossível ligar o mudo.");
			}
		}

		@Override
		public void desligarMudo() {

			if (this.getLigado() && this.getVolume() == 0) {
				this.setVolume(50);
			}else {
				System.out.println("Impossível desligar o mudo");
			}
		}

		@Override
		public void play() {
			
			if (this.getLigado() && !this.getTocando()) {
				this.setTocando(true);
			} else {
				System.out.println("Impossível ligar tocar");
			}
		}

		@Override
		public void pause() {
			
			if (this.getLigado() && this.getTocando()) {
				this.setTocando(false);
				
			} else {
				System.out.println("Não consegui pausar");
			}
			
			
		}
	}


