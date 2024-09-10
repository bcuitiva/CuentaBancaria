import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Brayan David Cuitiva Umbarila
        //05-09-2024
        //El código pretende simular una cuenta de banco donde se puede depositar plata, retirar plata y mantener la información actualizada.
        //En la clase main se creo una cuenta bancaria para probar los metodos de depositar, retirar y mostrar información.
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta1 = new CuentaBancaria();
        boolean val = true;
        String titular, numeroCuenta;
        double saldo;

        System.out.println("BIENVENIDO A SU BANCO");
        System.out.println("Ingrese su nombre:");
        titular = sc.next();
        cuenta1.setTitular(titular);
        System.out.println("Ingrese su numero de cuenta:");
        numeroCuenta = sc.next();
        cuenta1.setNumeroCuenta(numeroCuenta);
        System.out.println("Ingrese el saldo con el que cuenta en su cuenta:");
        saldo = sc.nextDouble();
        cuenta1.setSaldo(saldo);

        while(val == true){
            int op;
            System.out.println("""
                    \nQue accion desea hacer:
                    1. Depositar dinero
                    2. Retirar dinero
                    3. Ver informacion
                    4. Salir""");
            op = sc.nextInt();
            switch(op) {
                case 1:
                    System.out.println("\nDepositar dinero:");
                    cuenta1.depositarDinero();
                    break;
                case 2:
                    System.out.println("\nRetirar dinero:");
                    cuenta1.retirarDinero();
                    break;
                case 3:
                    System.out.println("\nVer informacion:");
                    cuenta1.mostrarInformacion();
                    break;
                case 4:
                    val = false;
                    break;
                default:
                    System.out.println("\nOpcion incorrecta, ingrese una opcion valida.");
                    break;
            }
        }

    }
}