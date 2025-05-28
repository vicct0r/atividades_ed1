
package questão10;

public class Potencia {
    

    public int elevar(int base, int expoente) {

        if (expoente == 0) {
            return 1;
        }

        return base * elevar(base, expoente - 1);
    }
}
    
