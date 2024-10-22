import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testando a classe Retangulo
        Retangulo retangulo = new Retangulo();
        System.out.print("Informe a altura do retângulo: ");
        retangulo.setAltura(scanner.nextDouble());
        System.out.print("Informe a largura do retângulo: ");
        retangulo.setLargura(scanner.nextDouble());
        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Perímetro do retângulo: " + retangulo.perimetro());

        // Testando a classe TrianguloRetangulo
        TrianguloRetangulo triangulo = new TrianguloRetangulo();
        System.out.print("\nInforme o cateto base do triângulo retângulo: ");
        triangulo.setCatetoBase(scanner.nextDouble());
        System.out.print("Informe o cateto altura do triângulo retângulo: ");
        triangulo.setCatetoAltura(scanner.nextDouble());
        triangulo.calcularHipotenusa();
        System.out.println("Hipotenusa do triângulo: " + triangulo.getHipotenusa());
        System.out.println("Área do triângulo retângulo: " + triangulo.area());
        System.out.println("Perímetro do triângulo retângulo: " + triangulo.perimetro());

        scanner.close();
    }
}
