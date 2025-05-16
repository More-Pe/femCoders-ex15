import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        //Escribe un programa que genere un array de 2 dimensiones de 100 filas y 10 columnas con números aleatorios del 0 al 99, a través de un bucle anidado (Si no te suenan estos conceptos, ¡búscalos!)
        int[][] array2D = new int[100][10];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                array2D[i][j] = randomNumber();
            }
        }
        print2DArray(array2D);
    }

    /**
     * Function name: randomNumber
     *
     * @return (int)
     *
     * Inside the function:
     * 1. generate random numbers from 0 to 99
     */
    public static int randomNumber() {
        int random = new Random().nextInt(100);
        return random;
    }

    /**
     * Function name: print2DArray
     *
     * @param array (2D array int)
     *
     * Inside the function:
     * 1. nested loop that prints a 2D array using the randomNumber function
     */
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}