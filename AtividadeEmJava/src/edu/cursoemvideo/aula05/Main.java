package edu.cursoemvideo.aula05;

public class Main {
	public static void main(String[] args) {
	
	ContaBanco p1 = new ContaBanco();
    p1.setNumConta(111);
    p1.setDono("Adilsom");
    p1.abrirConta("CC");


    ContaBanco p2 = new ContaBanco();
    p2.setNumConta(222);
    p2.setDono("Maria");
    p2.abrirConta("CP");

            
    p1.depositar(200);      
    p2.depositar(500);

    p1.fecharConta();
    
    p1.estadoAtual();
    p2.estadoAtual();


}

}
