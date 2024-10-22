public class TrianguloRetangulo {
    private double catetoBase;
    private double catetoAltura;
    private double hipotenusa;

    // Método para definir o cateto da base
    public void setCatetoBase(double catetoBase) {
        this.catetoBase = catetoBase;
    }

    // Método para definir o cateto da altura
    public void setCatetoAltura(double catetoAltura) {
        this.catetoAltura = catetoAltura;
    }

    // Método para calcular a hipotenusa usando o Teorema de Pitágoras
    public void calcularHipotenusa() {
        this.hipotenusa = Math.sqrt(Math.pow(catetoBase, 2) + Math.pow(catetoAltura, 2));
    }

    // Método para retornar o valor da hipotenusa
    public double getHipotenusa() {
        return this.hipotenusa;
    }

    // Método para calcular a área do triângulo retângulo
    public double area() {
        return (this.catetoBase * this.catetoAltura) / 2;
    }

    // Método para calcular o perímetro do triângulo retângulo
    public double perimetro() {
        return this.catetoBase + this.catetoAltura + this.hipotenusa;
    }
}
