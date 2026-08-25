package Aula1_Exercicios.Exercicio2;

public class Triangulo extends FormaGeometrica {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {

        double area = (base * altura) / 2;

        System.out.println("Área do triângulo: " + area);
    }

}
