
import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    // Método constructor con todos los atributos pasados por parámetro
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    // Método constructor sin los atributos pasados por parámetro
    public Operacion(){
        this.numero1 = 0;
        this.numero2 = 0;
    }
    //Métodos getters y setters
    public double getNumero1() {
        return numero1;
    }
    public double getNumero2() {
        return numero2;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    /*Método para crearOperacion(): que le pide al usuario los dos números y los
    guarda en los atributos del objeto*/

    public void crearOperacion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Primer Numero: ");
        this.numero1= scanner.nextDouble();
        System.out.println("Ingrese el Segundo Numero: ");
        this.numero2= scanner.nextDouble();

        scanner.close();
    }
    // Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public double sumar() {
        return numero1 + numero2;
    }
    //Método restar(): calcular la resta de los números y devolver el resultado al main.

    public double restar() {
        return numero1 - numero2;
    }

   /*Método multiplicar(): primero valida que no se haga una multiplicación por cero,
    si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
    error. Si no, se hace la multiplicación y se devuelve el resultado al main */

    public double multiplicar() {
        if (numero1==0 || numero2==0){
            System.out.println("!!! Error al Multiplicar! Estas intentado multiplicar por Cero **");
            return 0;
        } else
        return numero1 * numero2;
    }

    /* Método dividir(): primero valida que no se haga una división por cero, si fuera a
    pasar una división por cero, el método devuelve 0 y se le informa al usuario el
    error. Si no, se hace la división y se devuelve el resultado al main.*/

    public Double dividir() {
        if (numero2!=0){
        return numero1 / numero2;
    } else {
        System.out.println("!!! Error al dividir! No se puede dividir por Cero **");
        return null;
    }
    }


    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("Los resultados son los Siguientes --> ");
        System.out.println("** Suma : " + operacion.sumar());
        System.out.println("** Resta: " + operacion.restar());
        System.out.println("** Multiplicacion: " + operacion.multiplicar()); 
        if (operacion.dividir() != null){
            System.out.println("** Division: " + operacion.dividir());
        }   
       
    }

}