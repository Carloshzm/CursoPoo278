public static void main(String[] args) {

        class Producto {

            protected String nombre;
            protected double precio;

            public Producto(String nombre, double precio) {
                this.nombre = nombre;
                this.precio = precio;
            }

            public void mostrarDetalles() {
                System.out.println("Producto: " + nombre);
                System.out.println("Precio: " + precio);
            }
        }

// Clase derivada Electronica
        class Electronica extends Producto {

            private int garantiaMeses;

            public Electronica(String nombre, double precio, int garantiaMeses) {
                super(nombre, precio);
                this.garantiaMeses = garantiaMeses;
            }

            @Override
            public void mostrarDetalles() {
                System.out.println("Producto Electronico: " + nombre);
                System.out.println("Precio: " + precio);
                System.out.println("Garantia: " + garantiaMeses + " meses");
                System.out.println("---------------------------");
            }
        }

// Clase derivada Alimento
        class Alimento extends Producto {

            private String fechaDeCaducidad;

            public Alimento(String nombre, double precio, String fechaDeCaducidad) {
                super(nombre, precio);
                this.fechaDeCaducidad = fechaDeCaducidad;
            }

            @Override
            public void mostrarDetalles() {
                System.out.println("Producto Alimenticio: " + nombre);
                System.out.println("Precio: " + precio);
                System.out.println("Fecha de caducidad: " + fechaDeCaducidad);
                System.out.println("---------------------------");
            }
        }

// Main
        class Main {
            public void main(String[] args) {

                Producto[] productos = new Producto[3];

                productos[0] = new Electronica("Television", 4500.99, 24);
                productos[1] = new Alimento("Leche", 22.50, "15/12/2025");
                productos[2] = new Electronica("Laptop", 15999.00, 12);

                for (Producto p : productos) {
                    p.mostrarDetalles();
                }

            }
        }
}