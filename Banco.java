import java.util.Scanner;
import java.util.Random;

public class Banco {
    public static void main(String[] args) {
         
        int PIN_verifi=0,opcion=0,subopcion,control=0,volver=0;
        Scanner Teclado= new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta("Felix Quintero",200.0 ,1234,0.0,0.0);
        Cuenta cuenta2 = new Cuenta();
        //int numero= (int)(10000 * Math.random());
        
     do{
        System.out.println("\n-------BANCO------\n"); 
        System.out.println("\n1--Crear una cuenta: "); 
        System.out.println("2--Cuenta ya existente: ");
        System.out.println("3--Cuenta ya existente hecha por el usuario: ");
        System.out.println("4--Salir: ");
    
            
        System.out.println("\n Introduce el numero del menu:");
        opcion=Teclado.nextInt();
        System.out.println("\n ");

        if(opcion==1){
            
           System.out.println("\nIngresa su nombre: ");  
           Scanner inName = new Scanner(System.in);
           cuenta2.setName(inName.next());

           System.out.println("\nIngresa cuanto quiere depositar en su saldo: ");  
           Scanner inSaldo = new Scanner(System.in);
           cuenta2.setSaldo(inSaldo.nextDouble());

         
           System.out.println("\nSu nombre de usuario es: "+cuenta2.getName());
           System.out.println("\nSu deposito es: "+cuenta2.getSaldo());
           System.out.println("\nPIN generado es: "+cuenta2.getPin());
        

        }
        else if(opcion==2){
        
        do{
        System.out.println("\n Introduce el PIN:");
        PIN_verifi=Teclado.nextInt();

        if((cuenta1.getPin())==PIN_verifi){
           
            do{
                System.out.println("\n-------BANCO USUARIO------\n"); 
                System.out.println("\n1--Depositar: "); 
                System.out.println("2--Retirar: ");
                System.out.println("3--Estado de cuenta: ");
                System.out.println("4--Salir: ");
                
                System.out.println("\n Introduce el numero del menu:");
                subopcion=Teclado.nextInt();
                System.out.println("\n ");
                
                if(subopcion==1){
                    System.out.println("\n Coloque lo que se quiera Depositar:");
                    Scanner inDeposito = new Scanner(System.in);
                    cuenta1.setDeposito(inDeposito.nextDouble());
                    
                    System.out.println("\n Su DEPOSITO SE HA REALIZADO CON EXITO!!:");
                     control=1;
                }
                else if (subopcion==2){
                    
                    System.out.println("\n Coloque lo que se quiera retirar:");
                    Scanner inRetirar = new Scanner(System.in);
                    cuenta1.setRetirar(inRetirar.nextDouble());
                        
                    System.out.println("\n Su RETIRO SE HA REALIZADO CON EXITO!!:");
                     control=2;
                }
                else if(subopcion==3){
                    System.out.println("\nTitular de la cuenta: "+cuenta1.getName()+
                    "\nSu saldo original: "+cuenta1.getSaldo());
                    
                    if((cuenta1.getDeposito())>0 && control==1 )
                    System.out.println("\nSu saldo actualizado: "+cuenta1.getDeposito());

                    if((cuenta1.getRetirar())>0 && control==2)
                    System.out.println("\nSu saldo actualizado: "+cuenta1.getRetirar());
                    control=0;
                }
                
              }while(subopcion<4);
         }

         if(!((cuenta1.getPin())==PIN_verifi)){
         System.out.println("\n Error PIN no existente ");
         }
         
         System.out.println("\n1-- Volver a -Colocar PIN-");
         System.out.println("\n2-- Volver a menu principal -BANCO-");
         volver=Teclado.nextInt();

        }while(volver==1);
        }
        else if(opcion==3){
        
            do{
            System.out.println("\n Introduce el PIN:");
            PIN_verifi=Teclado.nextInt();
    
            if((cuenta2.getPin())==PIN_verifi){
               
                do{
                    System.out.println("\n-------BANCO USUARIO------\n"); 
                    System.out.println("\n1--Depositar: "); 
                    System.out.println("2--Retirar: ");
                    System.out.println("3--Estado de cuenta: ");
                    System.out.println("4--Salir: ");
                    
                    System.out.println("\n Introduce el numero del menu:");
                    subopcion=Teclado.nextInt();
                    System.out.println("\n ");
                    
                    if(subopcion==1){
                        System.out.println("\n Coloque lo que se quiera Depositar:");
                        Scanner inDeposito = new Scanner(System.in);
                        cuenta2.setDeposito(inDeposito.nextDouble());
                        
                        System.out.println("\n Su DEPOSITO SE HA REALIZADO CON EXITO!!:");
                         control=1;
                    }
                    else if (subopcion==2){
                        
                        System.out.println("\n Coloque lo que se quiera retirar:");
                        Scanner inRetirar = new Scanner(System.in);
                        cuenta2.setRetirar(inRetirar.nextDouble());
                            
                        System.out.println("\n Su RETIRO SE HA REALIZADO CON EXITO!!:");
                         control=2;
                    }
                    else if(subopcion==3){
                        System.out.println("\nTitular de la cuenta: "+cuenta2.getName()+
                        "\nSu saldo original: "+cuenta2.getSaldo());
                        
                        if((cuenta2.getDeposito())>0 && control==1 ){
                            System.out.println("\nSu saldo actualizado: "+cuenta2.getDeposito());
                            //(cuenta2.getSaldo())=(cuenta2.getDeposito());
                        }
                        
                        if((cuenta2.getRetirar())>0 && control==2)
                        System.out.println("\nSu saldo actualizado: "+cuenta2.getRetirar());


                        control=0;
                    }
                    
                  }while(subopcion<4);
             }
    
             if(!((cuenta2.getPin())==PIN_verifi)){
             System.out.println("\n Error PIN no existente ");
             }
             
             System.out.println("\n1-- Volver a -Colocar PIN-");
             System.out.println("\n2-- Volver a menu principal -BANCO-");
             volver=Teclado.nextInt();
    
            }while(volver==1);
            }
        
      }while(opcion<4);


    }
}