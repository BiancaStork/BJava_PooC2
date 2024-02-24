import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    // Constructor por defecto
    public Cuenta() {
        this.numeroCuenta = 0;
        this.dniCliente = 0;
        this.saldoActual = 0;
    }

    // Constructor con parametros.
    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    // Agregar los métodos getters y setters correspondientes
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    // Objeto Cuenta
    public void crearCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de cuenta:");
        this.numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI del cliente:");
        this.dniCliente = scanner.nextLong();
        System.out.println("Ingrese el saldo actual:");
        this.saldoActual = scanner.nextDouble();
        scanner.close();
    }

  // Método ingresar(double ingreso)
  public void ingresar(double ingreso) {
    this.saldoActual += ingreso;
    System.out.println("Se ha ingresado $" + ingreso + " a la cuenta.");
}

// Método retirar(double retiro)
public void retirar(double retiro) {
    if (retiro <= saldoActual) {
        this.saldoActual -= retiro;
        System.out.println("Se ha retirado $" + retiro + " de la cuenta.");
    } else {
        this.saldoActual = 0;
        System.out.println("No se puede retirar $" + retiro + ", saldo insuficiente. El saldo actual es $" + this.saldoActual);
    }
}

// Método extraccionRapida()
public void extraccionRapida() {
    double cantidadARetirar = this.saldoActual * 0.2;
    retirar(cantidadARetirar);
    System.out.println("Esos $" + cantidadARetirar + " corresponden a una extracción rápida.");
}

// Método consultarSaldo()
public double consultarSaldo() {
    return saldoActual;
}

// Método consultarDatos()
public void consultarDatos() {
    System.out.println("Número de cuenta: " + numeroCuenta);
    System.out.println("DNI del cliente: " + dniCliente);
    System.out.println("Saldo actual: $" + saldoActual);
}


    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();

        Scanner scanner = new Scanner(System.in);
        //ingreso de dinero
        System.out.print("Ingrese el monto a ingresar: ");
        double ingreso = scanner.nextDouble();
        cuenta.ingresar(ingreso);
        //muestro el saldo actualizado
         System.out.println("Su Saldo actual es: $" + cuenta.consultarSaldo());
       

        // extracción rápida
        System.out.print("¿Desea realizar una extracción rápida? (Si/No): ");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("Si")) {
            cuenta.extraccionRapida();
             //muestro el saldo actualizado
         System.out.println("Su Saldo actual es: $" + cuenta.consultarSaldo());
        } else {
            System.out.println("Extracción rápida cancelada.");
             //retiro de dinero
        System.out.print("Ingrese el monto a retirar: ");
        double retiro = scanner.nextDouble();
        cuenta.retirar(retiro);
         //muestro el saldo actualizado
         System.out.println("Su Saldo actual es: $" + cuenta.consultarSaldo());
        }

        // Mostrar saldo actual y datos de la cuenta
        System.out.println("Saldo actual: $" + cuenta.consultarSaldo());
        cuenta.consultarDatos();

        // Cerrar el Scanner
        scanner.close();
    }
        
    }
 
       


    


