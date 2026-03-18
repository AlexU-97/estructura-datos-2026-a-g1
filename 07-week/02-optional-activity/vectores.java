import java.util.Scanner;

public class vectores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Definir tamaño del vector
        System.out.print("Enter the size of the vector: ");
        int count = scanner.nextInt();

        //Vectores
        Double[] vectorA = new Double[count];
        Double[] vectorB = new Double[count];
        Double[] vectorC = new Double[count];
        Double[] vectorD = new Double[count]; //Nuevo vector (resta)

        int i;

        //Vector A
        for(i = 0; i < vectorA.length; i++){
            vectorA[i] = (double) (i + 1);
        }

        //Vector B
        for(i = 0; i < vectorB.length; i++){
            vectorB[i] = vectorA[i] * 4;
        }

        //Vector C (suma)
        for(i = 0; i < vectorC.length; i++){
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        //Vector D (resta)
        for(i = 0; i < vectorD.length; i++){
            vectorD[i] = vectorA[i] - vectorB[i];
        }

        //Salida de datos
        System.out.println("\nVector A:");
        for(i = 0; i < vectorA.length; i++){
            System.out.print(vectorA[i].intValue() + " - ");
        }

        System.out.println("\nVector B:");
        for(i = 0; i < vectorB.length; i++){
            System.out.print(vectorB[i].intValue() + " * ");
        }

        System.out.println("\nVector C (Suma):");
        for(i = 0; i < vectorC.length; i++){
            System.out.print(vectorC[i].intValue() + " | ");
        }

        System.out.println("\nVector D (Resta):");
        for(i = 0; i < vectorD.length; i++){
            System.out.print(vectorD[i].intValue() + " / ");
        }

    }
}