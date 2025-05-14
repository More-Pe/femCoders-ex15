public class Welcome {
    public static void main(String[] args) {

        //Crea un array que contenga 5 nombres de coders y con un bucle 'for-each' imprime: ¡Hola <name>, bienvenida a Java!
        System.out.println("----------------------------Ejercicio 1----------------------------\n");
        String[] coders = {"Alexandra", "Ana", "Anna", "Bruna", "Débora"};
        for (String coder: coders){
            System.out.println("¡Hola " + coder + ", bienvenida a Java!");
        }
        System.out.println("\n----------------------------Ejercicio 2----------------------------\n");
        //Escribe un bucle 'for' que imprima solo los siguientes números: 10 - 30 - 50 - 70 - 90 del array numbers, sin modificarlo ni creando uno nuevo
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i = 0; i <= numbers.length; i += 2){
            System.out.println(numbers[i]);
        }
        System.out.println("\n----------------------------Ejercicio 3----------------------------\n");
        //Crea un array que contenga algunos números y usa un bucle 'for-each' e imprime cada número duplicado (multiplicado por 2)
        int[] nums = { 2, 34, 5, 54, 6, 23};
        for (int num : nums){
            System.out.println(num * 2);
        }
        System.out.println("\n----------------------------Ejercicio 4----------------------------\n");
        //Crea un array de tipo char que contenga las vocales en minúsculas y usa un bucle 'for-each' e imprime cada vocal en mayúsculas
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels){
            System.out.println(Character.toUpperCase(vowel));
        }
    }
}
