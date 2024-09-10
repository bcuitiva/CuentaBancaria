import java.util.*;
public class CuentaBancaria {
    //Brayan David Cuitiva Umbarila
    //05-09-2024
    //El código pretende simular una cuenta de banco donde se puede depositar plata, retirar plata y mantener la información actualizada.
    //En la clase CuentaBancaria se crearon los metodos para depositar dinero, retirar dinero y mostrar la información actualizada de la cuenta.
    Scanner sc = new Scanner(System.in);
    private String titular, numeroCuenta;
    private double saldo = 0;

    public CuentaBancaria(){
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria: " + '\n' +
                "- Titular = " + titular + '\n' +
                "- NumeroCuenta = " + numeroCuenta + '\n' +
                "- Saldo = " + saldo;
    }

    public void depositarDinero(){
        double ingreso;
        System.out.println("Ingrese la cantidad de dinero que desea depositar:");
        ingreso = sc.nextDouble();
        this.saldo = saldo + ingreso;
        System.out.println("Su dinero fue depositado con exito.");
    }
    public void retirarDinero(){
        double retiro;
        boolean val = true;
        System.out.println("Ingrese la cantidad de dinero que desea retirar:");
        retiro = sc.nextDouble();
        while(val == true){
            if (retiro <= saldo) {
                this.saldo = saldo - retiro;
                System.out.println("Su dinero fue retirado con exito.");
                val = false;
            } else if (retiro > saldo){
                System.out.println("""
                La cantidad que desea retirar excede la cantidad de dinero que posee.
                Intente ingresando una cantidad valida""");
                retiro = sc.nextDouble();
            }
        }
    }
    public void mostrarInformacion(){
        System.out.println(toString());
    }
}
