package LLibreriesLliuramentA02;

import utilitats.EditorArrayEnters;

public class EditorTeclat {

    public void inici() {
        int[] arrayA = {1, 2, 3, 4, 5, 6};
        EditorArrayEnters ed = new EditorArrayEnters();
        InterficieUsuari iu = new InterficieUsuari();

        boolean executar = true;

        while (executar) {
            char op = iu.llegirOpcio(arrayA);
            int pos = 0;
            switch (op) {
                case 'I':
                    pos = iu.llegirPosicio(arrayA.length - 1);
                    int val = iu.llegirValor();
                    arrayA = ed.inserir(arrayA, pos, val);
                    break;
                case 'E':
                    pos = iu.llegirPosicio(arrayA.length - 1);
                    arrayA = ed.esborrar(arrayA, pos);
                    break;
                case 'S':
                    executar = false;
                default:
                    op = 'J';
                    break;
            }
        }
    }

}
