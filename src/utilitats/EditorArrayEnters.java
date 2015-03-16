package utilitats;
 
public class EditorArrayEnters {
 
/** Inseriu un valor a una posició d'un array d'enters, desplaçant el
  * valor existent i tots els que hi ha a continuació a la dreta.
  * No s'esborra cap valor.
  *
  * @param array Array d'enters original
  * @param pos Posició on fer la inserció
  * @param v Valor a inserir
  * @return Nou array d'enters amb el valor inserit. Ara la seva mida s'ha
  * incrementat en un. Si hi ha un error s'avalua a null.
  */
public int[] inserir(int[] array, int pos, int v) {
if ((pos >= 0)&&(pos < array.length)) {
int[] nouArray = new int[array.length + 1];
copiarNPosicions(array, nouArray, pos);
nouArray[pos] = v;
for (int i = pos; i < array.length; i++) {
nouArray[i + 1] = array[i];
}
return nouArray;
} else {
return null;
}
}
 
/** Esborra un valor a una posició d'un array d'enters, desplaçant els
  * valors sobre la posició eliminada, cap a l'esquerra.
  *
  * @param array Array d'enters original
  * @param pos Posició on fer l'esborrat
  * @return Nou array d'enters amb el valor esborrat. Ara la seva mida s'ha
  * reduït en un. Si hi ha un error s'avalua a null.
  */
public int[] esborrar(int[] array, int pos) {
if ((pos >= 0)&&(pos < array.length)) {
int[] nouArray = new int[array.length - 1];
copiarNPosicions(array, nouArray, pos);
for (int i = pos + 1; i < array.length; i++) {
nouArray[i - 1] = array[i];
}
return nouArray;
} else {
return null;
}
}
 
/** Donats dos arrays d'enters, copia els N primers valors de l'origen a la
  * destinació, començant per la posició 0.
  *
  * @param origen Array origen
  * @param desti Array destinació
  * @param n Nombre de valors a copiar
  */
public void copiarNPosicions(int[] origen, int[] desti, int n) {
for (int i = 0; i < n; i++) {
desti[i] = origen[i];
}
}
 
}