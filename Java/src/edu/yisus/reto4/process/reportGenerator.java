package edu.yisus.reto4.process;

public class reportGenerator {
    /*
    Se crea un metodo en el cual nos da el número más grande del arreglo de las filas que en este caso sería
    por cada sabor de helado
     */
        public static int getSaborMasProductivo(int[][] ventas) {
            int valorSabor = 0;
            for (int i = 0; i < ventas.length; i++) {
                int saborMasVendido = Integer.MIN_VALUE;
                int saborMasVendidoIndex = 0;
                for (int j = 0; j < ventas[i].length; j++) {
                    if (ventas[i][j] > saborMasVendido) {
                        saborMasVendido = ventas[i][j];

                    }
                    System.out.print(ventas[i][j] + " ");
                }
                System.out.print("    **    " + saborMasVendido);
                System.out.println();
            }
            return valorSabor;
        }
   /*
   Aquí también se crea un metodo en el cual nos da el número más grande pero esta vez de cada columna
   que sería que helado se vendió más por cada trimestre
    */
    public static int saborMasVendidoTrimestral(int[][] ventas) {
        int filas = ventas.length;
        int columnas = ventas[0].length;
        int valorTrimestral = 0;
        for (int j = 0; j < columnas; j++) {
            valorTrimestral = ventas[0][j];
            for (int i = 1; i < filas; i++) {
                if (ventas[i][j] > valorTrimestral) {
                    valorTrimestral = ventas[i][j];
                }
            }
            System.out.println("Sabor más vendido por trimestre "+ j + ": " + valorTrimestral);
        }
        return valorTrimestral;
    }
   /*
   Aqui también se agrega un nuevo metodo en el cuál suma cada columna del arreglo para que así podamos
   decirle a la computadora que nos diga cuál es el trimestre en cual se vendió más
    */
    public static int sumaColumnas(int[][] ventas) {
            int suma = 0;
        for (int x = 0; x < ventas[0].length; x++) {
            System.out.print("___");
        }
        System.out.println();
        for (int x = 0; x < ventas[0].length; x++) {
            for (int y = 0; y < ventas.length; y++) {
                suma += ventas[y][x];
            }
            System.out.printf("%d ", suma);
        }
        System.out.println();
        int mayor = 0;
        if (suma > mayor) {
            mayor = suma;
        }
        System.out.println("El trimestre más vendido fue: " + mayor);
        return suma;
    }

}

