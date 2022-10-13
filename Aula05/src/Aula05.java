
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Adilsom");
        p1.abrirConta("CC");
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        p2.estadoAtual();

    }
}
