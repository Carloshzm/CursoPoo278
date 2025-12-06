import java.util.Scanner;

    public static void main(String[] args) {

        class ValidacionID {

            // Metodo que valida si el ID es de 5 digitos
            public static boolean validarIDPaciente(int id) {
                // Un ID valido debe estar entre 10000 y 99999
                return id >= 10000 && id <= 99999;
            }

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int idPaciente;

                // Ciclo do-while que solicita el ID del paciente
                do {
                    System.out.print("Ingresa el ID del paciente (5 digitos): ");

                    // Validamos que la entrada sea un entero
                    while (!sc.hasNextInt()) {
                        System.out.println("Error: Debe ingresar un numero entero.");
                        sc.next(); // limpiar input incorrecto
                        System.out.print("Ingresa el ID del paciente (5 digitos): ");
                    }

                    idPaciente = sc.nextInt();

                    // Verificar si es valido
                    if (!validarIDPaciente(idPaciente)) {
                        System.out.println("ID invalido. Debe contener exactamente 5 digitos.\n");
                    }

                } while (!validarIDPaciente(idPaciente));  // Repite mientras no sea valido

                System.out.println("ID valido. Registro aceptado.");

                sc.close();
            }
        }
    }

