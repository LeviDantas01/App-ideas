import java.util.ArrayList;
import java.util.Scanner;

public class Bin2Dec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numBinario;
        double pot = 0;
        double result = 0;
        System.out.println("Inofrme um número binario de descubra sua converção na base 10");
        numBinario = sc.nextInt();

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(numBinario);

        int n = lista.get(0);
        String ns = Integer.toString(n);

        String ni = new StringBuilder(ns).reverse().toString();
        String[] quebrarString = ni.split("");
        for (int i = 0; i < quebrarString.length; i++) {

            if (!quebrarString[i].equals("0") && !quebrarString[i].equals("1")) {
                result = 0;
                break;
            } else {
                int nci = Integer.parseInt(quebrarString[i]);
                pot = Math.pow(2, i);
                result += pot * nci;
            }
        }

        System.out.println(result != 0 ? result : "Só é permitido numeros 0 e 1");

        sc.close();

    }

}
