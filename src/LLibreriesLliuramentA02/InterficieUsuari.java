package LLibreriesLliuramentA02;

import java.util.Scanner;

public class InterficieUsuari {

    /**
     * Mostra l'array i el menú a l'usuari i obté l'opció escollida.
     *
     * @param array Array a mostrar
     * @return El caràcter associat a l'opció triada (I, E o S), o 'X' si
     * incorrecta.
     */
    public char llegirOpcio(int[] array) {

//    char c = teclat.charAt(0);
        char c = 'a';

        return c;
    }

    /**
     * Pregunta a l'usuari la posició d'un array. Comprova si està dins el rang
     * correcte o si s'ha escrit realment un enter. Pregunta repetides vegades
     * fins a obtenir un valor correcte.
     *
     * @param max Valor màxim admès
     * @return La posició escrita
     */
    public int llegirPosicio(int max) {
        Scanner lector = new Scanner(System.in);
        boolean pendentLlegir = true;
        int pos = -1;
        String s = null;
        while (pendentLlegir) {
            System.out.print("Quina posició voleu manipular? ");
            if (lector.hasNextInt()) {
                pos = lector.nextInt();
                if ((pos < 0) || (pos > max)) {
                    System.out.println("Aquesta posició no existeix");
                    lector.nextLine();
                } else {
                    pendentLlegir = false;
                }
            } else {
                System.out.println("El valor no és enter");
                lector.nextLine();
            }
        }
        lector.nextLine();
        return pos;
    }

    /**
     * Llegeix un enter qualsevol via teclat. Pregunta repetides vegades fins a
     * obtenir un valor correcte.
     *
     * @return El valor llegit
     */
    public int llegirValor() {
        Scanner lector = new Scanner(System.in);
        boolean pendentLlegir = true;
        int val = 0;

        return val;
    }

}
