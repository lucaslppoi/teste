package Meu;

public class Celular {
    String color;
    double weight;
    boolean locked;
    boolean sound;

    void status (){
        System.out.println("Color: " + this.color);
        System.out.println("Weight: " + this.weight);
        System.out.println("Is locked? " + this.locked);
        System.out.println("Is ringing? " + this.sound);
    }

    void lock(){
         this.locked = true;
    }

    void unlock(){
        this.locked = false;
    }
}
