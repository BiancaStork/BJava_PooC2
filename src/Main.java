//EJERCICIO CALCULO DE FORMAS  
//En el main se crearán las formas y se mostrará el resultado final.
// Fórmulas:
// ● Área círculo: PI * radio ^ 2
// ● Perímetro círculo: 2 * PI * radio
// ● Área rectángulo: base * altura
// ● Perímetro rectángulo: (base + altura) * 2


public class Main {
    public static void main(String[] args) {
        // Crear un círculo con radio 5
        Circulo circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        // Crear un rectángulo con base 8 y altura 4
        Rectangulo rectangulo = new Rectangulo(8, 4);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
}

