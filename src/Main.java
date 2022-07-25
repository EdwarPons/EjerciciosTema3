public class Main {
    public static void main(String[] args) {
        // Declaro los tres números a sumar
        // y le asigno un valor a cada uno.
        int a = 2;
        int b = 6;
        int c = 8;

        // Llamo a la función y guardo el resultado.
        int resultado = sumarTresNumeros(a, b, c);
        // Muestro la suma y su resultado.
        System.out.println(a + " + " + b + " + " + c  + " = " + resultado);

        // Instancio la clase Coche.
        ClaseCoche coche = new ClaseCoche();

        // Obtengo la cantidad de puertas inicial y la muestro por pantalla.
        mostrameCantidadPuertas(coche);

        // Incremento
        coche.incrementarPuerta();

        // Obtengo la cantidad de puertas, luego del incremento, y la muestro por pantalla.
        mostrameCantidadPuertas(coche);
    }

    private static void mostrameCantidadPuertas (ClaseCoche coche) {
        int puertas = coche.dameCantidadPuertas();
        System.out.println("Coche con " + puertas + " puertas.");
    }

    public static int sumarTresNumeros(int a, int b, int c) {
        return a + b + c;
    }
}

