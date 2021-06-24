import java.util.ArrayList;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        /**
         * Ejercicios laboratorio EDA
         */
        int[] valores = {23,4,8,18,12,54,34,9,5,16,50,27};
        BST arbol = new BST();
        for (int i = 0; i < valores.length; i++) {
            arbol.insertNode(valores[i]);
        }
        //Ejercicio 01: Utilizando la estructura de un BST, encontrar el k-esimo elemento más pequeño.
        ArrayList<Integer> nums = arbol.inOrder(arbol.root, new ArrayList<>());
        printArray(nums);

        System.out.println("EL NUMERO K ESIMO MENOR ES: "+nums.get(4-1));
        
        
        // Ejercicio 02: Dado un valor a que pertenece a un BST, encontrar todos los nodos mayores a ese.


    }
    public static void printArray(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++) {
            System.out.print(" "+array.get(i));
        }
        System.out.println("");
    }
}