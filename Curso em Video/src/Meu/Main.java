package Meu;

public class Main {
    public static void main(String[] args) {
        Celular meuCelular = new Celular();

        meuCelular.color = "Black";
        meuCelular.weight = 900;
        meuCelular.sound = false;
        meuCelular.locked = true;
        meuCelular.status();
        meuCelular.unlock();
        System.out.println("Unlocked");
        meuCelular.status();

    }
}
