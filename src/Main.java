import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la inmersión con Java");
        System.out.println("Película Matrix");

        int fechaLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoPlanBasico = true;

        System.out.println("fechaLanzamiento = " + fechaLanzamiento);
        System.out.println("evaluacion = " + evaluacion);
        System.out.println("incluidoPlanBasico = " + incluidoPlanBasico);

        String nombre = "matrix";
        System.out.println("nombre = " + nombre);
        String sinopsis = """
                La mejor película del milenio
                Segundo renglón
                """;

        System.out.println("sinopsis = " + sinopsis);
        System.out.println();

        double evalucionMedia = (4.5 + 4.8 +3) / 3;
        System.out.println("evalucionMedia = " + evalucionMedia);

        if (fechaLanzamiento>=2023){
            System.out.println("Película Popular del momento");
        }else {
            System.out.println("Película que vale la pena ver");
        }

        double mediaEvaluacionUsuario = 0;
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la nota de Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }

        System.out.println();
        System.out.println("SumamediaEvaluacionUsuario = " + mediaEvaluacionUsuario);
        System.out.println("mediaEvaluacionUsuario = " + mediaEvaluacionUsuario / 3);
    }
}