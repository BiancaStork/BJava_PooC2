# Resolver los siguientes ejercicios aplicando los conceptos de POO
# 1- Crear una clase llamada Operacion 
que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:

● Método constructor con todos los atributos pasados por parámetro.
● Método constructor sin los atributos pasados por parámetro.
● Métodos get y set.
● Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
● Método sumar(): calcular la suma de los números y devolver el resultado al main.
● Método restar(): calcular la resta de los números y devolver el resultado al main.
● Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
● Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la división y se devuelve el resultado al main.

# 2- Realizar una clase llamada Cuenta (bancaria) 
que debe tener como mínimo los atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las operaciones asociadas a dicha clase son:
● Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
● Agregar los métodos getters y setters correspondientes
● Método para crear un objeto Cuenta, pidiéndole los datos al usuario.
● Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumará al saldo actual.
● Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se le restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
● Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
● Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
● Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.

# 3- Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas geométricas, en este caso un círculo y un rectángulo. 
Ya que este cálculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas, que tendrá los métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Fórmulas:
● Área círculo: PI * radio ^ 2
● Perímetro círculo: 2 * PI * radio
● Área rectángulo: base * altura
● Perímetro rectángulo: (base + altura) * 2