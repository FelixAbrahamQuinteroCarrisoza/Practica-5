import java.util.Random;
public class Cuenta {

    private String name;
    private double saldo;
    private double saldo2=saldo;
    private int pin;
    private double deposito;
    private double retirar;
    
    //Nombre
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //Saldo
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    //PIN
    public int getPin(){
        if(pin==0)
        pin= (int)(10000 * Math.random());

        return pin;
    }
    public void setPin(int pin){
        this.pin=pin;
    }

    //deposito
    public double getDeposito(){
        if(deposito>0){
        saldo2=saldo+deposito;
        }
        return saldo2;
    }
    public void setDeposito(double deposito){
        this.deposito=deposito;
    }

    //retirar
    public double getRetirar(){
        if(retirar>0){
        saldo2=saldo-retirar;
        }
        
        
        

        return saldo2;
    }
    public void setRetirar(double retirar){
        this.retirar=retirar;
    }
    

    public Cuenta(){
        this.name = "";
        this.saldo = 0;
        this.pin = 0;
        this.deposito = 0;
        this.retirar = 0;
    }

    public Cuenta(String name, double saldo, int pin,double deposito,double retirar ){
        this.name = name;
        this.saldo = saldo;
        this.pin = pin;
        this.deposito = deposito;
        this.retirar = retirar;
    }
}