
package questão9;

public class Soma {
    public int somarArray(int[] arr, int indice) {
        if (indice == arr.length) {
            return 0; 
        }
        return arr[indice] + somarArray(arr, indice + 1);
    }
}
