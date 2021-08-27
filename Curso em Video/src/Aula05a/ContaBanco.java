package Aula05a;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo){
        setStatus(true);
        setTipo(tipo);
        if (tipo == "CC"){
            this.saldo += 50;
        }
        else{
            this.saldo += 150;
        }
        System.out.println("Conta aberta");
    }

    public void fecharConta(){
        if (this.saldo == 0){
            this.status = false;
            System.out.println("Conta fechada");
        }
        else{
            System.out.println("Não foi possível, ainda tem " + this.saldo + " Reais");
        }
    }

    public void depositar(double valor){
        if(this.status == true){
            this.saldo += valor;
            System.out.println("Depositado " + valor);
        }
        else{
            System.out.println("Conta nao esta aberta");
        }
    }

    public void sacar(double valor){
        if(this.status == true) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Foi sacado " + valor);
            }
            else if (this.saldo < valor) {
                System.out.println("sem grana suficiente");
            }
        }
        else {
            System.out.println("Conta nao esta aberta");
        }
    }

    public void pagarMensal(){
        if (this.tipo == "CC"){
            this.saldo -= 12;
        }
        else{
            this.saldo -= 20;
        }
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
