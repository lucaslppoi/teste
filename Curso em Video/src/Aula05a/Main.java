package Aula05a;

public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();

        c1.abrirConta("CC");

        System.out.println(c1.getTipo());
        System.out.println(c1.isStatus());

        c1.sacar(50);

        System.out.println(c1.getSaldo());

        c1.sacar(1);
    }
}
 