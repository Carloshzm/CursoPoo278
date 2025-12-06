import java.util.Scanner;

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Ingresa el codigo del paciente (C, P, N): ");
                String codigo = sc.nextLine().toUpperCase();

                String area;

                // Clasificacion con switch
                switch (codigo) {
                    case "C":
                        area = "Cardiologia";
                        break;

                    case "P":
                        area = "Pediatria";
                        break;

                    case "N":
                        area = "Neurologia";
                        break;

                    default:
                        area = "General";
                        break;
                }

                // Reporte
                System.out.println("Codigo del paciente: " + codigo);
                System.out.println("Area asignada: " + area);

                sc.close();
            }

