
package Cuentas;

/**
 * Una clase para preentar en pantalla el saldo actual de la cuenta
 * Se mostrará mensajes de error en el caso de ingresos o retiradas 
 * de dinero erróneas.
 * @version 3, 24/01/21
 * @author José Rosales
 */

public class Main {

    public static void main(String[] args) {
        float cantidad=0;
         
        /**
        * Método que englobe las sentencias de la clase Main que operan
        * con el objeto cuenta1. 
        */
        operativa_cuenta(cantidad);
       
    }
    public static void operativa_cuenta(float cantidad){
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        
        /**
        * En caso de retirar una cantidad mayor que el saldo se imprimirá
        * el mensaje "Fallo al retirar". 
        */

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        /**
        * En caso de ingresar una cantidad negativa se imprimirá
        * el mensaje "Fallo al ingresar". 
        */
        
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }


    }
    }

