public static void main(String[] args) {
            class Circulo {

                private double radio;

                public Circulo(double radio) {
                    this.radio = radio;
                }

                public double calcularArea() {
                    return Math.PI * radio * radio;
                }

                public double calcularCircunferencia() {
                    return 2 * Math.PI * radio;
                }

                public void main(String[] args) {

                    Circulo c = new Circulo(5);

                    double area = c.calcularArea();
                    double circunferencia = c.calcularCircunferencia();

                    System.out.println("Area del circulo: " + area);
                    System.out.println("Circunferencia del circulo: " + circunferencia);
                }
            }
        }


