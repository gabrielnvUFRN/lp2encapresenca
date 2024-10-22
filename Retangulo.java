public class Retangulo {
    private double altura;
    private double largura;

    // Método para definir a altura
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para definir a largura
    public void setLargura(double largura) {
        this.largura = largura;
    }

    // Método para calcular a área do retângulo
    public double area() {
        return this.largura * this.altura;
    }

    // Método para calcular o perímetro do retângulo
    public double perimetro() {
        return (this.largura * 2) + (this.altura * 2);
    }
}
