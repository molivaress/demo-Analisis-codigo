package obtenerpuntaje;

/**
 *
 * @author mayer
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] numeros
                = {
                    {6, 7, 5, 4, 2},
                    {3, 8, 4, 2, 6},
                    {1, 0, 2, 4, 7},
                    {9, 5, 2, 1, 2},
                    {9, 5, 2, 1, 2}
                };

        int x = Principal.obtener_puntaje(numeros, 2);
        System.out.println("puntos : " + x);
    }

    public static int obtener_puntaje(int[][] numeros, int numero_buscado) {
        int numero, puntos = 0, f = 1, c = 1;
        int filas = numeros.length;
        int columnas = numeros[0].length;
        boolean buscar = true;
        while (buscar) {
            numero = numeros[f][c];
            if (numero > numero_buscado) {
                if (c + 1 < columnas) {
                    c++;
                } else if (f + 1 < filas) {
                    f++;
                } else {
                    buscar = false;
                }
            } else if (numero < numero_buscado) {
                if (f + 1 < filas) {
                    f++;
                } else if (c + 1 < columnas) {
                    c++;
                } else {
                    buscar = false;
                }
            } else {
                puntos++;
                if ((f + 1 == filas) && (c + 1 == columnas)) {
                    buscar = false;
                } else {
                    if (f + 1 < filas) {
                        f++;
                    }
                    if (c + 1 < columnas) {
                        c++;
                    }
                }
            }
        }
        return puntos;
    }
}
